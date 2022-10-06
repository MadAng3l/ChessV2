package de.benny.chess;

import de.benny.chess.pieces.*;

public class Square {
    public Piece piece;
    public Coordinates coordinates;

    public Square(char column, int row, char fenChar) {
        this.coordinates = new Coordinates(column, row);
        switch (fenChar) {
            case 'b', 'B' -> this.piece = new Bishop(fenChar);
            case 'k', 'K' -> this.piece = new King(fenChar);
            case 'n', 'N' -> this.piece = new Knight(fenChar);
            case 'p', 'P' -> this.piece = new Pawn(fenChar);
            case 'q', 'Q' -> this.piece = new Queen(fenChar);
            case 'r', 'R' -> this.piece = new Rook(fenChar);
        }
    }

    public boolean isEmpty() {
        return piece == null;
    }

    public char print() {
        if (isEmpty()) {
            return ' ';
        }
        return this.piece.getUniCode();
    }
}
