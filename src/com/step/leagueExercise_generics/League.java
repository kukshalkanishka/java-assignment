package com.step.leagueExercise_generics;

import java.util.ArrayList;
import java.util.Comparator;

public class League <T extends Team>{
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    private String name;

    public void addTeam(T team){
        this.teams.add(team);
    }

    public void printTeamsInOrder(){
        for (Team team: this.teams) {
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
