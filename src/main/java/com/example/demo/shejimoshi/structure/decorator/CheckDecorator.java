package com.example.demo.shejimoshi.structure.decorator;

import com.example.demo.shejimoshi.product.fruit.Bag;

public class CheckDecorator extends BagDecorator{
    public CheckDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        super.pack();
        check();
    }
    public void check(){
        System.out.println("打上防伪标记");
    }
}
