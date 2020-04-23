package com.example.demo.spring.annotation.cap6;

import com.example.demo.spring.annotation.pojo.Cat;
import com.example.demo.spring.annotation.pojo.Dog;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Cat.class, Dog.class,MyImportSelecor.class,MyImportRegisterDefinitions.class})
public class MainConfig6 {
}
