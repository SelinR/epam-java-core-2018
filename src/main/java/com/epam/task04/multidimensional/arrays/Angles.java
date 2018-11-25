package com.epam.task04.multidimensional.arrays;

/**
 * Task 12.270 from Zlatopolsky.
 * Gets two-dimensional array and returns symbols on its angles.
 *          1 2 1
 * Example: 2 2 2
 *          1 2 1
 * Returns 1111.
 * @author Selin Roman.
 */
public class Angles {
        public static String getAngleChar (char[][] array){
            StringBuilder angleChars = new StringBuilder();
            angleChars.append(array[0][0]).append(array[0][array[0].length - 1]).append(array[array.length - 1][0])
                    .append(array[array.length - 1][array[array.length - 1].length - 1]);
            return angleChars.toString();
        }
    }
