<div align="center">

![](https://img.shields.io/badge/Status-Concluído-brightgreen)
</div>

<div align="center">

# POC Spring-Boot-Redis
![](https://img.shields.io/badge/Autor-Ronnie%20Mikihiro%20Sato%20Lopes-brightgreen)
![](https://img.shields.io/badge/Language-java-brightgreen)
![](https://img.shields.io/badge/Framework-springboot-brightgreen)

![Java CI with Maven](https://github.com/wesleyosantos91/poc-multi-module-arch-hexagonal-springboot/workflows/Java%20CI%20with%20Maven/badge.svg?branch=main)
![Sonar Build](https://github.com/wesleyosantos91/poc-multi-module-arch-hexagonal-springboot/workflows/Sonar%20Build/badge.svg?branch=main)
![GitHub](https://img.shields.io/github/license/wesleyosantos91/poc-multi-module-arch-hexagonal-springboot)
</div>

## Fundamentos teóricos

> Cache é uma das abordagens para otimizar acesso à dados dos sistemas, onde evitamos requisições repetitivas nas fontes originais dos dados, que geralmente são grandes estruturas, complexas e nem sempre performáticas, assim com cache, passamos a consultar locais mais otimizados, que provêm acessos rápidos através de chaves.

Há diversas tecnologias de cache para utilizarmos nas aplicações Java, como: EHCache, Redis, Infinispan, Caffeine, etc, porém quando começamos a se preocupar com escalabilidade das nossas aplicações, consequentemente em aumentar o número de instâncias simultâneas das nossas aplicações, precisamos pensar em provedores que nos forneçam a possibilidade de cache distribuído, de forma que as informações armazenadas em cache possam ser compartilhada entre as instâncias, assim aprimorando o uso dos cache entre as aplicações, além de evitar problemas de validade dos caches entre as aplicações concorrentes.

Nessa POC utilizei o Redis, que é uma solução open source para armazenamento de estrutura de dados em memória, o qual pode ser utilizada como banco de dados, cache ou message broker.
##  Pré -requisitos

- [ `Java 17+` ](https://www.oracle.com/java/technologies/downloads/#java17)
- [ `Spring-Boot-2.7.1+` ](https://start.spring.io/)
- [ `Docker` ](https://www.docker.com/)
- [ `Docker-Compose` ](https://docs.docker.com/compose/install/)

## Stack
- **Sonar** Analise de qualidade e cobertura de testes
- **Redis** Armazenamento de estrutura de dados em memória

## Portas
| Aplicação          | Porta |
|--------------------|-------|
| Redis              | 6379  |


## Links

- OpenAPI
    - Swagger
        - http://localhost:8080/swagger-ui/index.html
    - API Docs
        - http://localhost:8080/v3/api-docs
      
## Setup

- ### Executando a aplicação com maven
- Execute o seguinte comando:
  ```
  ./mvnw clean spring-boot:run
  ```
  
- ### Executar docker-compose para subir a aplicação com container docker
- Execute o seguinte comando para subir os containers:
  ```
  docker-compose up
  ```
- Execute o seguinte comando para verificar os status do containers docker:
  ```
  docker-compose ps
  ```

## TODO List

- [x] Qualidade de código
    - [x] SonarLint