package de.benny.chess.pieces;

public class Queen implements Piece{
    boolean white;
    public Queen(char fenChar){
        if (fenChar == 'Q'){
            this.white = true;
        }
    }
    @Override
    public char getFenChar(){
        return '♕';
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
            return "White Queen";
        }
        return "Black Queen";
    }
}
