package com.step.assignments;

import java.util.Scanner;

public class InuptCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
               sum += number;
               count += 1;
            }else{
                double average = (double)sum/ (double)count;
                int averageInInt = (int) ( Math.round(average));
                System.out.println(average);
                System.out.println("SUM = " + sum + " AVG = " + averageInInt);
                break;
            }
        }
        scanner.close();

    }
}
