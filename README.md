Microservices

This repository contains a set of microservices built using Spring boot and Node.js and Docker. The microservices are designed to be scalable and fault-tolerant, and can be deployed either locally or to a cloud-based environment such as AWS or Google Cloud.

Installation
To install the microservices, you will need to have mvn and Docker installed on your system. Once you have those installed, follow these steps:

1-Clone the repository to your local machine.
2-Navigate to the root directory of the repository.
3-Run mvn install on each microservice(the one written with spring boot)
4-Run docker-compose up to start the services.
Usage
The microservices can be accessed via HTTP endpoints, which are exposed on different ports. To interact with the services, you can use a tool like Postman or cURL.

Here are some of the available endpoints:

/client-service/clients - Returns a list of clients.
/client-service/clients/:id - Returns a specific clients by ID.
/product-service/products - Returns a list of products.
/product-service/products/:id - Returns a specific products by ID.
/facture-service/factures - Returns a list of invoinces.
/facture-service/factures/:id - Returns a list of invoinces by ID

For monitoring the set of applications there is node exporter and prometheus for scraping metrics, and grafana and cadvisor of visualisation
