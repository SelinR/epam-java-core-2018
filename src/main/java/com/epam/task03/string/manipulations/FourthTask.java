package com.epam.task03.string.manipulations;

import java.util.Scanner;

/**
 * Task 9.64 from Zlatopolsky.
 * This task gets sentence and founds number of equal neighbor symbols.
 * Example: for sentence "aaa BB" answer will be 5.
 *
 * @author Selin Roman
 * @version 1.0
 */
public class FourthTask {
    public static void main(String[] args) {
        System.out.println("Please print some sentence.");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        
        FourthTask fourthTask = new FourthTask();
        int numberOfEqualNeighborSymbols = fourthTask.getNumberOfEqualNeighborSymbols(sentence);
        System.out.println("Number of equal neighbor symbols: " + numberOfEqualNeighborSymbols);
    }
    
    /**
     * @param sentence given sentence.
     * @return number of equal neighbor symbols.
     */
    private int getNumberOfEqualNeighborSymbols(String sentence) {
        int counter = 0;
        int lengthOfEqualString = 1;
        char previousLetter = sentence.charAt(0);
        
        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == previousLetter) {
                lengthOfEqualString++;
                if (lengthOfEqualString > 2) {
                    counter++;
                } else {
                    counter += 2;
                }
            }
            lengthOfEqualString = 1;
            previousLetter = sentence.charAt(i);
        }
        System.out.println("Number of equal symbols " + counter);
        return counter;
    }
}

