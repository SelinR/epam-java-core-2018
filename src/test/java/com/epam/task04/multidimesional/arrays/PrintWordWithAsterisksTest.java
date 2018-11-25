package com.epam.task04.multidimesional.arrays;

import org.junit.Assert;
import org.junit.Test;
import com.epam.task04.multidimensional.arrays.PrintWordWithAsterisks;

public class PrintWordWithAsterisksTest {
    private static char[][] charArray = {
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'}};
    char[][] starsArray = {
            {'*', '\u0000', '*', '\u0000', '*'},
            {'\u0000', '*', '\u0000', '*', '\u0000'},
            {'*', '\u0000', '*', '\u0000', '*'},
            {'\u0000', '*', '\u0000', '*', '\u0000'},
            {'*', '\u0000', '*', '\u0000', '*'}};
    
    @Test
    public void testPrintWord() {
        Assert.assertEquals("ACEBDACEBDACE", PrintWordWithAsterisks.printWord(charArray, starsArray, true));
        Assert.assertEquals("AAABBCCCDDEEE", PrintWordWithAsterisks.printWord(charArray, starsArray, false));
    
    }
}
