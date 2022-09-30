package de.benny.chess.pieces;

public class Bishop implements Piece {

    boolean white;
    public Bishop(char fenChar) {
        if (fenChar == 'B'){
            this.white = true;
        }

    }
    @Override
    public char getFenChar(){
        return '♗';
    }
    @Override
    public void availableSquare() {

    }

    @Override
    public void moveTo() {

    }

    @Override
    public void capture(){

    }

    @Override
    public String toString() {
        if (white){
            return "White Bishop";
        }
        return "Black Bishop";
    }
}
