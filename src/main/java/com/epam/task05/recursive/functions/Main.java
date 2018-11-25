package com.epam.task05.recursive.functions;

import java.util.Scanner;

/**
 * Loader class for tasks 10.42 - 10.43.
 * @author Selin Roman
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter values for tasks in correct order.");
        int factorialNumber = scanner.nextInt();
        double numberWhichWillBeRaised = scanner.nextDouble();
        int power = scanner.nextInt();
        int sumAndCountOfDigitsNumber = scanner.nextInt();
        
        System.out.println("10.41: " + Factorial.getFactorial(factorialNumber));
        System.out.println("10.42: " + RaiseToAPower.getRaisedNumber(numberWhichWillBeRaised, power));
        System.out.println("10.43: " + SumAndCount.getSumOfNumbersDigits(sumAndCountOfDigitsNumber)
                + SumAndCount.getCountOfNumbersDigits(sumAndCountOfDigitsNumber));
    }
}
