package com.step.units;

import java.math.BigDecimal;
import java.util.Objects;

public class Quantity {
    private BigDecimal value;
    private Unit unit;

    public Quantity(BigDecimal value, Unit lengthUnit) {
        this.value = value;
        this.unit = lengthUnit;
    }

    private boolean isSameType(Quantity otherQuantity) {
        return this.unit.isSameType(otherQuantity.unit);
    }

    private double getValueInBase(Quantity quantity){
        return quantity.unit.valueInBase(quantity.value);
    }

    @Override
    public boolean equals(Object otherQuantity) {
        if(!(otherQuantity.getClass().equals(this.getClass()))){
            return false;
        }
        boolean isSameType = isSameType((Quantity) otherQuantity);

        double value1InBase = getValueInBase(this);
        double value2InBase = getValueInBase((Quantity) otherQuantity);

        boolean hasSameBaseValue = value1InBase == (value2InBase);

        return isSameType && hasSameBaseValue;
    }

    public Quantity add(Quantity otherQuantity) throws QuantityTypeMismatchException {
        if(!isSameType(otherQuantity)){
            throw new QuantityTypeMismatchException();
        }

        double value1InBase = getValueInBase(this);
        double value2InBase = getValueInBase((Quantity) otherQuantity);

        double sumInBase = value1InBase + value2InBase;
        int sum = otherQuantity.unit.convertBackToUnit(new BigDecimal(sumInBase));
        return new Quantity(new BigDecimal(sum), this.unit);
    }
}
