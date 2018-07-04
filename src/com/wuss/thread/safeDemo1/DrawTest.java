package com.wuss.thread.safeDemo1;

import com.wuss.thread.notSafeDemo.Account;

import java.math.BigDecimal;

public class DrawTest {
    public static void main(String[] args) {
        Account account = new Account("账户A",new BigDecimal(100));
        DrawSafeThread drawA = new DrawSafeThread("甲",account,new BigDecimal(60));
        DrawSafeThread drawB = new DrawSafeThread("乙",account,new BigDecimal(60));
        drawA.start();
        drawB.start();
    }
}
