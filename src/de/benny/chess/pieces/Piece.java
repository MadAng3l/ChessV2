package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.List;

public abstract class Piece{
    char uniCode;
    char fenChar;
    boolean isWhite;
    public Piece(char uniCode,char fenChar, boolean isWhite){
        this.uniCode = uniCode;
        this.fenChar = fenChar;
        this.isWhite = isWhite;

    }

    public char getUniCode() {
        return uniCode;
    }

    public char getFenChar() {
        return fenChar;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract List<Square> availableSquare(int row, int column, Board board);

    public boolean validateMove(int row, int column, int newRow, int newColumn, Board board){
        List <Square> validSquares = availableSquare(row, column, board);
        for (Square square:validSquares){
            if (square.coordinates.getColumn() == newColumn && square.coordinates.getRow() == newRow){
                return true;
            }
        }
        return false;
    }
}
//♔ ♕ ♖ ♗ ♘ ♙ ♚ ♛ ♜ ♝ ♞ ♟ ■ □