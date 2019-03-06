package com.step.assignments;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int numberCopy = number;
        int sum = 0;
        while (numberCopy != 0) {
            int digit = numberCopy % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            numberCopy /= 10;
        }
        return sum;
    }
}
