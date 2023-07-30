package com.renan.capa.services;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.query.JsonQLQueryExecuterFactory;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class CapaService {

    @Autowired
    private RestTemplate restTemplate;

    public String Get(String id) {
        String apiUrl = "http://node:3000/capas/" + id;
        return restTemplate.getForObject(apiUrl, String.class);
    }

    public byte[] generateReportPDF(String json) {
        try {


            // Carregue o arquivo .jrxml do relatório
            InputStream objeto = getClass().getResourceAsStream("/jasper/capa.jasper");
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(objeto);

            // Preencha o relatório com os dados do DataSource

            byte[] dados = json.getBytes();
            InputStream dadosStream = new ByteArrayInputStream(dados) ;

            // Parâmetros, se necessário
            Map<String, Object> parameters = new HashMap<>();
            parameters.put(JsonQLQueryExecuterFactory.JSON_INPUT_STREAM, dadosStream);

            // Gere o relatório em formato PDF
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters);
            return JasperExportManager.exportReportToPdf(jasperPrint);
        } catch (JRException e) {
            e.printStackTrace();
            return null;
        }
    }
}
