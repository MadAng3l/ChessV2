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

    char getFenChar() {
        return fenChar;
    }

    boolean isWhite() {
        return isWhite;
    }

    public abstract List<Square> availableSquare(int row, int column, Board board);

}
//♔ ♕ ♖ ♗ ♘ ♙ ♚ ♛ ♜ ♝ ♞ ♟ ■ □