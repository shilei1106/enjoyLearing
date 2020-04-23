package com.example.demo.shejimoshi.structure.bridge;

import com.example.demo.shejimoshi.structure.bridge.material.Material;
import com.example.demo.shejimoshi.structure.bridge.material.Plastic;
import com.example.demo.shejimoshi.structure.bridge.myBag.MyBag;
import com.example.demo.shejimoshi.structure.bridge.myBag.SmallBag;

/**
 * 通过排列组合，用较少的类实现较多的组合，目的是功能分离并组合更多功能，在设计阶段考虑。
 */
public class BrigerPick {
    public static void main(String[] args){
        //型号
        MyBag myBag = new SmallBag();
        //材质
        Material material = new Plastic();

        //设置材质
        myBag.setMaterial(material);
        //采摘
        myBag.pick();
    }
}
