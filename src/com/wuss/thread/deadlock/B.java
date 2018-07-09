package com.wuss.thread.deadlock;

public class B {
    public synchronized void bar(A a){
        System.out.println("当前线程名："+Thread.currentThread().getName()+
                "调用B实例的 bar 方法");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程名："+Thread.currentThread().getName()+
                "调用A 实例的 last 方法");
        a.last();
    }
    public synchronized void last(){
        System.out.println("进入了B实例的last的方法内部");
    }
}
