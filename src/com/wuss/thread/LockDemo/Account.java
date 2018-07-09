package com.wuss.thread.LockDemo;

import java.math.BigDecimal;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String accountNo;
    private BigDecimal balance;
    private final ReentrantLock lock = new ReentrantLock();
    public Account(String accountNo ,BigDecimal balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public void draw(BigDecimal drawAmount){
        lock.lock();
        try {
            if(balance.compareTo(drawAmount) >= 0){
                System.out.println(Thread.currentThread().getName()+"取钱成功，取钱："+drawAmount);
                Thread.sleep(100);
                balance = balance.subtract(drawAmount);
                System.out.println("还剩 ："+balance);
            }else {
                System.out.println(Thread.currentThread().getName()+" 取钱失败。");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
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
