package com.example.demo.shejimoshi.structure.decorator;

import com.example.demo.shejimoshi.product.fruit.Bag;

/**
 * 实际包装类   快递加急
 */
public class SpeedDecorator extends BagDecorator{
    public SpeedDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        //调用原始方法
        super.pack();
        //包装方法
        speed();
    }
    //
    public void speed(){
        System.out.println("加急快递，请优先派送");
    }
}
