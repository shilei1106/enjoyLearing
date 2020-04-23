package com.example.demo.shejimoshi.create.singleton.lazy;

import java.io.Serializable;

public class MySingleton implements Serializable {
    public static MySingleton instance ;

    private MySingleton(){
        //private 无参构造器
    }
    //静态获取
    public static synchronized MySingleton getInstancec(){
//        synchronized (MySingleton.class){
            if(instance == null){
                instance = new MySingleton();
            }
//        }
        return instance;
    }



}
