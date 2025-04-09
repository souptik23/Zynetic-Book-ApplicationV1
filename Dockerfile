# Stage 1: Build the application using Maven and JDK 21
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the application using a lightweight JDK 21 image
FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/Bookstore-Application-Zynetic-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
