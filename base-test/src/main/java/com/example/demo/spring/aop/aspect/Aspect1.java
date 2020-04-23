package com.example.demo.spring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect1 {
    @Before("execution(public int com.example.demo.spring.aop.service.Service1.div())")
    public void logStart(){
        System.out.println("开始运算，。。。。参数列表:{}");
    }
    @After("execution(public int com.example.demo.spring.aop.service.Service1.div())")
    public void logEnd(){
        System.out.println("运算结束，。。。。结果是:{}");
    }
    public void logReturn(){
        System.out.println("正常返回，。。。。结果是:{}");
    }
    public void logExpection(){
        System.out.println("运算异常，。。。。异常信息:{}");
    }
}
