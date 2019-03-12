package com.step.TicTacToe;

import java.util.Arrays;
import java.util.List;

public class Board {
    private List<String> board = Arrays.asList(new String[9]);

    public void placeSymbol(int position, String symbol) {
        this.board.set(position, symbol);
        System.out.println(this.board.size());
    }
}
