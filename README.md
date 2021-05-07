# DSVendas

# Sobre o projeto

https://gustavo-dsvendas.netlify.app/ - (O backend foi implantado no Heroku, caso o mesmo esteja inativo, será necessário aguardar uns 30s e efetuar o reload da página)

DSVendas é uma aplicação full stack web construída durante a 3ª edição da **Semana DevSuperior** (#sds3), evento organizado pela [DevSuperior](https://devsuperior.com.br/ "Site da DevSuperior").

Analise o desempenho das suas vendas por diferentes perspectivas.

Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.

## Modelo conceitual
![Modelo Conceitual](https://raw.githubusercontent.com/devsuperior/bds-assets/main/sds/sds3-mc.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- Apex Charts

## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/martinigustavo/projeto-dsvendas.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/martinigustavo/projeto-dsvendas.git

# entrar na pasta do projeto front end
cd frontend

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Gustavo Martini

[![LinkedIn Badge](https://img.shields.io/badge/LinkedIn-Profile-informational?style=flat&logo=linkedin&logoColor=white&color=0D76A8)](https://www.linkedin.com/in/martini-gustavo/)
