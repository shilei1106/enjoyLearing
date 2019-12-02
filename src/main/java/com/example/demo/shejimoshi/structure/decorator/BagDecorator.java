package com.example.demo.shejimoshi.structure.decorator;

import com.example.demo.shejimoshi.product.fruit.Bag;

/**
 * 装饰器抽象类  将被包装对象注入，并调用原始方法
 * 实现相同接口，并传入原始对象，并构造有参构造器
 */
public abstract class BagDecorator implements Bag{
    private Bag bag;

    public BagDecorator(Bag bag){
        this.bag=bag;
    }
    public void pack(){
        bag.pack();
    };
}
