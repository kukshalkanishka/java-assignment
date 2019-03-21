package com.step.units;

import java.math.BigDecimal;


public class Unit {
    private final UnitTypes type;

    private enum UnitTypes {
        LENGTH, VOLUME;
    }
    private BigDecimal ratio;

    public static final Unit FEET = new Unit(new BigDecimal(304.8), UnitTypes.LENGTH);
    public static final Unit INCHES = new Unit(new BigDecimal(25.4), UnitTypes.LENGTH);
    public static final Unit CENTIMETER = new Unit(new BigDecimal(10), UnitTypes.LENGTH);
    public static final Unit MILLIMETER = new Unit(new BigDecimal(1), UnitTypes.LENGTH);

    public static final Unit GALLON = new Unit(new BigDecimal(3790), UnitTypes.VOLUME);
    public static final Unit LITRE = new Unit(new BigDecimal(1000), UnitTypes.VOLUME);


    public Unit(BigDecimal ratio, UnitTypes unitType) {
        this.ratio = ratio;
        this.type = unitType;
    }

    public int valueInBase(BigDecimal value) {
        return this.ratio.multiply(value).intValue();
    }

    public boolean isSameType(Unit unit){
        return this.type == unit.type;
    }
}
