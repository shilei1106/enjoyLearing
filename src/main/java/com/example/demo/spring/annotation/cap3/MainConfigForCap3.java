package com.example.demo.spring.annotation.cap3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.sql.SQLOutput;

@Configuration
@ComponentScan(value = "com.example.demo.spring.annotation.pojo",
                includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyAnnotationType.class})},
                useDefaultFilters = false)
public class MainConfigForCap3 {

}
