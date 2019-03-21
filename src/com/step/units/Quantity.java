package com.step.units;

import java.math.BigDecimal;

public class Quantity {
    private BigDecimal value;
    private Unit unit;

    public Quantity(BigDecimal value, Unit lengthUnit) {
        this.value = value;
        this.unit = lengthUnit;
    }

    public boolean isEqual(Quantity otherQuantity) {
        boolean isSameType = this.unit.isSameType(otherQuantity.unit);

        double value1InBase = this.unit.valueInBase(this.value);
        double value2InBase = otherQuantity.unit.valueInBase(otherQuantity.value);

        boolean hasSameBaseValue = value1InBase == (value2InBase);

        return isSameType && hasSameBaseValue;
    }
}
