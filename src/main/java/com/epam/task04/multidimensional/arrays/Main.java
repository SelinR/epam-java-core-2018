package com.epam.task04.multidimensional.arrays;

/**
 * Loader class for tasks 12.270-274 from Zlatopolsky.
 * @author Selin Roman.
 */
public class Main {
    public static void main(String[] args) {
        char[][] charArray = new char[5][5];
        charArray[0] = new char[]{'A', 'B', 'C', 'D', 'E'};
        charArray[1] = new char[]{'A', 'B', 'C', 'D', 'E'};
        charArray[2] = new char[]{'A', 'B', 'C', 'D', 'E'};
        charArray[3] = new char[]{'A', 'B', 'C', 'D', 'E'};
        charArray[4] = new char[]{'A', 'B', 'C', 'D', 'E'};
    
        char[][] starsArray = {
                {'*', '\u0000', '*', '\u0000', '*'},
                {'\u0000', '*', '\u0000', '*', '\u0000'},
                {'*', '\u0000', '*', '\u0000', '*'},
                {'\u0000', '*', '\u0000', '*', '\u0000'},
                {'*', '\u0000', '*', '\u0000', '*'}};
        
        System.out.println("Task 12.270: " + Angles.getAngleChar(charArray));
        System.out.println("Task 12.271: "
                + PrintWordFromArray.printWord(charArray, 2, 2, 3));
        System.out.println("Task 12.272(a): "
                + PrintWordWithAsterisks.printWord(charArray, starsArray, true));
        System.out.println("Task 12.272(b): "
                + PrintWordWithAsterisks.printWord(charArray, starsArray, false));
        System.out.println("Task 12.273: " + EvenRowsAndOddColumns.getWordFromElements(charArray, true));
        System.out.println("Task 12.274: " + EvenRowsAndOddColumns.getWordFromElements(charArray, false));
        
    }
}
