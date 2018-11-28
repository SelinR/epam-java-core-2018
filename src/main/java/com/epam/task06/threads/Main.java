package com.epam.task06.threads;

public class Main {
    public static void main(String[] args) {
        ATMRunnable atmRunnable = new ATMRunnable();
        new Thread(atmRunnable).start();
        new Thread(atmRunnable).start();
        new Thread(atmRunnable).start();
    }
}