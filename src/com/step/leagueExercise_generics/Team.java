package com.step.leagueExercise_generics;

public abstract class Team{
    protected int matchesWon;
    protected String name;
    protected int matchesLost;
    protected int matchesDrawn;

    abstract int compareTo(int totalPoints);

    public int getTotalPoints(){
        return this.matchesDrawn + this.matchesWon - this.matchesLost;
    }

    public String getName(){
        return this.name;
    }
}
