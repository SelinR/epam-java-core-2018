package com.epam.task06.threads;

/**
 * This class is responsible for functions we provide to our ATMs.
 * @author Selin Roman
 */
public class ATMFunctional {
    
    /**
     * Method we use to deposit money to our account.
     * @param account we want to use.
     * @param amount of money.
     */
    synchronized static double deposit(CashAccount account, double amount) {
        if (amount < 0) {
            System.err.println("You cannot deposite negative amount!");
        } else {
            account.setAmountOfMoney(account.getAmountOfMoney() + amount);
            System.out.println("You have successfully deposited " + amount + "$. Now you have "
                    + Math.round(account.getAmountOfMoney() * 100d) / 100d + "$.");
        }
        return account.getAmountOfMoney();
    }
    /**
     * Method we use to withdraw money from our account.
     * @param account we want to use.
     * @param amount of money.
     */
    synchronized static double withdraw(CashAccount account, double amount) {
        if (amount < 0) {
            System.err.println("You cannot withdraw negative amount!");
        } else if (amount > account.getAmountOfMoney()) {
            System.err.println("You cannot withdraw more than you have!");
        } else {
            account.setAmountOfMoney(account.getAmountOfMoney() - amount);
            System.out.println("You have successfully withdrawn " + amount + "$. Now you have "
                    + Math.round(account.getAmountOfMoney()) / 100d + "$.");
        }
        return account.getAmountOfMoney();
    }
}
