package com.epam.task04.multidimesional.arrays;


import org.junit.Test;
import com.epam.task04.multidimensional.arrays.Angles;

import static org.junit.Assert.*;

public class AnglesTest {
    
    private static char[][] charArray = {
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'},
            {'A', 'B', 'C', 'D', 'E'}};
    
    @Test
    public void testGetAngleChar () {
        assertEquals("AEAE", Angles.getAngleChar(charArray));
    
    }


}
