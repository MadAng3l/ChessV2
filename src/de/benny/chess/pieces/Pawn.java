package de.benny.chess.pieces;

public class Pawn implements Piece{

    boolean white;
    public Pawn(char fenChar){
        if (fenChar == 'P'){
            this.white = true;
        }
    }

    @Override
    public void moveTo() {

    }

    @Override
    public void availableSquare() {

    }

    @Override
    public void capture() {

    }

    @Override
    public String toString() {
        if (white){
            return "White Pawn";
        }
        return "Black Pawn";
    }
}
