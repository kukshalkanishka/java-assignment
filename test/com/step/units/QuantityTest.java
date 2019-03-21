package com.step.units;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void shouldReturnTrueWhenBothQuantitiesAreEqual(){
        Quantity oneFeet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity twelveInches = new Quantity(new BigDecimal(12), Unit.INCHES);
        assertTrue(oneFeet.isEqual(twelveInches));
    }
    @Test
    void shouldNotReturnTrueWhenBothQuantitiesAreNotEqual(){
        Quantity twoFeet = new Quantity(new BigDecimal(2), Unit.FEET);
        Quantity twelveInches = new Quantity(new BigDecimal(12), Unit.INCHES);
        assertFalse(twoFeet.isEqual(twelveInches));
    }

    @Test
    void shouldReturnTrueWhenQuantityInInchesIsEqualToQuantityInCentimeter(){
        Quantity twoInches = new Quantity(new BigDecimal(2), Unit.INCHES);
        Quantity fiveCentimeters = new Quantity(new BigDecimal(5), Unit.CENTIMETER);
        assertTrue(twoInches.isEqual(fiveCentimeters));
    }

    @Test
    void shouldNotReturnTrueWhenQuantityInInchesIsNotEqualToQuantityInCentimeter(){
        Quantity twoInches = new Quantity(new BigDecimal(1), Unit.INCHES);
        Quantity fiveCentimeters = new Quantity(new BigDecimal(5), Unit.CENTIMETER);
        assertFalse(twoInches.isEqual(fiveCentimeters));
    }

    @Test
    void shouldReturnTrueWhenQuantityInMilimeterIsEqualToQuantityInCentimeter(){
        Quantity oneMilimeter = new Quantity(new BigDecimal(10), Unit.MILLIMETER);
        Quantity pointOneCm = new Quantity(new BigDecimal(1), Unit.CENTIMETER);
        assertTrue(oneMilimeter.isEqual(pointOneCm));
    }

    @Test
    void shouldReturnTrueWhenQuantityInGallonIsEqualToQuantityInLiters(){
        Quantity oneGallon = new Quantity(new BigDecimal(1), Unit.GALLON);
        Quantity threeLitters = new Quantity(new BigDecimal(3.79), Unit.LITRE);
        assertTrue(oneGallon.isEqual(threeLitters));
    }

    @Test
    void shouldReturnFalseWhenQuantityInGallonIsNotEqualToQuantityInLiters(){
        Quantity oneGallon = new Quantity(new BigDecimal(2), Unit.GALLON);
        Quantity threeLitters = new Quantity(new BigDecimal(3.79), Unit.LITRE);
        assertFalse(oneGallon.isEqual(threeLitters));
    }

}