package com.step.assignments;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int greatestNumber = Math.max(first, second);
        int smallestNumber = Math.min(first, second);
        int divisor = smallestNumber;
        while (smallestNumber != 0) {
            if (smallestNumber % divisor == 0 && greatestNumber % divisor == 0) {
                return divisor;
            }
            divisor--;
        }
        return 1;
    }

}
