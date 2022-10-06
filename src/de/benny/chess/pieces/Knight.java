package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.List;

public class Knight implements Piece{

    boolean white;
    public Knight(char fenChar){
        if (fenChar == 'N'){
            this.white = true;
        }
    }
    @Override
    public char getUniCode(){
        return '♘';
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
            return "White Knight";
        }
        return "Black Knight";
    }
}
