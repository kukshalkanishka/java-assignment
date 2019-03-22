package com.step.units;

import java.math.BigDecimal;

public class VolumeUnit extends Unit{

    static final Unit GALLON = new VolumeUnit(new BigDecimal(3790));
    static final Unit LITRE = new VolumeUnit(new BigDecimal(1000));

    private VolumeUnit(BigDecimal ratio){
        super(ratio);
    }

}

