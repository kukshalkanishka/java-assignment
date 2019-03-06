package com.step.assignments;

public class sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int num = 1; num <1000 ; num++) {
            if(num %15 == 0){
                System.out.println(num);
                sum += num;
                counter++;
            }
            if(counter == 5){
                break;
            }
        }
    }
}
