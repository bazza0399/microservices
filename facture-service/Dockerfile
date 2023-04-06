FROM  openjdk:8-jdk-alpine
EXPOSE 8087
ADD /target/invoices-microservices-1.0.jar invoices-microservices.jar
ENTRYPOINT ["java", "-jar", "invoices-microservices.jar"]
