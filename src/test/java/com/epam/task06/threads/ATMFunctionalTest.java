package com.epam.task06.threads;

import org.junit.Before;
import org.junit.Test;

class MainTest {
    private CashAccount account;
    
    @Before
    public void prepare() {
        account = CashAccount.getInstance();
    }
    
    @Test
    public void testDeposit() {
        
    }
    
    @Test
    public void testWithdraw() {
    
    }
    
}
