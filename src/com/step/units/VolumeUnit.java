package com.step.units;

import java.math.BigDecimal;

public class VolumeUnit extends Unit{
    public static final VolumeUnit GALLON = new VolumeUnit(new BigDecimal(3790));
    public static final VolumeUnit LITRE= new VolumeUnit(new BigDecimal(1000));

    public VolumeUnit(BigDecimal ratio) {
        super(ratio);
    }
}
