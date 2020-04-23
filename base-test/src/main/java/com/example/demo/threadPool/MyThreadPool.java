package com.example.demo.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class MyThreadPool {
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);
    private static ExecutorService exectorService2 = Executors.newCachedThreadPool();

}
