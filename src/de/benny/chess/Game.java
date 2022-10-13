package de.benny.chess;

public class Game {
    Board board = new Board();
    Turn turn = Turn.WHITE;  //it's whites turn

    public static void main(String[] args) {
        Game game = new Game();
        game.board.printToConsole();
        game.board.move(1,2,4,2);
        game.board.printToConsole();
    }

}
