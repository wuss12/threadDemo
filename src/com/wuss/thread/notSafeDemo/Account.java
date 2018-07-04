package com.wuss.thread.notSafeDemo;

import java.math.BigDecimal;

public class Account {
    private String accountNo;
    private BigDecimal balance;

    public Account() {
    }

    public Account(String accountNo, BigDecimal balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Account)){
            return false;
        }
        Account other = (Account) obj;
        return accountNo.equals(other.accountNo) && balance.compareTo(other.balance) == 0;
    }
}
