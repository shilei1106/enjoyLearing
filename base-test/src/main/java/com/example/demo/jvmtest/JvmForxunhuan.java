package com.example.demo.jvmtest;

/**
 * 模拟死循环
 */
public class JvmForxunhuan {
    private static Integer in = 0;
    static void fro(){
        while(true){
            in++;
            System.out.println(in);
        }
    }

    public static void main(String[] args) {
        JvmForxunhuan.fro();
    }
}
