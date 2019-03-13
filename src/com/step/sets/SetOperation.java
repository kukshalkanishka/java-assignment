package com.step.sets;


import java.util.HashSet;
import java.util.Set;

public class SetOperation {

    public static <T> Set<T> getUnion(Set<T> set1, Set<T> set2){

        Set<T> union = new HashSet<T>();
        union.addAll(set1);
        union.addAll(set2);
        return union;

    }

    public static <T> Set<T> getIntersection(Set<T> set1, Set<T> set2){
        Set<T> intersection = new HashSet<T>();
        for (T element: set1) {
            if(set2.contains(element)){
                intersection.add(element);
            }

        }
        return intersection;
    }

    public static <T> Set<T> getDifference(Set<T> set1, Set<T> set2){
        Set<T> difference = new HashSet<T>();
        for (T element: set1) {
            if(!set2.contains(element)){
                difference.add(element);
            }

        }
        return difference;
    }

    }
