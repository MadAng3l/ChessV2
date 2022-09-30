package de.benny.chess;

public class Game {
    Board board = new Board();
    Turn turn = Turn.WHITE;  //it's whites turn

    public static void main(String[] args) {
        Game game = new Game();
        game.board.printToConsole();
        game.board.move(0,2,3,5);
        game.board.printToConsole();
        //game.board.squareList.forEach(System.out::println);
    }

}
