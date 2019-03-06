
package com.step.assignments;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int requiredBigCount = goal / 5;
        if (requiredBigCount <= bigCount) {
            int requiredSmallCount = goal % (bigCount * 5);
            if (requiredSmallCount <= smallCount) {
                return true;
            }
        }
        return false;
    }

}
