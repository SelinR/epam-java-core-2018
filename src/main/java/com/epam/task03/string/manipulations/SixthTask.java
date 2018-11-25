package com.epam.task03.string.manipulations;

import java.util.Scanner;

/**
 * Additional task.
 * Makes reverse of words in some sentence.
 *
 * @author Selin Roman
 * @version 0.5
 */
public class SixthTask {
    public static void main(String[] args) {
        System.out.println("Please print some sentence.");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        
        SixthTask sixthTask = new SixthTask();
        System.out.println(sixthTask.reverseSentence(sentence));
    }
    
    /**
     * This method reverses whole sentence.
     * @param sentence sentence we want to reverse.
     * @return reversed sentence.
     */
    private String reverseSentence(String sentence) {
        StringBuilder reversedSentence = new StringBuilder();
        String[] wordsArray = sentence.split(" ");
        for (String word : wordsArray) {
            reversedSentence.append(reverseWord(word)).append(" ");
        }
        return  reversedSentence.toString();
    }
    
    /**
     * This method reverses single word.
     * @param word one word of given sentence.
     * @return reversed word.
     */
    private String reverseWord(String word) {
        char[] reversedCharArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            reversedCharArray[i] = word.charAt(word.length() - i - 1);
        }
        return new String(reversedCharArray);
    }
}
