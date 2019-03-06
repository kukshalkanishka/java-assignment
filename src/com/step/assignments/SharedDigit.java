package com.step.assignments;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    public static boolean isNumberInRange(int number) {
        return number >= 10 && number <= 99;
    }

    public static boolean areNumbersInRange(int num1, int num2) {
        return (isNumberInRange(num1) && isNumberInRange(num2));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (areNumbersInRange(num1, num2)) {
            int number1Copy = num1;
            int number2Copy = num2;
            while (number1Copy != 0) {
                int digitOfNum1 = number1Copy % 10;
                while (number2Copy != 0) {
                    if (digitOfNum1 == number2Copy % 10) {
                        return true;
                    }
                    number2Copy /= 10;
                }
                number1Copy /= 10;
            }
        }
        return false;
    }
}
