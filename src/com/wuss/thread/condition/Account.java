package com.wuss.thread.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String accuntNo;
    private int balance;
    //已经存放钱
    private boolean hasPutMoney = false;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public Account(String accountNo, int balance) {
        this.accuntNo = accountNo;
        this.balance = balance;
    }

    public void draw(int drawAmount) {
        try {
            lock.lock();
            while (!hasPutMoney) {
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() + " get money: " + drawAmount);
            balance -= drawAmount;
            System.out.println("money left : " + balance);
            hasPutMoney = false;
            condition.signal();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void deposit(int depositAmount) {
        try {
            lock.lock();
            while (hasPutMoney) {
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() + " put money: " + depositAmount);
            balance += depositAmount;
            System.out.println("money left : " + balance);
            hasPutMoney = true;
            condition.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
