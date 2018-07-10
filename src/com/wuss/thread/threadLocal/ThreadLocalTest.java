package com.wuss.thread.threadLocal;

public class ThreadLocalTest {
    public static void main(String[] args) {
        Account account = new Account("初始名");
        new Test(account,"threadA：").start();
        new Test(account,"threadB：").start();
    }
}
