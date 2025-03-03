# Monster API

Cette application est une API REST pour gérer des monstres dans un jeu de type Gacha.  
Elle utilise Spring Boot et MongoDB, et est containerisée avec Docker.

## Prérequis

- Java 11 ou supérieur
- Maven
- Docker & Docker Compose

## Configuration

### MongoDB

La connexion à MongoDB est configurée via le fichier `application.properties` (ou `application.yml`):

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/monsterdb
