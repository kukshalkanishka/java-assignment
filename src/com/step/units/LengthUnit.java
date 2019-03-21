package com.step.units;

import java.math.BigDecimal;

public class LengthUnit extends Unit {

    private LengthUnit(BigDecimal ratio) {
        super(ratio);
    }

    public static final LengthUnit FEET = new LengthUnit(new BigDecimal(304.8));
    public static final LengthUnit INCHES = new LengthUnit(new BigDecimal(25.4));
    public static final LengthUnit CENTIMETER = new LengthUnit(new BigDecimal(10));
    public static final LengthUnit MILIMETER = new LengthUnit(new BigDecimal(1));

}
