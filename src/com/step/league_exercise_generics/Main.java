package com.step.league_exercise_generics;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        Cricket indXiC = new Cricket("IND XI C", 1, 2, 3);
        Cricket ausXiC = new Cricket("AUS XI C", 2, 2, 0);
        Cricket rsaXiC = new Cricket("RSA XI C", 1, 1, 1);


        League<Cricket> cricketTeamLeauge = new League<>(asList(indXiC, ausXiC, rsaXiC));
        cricketTeamLeauge.printTeamsInOrder();

        System.out.println("***************************");
        FootballTeam indXiF = new FootballTeam("IND XI F", 1, 2, 3);
        FootballTeam ausXiF = new FootballTeam("AUS XI F", 2, 2, 0);
        FootballTeam rsaXiF = new FootballTeam("RSA XI F", 1, 1, 1);


        League<FootballTeam> footbalTeamLeauge = new League<>(asList(indXiF, ausXiF, rsaXiF));
        footbalTeamLeauge.printTeamsInOrder();
    }
}
