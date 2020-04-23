package com.example.demo.spring.annotation.applicationContextAware;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Plane implements ApplicationContextAware {
    private  String name;
    private String age;
    private ApplicationContext applicationContext;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Plane(){
        System.out.println("Plane.......constructor....noParam");
    }
    //对象创建赋值后调用
    @PostConstruct
    public void init(){
        System.out.println("Plane.......postConstruct........");
    }
    @PreDestroy
    public void destory(){
        System.out.println("Plane........PreDestory........");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
