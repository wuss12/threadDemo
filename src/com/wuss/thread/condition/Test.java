package com.wuss.thread.condition;

public class Test {
    public static void main(String[] args) {
        Account account = new Account("12345",200);
        DepositTest depositTest = new DepositTest("A",account,100);
        depositTest.start();

        DrawTest drawTest = new DrawTest("B",account,100);
        drawTest.start();
    }
}
