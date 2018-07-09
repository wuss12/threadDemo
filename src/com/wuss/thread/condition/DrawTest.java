package com.wuss.thread.condition;

public class DrawTest extends Thread {
    private Account account;
    private int drawAmount;
    public DrawTest(String threadName,Account account,int drawAmount){
        super(threadName);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            account.draw(drawAmount*(i+1));
        }
    }
}
