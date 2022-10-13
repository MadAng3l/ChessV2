package de.benny.chess.pieces;

public class Rook extends DVPiece {
    public static final int MAXSTEPS = 8;
    public static final int[][] RUNDIRECTIONS = {{0,1},{1,0},{0,-1},{-1,0}};
    public Rook(boolean isWhite) {
        super(isWhite ? '♜' : '♖', isWhite ? 'R' : 'r', isWhite, MAXSTEPS, RUNDIRECTIONS);
    }
}
