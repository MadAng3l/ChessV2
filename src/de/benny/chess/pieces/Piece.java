package de.benny.chess.pieces;

public interface Piece {

    public void moveTo();

    public void availableSquare();

    public void capture();


   /* @Override
    public String toString() {
        return "Piece{" +
                "notation=" + notation +
                '}';
    }*/
}
