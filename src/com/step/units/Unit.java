package com.step.units;

import java.math.BigDecimal;


abstract class Unit {


    final BigDecimal ratio;

    Unit(BigDecimal ratio) {
        this.ratio = ratio;
    }

    int valueInBase(BigDecimal value) {
        return this.ratio.multiply(value).intValue();
    }

    int convertBaseToUnit(BigDecimal value){
        return value.intValue() / this.ratio.intValue();
    }


    boolean isSameType(Unit unit) {
        return this.getClass().equals(unit.getClass());
    }
}
