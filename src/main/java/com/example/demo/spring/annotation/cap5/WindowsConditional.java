package com.example.demo.spring.annotation.cap5;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class WindowsConditional implements Condition {
    /**
     *
     * @param conditionContext：判断条件能使用的上下文（环境）
     * @param annotatedTypeMetadata 注释信息
     * @return true 则不注册bean
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取IOC适用的BeanFactory
        ConfigurableListableBeanFactory clb =  conditionContext.getBeanFactory();
        //获取类加载器
        ClassLoader classLoader = conditionContext.getClassLoader();
        //获取当前环境信息
        Environment environment = conditionContext.getEnvironment();
        //获取bean定义的注册类
        BeanDefinitionRegistry beanDefinitionRegistry = conditionContext.getRegistry();
        String propetry = environment.getProperty("os.name");
        if("Windows 10".equals(propetry)){
            System.out.println("classLoader:"+classLoader);
            System.out.println("beanDefinitionRegistry"+beanDefinitionRegistry);
            return true;
        }
        return false;
    }
}
