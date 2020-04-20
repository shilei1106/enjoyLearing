package com.example.demo.shejimoshi.structure.decorator;

public class IncTest {
    public static void main(String args[]){
        IncTest inc = new IncTest ();
        int i = 0;
        inc.add(i);
        i = ++i;
        System.out.println(i);
    }
    void add(int i){
        i++;
    }
}
