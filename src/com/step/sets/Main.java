package com.step.sets;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(6);
        set1.add(5);

        set2.add(9);
        set2.add(7);
        set2.add(5);
        set2.add(6);
        set2.add(1);

        System.out.println(SetOperation.getUnion(set1, set2));
        System.out.println(SetOperation.getIntersection(set1, set2));
        System.out.println(SetOperation.getDifference(set1, set2));
    }
}
