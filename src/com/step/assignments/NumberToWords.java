package com.step.assignments;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

    }

    public static int getDigitCount(int number){
        int count = 0;
        Integer num = number;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int reverse(int number) {

        int reverse = 0;
        Integer num = number;
        while (num != 0) {
            int lastDigit = num % 10;
            num /= 10;
            reverse *= 10;
            reverse += lastDigit;
        }
        return reverse;
    }

    public static String getWord(int num) {
        switch (num) {
            case 0: {
                return "Zero";
            }
            case 1: {
                return "One";
            }
            case 2: {
                return "Two";
            }
            case 3: {
                return ("Three");
            }
            case 4: {
                return ("Four");
            }
            case 5: {
                return ("Five");
            }
            case 6: {
                return ("Six");
            }
            case 7: {
                return ("Seven");
            }
            case 8: {
                return ("Eight");
            }
            case 9: {
                return ("Nine");
            }
            default: {
                return ("other");
            }
        }
    }

    public static void numberToWords(int number) {
        String words = "";
        int reversedNumber = reverse(number);
        for (int digit = 0; digit < getDigitCount(number); digit++) {

            words += " " + getWord(reversedNumber % 10);
            reversedNumber /= 10;
        }

        if(number < 0){
            words = "Invalid Value";
        }
        System.out.println(words);
    }
}

