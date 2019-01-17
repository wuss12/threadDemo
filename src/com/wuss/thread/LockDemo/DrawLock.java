package com.wuss.thread.LockDemo;


import java.math.BigDecimal;

public class DrawLock extends Thread {
    private Account account;
    private BigDecimal balance;
    public DrawLock(String threadName, Account account, BigDecimal drawAmount){
        super(threadName);
        this.account = account;
        this.balance = drawAmount;
    }

    @Override
    public void run() {
        account.draw(balance);
    }

}
