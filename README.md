📚 LiterAltura

O LiterAltura é um projeto em Java que permite construir seu próprio catálogo de livros, explorando conceitos essenciais de programação, consumo de APIs, manipulação de dados JSON e persistência em banco de dados.

A aplicação roda via console e oferece ao usuário diferentes formas de interação com os livros e autores buscados a partir de uma API pública.

🎯 Objetivo

Desenvolver um catálogo de livros interativo que:

Consuma dados de uma API de livros;

Armazene informações em um banco de dados relacional;

Permita ao usuário interagir via console com pelo menos 5 opções de navegação;

Filtre e exiba os livros e autores de interesse.

⚙️ Funcionalidades

O usuário pode interagir com o sistema através de um menu no console, que oferece opções como:

Buscar livros pela API

Listar todos os livros salvos no banco de dados

Listar autores cadastrados

Filtrar livros por idioma

Pesquisar livros ou autores específicos

🛠️ Tecnologias Utilizadas

Java 17+

Spring Boot

JPA/Hibernate

Banco de Dados (PostgreSQL ou MySQL)

API externa de livros (ex: Gutendex)

Maven para gerenciamento de dependências

🚀 Como Executar o Projeto
Pré-requisitos

Java 17+ instalado

Maven configurado

Banco de dados relacional (PostgreSQL) rodando

IntelliJ IDEA

Passos

Clone este repositório:

git clone https://github.com/seu-usuario/literalura.git


Acesse a pasta do projeto:

cd literalura


Configure o application.properties com as credenciais do seu banco.

Compile e execute o projeto:

mvn spring-boot:run


Interaja com o menu no console 🎉

📝 Backlog

 Configuração do ambiente Java

 Criação do projeto

 Consumo da API de livros

 Análise da resposta JSON

 Persistência de dados no banco

 Criação do menu de interação via console

 Melhorias futuras: interface gráfica, exportação de relatórios, integração com outras APIs

🌟 Aprendizados

Este projeto proporciona uma experiência prática e envolvente no desenvolvimento Java, abordando desde conceitos básicos até a integração com serviços externos e persistência de dados.
