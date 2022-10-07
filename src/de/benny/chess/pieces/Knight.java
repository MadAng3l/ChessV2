package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.List;

public class Knight extends Piece{

    public Knight(boolean isWhite) {
        super(isWhite ? '♞' : '♘', isWhite ? 'N' : 'n', isWhite);
    }

    @Override
    public List<Square> availableSquare(int row, int column, Board board) {
        return null;
    }
}
