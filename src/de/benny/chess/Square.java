package de.benny.chess;

public class Square {
    Piece piece;
    Coordinates coordinates;

    public Square(char column,int row){
        this.coordinates = new Coordinates(column, row);
    }

    //needed for test
    @Override
    public String toString() {
        return "Square{" +
                "piece=" + piece +
                ", coordinates=" + coordinates +
                '}';
    }
}
