package com.step.assignments;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        int divisor = 1;
        if (number >= 1) {
            while (divisor < number) {
                if (number % divisor == 0) {
                    sum += divisor;
                }
                divisor++;

            }
            if (sum == number) {
                return true;
            }
        }

        return false;
    }
}
