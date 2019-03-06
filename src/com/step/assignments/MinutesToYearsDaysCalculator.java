package com.step.assignments;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        long days = (minutes / 60) / 24;
        long years = days / 365;
        long remainingDays = days % 365;
        System.out.println(years + " years " + remainingDays + " days");
    }
}
