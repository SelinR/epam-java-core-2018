package com.epam.task06.threads;

import org.junit.Before;
import org.junit.Test;

class ATMRunnableTest {
    private ATMRunnable atm;
    private CashAccount account;
    
    @Before
    public void prepare() {
        atm = new ATMRunnable();
        account = CashAccount.getInstance();
    }
    
    @Test
    public void testDeposit() {
    
    }
    
    @Test
    public void testWithdraw() {
    
    }
    
}
