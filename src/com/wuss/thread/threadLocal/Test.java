package com.wuss.thread.threadLocal;

public class Test extends Thread {
    private Account account;
    public Test(Account account,String treadName){
        super(treadName);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            if(i == 6){
                account.setName(getName());
            }
            System.out.println(account.getName()+"\ti = " + i);
        }
    }
}
