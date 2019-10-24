package com.example.demo.spring.annotation.cap2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value = "com.example.demo.spring.annotation.pojo",
        includeFilters={@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})},
        useDefaultFilters = false)
public class MainConfig {
}
