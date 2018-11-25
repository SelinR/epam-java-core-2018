package com.epam.task04.multidimesional.arrays;

import org.junit.Assert;
import org.junit.Test;

public class EvenRowsAndOddColumnsTest {
    
    private static char[][] charArray = {
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'}};
    
    @Test
    public void testGetWordFromElements() {
        Assert.assertEquals("ACE ACE ACE ACE ACE", charArray, true);
        Assert.assertEquals("AA BB CC DD EE", charArray, false);
    }
    
    @Test
    public void testIsEven() {
        Assert.assertEquals(true, 4);
    }
    
}
