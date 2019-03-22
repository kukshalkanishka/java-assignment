package com.step.units;

import java.math.BigDecimal;


abstract class Unit {


    private final UnitTypes type;
    final BigDecimal ratio;

    Unit(BigDecimal ratio, UnitTypes unitType) {
        this.ratio = ratio;
        this.type = unitType;
    }

    int valueInBase(BigDecimal value) {
        return this.ratio.multiply(value).intValue();
    }

    int convertBaseToUnit(BigDecimal value){
        return value.intValue() / this.ratio.intValue();
    }


    boolean isSameType(Unit unit) {
        return this.type == unit.type;
    }

    enum UnitTypes {
        LENGTH, VOLUME, TEMPERATURE
    }
}
