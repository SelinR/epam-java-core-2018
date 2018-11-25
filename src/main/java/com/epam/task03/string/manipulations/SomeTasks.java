package com.epam.task03.string.manipulations;

import java.util.Scanner;

/**
 * 9.13-9.15 and 9.100 tasks from Zlatopolsky
 *
 * @author Selin Roman
 * @version 1.0
 */
public class SomeTasks {
    public static void main(String[] args) {
        char letter;
    
        System.out.println("Please print some word and then index k for task 9.15.");
        Scanner scanner = new Scanner(System.in);
        String someWord = scanner.nextLine();
        int indexOfLetter = scanner.nextInt();
        SomeTasks someTasks = new SomeTasks();
        
        //Task 9.13. Display on screen third letter of word
        letter = someTasks.getLetter(someWord, 3);
        System.out.println("9.13 result: " + letter);
        
        //Task 9.14. Display on screen last letter of word
        letter = someTasks.getLetter(someWord, someWord.length());
        System.out.println("9.14 result: " + letter);
        
        //Task 9.15. Display on screen k letter of word
        letter = someTasks.getLetter(someWord, indexOfLetter);
        System.out.println("9.15 result: " + letter);
        
        //Task 9.100. Change positions of second and fifth symbols
        String changedWord = someTasks.changePositions(someWord, 2, 5);
        System.out.println("9.100 result: " + changedWord);
    }
    
    /**
     * Takes word and index and returns letter which stands on chosen index in given word.
     *
     * @param word given word.
     * @param index given index.
     * @return letter we need.
     */
    private char getLetter (String word, int index) {
        return word.charAt(index - 1);
    }
    
    /**
     * Changes positions of two letters with given indexes.
     * @param word given word.
     * @param firstIndex first index.
     * @param secondIndex second index.
     * @return changed word.
     */
    private String changePositions(String word, int firstIndex, int secondIndex) {
        char[] newCharArray = word.toCharArray();
        char tempChar = newCharArray[firstIndex - 1];
        newCharArray[firstIndex - 1] = newCharArray[secondIndex - 1];
        newCharArray[secondIndex - 1] = tempChar;
        return new String(newCharArray);
    }
}

