

Resgatar oferta
Crie um projeto com as seguintes informações

separadameente para facil entendimento, projeto para desafio e reopsitorio no github
Faça oque o enunciado pede
Antes de começar explique em poucas palavras oque vc irá fazer para que eu saiba se voce netendeu ou não

Nesta primeira fase, mergulharemos na configuração do ambiente de desenvolvimento Java para o nosso desafio de construção do LiterAlura. Certifique-se de ter os seguintes programas, arquivos e versões:

Java JDK: versão: 17 em diante -
Download the Latest Java LTS Free

Maven: versão 4 em diante

Spring: versão 3.2.3 - https://start.spring.io/

Postgres: versão16 em diante - PostgreSQL: Downloads

IDE (Ambiente de desenvolvimento integrado) IntelliJ IDEA- opcional -
Baixe o IntelliJ IDEA – O principal IDE para Java e Kotlin

Configuração ao criar o projecto com Spring Initializr:

Java (versão 17 em diante)

Maven (Initializr utiliza a versão 4)

Spring Boot (versão 3.2.3)

Projeto em JAR

Dependências para adicionar ao criar o projeto com Spring Initializr:

Spring Data JPA

Postgres Driver

A API Gutendex é um catálogo com informações sobre os mais de 70 mil livros presentes no Project Gutenberg (biblioteca online gratuita).

Neste passo crucial, é fundamental compreender melhor a API de livros, revisar sua documentação e aprender a realizar consultas na API. Neste desafio, não é necessário obter uma chave de acesso, apenas realizar as consultas, tais como descritas no site oficial.

        Certifique-se de seguir cuidadosamente as instruções proporcionadas pela API Gutendex.

Link da API:
Gutendex

Repositório da API*: GitHub - garethbjohnson/gutendex: Web API for Project Gutenberg ebook metadata

* Deixamos aqui o código oficial (o repositório) da API, caso você tenha curiosidade sobre como foi feito

Constuindo o Cliente para Requisições (HttpClient)

Na terceira fase do nosso desafio, utilizamos a classe HttpClient para fazer requisições à API de livros e obter dados essenciais. O uso do HttpClient em Java facilita a conexão e a obtenção de respostas de maneira eficiente. Além disso, fornece uma base sólida para realizar operações HTTP de maneira mais estruturada e versátil. Explorar e entender o manejo dessa classe em Java otimiza o processo de solicitação.



Construindo a Solicitação (HttpRequest)

Agora vamos mergulhar no uso da classe HttpRequest para configurar e personalizar nossas solicitações à API de livros. A classe HttpRequest em Java nos oferece um controle detalhado sobre os parâmetros de nossas solicitações, sendo essencial para adaptar a consulta às nossas necessidades específicas. Aprender a usar a classe HttpRequest não apenas é crucial para o sucesso do nosso projeto, mas também proporciona uma compreensão mais profunda de como interagir de maneira eficiente com APIs em Java.



Construindo a Resposta (HttpResponse)

Finalmente, podemos focar no uso da interface HttpResponse para gerenciar as respostas recebidas da API. A interface HttpResponse em Java oferece uma estrutura que permite acessar e analisar os diferentes elementos de uma resposta HTTP. Ao compreender como trabalhar com esta interface, você será capaz de extrair informações significativas das respostas, como códigos de status, cabeçalhos e o corpo da resposta, que geralmente é apresentado em formato JSON.

Na quarta fase do nosso desafio, mergulharemos na análise da resposta JSON utilizando a biblioteca Jackson em Java. A manipulação de dados JSON é essencial, já que a maioria das respostas das API se apresentam neste formato.

        → Para facilitar a análise dos dados que serão obtidos a partir da API, recomendamos o uso do site de API para realizar consulta de livros e autores.

Com a biblioteca Jackson, você poderá realizar o mapeamento eficiente de dados JSON para objetos Java, facilitando assim a extração e manipulação da informação necessária.

→ Não se esqueça de agregar a biblioteca Jackson ao projeto como dependência do arquivo POM.xml - sugerimos usar a versão 2.16.

Lembre-se de utilizar as classes proporcionadas pelo Jackson, como ObjectMapper, para acessar as distintas propriedades da resposta JSON.

        Nesta etapa, realizaremos as conversões com os dados de livros e autores, agora que contamos com a informação em nosso poder.raised_hands

Experimente utilizar as classes Java para receber os dados obtidos através da API, transformar os atributos do corpo JSON a uma classe Java e mostrar os resultados.

É fundamental criar métodos específicos para manejar esses dados, o que fará com que o código seja mais modular e fácil de entender, como os métodosgetters, setters and toString().

        → Não se esqueça de utilizar as anotações @JsonIgnoreProperties e @JsonAlias para obter os atributos desejados do corpo de resposta Json.

Nesta etapa do desafio, entraremos na interação com o usuário. O método Main deve implementar a interface CommandLineRunner e seu método run(), em que você deverá chamar um método para exibir o menu. Neste método, você deve criar um laço de repetição para apresentar ao usuário as opções de inserção e consulta. O usuário deverá selecionar um número que corresponderá à opção numérica e proporcionar os dados que a aplicação receberá, utilizando a classe Scanner para capturar a entrada do usuário.

        Lembre-se de exibir ao usuário as informações que forem demandadas e informar-lhe quando houver um erro. Além disso, é fundamental realizar diversos testes para garantir o funcionamento correto do programa, simulando diversas situações e caminhos para identificar e corrigir possíveis erros.

        Certo, agora vamos começar a construir nosso catálogo de livros e autores. Nesta etapa, realizamos consultas de livros na API, com a ajuda da URL base "https://gutendex.com/books/" (sugerimos verificar a documentação oficial para diferentes exemplos de consulta).

        Neste caso, realizamos a consulta pelo título do livro na API para reter o primeiro resultado obtido. Um livro deve ter os seguintes atributos:

Título;

Autor;

Idiomas;

Número de Downloads.

Com essa funcionalidade pronta, será possível apresentar na tela um listagem de todos os livros que já foram buscados.

        Além disso, você também deve possibilitar ao usuário ver um listagem com base no idioma em que um ou mais livros foram escritos, com a ajuda das consultas derivadas.

→ Neste desafio, vamos considerar que um livro possui apenas um idioma, para que as consultas feitas com esse objetivo sejam mais compreensíveis e simples. Em outras palavras, vamos manter apenas o primeiro resultado de idioma da lista de idiomas recebida.

        Em resumo, temos estas duas funcionalidades obrigatórias no projeto:

Busca de livro por título;

Listagem de todos os livros.

Como podemos ver no site da API, cada livro possui dados relacionados aos seus autores. Neste caso, o corpo do JSON recebe uma lista de autores por livro, onde cada autor possui três características:

Nome;

Ano de nascimento;

Ano de falecimento.

→ Neste desafio, vamos considerar que um livro possui apenas um autor, para que as consultas feitas com esse objetivo sejam mais compreensíveis e simples. Em outras palavras, vamos manter apenas o primeiro resultado de autor da lista de autores recebida.

Ao salvar os dados dos autores, teremos a opção de listar os autores dos livros buscados.

        Além disso, pensando nos anos de nascimento e falecimento, é possível até mesmo realizar uma consulta de autores vivos em um determinado ano. O que você acha?

        Em resumo, temos estas duas funcionalidades obrigatórias relacionadas aos autores:

Lista de autores;

Listar autores vivos em determinado ano.

Chegou o momento de nos concentrarmos em construir uma base de dados, com tabelas e atributos relacionados aos nossos objetos de interesse: Livro e Autor.

        Neste desafio, vamos utilizar o banco de dados chamado PostgreSQL, um dos bancos de dados open source mais utilizados no mercado.

→ Se tem mais experiência com outro banco relacional, como o MySQL, pode utilizá-lo sem problemas.

Sugerimos a criação de classes de entidade/modelo para Livro e Autor, assim como suas respectivas interfaces de repositório para lidar com inserções e consultas no banco de dados.

→ Não se esqueça de usar as anotações corretas e de importar JpaRepository, porque estamos trabalhando com um projeto Spring com Spring Data JPA, então ele pode lidar com as funções necessárias para nosso desafio Java com persistência de dados.

Ao criar os repositórios de livros e autores, lembre-se de realizar a conversão dos atributos do livro presentes no resultado JSON para um objeto Java correspondente ao livro, assim será mais fácil lidar com os dados obtidos no seu projeto.

[IMPORTANTE] Ao inserir um livro no banco, você também deverá inserir seu autor e assim manter uma relação entre os dois objetos via atributo de identificação (ou como chamamos, o famoso ID).

Uma vez que você já tem livros e autores salvos em seu banco de dados, que tal exibir estatísticas sobre eles para o seu usuário? Aproveite os recursos de Streams do Java e derived queries para fornecer ao seu usuário estatísticas sobre a quantidade de livros em um determinado idioma no banco de dados.

Não é necessário criar opções para todos os idiomas. Escolha no mínimo dois idiomas.

        Em resumo, temos esta funcionalidade obrigatória no projeto:

Exibir a quantidade de livros em um determinado idioma.

Agora que você avançou no uso do banco de dados, convidamos você a mudar o método para listar os autores vivos em um determinado ano. Para isso, você deve usar derived queries para recuperar todos os autores que estavam vivos no ano que o usuário fornecerá.

        → Lembre-se de fazer testes para receber adequadamente os dados, porque isso ajudará você a lidar com os valores inválidos que o usuário possa inserir no sistema.

Entendi sim. Vou resumir em poucas palavras o que vou fazer, para você confirmar se está correto antes de eu montar o projeto completo.

O que eu vou fazer no projeto
Vou criar um projeto Java com Spring Boot chamado LiterAlura, organizado como um projeto real de GitHub, com as camadas separadas para facilitar o entendimento.

O projeto irá:

        1️⃣ Consumir a API Gutendex

        Usar HttpClient, HttpRequest e HttpResponse para buscar livros pela API.

2️⃣ Converter o JSON para objetos Java

Usar Jackson (ObjectMapper)

Criar classes para representar:

Livro

        Autor

DadosLivro (dados vindos da API)

3️⃣ Salvar os dados no banco PostgreSQL

Usar Spring Data JPA

Criar entidades:

Livro

        Autor

Criar repositórios:

LivroRepository

        AutorRepository

4️⃣ Criar um menu interativo no terminal
Usando CommandLineRunner e Scanner.

O menu terá:

Buscar livro por título (API)

Listar todos os livros

Listar autores

Listar autores vivos em determinado ano

Listar livros por idioma

Estatística de livros por idioma

        Sair

5️⃣ Relacionamento entre entidades

Um Livro terá 1 Autor
e um Autor pode ter vários livros.

6️⃣ Estrutura profissional do projeto

        literalura
│
        ├── model
│   ├── Livro
│   ├── Autor
│
        ├── dto
│   ├── DadosLivro
│   ├── DadosAutor
│
        ├── repository
│   ├── LivroRepository
│   ├── AutorRepository
│
        ├── service
│   ├── ConsumoApi
│   ├── ConverteDados
│
        ├── principal
│   ├── Principal (menu do usuário)
│
        └── LiterAluraApplication
7️⃣ Também vou mostrar

Dependências do pom.xml

Configuração do PostgreSQL

Como criar o projeto no Spring Initializr

Como subir no GitHub

Código separado e explicado

Resultado final do desafio
O projeto permitirá:

        ✔ Buscar livro na API
✔ Salvar livro e autor no banco
✔ Listar livros
✔ Listar autores
✔ Buscar autores vivos em um ano
✔ Listar livros por idioma
✔ Mostrar estatísticas de idiomas

Antes de eu montar tudo
Quero confirmar uma coisa com você.

Você quer que eu também mostre:

        1️⃣ Estrutura completa do repositório GitHub (README profissional)
ou

2️⃣ Apenas o código do projeto organizado para estudo

        Se quiser, eu também posso te entregar:

        ✅ A estrutura usada pelos alunos da Alura que tiram nota máxima nesse desafio
✅ Diagramas para entender o projeto
✅ Fluxo da aplicação
✅ Passo a passo para rodar

Se você quiser, eu também posso montar uma versão MUITO didática, perfeita para quem está aprendendo Java e Spring (que parece ser seu caso pelas perguntas anteriores).


codigo projeto organizado

Abaixo está um exemplo completo e organizado do projeto LiterAlura, separado em partes para facilitar o entendimento e pronto para ser colocado em um repositório no GitHub.

        1️⃣ Estrutura do Projeto
Estrutura recomendada:

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
2️⃣ pom.xml (Dependências)
<dependencies>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
    </dependency>

    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.16.1</version>
    </dependency>

</dependencies>
        3️⃣ Classe Principal (Spring Boot)
LiteraluraApplication.java

package br.com.literalura;

import br.com.literalura.principal.Principal;
import br.com.literalura.repository.AutorRepository;
import br.com.literalura.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private AutorRepository autorRepository;

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Principal principal = new Principal(livroRepository, autorRepository);
        principal.exibeMenu();

    }
}
4️⃣ Classe de Consumo da API
ConsumoApi.java

package br.com.literalura.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    public String obterDados(String endereco){

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {
            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
5️⃣ Conversão JSON → Objeto
ConverteDados.java

package br.com.literalura.service;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados {

    private ObjectMapper mapper = new ObjectMapper();

    public <T> T obterDados(String json, Class<T> classe){

        try {
            return mapper.readValue(json, classe);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}