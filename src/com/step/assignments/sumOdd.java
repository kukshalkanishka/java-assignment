package com.step.assignments;

public class sumOdd {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));


    }

    public static boolean isOdd(int number){
        if((number >= 0) && (number % 2 != 0)){
            return true;
        }
        return false;
    }
    public static int sumOdd (int start, int end){
        int sum = 0;
        if(start > 0 && end > 0 && end >= start) {
            for (int number = start; number < end; number++) {
                if (isOdd(number)) {
                    sum += number;
                }
            }
            return sum;
        }
        return -1;
    }
}
