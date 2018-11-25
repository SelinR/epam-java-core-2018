package com.epam.task05.recursive.functions;

/**
 * Task 10.42. This class returns given number raised to given power.
 * @author Selin Roman
 */
public class RaiseToAPower {
    public static double getRaisedNumber (double number, int powerOfANumber) {
        if (powerOfANumber == 0) {
            return 1;
        } else if (powerOfANumber == 1) {
            return number;
        }
        return number * getRaisedNumber(number, powerOfANumber - 1);
    }
}
