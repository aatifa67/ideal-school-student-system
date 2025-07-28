FROM eclipse-temurin:11-jdk
WORKDIR /app
COPY . /app
RUN ./mvnw clean package -DskipTests || mvn clean package -DskipTests
EXPOSE 8080
CMD ["java", "-jar", "target/student-management-1.0.0.jar"]
