package com.epam.task06.threads;

class ATMFunctional {
    static void deposit(CashAccount account, double amount) {
        if (amount < 0) {
            System.err.println("You cannot deposite negative amount!");
        } else {
            account.setAmountOfMoney(account.getAmountOfMoney() + amount);
            System.out.println("You have successfully deposited " + amount + "$. Now you have "
                    + Math.round(account.getAmountOfMoney() * 100d) / 100d + "$.");
        }
    }
    
    static void withdraw(CashAccount account, double amount) {
        if (amount < 0) {
            System.err.println("You cannot withdraw negative amount!");
        } else if (amount > account.getAmountOfMoney()) {
            System.err.println("You cannot withdraw more than you have!");
        } else {
            account.setAmountOfMoney(account.getAmountOfMoney() - amount);
            System.out.println("You have successfully withdrawn " + amount + "$. Now you have "
                    + Math.round(account.getAmountOfMoney()) / 100d + "$.");
        }
    }
}
