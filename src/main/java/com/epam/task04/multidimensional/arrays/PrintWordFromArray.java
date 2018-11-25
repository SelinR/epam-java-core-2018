package com.epam.task04.multidimensional.arrays;

/**
 * Task 12.271 from Zlatopolsky.
 * Prints word from one row of given two-dimensional array.
 * Word starts from symbol with given index and finishes with given length or end of the row.
 * @author Selin Roman.
 */
public class PrintWordFromArray {
    public static String printWord (char[][] charArray, int indexOfRow, int indexOfSymbol, int lengthOfWord) {
        StringBuilder word = new StringBuilder();
        for (int i = indexOfSymbol; i < indexOfSymbol + lengthOfWord || i < charArray.length; i++) {
            word.append(charArray[indexOfRow][i]);
        }
        return word.toString();
    }

}
