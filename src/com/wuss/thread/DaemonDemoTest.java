package com.wuss.thread;

/**
 * 后台进程：守护进程
 * 特征：如果所有的前台进程都死亡 则守护进程也会死亡
 * 例子：JVM垃圾回收 线程
 * 使用时间：设置为守护线程，必须在线程启动前设置
 */
public class DaemonDemoTest {
    static class DaemonDemo extends Thread{
        public void run() {
           for (int i=0;i<100;i++){
               System.out.println(getName()+"\t i = " + i);
               try {
                   sleep(100);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }
    }

    public static void main(String[] args) {
        DaemonDemo daemonDemo = new DaemonDemo();
        //设置为守护线程，必须在线程启动前设置
        daemonDemo.setDaemon(true);
        daemonDemo.start();
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" i = "+ i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //程序执行到此处，前台线程(main)线程，结束则 守护线程结束
    }
}
