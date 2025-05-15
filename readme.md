# 📚 Cadastro de Escolas

Este é um projeto full stack para cadastro e gerenciamento de escolas, desenvolvido com **Spring Boot** e **AngularJS**. Ele permite realizar operações básicas de CRUD (Criar, Ler, Atualizar e Deletar) com persistência de dados em ProstgreSQL.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot (Web, Data JPA)
- PostgreSQL
- AngularJS
- HTML
- Maven

---

## ⚙️ Funcionalidades

- 🔹 Listar escolas cadastradas
- 🔹 Cadastrar nova escola
- 🔹 Editar dados de uma escola
- 🔹 Excluir escola
- 🔹 Interface AngularJS integrada diretamente via `src/main/resources/static`

---

## 📁 Estrutura do Projeto

```
cadastro-escolas/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── cadastro_escolas/
│       │           ├── CadastroEscolasApplication.java
│       │           ├── controller/
│       │           │   └── EscolaController.java
│       │           ├── model/
│       │           │   └── Escola.java
│       │           └── repository/
│       │               └── EscolaRepository.java
│       └── resources/
│           ├── static/
│           │   ├── index.html
│           │   ├── app.js
│           │   └── escola-controller.js
│           ├── templates/              
│           └── application.properties
├── target/                              
├── .gitignore
├── mvnw / mvnw.cmd
├── pom.xml                            
└── README.md

```

---

## ▶️ Como Executar

### 1. Clonar o repositório

```bash
git clone https://github.com/davigoularts/cadastro-escolas.git
cd cadastro-escolas
```

### 2. Rodar a aplicação

Abra o projeto no IntelliJ e execute a classe:

```
CadastroEscolasApplication.java
```

A aplicação será iniciada em:
```
http://localhost:8080
```

### 3. Usar a interface AngularJS

A interface AngularJS está no arquivo `index.html`, que é servido automaticamente por Spring Boot (pasta `static`). Basta acessar:

```
http://localhost:8080
```

---

## 📌 Objetivo

Este projeto foi desenvolvido com o objetivo de praticar o desenvolvimento de aplicações web completas, utilizando Spring Boot como backend e AngularJS no frontend.

---

## 👤 Autor

Desenvolvido por [@davigoularts](https://github.com/davigoularts)

---

## 📝 Licença

Este projeto é open source e está licenciado sob os termos da Licença MIT.
