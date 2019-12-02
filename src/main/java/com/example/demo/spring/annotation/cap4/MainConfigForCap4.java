package com.example.demo.spring.annotation.cap4;

import com.example.demo.spring.annotation.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfigForCap4 {
    @Bean("person1")
    public Person person(){
        System.out.println("容器加载bean------------>");
        return new Person("name",20);
    }

}
