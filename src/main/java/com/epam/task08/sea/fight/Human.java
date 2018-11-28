package com.epam.task08.sea.fight;

import java.util.Scanner;

import static com.epam.task08.sea.fight.Ship.*;

public class Player {
    private int playerHullPoints = 20;
    private Scanner sc = new Scanner(System.in);
    private static Player player = new Player();
    private Field playerField = new Field();
    
    //TODO сделать ввод по форме А1
    
    void startGame() {
        playerField.getBattlefield();
        for (int i = 0; i < shipSizes.length; i++) {
            System.out.println("Please, place " + shipSizes[i] + "-sized ship wherever you like.");
            boolean checker = placeTheShip(playerField, shipSizes[i], sc.nextInt(), sc.nextInt(), sc.next().charAt(0));
            while (!checker) {
                checker = placeTheShip(playerField, shipSizes[i], sc.nextInt(), sc.nextInt(), sc.next().charAt(0));
            }
            playerField.getBattlefield();
        }
    }
    
    void takeTurn() {
        String status = "Hit";
        while (status.equals("Hit")) {
            playerField.getBattlefield();
            status = Shooting.shoot(Player.getPlayer().getPlayerField(), Computer.getComputer().getComputerField(),
                    sc.nextInt(), sc.nextInt());
        }
    }
    
    public int getPlayerHullPoints() {
        return playerHullPoints;
    }
    
    public void setPlayerHullPoints(int playerHullPoints) {
        this.playerHullPoints = playerHullPoints;
    }
    
    static Player getPlayer() {
        return player;
    }
    
    public Field getPlayerField() {
        return playerField;
    }
    
    int inputParser(char column, int row) {
        return 0;
    }
}
