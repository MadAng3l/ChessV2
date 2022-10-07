package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.List;

public class Pawn extends Piece{

    public Pawn(boolean isWhite) {
        super(isWhite ? '♟' : '♙', isWhite ? 'P' : 'p', isWhite);
    }

    @Override
    public List<Square> availableSquare(int row, int column, Board board) {
        return null;
    }
}
