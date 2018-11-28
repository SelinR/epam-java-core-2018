package com.epam.task08.sea.fight;

import java.util.concurrent.TimeUnit;

/**
 * This is console Battleship game, made for task 08 on Epam Java Core 2018.
 *
 * @author Selin Roman
 * @version 1.1
 */
public class Launcher {
    public static void main(String[] args) {
        Human.getInstance().startGame();
        waitForIt();
        Computer.getInstance().startGame();
        waitForIt();
        
        while (Human.getInstance().getHullPoints() > 0 || Computer.getInstance().getHullPoints() > 0) {
            Human.getInstance().takeTurn();
            waitForIt();
            Computer.getInstance().takeTurn();
            waitForIt();
        }
    }
    
    /**
     * Simple method that waits for 5 milliseconds for user experience purposes.
     */
    private static void waitForIt() {
        try {
            TimeUnit.MILLISECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.err.println("Something gone wrong :^C");
        }
    }
}
