package com.epam.task05.recursive.functions;

/**
 * Task 10.43. This class returns sum and count of digits of given number.
 * @author Selin Roman
 */
public class SumAndCount {
    public static int getSumOfNumbersDigits (int number) {
        if (number == 0) {
            return number;
        }
        return number % 10 + getSumOfNumbersDigits(number / 10);
    }
    
    public static int getCountOfNumbersDigits (int number) {
        if (number == 0) {
            return number;
        }
    return 1 + getCountOfNumbersDigits(number / 10);
    }
}
