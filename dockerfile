# Utilise une image de base Java 11 slim
FROM openjdk:11-jdk-slim

COPY target/monster-api.jar app.jar

# Expose le port 8080
EXPOSE 8080

# Démarre l'application
ENTRYPOINT ["java", "-jar", "/app.jar"]
