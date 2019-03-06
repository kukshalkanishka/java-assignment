package com.step.assignments;

public class FactorPrinter {
    public static void main(String[] args) {

        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors (int number) {
        if (number > 1) {
            int divisor = 1;

            while (divisor <= number) {
                if (number % divisor == 0) {
                    System.out.println(divisor);
                }
                divisor++;

            }
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}
