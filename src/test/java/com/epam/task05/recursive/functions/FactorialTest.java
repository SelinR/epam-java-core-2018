package com.epam.task05.recursive.functions;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    
    @Test
    public void testGetFactorial() {
        Assert.assertEquals(120, Factorial.getFactorial(5));
    }
}
