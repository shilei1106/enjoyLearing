package com.example.demo.spring.annotation.applicationContextAware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig7 {
    @Bean
    public Plane plane(){
        return new Plane();
    }
}
