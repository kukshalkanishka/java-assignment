package com.step.units;

import java.math.BigDecimal;

public class TemperatureUnit extends Unit {

    static final Unit FAREHNEIT = new TemperatureUnit(new BigDecimal(1),0);
    static final Unit CELCIUS = new TemperatureUnit(new BigDecimal(1.8),32);

    private final double scale;

    public TemperatureUnit(BigDecimal ratio, double scale) {
        super(ratio,UnitTypes.TEMPERATURE);
        this.scale = scale;
    }

    @Override
    int valueInBase(BigDecimal value) {
        return (int) ((value.multiply(this.ratio)).intValue()+this.scale);
    }
}
