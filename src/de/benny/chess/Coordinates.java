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
        return (char)(8-row);
    }
    public char getColumnLabel(){
        return (char)('A' + column);
    }
    public static int[] convertCoordinates(String line){
        char letter = line.charAt(0); //letter = 'A' + column
        int row = 8 - (line.charAt(1) - '0');
        int column = (letter - 'A');

        return new int[]{row,column};
    }
}
