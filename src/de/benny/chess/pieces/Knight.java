package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.List;

public class Knight extends DVPiece{
    public static final int MAXSTEPS = 1;
    public static final int[][] RUNDIRECTIONS = {{2,1},{2,-1},{-2,-1},{-2,1},{-1,-2},{-1,2},{1,-2},{1,-2}};
    public Knight(boolean isWhite) {
        super(isWhite ? '♞' : '♘', isWhite ? 'N' : 'n', isWhite, MAXSTEPS, RUNDIRECTIONS);
    }

}
