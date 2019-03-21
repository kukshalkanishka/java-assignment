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

    @Override
    public boolean equals(Object otherQuantity) {
        if(!(otherQuantity.getClass().equals(this.getClass()))){
            return false;
        }
        boolean isSameType = isSameType((Quantity) otherQuantity);

        double value1InBase = this.unit.valueInBase(this.value);
        double value2InBase = ((Quantity) otherQuantity).unit.valueInBase(((Quantity) otherQuantity).value);

        boolean hasSameBaseValue = value1InBase == (value2InBase);

        return isSameType && hasSameBaseValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    public Quantity add(Quantity otherQuantity) throws QuantityTypeMismatchException {
        if(!isSameType(otherQuantity)){
            throw new QuantityTypeMismatchException();
        }
        BigDecimal sum = this.value.add(otherQuantity.value);
        return new Quantity(sum, this.unit);
    }
}
