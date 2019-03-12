package com.step.leagueExercise_generics;

public abstract class Team{
    protected int matchesWon;
    protected String name;
    protected int matchesLost;
    protected int matchesDrawn;

    abstract int compareTo(int totalPoints);

    public String getName(){
        return this.name;
    }

    public abstract int getTotalPoints();
}
