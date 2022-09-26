package de.benny.chess;

public interface Piece {

    char notation = 0;

    public void moveTo();

    public void availableSquare();



   /* @Override
    public String toString() {
        return "Piece{" +
                "notation=" + notation +
                '}';
    }*/
}
