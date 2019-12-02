package com.example.demo.spring.aop;

import com.example.demo.spring.aop.aspect.Aspect1;
import com.example.demo.spring.aop.service.Service1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopMainConfig1 {
    @Bean
    public Service1 service1(){
        return new Service1();
    }
    @Bean
    public Aspect1 aspect1(){
        return  new Aspect1();
    }
}
