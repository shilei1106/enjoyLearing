package com.example.demo.spring.aop.service;

import org.springframework.context.ApplicationContext;

public class Service1 {
    public int div(int i ,int j){
        return i/j;
    }
    public static void main(String[] args){
        Service1 service1 = new Service1();
        double a = service1.div(1,2);
        System.out.println(a);
    }

}
