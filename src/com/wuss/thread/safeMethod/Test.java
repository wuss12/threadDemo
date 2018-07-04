package com.wuss.thread.safeMethod;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Account account = new Account("11111",new BigDecimal(100));
        DrawSafeMethod draw1 = new DrawSafeMethod("甲",account,new BigDecimal(60));
        DrawSafeMethod draw2 = new DrawSafeMethod("乙",account,new BigDecimal(60));
        draw1.start();
        draw2.start();
    }
}
