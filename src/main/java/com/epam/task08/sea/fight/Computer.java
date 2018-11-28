package com.epam.task08.sea.fight;

import static com.epam.task08.sea.fight.Ship.placeTheShip;
import static com.epam.task08.sea.fight.Ship.shipSizes;
import static com.epam.task08.sea.fight.Shooting.*;

/**
 * This Singleton class represents AI which will oppose in this battleship game.
 * @author Selin Roman
 */
class Computer {
    private int hullPoints = 20;
    private static Computer instance = new Computer();
    private Field field = new Field();
    
    /**
     * This method starts the game of Computer by placing ships randomly.
     */
    void startGame() {
        for (int i = 0; i < shipSizes.length; i++) {
            boolean checker = placeTheShip(field, shipSizes[i], chooseTarget(), chooseTarget(), randomDirection());
            while (!checker) {
                checker = placeTheShip(field, shipSizes[i], chooseTarget(), chooseTarget(), randomDirection());
            }
        }
    }
    
    /**
     * On his turn computer will shoot to random target and then react depending of the results.
     * If it misses, player will take his turn, but if it hits, it'll fire again.
     */
    void takeTurn() {
        System.out.println("Computer takes his turn.");
        String status = shoot(Computer.getInstance().getField(), Human.getInstance().getField(),
                chooseTarget(), chooseTarget());
        switch (status) {
            case "Miss":
                break;
            case "Shoot again":
            case "Hit":
                Human.getInstance().setHullPoints(Human.getInstance().getHullPoints() - 1);
                takeTurn();
        }
    }
    
    /**
     * Simple method used to generate random values for computer's turns.
     * @return random int value from 1 to 10.
     */
    private int chooseTarget() {
        return (int) (1 + (10 * Math.random()));
    }
    
    /**
     * This method generates random direction for ship placing.
     * @return r, l, u or d. Each letter represents direction.
     */
    private char randomDirection() {
        double random = Math.random();
        if (random < 0.25) {
            return 'r';
        } else if (random >= 0.25 && random < 0.5) {
            return 'l';
        } else if (random >= 0.5 && random < 0.75) {
            return 'u';
        } else {
            return 'd';
        }
    }
    
    int getHullPoints() {
        return hullPoints;
    }
    
    void setHullPoints(int hullPoints) {
        this.hullPoints = hullPoints;
    }
    
    static Computer getInstance() {
        return instance;
    }
    
    Field getField() {
        return field;
    }
}
