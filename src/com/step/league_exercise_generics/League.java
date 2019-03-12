package com.step.league_exercise_generics;

import java.util.Comparator;
import java.util.List;

public class League<T extends Team> {
    private List<T> teams;

    public League(List<T> teams) {
        this.teams = teams;
    }

    public void printTeamsInOrder() {
        this.sortTeams();
        for (Team team : this.teams) {
            System.out.println(team.getName());
        }
    }

    public void sortTeams() {
        this.teams.sort(new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                return (int) o2.compareTo(o1.getTotalPoints());
            }
        });
    }
}
