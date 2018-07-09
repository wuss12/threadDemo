package com.wuss.thread.condition;

public class DepositTest extends Thread {
    private Account account;
    private int depositAmount;
    public DepositTest(String threadName,Account account,int deposit){
        super(threadName);
        this.account = account;
        this.depositAmount = deposit;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
        account.deposit(depositAmount*(i+1));
        }
    }
}
