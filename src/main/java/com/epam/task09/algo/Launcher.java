package com.epam.task09.algo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] unsortedArray = new int[10];
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = scanner.nextInt();
        }
    
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println("Bubble sort:");
        int[] bubbleSortResult = new BubbleSort().sort(unsortedArray);
        System.out.println(Arrays.toString(bubbleSortResult));
    
        System.out.println("Binary search:" + new BinarySearch().search(bubbleSortResult));
    
        System.out.println("Merge sort:");
        int[] mergeSortReslut = new MergeSort().sort(unsortedArray);
    }
}
