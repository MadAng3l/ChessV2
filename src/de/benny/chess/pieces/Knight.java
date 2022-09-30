package de.benny.chess.pieces;

public class Knight implements Piece{

    boolean white;
    public Knight(char fenChar){
        if (fenChar == 'N'){
            this.white = true;
        }
    }
    @Override
    public char getFenChar(){
        return '♘';
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
            return "White Knight";
        }
        return "Black Knight";
    }
}
