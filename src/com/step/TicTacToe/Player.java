package com.step.TicTacToe;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Integer> moves = new ArrayList<Integer>();
    private String symbol;

    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public void addMove(Integer move){
        this.moves.add(move);
    }

    public String getSymbol() {
        return this.symbol;
    }

    public ArrayList<Integer> getMoves() {
        return this.moves;
    }
}
