📚 LiterAltura
------------------------------------------------------------------------------------------------

Aplicação desenvolvida em Java para construir um catálogo de livros consumindo dados de uma   API pública.
Os livros e autores podem ser consultados, filtrados e armazenados em banco de dados relacional, com interação via console.

🛠 Tecnologias
-----------------------------------------------------------------------------------------------
  . Java 17+
  
  . Spring Boot
  
  . Spring Data JPA
   
  . Banco relacional (PostgreSQL)
  
  . Maven
  
  . Hibernate
  
  . API pública Gutendex


🔑 Funcionalidades
------------------------------------------------------------------------------------------------
.Consumo da API de livros (JSON → objetos Java)

. Persistência em banco de dados

. Menu interativo no console com 5+ opções:

. Buscar livros pela API

. Listar todos os livros salvos

. Listar autores cadastrados

. Filtrar livros por idioma

. Pesquisar livros/autores específicos


🗄 Estrutura do Banco de Dados
------------------------------------------------------------------------------------------------
- livros

  .id
  
  .titulo
  
  .autor_id
  
  .idioma
  
  .downloads

- autores

   .id
  
   .nome
  
   .ano_nascimento
  
   .ano_falecimento


⚙️ Configuração
------------------------------------------------------------------------------------------------

Clone o repositório:

    git clone https://github.com/seu-usuario/literalura.git
    cd literalura


Configure o banco de dados no application.properties:

    spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
    spring.datasource.username=SEU_USUARIO
    spring.datasource.password=SUA_SENHA
    spring.jpa.hibernate.ddl-auto=update


Execute a aplicação:

    ./mvnw spring-boot:run

📖 Uso
------------------------------------------------------------------------------------------------
  Ao iniciar, o sistema exibirá um menu no console para navegação entre as opções de catálogo.
Exibir Menu:
```
***** LiterAlura *****

Escolha a opção desejada:

1 - Buscar livro pelo título
2 - Listar livros registrados
3 - Listar autores registrados
4 - Listar autores vivos em um determinado ano
5 - Listar livros em um determinado idioma
6 - Exibir Top 10 livros mais baixados

0 - Sair
```

🎯 Créditos
------------------------------------------------------------------------------------------------
   Projeto proposto como desafio educacional do programa Alura + Oracle Next Education (ONE).

------------------------------------------------------------------------------------------------
   Desenvolvido com ☕ por Renata Fombeli
