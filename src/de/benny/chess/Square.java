package de.benny.chess;

import de.benny.chess.pieces.*;

public class Square {
    public Piece piece;
    public Coordinates coordinates;

    public Square(int column, int row, char fenChar) {
        this.coordinates = new Coordinates(column, row);
        switch (fenChar) {
            case 'b' -> this.piece = new Bishop(false);
            case 'B' -> this.piece = new Bishop(true);
            case 'k' -> this.piece = new King(false);
            case 'K' -> this.piece = new King(true);
            case 'n' -> this.piece = new Knight(false);
            case 'N' -> this.piece = new Knight(true);
            case 'p' -> this.piece = new Pawn(false);
            case 'P' -> this.piece = new Pawn(true);
            case 'q' -> this.piece = new Queen(false);
            case 'Q' -> this.piece = new Queen(true);
            case 'r' -> this.piece = new Rook(false);
            case 'R' -> this.piece = new Rook(true);
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
