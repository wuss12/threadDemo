package com.wuss.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new ThreadTest());
        executorService.submit(new ThreadTest());
        executorService.submit(new ThreadTest());
        executorService.submit(new ThreadTest());
        executorService.shutdown();
    }
}
