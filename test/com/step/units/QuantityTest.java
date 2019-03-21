package com.step.units;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void shouldReturnTrueWhenBothQuantitiesAreEqual(){
        Quantity oneFeet = new Quantity(new BigDecimal(1), LengthUnit.FEET);
        Quantity twelveInches = new Quantity(new BigDecimal(12), LengthUnit.INCHES);
        assertTrue(oneFeet.isEqual(twelveInches));
    }
    @Test
    void shouldNotReturnTrueWhenBothQuantitiesAreNotEqual(){
        Quantity twoFeet = new Quantity(new BigDecimal(2), LengthUnit.FEET);
        Quantity twelveInches = new Quantity(new BigDecimal(12), LengthUnit.INCHES);
        assertFalse(twoFeet.isEqual(twelveInches));
    }

    @Test
    void shouldReturnTrueWhenQuantityInInchesIsEqualToQuantityInCentimeter(){
        Quantity twoInches = new Quantity(new BigDecimal(2), LengthUnit.INCHES);
        Quantity fiveCentimeters = new Quantity(new BigDecimal(5), LengthUnit.CENTIMETER);
        assertTrue(twoInches.isEqual(fiveCentimeters));
    }

    @Test
    void shouldReturnTrueWhenQuantityInMilimeterIsEqualToQuantityInCentimeter(){
        Quantity oneMilimeter = new Quantity(new BigDecimal(10), LengthUnit.MILIMETER);
        Quantity pointOneCm = new Quantity(new BigDecimal(1), LengthUnit.CENTIMETER);
        assertTrue(oneMilimeter.isEqual(pointOneCm));
    }

    @Test
    void shouldReturnTrueWhenQuantityInGallonIsEqualToQuantityInLiters(){
        Quantity oneGallon = new Quantity(new BigDecimal(1), VolumeUnit.GALLON);
        Quantity threeLitters = new Quantity(new BigDecimal(3.79), VolumeUnit.LITRE);
        assertTrue(oneGallon.isEqual(threeLitters));
    }

}