package com.epam.task04.multidimensional.arrays;

/**
 * Tasks 12.273-4 from Zlatopolsky.
 * Gets two-dimensional array.
 * If boolean evenRows is true, returns word consisting of even elements of each row.
 * If evenRows is false, returns word consisting of odd elements of each column.
 * @author Selin Roman.
 */
public class EvenRowsAndOddColumns {
    public static String getWordFromElements(char[][] charArray, boolean evenRows) {
        StringBuilder words = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                if (isEven(j) && evenRows) {
                    words.append(charArray[i][j]);
                } else if (!isEven(j) && !evenRows) {
                    words.append(charArray[j][i]);
                }
            }
            words.append(" ");
        }
        return words.toString();
    }
    
    private static boolean isEven(int index) {
        return (index % 2 == 0);
    }
}
