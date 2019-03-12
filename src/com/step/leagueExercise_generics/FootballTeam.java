package com.step.leagueExercise_generics;

public class FootballTeam extends Team {

    public FootballTeam(String name, int matchesWon, int matchesLost, int matchesDrawn) {

        this.matchesWon = matchesWon;
        this.name = name;
        this.matchesDrawn = matchesDrawn;
        this.matchesLost = matchesLost;
    }

    public int compareTo(int otherPlayerPoints) {
        if (getTotalPoints() == otherPlayerPoints) {
            return 0;
        }
        if (getTotalPoints() > otherPlayerPoints) {
            return 1;
        }
        return -1;
    }
}
