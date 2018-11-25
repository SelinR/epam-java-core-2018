package com.epam.task04.multidimensional.arrays;

/**
 * Task 12.272 form Zlatopolsky.
 * Gets two two-dimensional char arrays - charArray and starsArray.
 * It prints word composed from letters in charArray which positions
 * match with positions of asterisks in starsArray.
 * @author Selin Roman
 */
public class PrintWordWithAsterisks {
    public static String printWord(char[][] charArray, char starsArray[][], boolean fromLeftToRight) {
        StringBuilder word = new StringBuilder();
        
            for (int i = 0; i < charArray.length; i++) {
                for (int j = 0; j < charArray[i].length; j++) {
                    if (fromLeftToRight && starsArray[i][j] == '*') {
                        word.append(charArray[i][j]);
                    } else if (!fromLeftToRight && starsArray[j][i] == '*') {
                        word.append(charArray[j][i]);
                    }
                }
            }
        return word.toString();
    }
}
