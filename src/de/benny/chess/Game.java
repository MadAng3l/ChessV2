package de.benny.chess;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    Board board = new Board();
    Turn turn = Turn.WHITE;  //it's whites turn
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.board.printToConsole();
        while(true) {
            game.printInstruction();
            game.readUserInput();
            Thread.sleep(100);
            game.board.printToConsole();
        }
    }

    public void readUserInput(){
        try {
            String line = scanner.nextLine();
            String[] coords = line.split(" ");
            int[] fromCoord = Coordinates.convertCoordinates(coords[0]);
            int[] toCoord = Coordinates.convertCoordinates(coords[1]);

        /* nur zum testen
        System.out.println(Arrays.toString(coords));
        System.out.println(Arrays.toString(fromCoord));
        System.out.println(Arrays.toString(toCoord));
        */
            if (turn == Turn.WHITE && this.board.isWhitePiece(fromCoord[0], fromCoord[1]) || turn == Turn.BLACK && this.board.isBlackPiece(fromCoord[0], fromCoord[1])) {
                try {
                    this.board.move(fromCoord[0], fromCoord[1], toCoord[0], toCoord[1]);
                    turn = turn.nextTurn();
                } catch (InvalidMoveException e) {
                    System.err.println(e.getMessage());
                }
            } else System.out.println("It's not your turn!");
        }catch (Exception i) {
            System.err.println("Please enter valid from and to squares (ex. A7 A6)");
        }
    }
    public void printInstruction(){
        System.out.print("Player " + turn + " to move: ");

    }
}
