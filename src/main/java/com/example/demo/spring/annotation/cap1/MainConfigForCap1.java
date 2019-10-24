package com.example.demo.spring.annotation.cap1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfigForCap1 {

    @Bean("person")
    //默认单实例
    @Scope("prototype")
    @Lazy
    public Person person(){
        return new Person("shilei",18);
    }
}
