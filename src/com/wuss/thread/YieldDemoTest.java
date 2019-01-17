package com.wuss.thread;

public class YieldDemoTest {
    public static void main(String[] args) {
        YieldDemo yeMax = new YieldDemo("高优先级");
        YieldDemo yeMin = new YieldDemo("低优先级");
        yeMin.setPriority(Thread.MIN_PRIORITY);
        yeMin.start();
        yeMax.setPriority(Thread.MAX_PRIORITY);
        yeMax.start();


    }
    static class YieldDemo extends Thread{
        YieldDemo (String name){
            super(name);
        }

        public void run() {
            for (int i=0;i<10;i++){
                System.out.println(getName()+"\t+i = "+ i);

                if(i == 5){
                    yield();
                }
            }
        }
    }
}
