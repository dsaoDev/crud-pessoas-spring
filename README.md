# CRUD de Pessoas

## O QUE É A APLICAÇÃO :

Essa é uma aplicação de CRUD básico em que consiste em manipular dados no banco através da entidade Pessoa.

##	FUNCIONALIDADES :

- Encontra uma pessoa registrada no sistema por ID.

- Encontra uma lista de pessoas registradas no sistema.

- Registra uma pessoa no sistema.

- Atualiza dados de uma pessoa do sistema.

- Deleta uma pessoa do sistema.

## VERSIONAMENTO: 

  Versão do Java: 17

  Versão do Spring Boot: 3.0.6
  
## TECNOLOGIAS UTILIZADAS :

Back end:

- Java :heavy_check_mark:

- Spring Data JPA :heavy_check_mark:

- Maven :heavy_check_mark:

## SCHEMA

![schema](https://github.com/dsaoDev/crud-spring/assets/129787872/83d58fe7-51aa-422e-b3dc-5e305c8184e0)
  
## DEPENDENCIAS DO MAVEN :

Data JPA - > Utilizando o JPA para fazer a ponte entre o banco de dados e a aplicação -> ORM

Spring Web -> É uma aplicação WEB, Utilizado para receber requisições, devolver uma resposta ...

LomBok -> Utilizado para evitar muitas linhas de código através de annotations.

MySQL Connector -> Utilizado para se connectar ao Banco de Dados MySQL

## Programas Utilizados :
Postman - Utilizado para fazer as requisições (CONSUMIR) a aplicação.

STS- IDE escolhida para desenvolver o projeto.

MySQL -> Utilizado esse BANCO no ambiente de desenvolvimento e produção.

MySQL WorkBench - Plataforma utilizada para fazer a manipulação e a leitura dos dados de uma base de dados do banco MySQL.

Git e GitHub - Utilizados para commitar o projeto e subir o código para a nuvem(remoto). 

## COMO EXECUTAR O PROJETO
### PRÉ-REQUISITOS: JAVA 17

```bash
# clonar repositorio
git clone https://github.com/dsaoDev/crud-spring.git

# entrar na pasta do projeto
cd crud-spring-main

# executar o projeto
./mvnw spring-boot:run
```
