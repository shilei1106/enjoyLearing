package com.example.demo.shejimoshi.structure.decorator;

import com.example.demo.shejimoshi.product.bag.AppleBag;
import com.example.demo.shejimoshi.product.fruit.Bag;

public class DecoratorTest {
    public static void main(String[] args) {
        Bag bag=new AppleBag() ;
        //装饰器
        bag = new CheckDecorator(bag);
        bag = new SpeedDecorator(bag);
        bag.pack();

    }
}
