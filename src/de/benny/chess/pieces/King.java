package de.benny.chess.pieces;

public class King extends DVPiece {
    public static final int MAXSTEPS = 1;
    public static final int[][] RUNDIRECTIONS = {{1,1},{1,-1},{-1,-1},{-1,1},{0,1},{1,0},{0,-1},{-1,0}};
    public King(boolean isWhite) {
        super(isWhite? '♚':'♔',isWhite? 'K':'k',isWhite, MAXSTEPS, RUNDIRECTIONS);

    }

}
