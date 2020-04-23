package com.example.demo.spring.annotation.cap3;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import org.springframework.core.io.Resource;
import java.io.IOException;

public class MyAnnotationType implements TypeFilter {
    //metadataReader：当前类的信息读取
    //metadataReaderFactory：可以读取其他任何类的信息
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前正在加载的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //类名
        String className = classMetadata.getClassName();
        //类路径
        Resource resource = metadataReader.getResource();
        System.out.println("扫描类名："+className+"注解"+annotationMetadata+"路径"+resource);
        if(className.contains("myDao")){
            return true;
        }
        return false;
    }
}
