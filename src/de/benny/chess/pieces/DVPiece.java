package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.LinkedList;
import java.util.List;

//class for King, Queen, Rook and Bishop: Direction Vector Piece.
public abstract class DVPiece extends Piece{
    int maxSteps;
    int [][] runDirections;
    public DVPiece(char uniCode, char fenChar, boolean isWhite, int maxSteps, int[][] runDirections) {
        super(uniCode, fenChar, isWhite);
        this.maxSteps = maxSteps;
        this.runDirections = runDirections;
    }

    @Override
    public List<Square> availableSquare(int row, int column, Board board) {
        List<Square> availableSquareList = new LinkedList<>();
        for (int[]runDirection:runDirections){
            int currentRow = row;
            int currentColumn = column;
            for (int i = 0; i < maxSteps; i++){
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
