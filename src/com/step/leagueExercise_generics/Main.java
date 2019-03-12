package com.step.leagueExercise_generics;

public class Main {

    public static void main(String[] args) {
        Cricket cricket1 = new Cricket("dheeru",1, 2, 1);
        Cricket cricket = new Cricket("kannu",1, 2, 3);
        League league = new League("Cricket");
        league.addTeam(cricket);
        league.addTeam(cricket1);

        league.printTeamsInOrder();
    }
}
