package com.epam.task08.sea.fight;

/**
 * Class, responsible for creating and managing battlefield.
 * @author Selin Roman
 */
class Field {
    private String[][] battlefield = {
            {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "      ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "},
            {"   ", " A ", " B ", " C ", " D ", " E ", " F ", " G ", " H ", " I ", " J ", "      ", " A ", " B ", " C ", " D ", " E ", " F ", " G ", " H ", " I ", " J "},
            {"1  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "   1  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|"},
            {"2  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "   2  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|"},
            {"3  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "   3  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|"},
            {"4  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "   4  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|"},
            {"5  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "   5  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|"},
            {"6  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "   6  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|"},
            {"7  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "   7  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|"},
            {"8  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "   8  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|"},
            {"9  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "   9  ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|"},
            {"10 ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "   10 ", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|", "|_|"},
            {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "      ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "}
    };
    
    /**
     * Prints battlefield into the console.
     */
    void showBattlefield() {
        for (int i = 0; i < battlefield.length; i++) {
            for (int j = 0; j < battlefield[i].length; j++) {
                System.out.print(battlefield[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    /**
     * Returns chosen tile.
     * @return String value, which held by element of array battlefield.
     */
    String getTile(int row, int column) throws ArrayIndexOutOfBoundsException {
        return battlefield[row + 1][column];
    }
    
    /**
     * Method that changes value of a tile to something different.
     * @param tile value we want to be in our tile.
     */
    void changeTile(int row, int column, String tile) {
        try {
            battlefield[row + 1][column] = tile;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("This ship is out of bounds!");
        }
    }
}
