package de.benny.chess;

public class Coordinates {
    int column;
    int row;

    public Coordinates(int column,int row){
        this.column = column;
        this.row = row;
    }
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return column;
    }
    public char getRowLabel(){
        return ' ';
    }
    public char getColumnLabel(){
        return (char)('A' + column);
    }
}
