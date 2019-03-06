package com.step.assignments;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        Integer num = number;
        while(num != 0){
            int lastDigit = num % 10;
            num /= 10;
            reverse *= 10;
            reverse += lastDigit;
        }
        System.out.println(reverse);
        if(number == reverse){
            return true;
        }
        return false;
    }
}
