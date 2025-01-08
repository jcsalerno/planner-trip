# Planner Project

O Planner Project é um sistema de planejamento de viagens desenvolvido em parceria com a Rocketseat, utilizando Spring Boot. Ele permite gerenciar viagens, atividades, participantes e links relacionados às viagens. A seguir, você encontrará uma visão geral de como o projeto funciona, suas funcionalidades e como ele é estruturado.

## Funcionalidades Principais

- **Gerenciamento de Viagens**: Criação, atualização, confirmação e listagem de viagens.
- **Gerenciamento de Atividades**: Adição e listagem de atividades relacionadas a uma viagem.
- **Gerenciamento de Participantes**: Convite, confirmação e listagem de participantes de uma viagem.
- **Gerenciamento de Links**: Adição e listagem de links úteis relacionados a uma viagem.

## Endpoints da API

### Viagens

- **Criar Viagem**: `POST /trips`
    - Cria uma nova viagem.
- **Detalhes da Viagem**: `GET /trips/{id}`
    - Retorna os detalhes de uma viagem específica.
- **Atualizar Viagem**: `PUT /trips/{id}`
    - Atualiza as informações de uma viagem existente.
- **Confirmar Viagem**: `GET /trips/{id}/confirm`
    - Confirma uma viagem.

### Atividades

- **Registrar Atividade**: `POST /trips/{id}/activities`
    - Adiciona uma nova atividade a uma viagem.
- **Listar Atividades**: `GET /trips/{id}/activities`
    - Lista todas as atividades de uma viagem.

### Participantes

- **Convidar Participante**: `POST /trips/{id}/invite`
    - Convida um novo participante para uma viagem.
- **Listar Participantes**: `GET /trips/{id}/participants`
    - Lista todos os participantes de uma viagem.
- **Confirmar Participante**: `POST /participants/{id}/confirm`
    - Confirma a participação de um participante.

### Links

- **Registrar Link**: `POST /trips/{id}/links`
    - Adiciona um novo link a uma viagem.
- **Listar Links**: `GET /trips/{id}/links`
    - Lista todos os links de uma viagem.

## Exemplos de Uso

### Criar uma nova viagem

```http
POST /trips
Content-Type: application/json

{
  "destination": "Paris",
  "starts_at": "2023-07-20T10:00:00",
  "ends_at": "2023-07-25T18:00:00",
  "emails_to_invite": ["email1@example.com", "email2@example.com"]
}
```

### Adicionar uma nova atividade a uma viagem

```http
POST /trips/{id}/activities
Content-Type: application/json

{
"title": "Visita à Torre Eiffel",
"occurs_at": "2023-07-21T14:00:00"
}
```
### Convidar um novo participante

```
POST /trips/{id}/invite
Content-Type: application/json

{
  "email": "novo.participante@example.com"
}

```

### Adicionar um novo link a uma viagem
```
POST /trips/{id}/links
Content-Type: application/json

{
  "title": "Informações Turísticas",
  "url": "https://www.parisinfo.com/"
}

```

## Estrutura do Projeto

O projeto é dividido em pacotes que representam as principais funcionalidades:

- activity: Contém as classes relacionadas ao gerenciamento de atividades.
- link: Contém as classes relacionadas ao gerenciamento de links.
- participant: Contém as classes relacionadas ao gerenciamento de participantes.
- trip: Contém as classes relacionadas ao gerenciamento de viagens

# Tecnologias Utilizadas ⚒️

- **Spring Boot**: Framework para criação de aplicativos Java baseados em Spring.
- **Java 21**: Linguagem de programação principal.
- **Hibernate/JPA**: Mapeamento objeto-relacional para persistência de dados.
- **Flyway**: Para migração de banco de dados.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **Lombok**: Biblioteca para reduzir o boilerplate de código Java.
  


<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=java,spring,postman,idea,hibernate" />
    
  </a>
</p>

