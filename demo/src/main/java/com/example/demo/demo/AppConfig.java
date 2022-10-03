package com.example.demo.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "myDevBean")
    @ConditionalOnProperty(prefix = "spring.profiles", name = "active", havingValue = "dev")
    public String myDevBean(){
        return "DevBean";
    }
    
    @Bean(name = "myProdBean")
    @ConditionalOnProperty(prefix = "spring.profiles", name = "active", havingValue = "prod")
    public String myProdBean(){
        return "ProdBean";
    }
}
