package com.epam.task06.threads;

public class CashAccount {
    private int accountId;
    private double amountOfMoney;
    private String pinCode;
    
    CashAccount (int accountId, double amountOfMoney, String pinCode) {
        this.accountId = accountId;
        this.amountOfMoney = amountOfMoney;
        this.pinCode = pinCode;
    }
    
    void cashDeposit(int amount) {
        setAmountOfMoney(getAmountOfMoney() + amount);
    }
    
    void cashWithdraw(int amount) {
        if (amount > getAmountOfMoney()) {
            throw new IllegalArgumentException("You're trying to withdraw more, then you have!");
        }
        setAmountOfMoney(getAmountOfMoney() - amount);
    }
    
    double getAmountOfMoney() {
        return amountOfMoney;
    }
    
    void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
    
    String getPinCode() {
        return pinCode;
    }
    
    void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
