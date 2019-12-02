package com.example.demo.spring.annotation.cap6;

import com.example.demo.spring.annotation.pojo.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * 自定义注册类 可通过@Import注将bean注册到容器
 *
 */
public class MyImportRegisterDefinitions implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {

    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //todo:该注册类未验证通过
        Boolean beanDefinition1 = registry.containsBeanDefinition("com.example.demo.spring.annotation.pojo.Cat");
        Boolean beanDefinition2 = registry.containsBeanDefinition("com.example.demo.spring.annotation.pojo.Dog");
        RootBeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
        System.out.println("要判断cat和dog了");
        if(beanDefinition1 && beanDefinition2){
            System.out.println("我要注册pig了");
            registry.registerBeanDefinition("pig",beanDefinition);
        }
    }
}
