package com.epam.task04.multidimesional.arrays;

import org.junit.Assert;
import org.junit.Test;
import com.epam.task04.multidimensional.arrays.PrintWordFromArray;

public class PrintWordFromArrayTest {
    private static char[][] charArray = {
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'}};
    
    @Test
    public void testPrintWord () {
        Assert.assertEquals("CDE", PrintWordFromArray.printWord(charArray,
                2, 2, 3));
    }
}
