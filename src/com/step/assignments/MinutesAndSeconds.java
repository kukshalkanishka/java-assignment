package com.step.assignments;

public class MinutesAndSeconds {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3600));


    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || (seconds < 0 && seconds > 59)){
         return "Invalid Value";
        }
        int hours = minutes/60;
        int remainingMinutes = minutes % 60;
        return (hours + " hours " + remainingMinutes+ " minutes" + seconds + "seconds");

    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds%60;
        return getDurationString(minutes, remainingSeconds);
    }

}
