package com.example.demo.shejimoshi.structure.bridge.myBag;

import com.example.demo.shejimoshi.structure.bridge.material.Material;

/**
 * 大小
 */
public abstract class MyBag {
    //材质注入
    protected  Material material;
    //采摘方法
    public void pick(){};

    public void setMaterial(Material material) {
        this.material = material;
    }
}
