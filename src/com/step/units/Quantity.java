package com.step.units;

public class Quantity {
    private double value;
    private Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean isEqual(Quantity otherQuantity){
        int value1InBase = this.unit.valueInBase(this.value);
        int value2InBase = otherQuantity.unit.valueInBase(otherQuantity.value);
        return value1InBase == (value2InBase);
    }
}
