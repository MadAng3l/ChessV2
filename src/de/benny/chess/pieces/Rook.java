package de.benny.chess.pieces;

public class Rook implements Piece {
    boolean white;
    public Rook(char fenChar){
        if (fenChar == 'R'){
            this.white = true;
        }
    }
    @Override
    public char getFenChar(){
        return '♖';
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
            return "White Rook";
        }
        return "Black Rook";
    }
}
