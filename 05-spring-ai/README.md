# 💰 Budgeting - Spring AI

Projeto desenvolvido durante a trilha **Santander 2026 - AI Java Back-end**, com foco na construção de uma aplicação de gerenciamento financeiro utilizando **Java, Spring Boot, Spring AI, OpenAI e MySQL**.

A aplicação permite registrar e consultar transações financeiras e utiliza Inteligência Artificial para interpretar solicitações do usuário e executar operações por meio de ferramentas disponibilizadas à IA.

---

## 🚀 Sobre o projeto

O projeto consiste em uma aplicação de gerenciamento de transações financeiras integrada ao **Spring AI**.

O usuário pode interagir com o sistema utilizando linguagem natural, enquanto o modelo de IA utiliza ferramentas (*tools*) disponíveis na aplicação para consultar ou manipular os dados financeiros.

### Principais funcionalidades

- 💰 Registro de transações financeiras.
- 📋 Listagem de transações por categoria.
- 📊 Resumo de despesas por categoria.
- 🤖 Integração com OpenAI através do Spring AI.
- 🎙️ Transcrição de áudio para texto.
- 🔊 Conversão da resposta da IA para áudio.
- 🗄️ Persistência das transações em MySQL.
- 🧠 Uso de ferramentas (*tools*) para permitir que a IA interaja com os dados da aplicação.

---

## 🛠️ Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring AI
- OpenAI API
- Gradle
- MySQL
- Docker / Docker Compose
- Spring Data JPA
- Hibernate
- Git
- GitHub

---

## 📂 Estrutura do projeto

```text
05-spring-ai/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── dio/
│   │   │       └── budgeting/
│   │   │           ├── application/
│   │   │           │   ├── GetExpenseSummaryByCategoryUseCase.java
│   │   │           │   ├── ListTransactionsByCategoryUseCase.java
│   │   │           │   ├── PersistTransactionUseCase.java
│   │   │           │   └── output/
│   │   │           │       └── ExpenseSummaryOutput.java
│   │   │           │
│   │   │           ├── domain/
│   │   │           └── infrastructure/
│   │   │               └── http/
│   │   │                   └── TransactionController.java
│   │   │
│   │   └── resources/
│   │       ├── prompts/
│   │       │   └── system-message.st
│   │       └── application.properties
│   │
│   ├── test/
│   │
│   └── ...
│
├── build.gradle
├── docker-compose.yml
└── gradlew