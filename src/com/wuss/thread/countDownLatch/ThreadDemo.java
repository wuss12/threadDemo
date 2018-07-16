package com.wuss.thread.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class ThreadDemo extends Thread {
    private CountDownLatch countDownLatch;
    public ThreadDemo(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {

        try {
            System.out.println(getName()+" running now...");
        } catch (Exception e) {

        } finally {
            countDownLatch.countDown();
        }

    }
}
