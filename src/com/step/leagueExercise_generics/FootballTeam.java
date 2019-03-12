package com.step.leagueExercise_generics;

public class FootballTeam extends Team {

    public FootballTeam(String name, int matchesWon, int matchesLost, int matchesDrawn) {

        this.matchesWon = matchesWon;
        this.name = name;
        this.matchesDrawn = matchesDrawn;
        this.matchesLost = matchesLost;
    }

    public int getTotalPoints(){
        return this.matchesWon + (this.matchesLost * -2);
    }

    public int compareTo(int otherPlayerPoints) {
        if (this.getTotalPoints() == otherPlayerPoints) {
            return 0;
        }
        if (this.getTotalPoints() > otherPlayerPoints) {
            return 1;
        }
        return -1;
    }
}
