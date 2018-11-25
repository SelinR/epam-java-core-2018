package com.epam.task05.recursive.functions;

/**
 * Task 10.41. This class returns factorial for given number.
 * @author Selin Roman.
 */
public class Factorial {
    public static int getFactorial (int number) {
        if (number == 1 || number == 0) {
            return number;
        }
        return number * getFactorial(number - 1);
        }
    }
    

