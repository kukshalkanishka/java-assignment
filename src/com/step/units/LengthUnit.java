package com.step.units;

import java.math.BigDecimal;

class LengthUnit extends Unit {
    static final Unit FEET = new LengthUnit(new BigDecimal(304.8));
    static final Unit INCHES = new LengthUnit(new BigDecimal(25.4));
    static final Unit CENTIMETER = new LengthUnit(new BigDecimal(10));
    static final Unit MILLIMETER = new LengthUnit(new BigDecimal(1));

    private LengthUnit(BigDecimal ratio){
        super(ratio);
    }
}
