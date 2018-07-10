package com.wuss.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class RtnThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i=0;i<10;i++){
            sum += i;
        }
        System.out.println(Thread.currentThread().getName()+" 1+...+9 = ");
        return sum;
    }

    public static void main(String[] args) throws Exception{
        RtnThread rtnThread = new RtnThread();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(rtnThread);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
