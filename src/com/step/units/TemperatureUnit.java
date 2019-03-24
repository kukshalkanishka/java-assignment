package com.step.units;

import java.math.BigDecimal;

class TemperatureUnit extends Unit {

    static final Unit FAHRENHEIT = new TemperatureUnit(new BigDecimal(1),0);
    static final Unit CELSIUS = new TemperatureUnit(new BigDecimal(1.8),32);

    private final double scale;

    private TemperatureUnit(BigDecimal ratio, double scale) {
        super(ratio);
        this.scale = scale;
    }

    @Override
    int valueInBase(BigDecimal value) {
        return (int) ((value.multiply(this.ratio)).intValue()+this.scale);
    }
}
