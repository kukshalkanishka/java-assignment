package com.step.assignments;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    public static boolean isNumberInRange(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean areNumbersInRange(int num1, int num2, int num3) {
        return (isNumberInRange(num1) && isNumberInRange(num2) && isNumberInRange(num3));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (areNumbersInRange(num1, num2, num3)) {
            if (num1 % 10 == num2 % 10 || num2 % 10 == num3 % 10 || num3 % 10 == num1 % 10) {
                return true;

            }
        }
        return false;
    }
}
