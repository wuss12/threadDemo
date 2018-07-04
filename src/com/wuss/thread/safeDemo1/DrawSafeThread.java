package com.wuss.thread.safeDemo1;

import com.wuss.thread.notSafeDemo.Account;

import java.math.BigDecimal;

/**
 * 使用同步代码块
 */
public class DrawSafeThread extends Thread {
    private Account account;
    private BigDecimal balance;

    public DrawSafeThread(String threadName,Account account,BigDecimal drawAmount){
        super(threadName);
        this.account = account;
        this.balance = drawAmount;
    }
    public void run(){
        synchronized(account){
            if(account.getBalance().compareTo(balance)>= 0){
                System.out.println(getName()+"取钱成功，取钱:"+ balance);
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.setBalance(account.getBalance().subtract(balance));
                System.out.println("剩余钞票:"+account.getBalance());
            }else {
                System.out.println(getName()+" 取钱失败，余额不足");
            }
        }
    }
}
