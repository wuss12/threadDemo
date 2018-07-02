package com.wuss.thread;

/**
 * sleep 让线程暂停执行，进入阻塞状态
 */
public class SleepDemoTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<10;i++){
            System.out.println(System.currentTimeMillis()+"\t i = " + i);
            Thread.sleep(1000);
        }
    }
}
