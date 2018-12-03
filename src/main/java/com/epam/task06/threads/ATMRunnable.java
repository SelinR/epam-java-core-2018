package com.epam.task06.threads;

import static com.epam.task06.threads.ATMFunctional.*;

/**
 * This class is responsible for running ATM thread.
 * @author Selin Roman
 */
class ATMRunnable implements Runnable {
    
    @Override
    public void run() {
        CashAccount account = CashAccount.getInstance();
        deposit(account, 200.5);
        goToSleep();
        deposit(account, -100.2);
        for (int i = 0; i < 10; i++) {
            goToSleep();
            withdraw(account, Math.round(500.0 * Math.random() * 100d) / 100d);
        }
    }
    
    /**
     * Simple method used to slow down threads a bit.
     */
    private void goToSleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
