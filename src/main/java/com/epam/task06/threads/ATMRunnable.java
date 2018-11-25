package com.epam.task06.threads;

public class ATM implements Runnable {
    
    @Override
    public void run() {
        deposit(CashAccount.getInstance(), 200.5);
        goToSleep();
        deposit(CashAccount.getInstance(), -100.2);
        for (int i = 0; i < 10; i++) {
            goToSleep();
            withdraw(CashAccount.getInstance(), Math.round(500.0 * Math.random() * 100d) / 100d);
        }
    }
    
    private void deposit(CashAccount account, double amount) {
        if (amount < 0) {
            System.err.println("You cannot deposite negative amount!");
        } else {
            account.setAmountOfMoney(account.getAmountOfMoney() + amount);
            System.out.println("You have successfully deposited " + amount + "$. Now you have "
                    + Math.round(account.getAmountOfMoney() * 100d) / 100d + "$.");
        }
    }
    
    private void withdraw(CashAccount account, double amount) {
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
    
    private void goToSleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
