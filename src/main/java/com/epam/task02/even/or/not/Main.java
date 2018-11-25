package com.epam.task02.even.or.not;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String param = reader.readLine();
            int digit = Integer.parseInt(param);
            System.out.println("Digit " + digit + " is even: " + main.isEven(digit));
        }   catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    private boolean isEven (int digit) {
        return digit % 2 == 0;
    }
}

