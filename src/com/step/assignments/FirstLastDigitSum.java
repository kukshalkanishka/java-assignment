package com.step.assignments;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number){
        if(number <0){
            return -1;
        }
        int numberCopy  = number;
        int lastNumber = number % 10;
        int firstNumber = lastNumber;
        while (numberCopy != 0){
            firstNumber = numberCopy %10;
            numberCopy /= 10;
        }
        return firstNumber + lastNumber;
    }
}
