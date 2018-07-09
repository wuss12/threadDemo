package com.wuss.thread.wait;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Account account = new Account("1234567", BigDecimal.ZERO);
        new DrawTest("取钱者",account,new BigDecimal("800")).start();
        new DepositTest("存钱者甲",account,new BigDecimal("800")).start();
//        new DepositTest("存钱者乙",account,new BigDecimal("800")).start();
//        new DepositTest("存钱者丙",account,new BigDecimal("800")).start();
    }
}
