package com.example.demo.shejimoshi.product.bag;

import com.example.demo.shejimoshi.product.fruit.Bag;

public class AppleBag implements Bag {
    @Override
    public void pack() {
        System.out.println("包装苹果");
    }
}
