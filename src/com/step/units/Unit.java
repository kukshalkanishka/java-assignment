package com.step.units;

import java.math.BigDecimal;

public abstract class Unit {
    private BigDecimal ratio;

    public Unit(BigDecimal ratio) {
        this.ratio = ratio;
    }

    public int valueInBase(BigDecimal value) {
        return this.ratio.multiply(value).intValue();
    }
}
