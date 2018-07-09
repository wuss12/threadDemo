package com.wuss.thread.wait;

import java.math.BigDecimal;

public class DrawTest extends Thread {
    private Account account;
    private BigDecimal drawAmount;
    public DrawTest(String threadName,Account account,BigDecimal drawAmount){
        super(threadName);
        this.account = account;
        this.drawAmount = drawAmount;
    }
    public void run(){
        for (int i = 0;i<20;i++){
            account.draw(drawAmount);
        }
    }
}
