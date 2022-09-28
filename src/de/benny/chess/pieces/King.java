package de.benny.chess.pieces;

public class King implements Piece{

    boolean white;
    public King(char fenChar){
        if (fenChar == 'K'){
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
            return "White King";
        }
        return "Black King";
    }
}
