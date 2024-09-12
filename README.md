# Projeto de Microserviços com Spring, Docker e Eureka

Este projeto implementa três microserviços que se comunicam entre si, utilizando várias tecnologias modernas para garantir escalabilidade e modularidade. Cada serviço tem sua função bem definida e a comunicação entre eles é facilitada pelo Eureka Server e OpenFeign.

## Tecnologias Utilizadas

- **Spring Data JPA**: Abstração para persistência de dados com JPA.
- **Spring Cloud**: Ferramentas para construção de sistemas distribuídos e escaláveis.
- **Docker**: Containerização dos microserviços.
- **Docker Compose**: Orquestração dos containers Docker.
- **Criação de Imagens Docker**: Cada microserviço gera sua própria imagem Docker.
- **Docker Registry**: Registro das imagens no Docker Hub ou outro registry.
- **Git e GitHub**: Versionamento de código.
- **OpenFeign**: Comunicação simplificada entre microserviços via HTTP.
- **Eureka Server**: Descoberta de serviços (Service Discovery) para os microserviços.
- **API Gateway**: Roteamento e balanceamento de carga entre os microserviços.
- **Hibernate**: Framework de ORM para persistência de dados.
- **API RESTful**: Implementação de APIs seguindo o padrão REST.
- **Postman**: Ferramenta para teste das APIs.
- **Banco de Dados H2**: Banco em memória utilizado durante o desenvolvimento.
- **Tratamento de Exceções Personalizado**: Customização do tratamento de erros e exceções.
- **Arquitetura em Camadas**: Organização do projeto em camadas (Controller, Service, Repository).
- **Protocolo HTTP no padrão REST**: Comunicação seguindo o padrão REST.

## Estrutura do Projeto

O projeto contém 2 microserviços que interagem entre si por meio de um **Eureka Server** para descoberta e registro, e um **API Gateway** para gerenciamento de requisições.

### Serviços:

1. **Serviço user-api**: Responsável Gerenciar os dados dos usuários.
2. **Serviço payroll-api**: Responsável pelo gerenciamento de folhas de pagamento. Ele calcula a remuneração de cada usuário com base nos dados fornecidos pelo serviço user-api.
3. **Serviço eureka-server**: Responsável pela descoberta de serviços no ecossistema de microserviços. Ele atua como um registro central onde todos os microserviços (como user-api e payroll-api) se registram e permitem que outros serviços encontrem e se comuniquem entre si sem a necessidade de configuração manual de endpoints.
4. **Serviço api-gateway**: Responsável por atuar como uma porta de entrada para todas as requisições feitas aos microserviços. Ele roteia as chamadas para os serviços correspondentes, como user-api ou payroll-api, e também pode implementar funcionalidades como autenticação, controle de taxa de requisições (rate limiting) e monitoramento de tráfego.

Cada um desses serviços está containerizado e gerenciado pelo Docker, facilitando o deploy e escalabilidade.

### Comunicação

A comunicação entre os microserviços é facilitada pelo **OpenFeign** e pelo **Eureka Server**, que permite que os serviços descubram uns aos outros sem a necessidade de endereços fixos. As requisições externas são gerenciadas pelo **API Gateway**, que distribui as chamadas para os serviços correspondentes.

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas antes de rodar o projeto:

- [Docker](https://docs.docker.com/get-docker/)
- [Docker Compose](https://docs.docker.com/compose/install/)
- [Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)




