package com.wuss.thread.safeMethod;

import java.math.BigDecimal;

public class Account {
    private String accountNo;
    private BigDecimal balance;
    public Account(String accountNo,BigDecimal balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public synchronized void  draw(BigDecimal drawAmount ){
        if(balance.compareTo(drawAmount)<0){
            System.out.println(Thread.currentThread().getName()+"取钱失败，余额不足");
            return;
        }
        System.out.println(Thread.currentThread().getName()+"取钱成功，取钱：" + drawAmount);
        balance = balance.subtract(drawAmount);
        System.out.println("还剩下："+balance);
    }
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
