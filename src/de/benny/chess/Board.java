package de.benny.chess;

import de.benny.chess.pieces.Piece;

public class Board {
    //List<Square> squareList = new ArrayList<>();
    public Square[][] squares = new Square[8][8];
    String startFEN = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR";//start position and information of a chess game
    public Board(){
        //fillBoard();
        fillBoardByFEN(startFEN);
    }

    private void fillBoardByFEN(String fen) { //Forsyth-Edwards-Notation, standard notation for describing a particular chess board position
        int columnIndex = 0;
        int row = 0;
        for (int i=0; i < fen.length(); i++){
            char fenChar = fen.charAt(i);
            switch (fenChar){
                case 'r','n','b','q','k','p','R','N','B','Q','K','P':
                    Square square = new Square (columnIndex,row,fenChar);
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
                        Square emptySquare = new Square(columnIndex,row,fenChar);
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
                System.out.print("\t"+square.print());
            }
            System.out.println();
        }
    }

    public void move(int row, int column, int newRow, int newColumn){
        Square square = squares[row][column];
        if (square.isEmpty()){
            throw new IllegalArgumentException("Square is empty, cannot move");
        }
        Piece piece = square.piece;
        if (!piece.validateMove(row, column, newRow, newColumn, this)){
            throw new IllegalArgumentException("Piece cannot move there");
        }
        squares[newRow][newColumn].piece = square.piece;
        square.piece = null;
    }
}
