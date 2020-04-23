package com.example.demo.spring.annotation.cap5;

import com.example.demo.spring.annotation.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig5 {
    @Bean("person")
    @Conditional({LinuxConditional.class})
    public Person person(){
        System.out.println("容器注入person");
        return new Person("aaa",33);
    }
    @Conditional({WindowsConditional.class})
    @Bean("windows")
    public Person windows(){
        System.out.println("容器注入windows");
        return new Person("windows",20);
    }
    @Bean("linux")
    @Conditional({LinuxConditional.class})
    public Person linux(){
        System.out.println("容器注入linux");
        return new Person("linux",22);
    }
}
