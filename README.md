📚 LiterAlura

Projeto desenvolvido como desafio da Alura, com o objetivo de construir um catálogo de livros utilizando Java, Spring Boot, PostgreSQL e consumo de API.

A aplicação consome dados da API Gutendex, permitindo buscar livros, salvar informações no banco de dados e realizar consultas sobre livros e autores.

🚀 Funcionalidades

A aplicação permite:

✔ Buscar livros pelo título através da API Gutendex
✔ Salvar livros e autores no banco de dados
✔ Listar todos os livros registrados
✔ Listar todos os autores registrados
✔ Listar autores vivos em um determinado ano
✔ Listar livros por idioma
✔ Exibir estatísticas de quantidade de livros por idioma

🛠️ Tecnologias utilizadas

Java 17+

Spring Boot 3.2.3

Maven

PostgreSQL

Spring Data JPA

Jackson (JSON)

HttpClient (Java)

🌐 API utilizada

A aplicação consome dados da API:

Gutendex
https://gutendex.com/

A API fornece informações sobre mais de 70 mil livros do Project Gutenberg, incluindo:

título

autor

idiomas

número de downloads

📦 Estrutura do Projeto
literalura
│
├── src/main/java/br/com/literalura
│
│   ├── LiteraluraApplication.java
│
│   ├── principal
│   │      └── Principal.java
│
│   ├── service
│   │      ├── ConsumoApi.java
│   │      └── ConverteDados.java
│
│   ├── dto
│   │      ├── DadosLivro.java
│   │      ├── DadosAutor.java
│   │      └── ResultadoBusca.java
│
│   ├── model
│   │      ├── Livro.java
│   │      └── Autor.java
│
│   └── repository
│          ├── LivroRepository.java
│          └── AutorRepository.java
│
└── pom.xml
⚙️ Configuração do Banco de Dados

Este projeto utiliza PostgreSQL.

Crie um banco chamado:

literalura

Configure o arquivo:

src/main/resources/application.properties

Exemplo:

spring.datasource.url=jdbc:postgresql://localhost/literalura
spring.datasource.username=postgres
spring.datasource.password=1234

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.format-sql=true
▶️ Como executar o projeto
1️⃣ Clonar o repositório
git clone https://github.com/seu-usuario/literalura.git
2️⃣ Acessar a pasta do projeto
cd literalura
3️⃣ Executar o projeto

Pelo terminal:

mvn spring-boot:run

Ou execute a classe:

LiteraluraApplication.java
🖥️ Menu da Aplicação

Ao iniciar o programa, o menu será exibido no terminal:

1 - Buscar livro pelo título
2 - Listar livros registrados
3 - Listar autores registrados
4 - Listar autores vivos em determinado ano
5 - Listar livros por idioma
6 - Estatísticas de livros por idioma
0 - Sair
🗄️ Modelo de Dados
Livro

id

título

idioma

número de downloads

autor

Autor

id

nome

ano de nascimento

ano de falecimento

Relacionamento:

Autor 1 ----- N Livro
📊 Exemplo de Consulta

Busca de livro pela API:

https://gutendex.com/books/?search=dom+casmurro

A aplicação extrai o primeiro resultado e salva os dados no banco.

📚 Aprendizados

Durante o desenvolvimento deste projeto foram aplicados conceitos de:

Consumo de API REST

Manipulação de JSON com Jackson

Programação Orientada a Objetos

Persistência de dados com JPA

Consultas derivadas no Spring Data

Estruturação de projetos Spring Boot

Integração com banco PostgreSQL

👨‍💻 Autor

Projeto desenvolvido para fins educacionais durante os estudos de Java e Spring Boot.

📄 Licença

Este projeto foi desenvolvido para fins de estudo.
