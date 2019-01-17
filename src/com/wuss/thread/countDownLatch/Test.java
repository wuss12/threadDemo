package com.wuss.thread.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) {
        int number = 4;
        CountDownLatch countDownLatch = new CountDownLatch(number);
        for(int i = 0;i<number;i++){
            new ThreadDemo(countDownLatch).start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------------------");
        System.out.println(Thread.currentThread().getName());
    }
}
