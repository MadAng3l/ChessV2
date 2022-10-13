package de.benny.chess.pieces;

public class Queen extends DVPiece {
    public static final int MAXSTEPS = 8;
    public static final int[][] RUNDIRECTIONS = {{1,1},{1,-1},{-1,-1},{-1,1},{0,1},{1,0},{0,-1},{-1,0}};
    public Queen(boolean isWhite) {
        super(isWhite ? '♛' : '♕', isWhite ? 'Q' : 'q', isWhite, MAXSTEPS, RUNDIRECTIONS);
    }
}