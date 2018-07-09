package com.wuss.thread.wait;

import java.math.BigDecimal;

public class Account {
    private String accountNo;
    private BigDecimal balance;
    // 表示账户中是否已有存款
    private boolean flag = false;

    public Account(String accountNo, BigDecimal balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public synchronized void draw(BigDecimal drawAmount) {
        try {
            //表示没有存钱
            if (!flag) {
                wait();
            }else {
                System.out.println("thread name: "+ Thread.currentThread().getName()+" 取钱："+drawAmount);
                balance = balance.subtract(drawAmount);
                System.out.println("left money :" + balance);
                flag = false;
                notifyAll();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public synchronized void deposit(BigDecimal depositAmount) {
        try {
            //表示 已经存过钱
            if (flag) {
                wait();
            }else {
                System.out.println("thread name: "+ Thread.currentThread().getName()+" 存钱："+depositAmount);
                balance = balance.add(depositAmount);
                System.out.println("left money :" + balance);
                flag = true;
                notifyAll();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
