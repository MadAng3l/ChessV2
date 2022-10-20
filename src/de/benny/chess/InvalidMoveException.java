package de.benny.chess;

public class InvalidMoveException extends Exception{
    public InvalidMoveException (String message){
        super(message);
    }
}
