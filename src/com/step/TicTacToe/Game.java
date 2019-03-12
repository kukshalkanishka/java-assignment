package com.step.TicTacToe;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players = new ArrayList<Player>();
    private int currentPlayerIndex;
    private Board board = new Board();
    private int[][] possibleWinningMoves = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},
            {0, 3, 6},
            {1, 4, 7},
            {2, 5, 8},
            {0, 4, 8},
            {2, 4, 6}
    };

    public Game() {
        this.currentPlayerIndex = 0;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void makeMove(int symbolPosition) {
        Player currentPlayer = this.players.get(this.currentPlayerIndex);
        this.board.placeSymbol(symbolPosition, currentPlayer.getSymbol());
        currentPlayer.addMove(symbolPosition);
    }

    private boolean isSubset(ArrayList<Integer> currentPlayerMoves) {
        for (int[] possibleMoves : this.possibleWinningMoves) {
            boolean isSubset = true;
            for (int move : possibleMoves) {
                if (!currentPlayerMoves.contains(move)) {
                    isSubset = false;
                }
            }
            if (isSubset) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCurrentPlayerWon() {
        Player currentPlayer = this.players.get(this.currentPlayerIndex);
        ArrayList<Integer> currentPlayerMoves = currentPlayer.getMoves();
        return this.isSubset(currentPlayerMoves);
    }

    public void updateTurn() {
        this.currentPlayerIndex = (currentPlayerIndex + 1) % 2;
    }
}
