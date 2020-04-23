package com.example.demo.shejimoshi.structure.bridge.myBag;

public class SmallBag extends MyBag{
    public void pick(){
        System.out.println("采摘水果开始");
        this.material.draw();
        System.out.println("采摘了一小袋");
    }
}
