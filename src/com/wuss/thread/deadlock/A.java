package com.wuss.thread.deadlock;

public class A {
    public synchronized void foo(B b){
        System.out.println("当前线程名："+Thread.currentThread().getName()+
        "进入A实例的foo方法");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程名："+Thread.currentThread().getName()+
                "企图调用B实例的last 方法");
        b.last();
    }
    public synchronized void last(){
        System.out.println("进入了A实例的方法的内部");
    }


}
