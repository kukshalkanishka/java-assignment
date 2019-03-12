package com.step.TicTacToe;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        startGame();


    }
    private static void startGame() {
        Game game = new Game();
        game.addPlayer(new Player("kannu", "X"));
        game.addPlayer(new Player("kk", "O"));
        game.makeMove(0);
        game.updateTurn();
        game.makeMove(3);
        game.updateTurn();
        game.makeMove(1);
        System.out.println(game.hasCurrentPlayerWon());
        game.updateTurn();
        game.makeMove(6);
        game.updateTurn();
        game.makeMove(2);
        System.out.println(game.hasCurrentPlayerWon());
        game.updateTurn();
    }

}
