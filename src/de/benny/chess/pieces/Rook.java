package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.List;

public class Rook extends Piece {

    public Rook(boolean isWhite) {
        super(isWhite ? '♜' : '♖', isWhite ? 'R' : 'r', isWhite);
    }

    @Override
    public List<Square> availableSquare(int row, int column, Board board) {
        return null;
    }
}
