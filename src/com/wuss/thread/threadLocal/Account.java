package com.wuss.thread.threadLocal;

public class Account {
    private ThreadLocal<String> name = new ThreadLocal<>();
    public Account(String str){
        this.name.set(str);
        System.out.println("-------" + name.get());
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }
}
