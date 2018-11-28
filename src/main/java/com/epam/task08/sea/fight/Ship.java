package com.epam.task08.sea.fight;

/**
 * Class responsible for ships and their placing.
 */
class Ship {
    static int[] shipSizes = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
    
    /**
     * This method places the ships.
     * @param field field on which we want to place ship.
     * @param sizeOfShip size of ship we placing from special array.
     * @param column column where first tile of ship will be placed.
     * @param row row here first tile of ship will be placed.
     * @param direction in this direction our ship will be placed from head to tail.
     * @return true if ship is placed correctly and false if there are problems.
     */
    static boolean placeTheShip(Field field, int sizeOfShip, int column, int row, char direction) {
        try {
            if (!checkTheSpot(field, sizeOfShip, row, column, direction)) {
                return false;
            } else {
                for (int i = 0; i < sizeOfShip; i++) {
                    switch (direction) {
                        case 'r':
                            field.changeTile(row, column + i, "|H|");
                            break;
                        case 'l':
                            field.changeTile(row, column - i, "|H|");
                            break;
                        case 'u':
                            field.changeTile(row - i, column, "|H|");
                            break;
                        case 'd':
                            field.changeTile(row + i, column, "|H|");
                            break;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }
    
    /**
     * This big boy checks if we can place ship on given coordinates.
     * To do that it searches through all surrounding tiles for another ships or borders of battlefield.
     * @return true if there is no problems and false if any.
     * @throws ArrayIndexOutOfBoundsException if we try to place our ship weird way.
     */
    private static boolean checkTheSpot(Field field, int size, int row, int column, char direction) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < size; i++) {
            switch (direction) {
                case 'r':
                    if (!(field.getTile(row, column + i).equals("|_|")
                            && !field.getTile(row + 1, column + i).equals("|H|")
                            && !field.getTile(row + 1, column + 1 + i).equals("|H|")
                            && !field.getTile(row, column + 1 + i).equals("|H|")
                            && !field.getTile(row - 1, column + i).equals("|H|")
                            && !field.getTile(row - 1, column - 1 + i).equals("|H|")
                            && !field.getTile(row, column - 1 + i).equals("|H|")
                            && !field.getTile(row + 1, column - 1 + i).equals("|H|")
                            && !field.getTile(row - 1, column + 1 + i).equals("|H|"))) {
                        return false;
                    }
                    break;
                case 'l':
                    if (!(field.getTile(row, column - i).equals("|_|")
                            && !field.getTile(row + 1, column - i).equals("|H|")
                            && !field.getTile(row + 1, column + 1 - i).equals("|H|")
                            && !field.getTile(row, column + 1 - i).equals("|H|")
                            && !field.getTile(row - 1, column - i).equals("|H|")
                            && !field.getTile(row - 1, column - 1 - i).equals("|H|")
                            && !field.getTile(row, column - 1 - i).equals("|H|")
                            && !field.getTile(row + 1, column - 1 - i).equals("|H|")
                            && !field.getTile(row - 1, column + 1 - i).equals("|H|"))) {
                        return false;
                    }
                    break;
                case 'u':
                    if (!(field.getTile(row - i, column).equals("|_|")
                            && !field.getTile(row + 1 - i, column).equals("|H|")
                            && !field.getTile(row + 1 - i, column + 1).equals("|H|")
                            && !field.getTile(row - i, column + 1).equals("|H|")
                            && !field.getTile(row - 1 - i, column).equals("|H|")
                            && !field.getTile(row - 1 - i, column - 1).equals("|H|")
                            && !field.getTile(row - i, column - 1).equals("|H|")
                            && !field.getTile(row + 1 - i, column - 1).equals("|H|")
                            && !field.getTile(row - 1 - i, column + 1).equals("|H|"))) {
                        return false;
                    }
                    break;
                case 'd':
                    if (!(field.getTile(row + i, column).equals("|_|")
                            && !field.getTile(row + 1 + i, column).equals("|H|")
                            && !field.getTile(row + 1 + i, column + 1).equals("|H|")
                            && !field.getTile(row + i, column + 1).equals("|H|")
                            && !field.getTile(row - 1 + i, column).equals("|H|")
                            && !field.getTile(row - 1 + i, column - 1).equals("|H|")
                            && !field.getTile(row + i, column - 1).equals("|H|")
                            && !field.getTile(row + 1 + i, column - 1).equals("|H|")
                            && !field.getTile(row - 1 + i, column + 1).equals("|H|"))) {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
}
