FROM openjdk:8u201-jdk-alpine3.9
ADD target/springboot-dockerfile-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]