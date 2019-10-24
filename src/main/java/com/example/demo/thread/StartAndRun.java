package com.example.demo.thread;

public class StartAndRun {
     public static class Thread1 extends Thread{

         @Override
         public void run() {
          int i=90;
          while(i>0){
            System.out.println(Thread.currentThread().getName()+"is running" +  i--);
          }
         }
     }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "is running");
        }
    }
    //用new关键字创建
    //调用对象的clone方法
    //利用反射，调用Class类的或者是Constructor类的newInstance（）方法
    //用反序列化，调用ObjectInputStream类的readObject（）方法
     public static void main(String[] args){
         Thread1 t1 = new Thread1();
         Thread2 t2 = new Thread2();
         t1.setName("t1");
         t1.start();
//            t1.run();
     }
}
