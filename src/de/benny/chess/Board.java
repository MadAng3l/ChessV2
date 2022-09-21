package de.benny.chess;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Square> squareList = new ArrayList<>();

    public Board(){
        //fillBoard();
        fillBoardByFEN("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR");
    }

    private void fillBoard() {
        for (int i = 1; i <= 8; i++) {
            for (char c = 'A'; c <= 'H'; c++) {
                Square square = new Square(c, i);
                squareList.add(square);
            }
        }
    }

    private void fillBoardByFEN(String fen) {

    }
}
