package com.wuss.thread.notSafeDemo;

import java.math.BigDecimal;

public class TestDraw {
    public static void main(String[] args) {
        Account account = new Account("账户A",new BigDecimal(100));
        DrawThread drawA = new DrawThread("甲",account,new BigDecimal(60));
        DrawThread drawB = new DrawThread("乙",account,new BigDecimal(60));
        drawA.start();
        drawB.start();
    }
}
