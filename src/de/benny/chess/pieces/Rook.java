package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.List;

public class Rook implements Piece {
    boolean white;
    public Rook(char fenChar){
        if (fenChar == 'R'){
            this.white = true;
        }
    }
    @Override
    public char getUniCode(){
        return '♖';
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
            return "White Rook";
        }
        return "Black Rook";
    }
}
