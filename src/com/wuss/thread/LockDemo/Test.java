package com.wuss.thread.LockDemo;


import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Account account = new Account("11111",new BigDecimal(100));
        DrawLock draw1 = new DrawLock("甲",account,new BigDecimal(60));
        DrawLock draw2 = new DrawLock("乙",account,new BigDecimal(60));
        draw1.start();
        draw2.start();
    }
}
