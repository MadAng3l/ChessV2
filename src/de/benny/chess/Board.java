package de.benny.chess;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Square> squareList = new ArrayList<>();
    String startFEN = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";//startposition and information of a chessgame
    public Board(){
        //fillBoard();
        fillBoardByFEN(startFEN);
    }

   /* private void fillBoard() {  //fills Board with squares that do not have a piece, but coordinates
        for (int i = 1; i <= 8; i++) {
            for (char c = 'A'; c <= 'H'; c++) {
                Square square = new Square(c, i,'-');
                squareList.add(square);
            }
        }
    }*/

    private void fillBoardByFEN(String fen) { //Forsyth-Edwards-Notation, standart notation for describing a particular chess board position
        char column = 'A';
        int row = 8;
        for (int i=0; i < fen.length(); i++){
            switch (fen.charAt(i)){
                case 'r','n','b','q','k','p','R','N','B','Q','K','P':
                    char notation = fen.charAt(i);
                    Square square = new Square(column,row,notation);
                    squareList.add(square);
                    column += 1;
                    break;
                case '/':
                    column = 'A';
                    row -= 1;
                    break;
                case '1','2','3','4','5','6','7','8':
                    int skip = fen.charAt(i) - 48;
                    for (int j=1; j <= skip; j++){
                        Square emptySquare = new Square(column,row, '-');
                        squareList.add(emptySquare);
                        column +=1;
                    }
                    break;
                default: break;
            }
        }
    }
}
