package com.wuss.thread;

/**
 * 在程序执行流中，调用其它线程的join 方法时，调用的那个线程将被阻塞，直道
 * 被join 的线程执行完为止
 */
public class JoinDemoTest {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new JoinDemo(), "被join 线程");
        for(int i=0;i<10;i++){
            if(i ==1){
                thread1.start();
                thread1.join();
            }
            System.out.println("thread name is : "+ Thread.currentThread().getName()+"\t i= "+ i);

        }
    }
}
class JoinDemo extends Thread{
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(getName()+"\t i = "+ i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
