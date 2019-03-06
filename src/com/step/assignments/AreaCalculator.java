package com.step.assignments;

public class AreaCalculator {
    public static final double pi = Math.PI;

    public static void main(String[] args) {
        System.out.println(area(5.0));

        System.out.println(area(-1));

        System.out.println(area(5.0, 4.0));

        System.out.println(area(-1.0, 4.0));

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return (pi * radius * radius);
    }

    public static double area(double height, double width) {
        if (height < 0 || width < 0) {
            return -1.0;
        }
        return height * width;
    }
}
