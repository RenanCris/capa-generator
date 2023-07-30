
## CapaGerator

CapaGerator é um projeto que combina um aplicativo Java Spring Boot com uma aplicação Node.js que roda um servidor JSON. O objetivo do projeto é fornecer uma API simples que responde a três valores possíveis. Este repositório contém todo o código necessário para executar o aplicativo usando o Docker Compose.

## Funcionalidades

O projeto CapaGerator possui as seguintes funcionalidades:

- API Java Spring Boot para gerar capas de livros.
- Servidor JSON Node.js para fornecer os dados necessários para a geração das capas.
- Respostas da API contendo três valores possíveis para cada capa gerada.

## Pré-requisitos

Para executar o projeto localmente, você deve ter o Docker instalado em seu sistema. Certifique-se de que o Docker esteja configurado corretamente e executando sem problemas.

## Instruções de uso

1. Clone este repositório em sua máquina local:


git clone https://github.com/RenanCris/capa-generator.git
cd capaGerator` 

2.  Execute o Docker Compose para criar e iniciar os contêineres do projeto:

bashCopy code

`docker-compose up` 

3.  Após a execução bem-sucedida do comando acima, o aplicativo estará disponível em:

-   API Java Spring Boot: [http://localhost:8080](http://localhost:8080/)
-   Servidor JSON Node.js: [http://localhost:3000](http://localhost:3000/)

4.  Você pode utilizar o Insomnia para testar a API. Baixe o arquivo .collection e importe-a em seu cliente Insomnia para obter os endpoints disponíveis e testá-los facilmente.

## Autor

Este projeto foi desenvolvido por Renan Nunes. 