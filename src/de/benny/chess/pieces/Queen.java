package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.List;

public class Queen extends Piece {

    public Queen(boolean isWhite) {
        super(isWhite ? '♛' : '♕', isWhite ? 'Q' : 'q', isWhite);
    }

    @Override
    public List<Square> availableSquare(int row, int column, Board board) {
        return null;
    }
}