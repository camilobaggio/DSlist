# DSlist - Catálogo de Jogos

Este é um projeto educativo criado como parte do meu aprendizado em desenvolvimento web com Spring Boot. O objetivo do DSlist é construir uma API REST para catalogar jogos e listas personalizadas, oferecendo endpoints que permitem a consulta de jogos individuais, listas e detalhes específicos.

## Aprendizados
- Estruturação de APIs RESTful com Spring Boot.
- Uso de JPA para interação com banco de dados.
- Criação de endpoints para exibição de listas e detalhes de itens.

## Instalação e Execução

### Pré-requisitos
- [Git](https://git-scm.com/)
- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/) ou uma IDE como IntelliJ ou Eclipse que já inclua suporte ao Maven

### Passo a Passo

1. **Clone este repositório**:
    ```bash
    git clone git@github.com:camilobaggio/dslist.git
    cd DSlist
    ```

2. **Instale as dependências**:
    Se estiver usando o Maven, você pode instalar as dependências com o comando:
    ```bash
    mvn install
    ```

3. **Execute a aplicação**:
    Após instalar as dependências, rode a aplicação usando o Maven:
    ```bash
    mvn spring-boot:run
    ```
   Ou, se estiver usando uma IDE, localize a classe principal e inicie o projeto por lá.

4. **Acesse a aplicação**:
    A API estará disponível em `http://localhost:8080` por padrão.


   ## Endpoints da API

### Listar todos os jogos
- **Rota**: `GET /games`
- **Descrição**: Retorna uma lista com informações mínimas sobre todos os jogos disponíveis.
- **Exemplo de Resposta**:
    ```json
    [
      {
        "id": 1,
        "title": "Nome do Jogo",
        "year": 2023,
        "imgUrl": "link_da_imagem.jpg",
        "shortDescription": "Descrição breve do jogo"
      },
      ...
    ]
    ```

### Buscar jogo por ID
- **Rota**: `GET /games/{id}`
- **Descrição**: Retorna informações detalhadas sobre um jogo específico.
- **Parâmetro**: `id` - O ID do jogo que deseja buscar.
- **Exemplo de Resposta**:
    ```json
    {
      "id": 1,
      "title": "Nome do Jogo",
      "year": 2023,
      "imgUrl": "link_da_imagem.jpg",
      "description": "Descrição detalhada do jogo",
      "otherField": "outros detalhes..."
    }
    ```

### Listar todos os jogos em uma lista específica
- **Rota**: `GET /lists/{listId}/games`
- **Descrição**: Retorna uma lista de jogos para um ID específico de lista.
- **Parâmetro**: `listId` - O ID da lista que deseja consultar.
- **Exemplo de Resposta**:
    ```json
    [
      {
        "id": 1,
        "title": "Nome do Jogo",
        "year": 2023,
        "imgUrl": "link_da_imagem.jpg",
        "shortDescription": "Descrição breve do jogo",
        "position": 1
      },
      ...
    ]
    ```

### Listar todas as listas de jogos
- **Rota**: `GET /lists`
- **Descrição**: Retorna todas as listas de jogos.
- **Exemplo de Resposta**:
    ```json
    [
      {
        "id": 1,
        "name": "Nome da Lista"
      },
      ...
    ]
    ```


    ## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto.
- **Spring Boot**: Framework para desenvolvimento de aplicações Java que facilita a criação e configuração de APIs e aplicações web.
- **Spring Data JPA**: Subprojeto do Spring que facilita a integração com bancos de dados relacionais.
- **H2 Database**: Banco de dados em memória usado para desenvolvimento e testes.
- **Maven**: Ferramenta de gerenciamento de dependências e automação de builds.
- **Git**: Sistema de controle de versão para controle e colaboração no código-fonte.
- **GitHub**: Plataforma para hospedagem e colaboração de repositórios Git.









