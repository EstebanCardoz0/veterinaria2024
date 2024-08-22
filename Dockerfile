FROM openjdk:17-jdk-slim
LABEL authors="Esteban Cardozo"
ARG JAR_FILE=target/Veterinaria2024-0.0.1.jar
COPY ${JAR_FILE} app_veterinaria.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app_veterinaria.jar"]