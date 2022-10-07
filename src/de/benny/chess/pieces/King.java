package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.List;

public class King extends Piece {

    public King(boolean isWhite) {
        super(isWhite? '♚':'♔',isWhite? 'K':'k',isWhite);

    }
    @Override
    public List<Square> availableSquare(int row, int column, Board board) {
        return null;
    }
}
