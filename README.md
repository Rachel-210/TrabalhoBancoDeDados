# 🏥 Gestão Hospital Terapêutico

## 📄 Descrição do Projeto
O Hospital Terapêutico é uma aplicação desktop desenvolvida para otimizar o gerenciamento administrativo de clínicas e centros de terapia. O sistema automatiza o controle de cadastros de pacientes e profissionais, além de organizar o agendamento de consultas com cálculos de valores e status. O projeto foca na aplicação de conceitos de Programação Orientada a Objetos (POO) e Banco de Dados Relacional, garantindo que as informações sejam armazenadas de forma segura e cruzada com integridade referencial.

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java (JDK 17)
* **Interface Gráfica:** Java Swing (NetBeans IDE)
* **SGBD:** PostgreSQL 16
* **Conectividade:** JDBC (Java Database Connectivity)
* **Gestão de Banco:** DBeaver (Scripts SQL e Modelagem)

## 📸 Prints da Aplicação
Estão localizados em uma pasta acima.

## 🚀 Funcionalidades
* **Cadastro de Clientes (Pacientes):** Registro completo com CPF (chave única) e histórico.
* **Cadastro de Terapeutas:** Gestão de profissionais por nome, especialidade, email e status.
* **Agendamento de Consultas:** Integração entre paciente e terapeuta com controle de data, valor e status da consulta.
* **Relatórios em Tempo Real:** Visualização de dados cruzados utilizando INNER JOIN e Aliases no PostgreSQL.

## ⚙️ Instruções de Execução
**1. Configuração do Banco de Dados (PostgreSQL)**
Para rodar a aplicação localmente, é necessário configurar o banco de dados seguindo os passos abaixo:
* Crie um banco de dados no PostgreSQL chamado HospitalTerapeutico.
* Execute o script de criação de tabelas contido na pasta /sql do projeto

**2. Configuração do Projeto Java**
* Importe o projeto na sua IDE (recomendado NetBeans).
* Adicione o driver JDBC do PostgreSQL (postgresql-42.x.x.jar) às bibliotecas do projeto.
* No arquivo Conexao.java, atualize as credenciais de acesso:
User: postgres
Password: sua_senha_aqui
* Execute o arquivo LoginView.java como classe principal.
