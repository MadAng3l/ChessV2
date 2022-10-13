package de.benny.chess.pieces;

public class Bishop extends DVPiece {
    public static final int MAXSTEPS = 8;
    public static final int[][] RUNDIRECTIONS = {{1,1},{1,-1},{-1,-1},{-1,1}};
    public Bishop(boolean isWhite) {
        super(isWhite? '♝':'♗',isWhite? 'B':'b',isWhite, MAXSTEPS, RUNDIRECTIONS);
    }
}
