package com.epam.task05.recursive.functions;

import org.junit.Assert;
import org.junit.Test;

public class RaiseToAPowerTest {
    
    @Test
    public void testGetRaisedNumber() {
        Assert.assertEquals(25.0, RaiseToAPower.getRaisedNumber(5.0, 2));
    }
}
