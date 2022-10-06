package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.List;

public class Queen implements Piece{
    boolean white;
    public Queen(char fenChar){
        if (fenChar == 'Q'){
            this.white = true;
        }
    }
    @Override
    public char getUniCode(){
        return '♕';
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
            return "White Queen";
        }
        return "Black Queen";
    }
}
