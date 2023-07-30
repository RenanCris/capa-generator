package com.renan.capa.controller;

import com.renan.capa.services.CapaService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapaGeneratorController
{
    private final CapaService service;

    public CapaGeneratorController(CapaService service){
        this.service = service;
    }

    @GetMapping("/capa/{id}")
    public ResponseEntity<byte[]> GetCapa(@PathVariable String id){

        String dados = service.Get(id);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);

        // Define o nome do arquivo no header da resposta
        headers.setContentDispositionFormData("attachment", "capa.pdf");

        var pdfContent = service.generateReportPDF(dados);

        return ResponseEntity.ok()
                .headers(headers)
                .body(pdfContent);
    }
}
