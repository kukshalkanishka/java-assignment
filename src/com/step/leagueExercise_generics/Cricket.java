package com.step.leagueExercise_generics;

public class Cricket extends Team{
    public Cricket(String name,int matchesWon, int matchesLost, int matchesDrawn) {

        this.name = name;
        this.matchesWon = matchesWon;
        this.matchesDrawn = matchesDrawn;
        this.matchesLost = matchesLost;
    }

    @Override
    public int getTotalPoints(){
        return (this.matchesWon *2) + this.matchesDrawn;
    }

    @Override
    public int compareTo(int otherPlayerPoints) {
        int totalPoints = this.getTotalPoints();
        if(totalPoints == otherPlayerPoints){
            return 0;
        }
        if(totalPoints > otherPlayerPoints){
            return 1;
        }
        return -1;
    }



}
