package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.List;

public class King implements Piece{

    boolean white;
    public King(char fenChar){
        if (fenChar == 'K'){
            this.white = true;
        }
    }
    @Override
    public char getUniCode(){
        return '♔';
    }

    @Override
    public char getFenChar() {
        return 0;
    }


    @Override
    public List<Square> availableSquare(int row, int column, Board board) {

    }


    @Override
    public String toString() {
        if (white){
            return "White King";
        }
        return "Black King";
    }
}
