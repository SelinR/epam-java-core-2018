package com.epam.task01.traffic.light;

import java.util.Scanner;

/**
 * Traffic light task for Epam Java Development Courses.
 * Gets minute as input and returns color of current signal.
 *
 * @author Selin Roman
 * @version 0.1.3
 */
public class TrafficLight {
    
    public static void main(String[] args) {
        int time;
        
        System.out.println("Please, enter time in minutes.");
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextInt();
        
        // We call method getTrafficLightSignal of Signal Checker class
        SignalChecker signal = new SignalChecker();
        String newSignal = signal.getTrafficLightSignal(time);
        System.out.println("Traffic light now shows " + newSignal + " signal.");
    }
}