package com.step.units;

public class Unit {
    private double ratio;

    private Unit(double ratio) {
        this.ratio = ratio;
    }

    public static final Unit FEET = new Unit((304.8));
    public static final Unit INCHES = new Unit((25.4));
    public static final Unit CENTIMETER = new Unit((10));
    public static final Unit MILIMETER = new Unit((1));

    public int valueInBase(double value) {
        int valueInInt = (int) Math.round(value);
        return (int) (valueInInt * ratio);
    }
}
