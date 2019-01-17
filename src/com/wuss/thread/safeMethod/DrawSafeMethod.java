package com.wuss.thread.safeMethod;

import java.math.BigDecimal;

public class DrawSafeMethod extends Thread {
    private Account account;
    private BigDecimal balance;
    public DrawSafeMethod(String threadName,Account account,BigDecimal drawAmount){
        super(threadName);
        this.account = account;
        this.balance = drawAmount;
    }

    @Override
    public void run() {
        account.draw(balance);
    }

}
