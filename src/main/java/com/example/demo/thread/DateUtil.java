package com.example.demo.thread;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.SimpleFormatter;

public class DateUtil {
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static Date parse(String dataStr){
        Date date=null;
        try {
            date=sdf.parse(dataStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(20);
        for(int i=1;i<21;i++){
            Runnable runnable=new Runnable(){
                @Override
                public void run() {
                    System.out.println("启动线程");
                }
            };
            executorService.execute(runnable);
        }
        executorService.shutdown();
    }
}
