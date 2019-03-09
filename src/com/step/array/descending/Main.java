package com.step.array.descending;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 2, 7, 9, 5};
        for (int numberIndex = 0; numberIndex < numbers.length - 1; numberIndex++) {
        System.out.println(numbers[numberIndex]);
        }

    }

    public static  int[] duplicateList(int[] list){
        int[] duplicateList= new int[list.length];

        for (int numberIndex = 0; numberIndex < list.length - 1; numberIndex++) {
            duplicateList[numberIndex] = list[numberIndex];
        }
        return duplicateList;
    }

    public static int[] sortArray(int[] numbers){
        boolean flag = true;
        int smallerNumber;
        int[] sortedNumbers= duplicateList(numbers);

        while(flag){
            for (int numberIndex = 0; numberIndex < numbers.length - 1; numberIndex++) {
                flag = false;
                if(sortedNumbers[numberIndex]< sortedNumbers[numberIndex +1]){
                    smallerNumber = sortedNumbers[numberIndex];
                    sortedNumbers[numberIndex] = sortedNumbers[numberIndex +1];
                    sortedNumbers[numberIndex +1] = smallerNumber;
                    flag = true;
                }
            }
        }
        return sortedNumbers;
    }
}
