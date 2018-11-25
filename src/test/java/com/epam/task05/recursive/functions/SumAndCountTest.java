package com.epam.task05.recursive.functions;

import org.junit.Assert;
import org.junit.Test;

public class SumAndCountTest {
    
    @Test
    public void testGetSumOfNumbersDigits() {
        Assert.assertEquals(6, SumAndCount.getSumOfNumbersDigits(123));
    }
    
    @Test
    public void testGetCountOfNumbersDigits() {
        Assert.assertEquals(5, SumAndCount.getCountOfNumbersDigits(34521));
    }
}
