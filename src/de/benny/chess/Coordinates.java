package de.benny.chess;

public class Coordinates {
    char column;
    int row;

    public Coordinates(char column,int row){
        this.column = column;
        this.row = row;
    }

    //needed for test
    @Override
    public String toString() {
        return "Coordinates{" +
                "column=" + column +
                ", row=" + row +
                '}';
    }
}
