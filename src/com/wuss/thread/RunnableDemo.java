package com.wuss.thread;

/**
 * s实现Runnable 接口
 */
public class RunnableDemo {
    public static void main(String[] args) {
        RunableThread runable1 = new RunableThread();
        Thread thread1 = new Thread(runable1,"线程1");
        Thread thread2 = new Thread(runable1,"线程2");
        thread1.start();
        thread2.start();
        System.out.println("当前线程名："+Thread.currentThread().getName());

    }

}

/**
 *  使用 Runnable 来创建多线程 可以共享 线程类的实例变量
 */
class RunableThread implements Runnable{
    private int i;
// run 方法是线程的 执行体
    public void run() {
       for (;i<10;i++){
           System.out.println("当前线程的名称:"+Thread.currentThread().getName()+"\t i = "+ i);
       }
    }
}