package com.step.units;

import java.math.BigDecimal;

public class Quantity {
    private BigDecimal value;
    private Unit unit;

    public Quantity(BigDecimal value, Unit lengthUnit) {
        this.value = value;
        this.unit = lengthUnit;
    }

    public boolean isEqual(Quantity otherQuantity){
        double value1InBase = this.unit.valueInBase(this.value);
        double value2InBase = otherQuantity.unit.valueInBase(otherQuantity.value);
        System.out.println(value1InBase +" "+ value2InBase);
        return value1InBase == (value2InBase);
    }
}
