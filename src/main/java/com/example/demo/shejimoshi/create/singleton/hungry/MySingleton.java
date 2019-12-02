package com.example.demo.shejimoshi.create.singleton.hungry;

import java.io.Serializable;

public class MySingleton implements Serializable {
    public static MySingleton instance = new MySingleton();

    private MySingleton(){
        //private 无参构造器
    }
    public MySingleton getInstancec(){
        return instance;
    }
    //业务方法
//    public Object *****(){doSomeThing();}



}
