package de.benny.chess;

import de.benny.chess.pieces.*;

public class Square {
    Piece piece;
    Coordinates coordinates;

    public Square(char column,int row,char fenChar){
        this.coordinates = new Coordinates(column, row);
        switch (fenChar) {
            case 'b', 'B' -> this.piece = new Bishop(fenChar);
            case 'k', 'K' -> this.piece = new King(fenChar);
            case 'n', 'N' -> this.piece = new Knight(fenChar);
            case 'p', 'P' -> this.piece = new Pawn(fenChar);
        }
    }

    //needed for test
    @Override
    public String toString() {
        return "Square{" +
                piece + " " +
                coordinates +
                '}';
    }
}
