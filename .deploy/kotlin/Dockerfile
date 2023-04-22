FROM maven:3.8.7-openjdk-18 AS MAVEN

COPY ./kotlin/pom.xml ./pom.xml

RUN mvn dependency:go-offline -B

COPY ./kotlin/src ./src

RUN mvn clean package -DskipTests

FROM openjdk:18-alpine

WORKDIR /app

COPY --from=MAVEN target/*-SNAPSHOT.jar /application.jar
CMD ["java", "-jar", "/application.jar"]