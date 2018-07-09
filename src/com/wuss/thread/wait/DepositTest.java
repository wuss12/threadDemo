package com.wuss.thread.wait;

import java.math.BigDecimal;

public class DepositTest extends Thread {
    private Account account;
    private BigDecimal depositAmount;
    public DepositTest(String threadName, Account account, BigDecimal depositAmount){
        super(threadName);
        this.account = account;
        this.depositAmount = depositAmount;
    }
    public void run(){
        for (int i = 0;i<20;i++){
            account.deposit(depositAmount);
        }
    }
}
