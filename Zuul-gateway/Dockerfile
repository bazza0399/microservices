FROM openjdk:8-jdk-alpine
EXPOSE 8762
ADD /target/Zuul-Gateway-0.0.1-SNAPSHOT.jar Zuul-Gateway.jar
ENTRYPOINT ["java","-jar","Zuul-Gateway.jar"]