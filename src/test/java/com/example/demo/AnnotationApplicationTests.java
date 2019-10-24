package com.example.demo;

import com.example.demo.spring.annotation.cap1.MainConfigForCap1;
import com.example.demo.spring.annotation.cap1.Person;
import com.example.demo.spring.annotation.cap2.MainConfig;
import com.example.demo.spring.annotation.cap3.MyAnnotationType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * //@ComponentScan value:指定要扫描的包
 * //excludeFilters = Filter[] 指定扫描的时候按照什么规则排除那些组件
 * //includeFilters = Filter[] 指定扫描的时候只需要包含哪些组件
 * //useDefaultFilters = false 默认是true,扫描所有组件，要改成false
 * //－－－－扫描规则如下
 * //FilterType.ANNOTATION：按照注解
 * //FilterType.ASSIGNABLE_TYPE：按照给定的类型；比如按BookService类型
 * //FilterType.ASPECTJ：使用ASPECTJ表达式
 * //FilterType.REGEX：使用正则指定
 * //FilterType.CUSTOM：使用自定义规则，自已写类，实现TypeFilter接口
 */

@SpringBootTest
class AnnotationApplicationTests {
    /**
     * cap1 Test  ClassPathXmlApplicationContext:类路径下的XML
     */
    @Test
    void test1() {
        //获取上下文
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person)app.getBean("person");
        System.out.println(person);
    }

    /**
     * 来测试//AnnoatationConfigApplicationContext: 注解配置来获取IOC容器
     */
    @Test
    void test2(){
        //声明容器，将配置类加载到容器
        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] ss = app.getBeanDefinitionNames();
        for(String s:ss){
            System.out.println(s);

        }
    }
    /**
     * 自定义注解
     */
    @Test
    void test3(){
        //声明容器，将配置类加载到容器
        ApplicationContext app = new AnnotationConfigApplicationContext(MyAnnotationType.class);
        String[] ss = app.getBeanDefinitionNames();
        for(String s:ss){
            System.out.println("根据自定义规则加载的类："+s);
        }
    }
    /**
     * 单实例和多实例（scope）   /   懒加载 lazy
     *默认单实例，可配置多实例；多实例默认懒加载，单实例默认
     */
    @Test
    void test4(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfigForCap1.class);
        Object o1 = app.getBean("person");
        Object o2 = app.getBean("person");
        System.out.println(o1.equals(o2));
    }

}
