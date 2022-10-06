package de.benny.chess;

import java.util.ArrayList;
import java.util.List;

public class Board {
    //List<Square> squareList = new ArrayList<>();
    public Square[][] squares = new Square[8][8];
    String startFEN = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR";//startposition and information of a chessgame
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
        int columnIndex = 0;
        int row = 0;
        for (int i=0; i < fen.length(); i++){
            char fenChar = fen.charAt(i);
            switch (fenChar){
                case 'r','n','b','q','k','p','R','N','B','Q','K','P':
                    Square square = new Square((char) (column+columnIndex),row,fenChar);
                    squares[row][columnIndex] = square;
                    columnIndex += 1;
                    break;
                case '/':
                    columnIndex = 0;
                    row += 1;
                    break;
                case '1','2','3','4','5','6','7','8':
                    int skip = Character.getNumericValue(fenChar);
                    for (int j=1; j <= skip; j++){
                        Square emptySquare = new Square((char)(column+columnIndex),row,fenChar);
                        squares[row][columnIndex] = emptySquare;
                        columnIndex +=1;
                    }
                    break;
                default: break;
            }
        }
    }

    public boolean isOnBoard(int row, int column){
        return row < 8 && column < 8 && row >= 0 && column >= 0;
    }


    public void printToConsole(){
        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                Square square = squares[i][j];
                System.out.print(square.print());
            }
            System.out.println();
        }
    }
    public void move(int row, int column, int newRow, int newColumn){
        Square square = squares[row][column];
        squares[newRow][newColumn].piece = square.piece;
        square.piece = null;
    }
}
