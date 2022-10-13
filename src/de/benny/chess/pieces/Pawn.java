package de.benny.chess.pieces;

import de.benny.chess.Board;
import de.benny.chess.Square;

import java.util.LinkedList;
import java.util.List;

public class Pawn extends Piece {
    int rd = 1; //rundirection 1 (black pawn -> down)

    public Pawn(boolean isWhite) {
        super(isWhite ? '♟' : '♙', isWhite ? 'P' : 'p', isWhite);
        if (isWhite) {
            rd = -1; //rundirection -1 (white pawn -> up)
        }
    }

    @Override
    public List<Square> availableSquare(int row, int column, Board board) {
        List<Square> availableSquareList = new LinkedList<>();
        int maxSteps = 1;
        if ((isWhite && row == 6) || (!isWhite && row == 1)) {
            maxSteps = 2;
        }
        int[] runDirection = new int[]{rd, 0};
        int currentRow = row;
        int currentColumn = column;
        for (int i = 0; i < maxSteps; i++) {
            currentRow = currentRow + runDirection[0];
            currentColumn += runDirection[1];
            if (!board.isOnBoard(currentRow, currentColumn)) {
                break;
            }
            Square currentSquare = board.squares[currentRow][currentColumn];
            if (currentSquare.isEmpty()) {
                availableSquareList.add(currentSquare);
            } else {
                break;
            }
        }
        currentRow = row + rd;
        currentColumn = column - 1;
        if (board.isOnBoard(currentRow, currentColumn)) {
            Square currentSquare = board.squares[currentRow][currentColumn];
            if (!currentSquare.isEmpty() && currentSquare.piece.isWhite() != isWhite()) {
                availableSquareList.add(currentSquare);
            }
        }
        currentColumn = column + 1;
        if (board.isOnBoard(currentRow, currentColumn)) {
            Square currentSquare = board.squares[currentRow][currentColumn];
            if (!currentSquare.isEmpty() && currentSquare.piece.isWhite() != isWhite()) {
                availableSquareList.add(currentSquare);
            }
        }
        return availableSquareList;
    }
}
