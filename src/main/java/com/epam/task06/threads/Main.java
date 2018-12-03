package com.epam.task06.threads;

/**
 * ATM simulation task for EPAM Java Core 2018.
 * @author Selin Roman
 */
public class Main {
    public static void main(String[] args) {
        ATMRunnable atmRunnable = new ATMRunnable();
        new Thread(atmRunnable).start();
        new Thread(atmRunnable).start();
        new Thread(atmRunnable).start();
    }
}