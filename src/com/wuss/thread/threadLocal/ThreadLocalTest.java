package com.wuss.thread.threadLocal;

public class ThreadLocalTest {
    public static void main(String[] args) {
        //主线程 设置 名称
        Account account = new Account("初始名");
        for(int i=0;i<10;i++){
            System.out.println(account.getName()+"\ti = " + i);
        }
        new Test(account,"threadA：").start();
        new Test(account,"threadB：").start();
    }
}
