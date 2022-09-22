package de.benny.chess;

public class Piece {

    char notation;
    public Piece(char notation){
        this.notation = notation;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "notation=" + notation +
                '}';
    }
}
