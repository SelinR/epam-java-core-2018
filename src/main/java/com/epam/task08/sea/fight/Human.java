package com.epam.task08.sea.fight;

import java.util.Scanner;

import static com.epam.task08.sea.fight.Ship.*;
import static com.epam.task08.sea.fight.Shooting.*;

/**
 * This Singleton class represents real human player.
 * @author Selin Roman
 */
class Human {
    private int hullPoints = 20;
    private Scanner sc = new Scanner(System.in);
    private static Human instance = new Human();
    private Field field = new Field();
    
    /**
     * This method offers player to place his ships.
     */
    void startGame() {
        field.showBattlefield();
        for (int i = 0; i < shipSizes.length; i++) {
            System.out.println("Please, place " + shipSizes[i] + "-sized ship wherever you like.");
            boolean checker = placeTheShip(field, shipSizes[i], inputParser(sc.next().charAt(0)), sc.nextInt(), sc.next().charAt(0));
            while (!checker) {
                System.err.println("You can't place ship like this! Try again.");
                checker = placeTheShip(field, shipSizes[i], inputParser(sc.next().charAt(0)), sc.nextInt(), sc.next().charAt(0));
            }
            field.showBattlefield();
        }
    }
    
    /**
     * This method represents player's turn.
     */
    void takeTurn() {
        getField().showBattlefield();
        System.out.println("Take your turn");
        String status = shoot(Human.getInstance().getField(), Computer.getInstance().getField(),
                inputParser(sc.next().charAt(0)), sc.nextInt());
        switch (status) {
            case "Miss":
                break;
            case "Shoot again":
                System.out.println("This one is already hit. Try another one.");
            case "Hit":
                Computer.getInstance().setHullPoints(Computer.getInstance().getHullPoints() - 1);
                takeTurn();
        }
    }
    
    /**
     * Simple method we use to transform input like A1 to number of row and column for our methods.
     * @param letter from A to J, which player inputs from console.
     * @return number which matches given letter.
     */
    private static int inputParser(char letter) {
        String letters = "ABCDEFGHIJ";
        return letters.indexOf(letter) + 1;
    }
    
    int getHullPoints() {
        return hullPoints;
    }
    
    void setHullPoints(int hullPoints) {
        this.hullPoints = hullPoints;
    }
    
    static Human getInstance() {
        return instance;
    }
    
    Field getField() {
        return field;
    }
}
