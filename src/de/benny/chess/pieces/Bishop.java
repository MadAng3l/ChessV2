package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.LinkedList;
import java.util.List;

public class Bishop extends Piece {

    public Bishop(boolean isWhite) {
        super(isWhite? '♝':'♗',isWhite? 'B':'b',isWhite);
    }

    @Override
    public List<Square> availableSquare(int row, int column, Board board) {
        List<Square> availableSquareList = new LinkedList<>();
        int[][] runDirections = {{1,1},{1,-1},{-1,-1},{-1,1}};
        for (int[]runDirection:runDirections){
            int currentRow = row;
            int currentColumn = column;
            while(true){
                currentRow = currentRow + runDirection[0];
                currentColumn += runDirection[1];
                if (!board.isOnBoard(currentRow, currentColumn)){
                    break;
                }
                Square currentSquare = board.squares[currentRow][currentColumn];
                if (currentSquare.isEmpty() || currentSquare.piece.isWhite() != isWhite()){
                    availableSquareList.add(currentSquare);
                }
                if (!currentSquare.isEmpty()){
                    break;
                }
            }
        }
        return availableSquareList;
    }
}
