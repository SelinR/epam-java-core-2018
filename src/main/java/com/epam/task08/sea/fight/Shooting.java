package com.epam.task08.sea.fight;

/**
 * Class, responsible for shooting.
 * @author Selin Roman
 */
class Shooting {
    
    /**
     * Method that does main part of gaming process - it shoots.
     * @param fieldOfShooter takes player's field to represent results of shots on it's right part.
     * @param fieldOfOpponent field of player's opponent.
     * @return String value representing result of the shot.
     */
    static String shoot(Field fieldOfShooter, Field fieldOfOpponent, int column, int row) {
        if (fieldOfOpponent.getTile(row, column).equals("|_|")) {
            fieldOfOpponent.changeTile(row, column, "|o|");
            fieldOfShooter.changeTile(row, column + 11, "|o|");
            System.out.println(outputParser(column, row) + ": Miss!");
            return "Miss";
        } else if (fieldOfShooter.getTile(row, column).equals("|X|") || fieldOfShooter.getTile(row, column).equals("|o|")) {
            return "Shoot again";
        } else {
            fieldOfOpponent.changeTile(row, column, "|X|");
            fieldOfShooter.changeTile(row, column + 11, "|X|");
            System.out.println(outputParser(column, row) + ": Hit! Another one shot.");
            return "Hit";
        }
    }
    
    /**
     * Simple method we use to print things like A5 or J7.
     */
    private static String outputParser(int column, int row) {
        String letters = "ABCDEFGHIJ";
        return "" + letters.charAt(column - 1) + row;
    }
}



