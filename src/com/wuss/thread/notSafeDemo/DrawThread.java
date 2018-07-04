package com.wuss.thread.notSafeDemo;

import java.math.BigDecimal;

public class DrawThread extends Thread {
    private Account account;
    //线程希望取钱的数量
    private BigDecimal balance;
    public DrawThread(String threadName,Account account,BigDecimal drawAmount){
        super(threadName);
        this.account = account;
        this.balance = drawAmount;
    }
    //多个线程修改同一个共享数据的时候将会出现 线程安全问题
    public void run() {
        //账户要有足够的钱
        if(account.getBalance().compareTo(balance) >=0){
            System.out.println(getName()+" 取钱成功，取出： "+balance);
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.setBalance(account.getBalance().subtract(balance));
            System.out.println("余额："+account.getBalance());
        }else {
            System.out.println(getName()+" 取钱失败，余额不足");
        }

    }
}
