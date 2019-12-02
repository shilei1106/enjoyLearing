package com.example.demo.shejimoshi.structure.bridge.myBag;

public class BigBag extends MyBag{
    @Override
    public void pick() {
//        super.pick();
        System.out.println("采摘水果开始");
        this.material.draw();
        System.out.println("采摘了一大袋");
    }
}
