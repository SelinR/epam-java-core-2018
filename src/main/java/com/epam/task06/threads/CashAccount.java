package com.epam.task06.threads;

class CashAccount {
    private static CashAccount account = new CashAccount(2000.0);
    private volatile double amountOfMoney;
    
    private CashAccount(double amountOfMoney) {
        super();
        this.amountOfMoney = amountOfMoney;
    }
    
    static CashAccount getInstance() {
        return account;
    }
    
    double getAmountOfMoney() {
        return amountOfMoney;
    }
    
    void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
