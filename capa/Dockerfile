# Define a imagem base que usaremos para o container
FROM openjdk:17-jdk

# Diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR da aplicação para o diretório /app dentro do container
COPY target/capa-0.0.1-SNAPSHOT.jar /app/capa-0.0.1-SNAPSHOT.jar

# Expõe a porta que a aplicação Spring está usando (altere a porta se necessário)
EXPOSE 8080

# Comando a ser executado quando o container é iniciado
CMD ["java", "-jar", "capa-0.0.1-SNAPSHOT.jar"]