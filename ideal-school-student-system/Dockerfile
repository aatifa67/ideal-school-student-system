FROM maven:3.9.4-eclipse-temurin-17

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

CMD ["java", "-jar", "target/student-management-1.0.0.jar"]