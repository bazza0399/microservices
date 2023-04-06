package com.esprit.microservice.Productservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
	
	 @Bean
	    ApplicationRunner init(ProductRepository repository) {
	        return args -> {
	            Stream.of("pc", "tel", "ipad").forEach(name -> {
	                repository.save(new Product(name));
	            });
	            repository.findAll().forEach(System.out::println);
	        };
	    }

}
