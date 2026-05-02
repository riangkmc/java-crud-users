# API de Usuários e Endereços


API REST desenvolvida como projeto de estudo com o objetivo de aplicar conceitos de desenvolvimento backend utilizando o ecossistema Spring.

A aplicação permite o gerenciamento de usuários e seus respectivos endereços, explorando práticas como arquitetura em camadas, persistência de dados com JPA e documentação de APIs com OpenAPI.

---

## Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Lombok 
* Swagger (OpenAPI)

---

## Configuração

Configure as credenciais do banco de dados no arquivo `application.properties` ou `application.yml`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

---

## Como executar o projeto

```bash
# Clonar repositório
git clone https://github.com/riangkmc/java-crud-users

# Entrar na pasta
cd java-crud-users

# Executar o projeto (via Maven Wrapper)
mvn spring-boot:run
```

---



---

## Endpoints da API

### 👤 Usuários

* `GET /users` → listar usuários
* `POST /users` → criar usuário
* `GET /users/{id}` → buscar por ID
* `PUT /users/{id}` → atualizar usuário
* `DELETE /users/{id}` → deletar usuário por ID
* `DELETE /users` → deletar todos os usuários e seus respectivos endereços
* `POST /users/{id}/enderecos` → adicionar endereço a um usuário

### 📍 Endereços

* `GET /addresses` → listar endereços
* `GET /addresses/{id}` → buscar endereço por ID
* `PUT /addresses/{id}` → atualizar endereço
* `DELETE /addresses/{id}` → deletar endereço por ID
* `DELETE /addresses` → deletar todos os endereços

---

## Documentação da API (Swagger)

A documentação interativa da API está disponível via Swagger:

👉 http://localhost:8080/swagger-ui/index.html

Através dela, é possível visualizar e testar todos os endpoints diretamente pelo navegador.

---

##  Arquitetura

O projeto segue uma arquitetura em camadas:

* **Controller** → responsável por receber e tratar as requisições HTTP
* **Service** → contém as regras de negócio
* **Repository** → responsável pelo acesso aos dados
* **Model** → representação das entidades

---

##  Melhorias futuras

* Implementar autenticação e autorização com JWT
* Adicionar testes automatizados
* Realizar deploy da aplicação

---

##  Autor

Rian Barbosa Rampinelli Delgado
