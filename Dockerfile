FROM openjdk:21-jdk-slim
EXPOSE 8080
ADD target/calculation.jar calculation.jar
ENTRYPOINT ["java", "-jar", "/calculation.jar"]
