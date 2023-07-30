# Use uma imagem base do Node.js
FROM node:14-alpine

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia os arquivos necessários para o diretório de trabalho
COPY package.json package-lock.json db.json /app/

# Instala as dependências de produção
RUN npm install --production

# Copia o restante dos arquivos para o diretório de trabalho
COPY . /app

# Expor a porta em que a aplicação estará rodando (ajuste a porta conforme necessário)
EXPOSE 3000

# Executa o comando para iniciar o servidor Node.js
CMD ["node", "server.js"]