package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class FeignConfig {
@Bean
public BasicAuthRequestInterceptor mbBasicAuthRequestInterceptor(){
    return new BasicAuthRequestInterceptor("user","user");
}    
}
