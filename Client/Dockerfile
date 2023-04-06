FROM  openjdk:8-jdk-alpine
EXPOSE 8090
ADD /target/Client-0.0.1-SNAPSHOT.jar Client.jar
ENTRYPOINT ["java", "-jar", "Client.jar"]
