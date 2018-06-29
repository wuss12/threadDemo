package com.wuss.thread;

/**
 * 通过继承Thread类 的例子
 * 1.继承Thread 类，并重写run 方法，该方法就是 该线程需要完成的任务
 * 2.通过run 方法调用
 * currentThread 返回对当前正在执行的线程对象
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1("线程1");
        thread1.start();
        thread1.interrupt();
        System.out.println("当前线程是："+thread1.getName()+"当前线程是否停止：  "+thread1.interrupted());
        System.out.println("当前线程是："+thread1.currentThread().getName()+"当前线程是否停止：  "+thread1.interrupted());
        //thread1.currentThread().getName()返回调用这个方法（ThreadDemo）的线程的名字
        //thread1.getName()返回返回的是thread1的引用，而thread1没有重写getName方法，所以调用的是父类Thread的getName方法。
    }

    static class Thread1 extends Thread{
        Thread1(String name){
            super(name);
        }
        public void run() {
            System.out.println("当前线程的名字："+getName());
            System.out.println("当前线程的名字："+currentThread().getName());
        }
    }
}
