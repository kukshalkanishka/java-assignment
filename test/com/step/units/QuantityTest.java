package com.step.units;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void shouldReturnTrueWhenBothQuantitiesAreEqual() {
        Quantity oneFeet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity twelveInches = new Quantity(new BigDecimal(12), Unit.INCHES);
        assertTrue(oneFeet.equals(twelveInches));
    }

    @Test
    void shouldNotReturnTrueWhenBothQuantitiesAreNotEqual() {
        Quantity twoFeet = new Quantity(new BigDecimal(2), Unit.FEET);
        Quantity twelveInches = new Quantity(new BigDecimal(12), Unit.INCHES);
        assertFalse(twoFeet.equals(twelveInches));
    }

    @Test
    void shouldReturnTrueWhenQuantityInInchesIsEqualToQuantityInCentimeter() {
        Quantity twoInches = new Quantity(new BigDecimal(2), Unit.INCHES);
        Quantity fiveCentimeters = new Quantity(new BigDecimal(5), Unit.CENTIMETER);
        assertTrue(twoInches.equals(fiveCentimeters));
    }

    @Test
    void shouldNotReturnTrueWhenQuantityInInchesIsNotEqualToQuantityInCentimeter() {
        Quantity twoInches = new Quantity(new BigDecimal(1), Unit.INCHES);
        Quantity fiveCentimeters = new Quantity(new BigDecimal(5), Unit.CENTIMETER);
        assertFalse(twoInches.equals(fiveCentimeters));
    }

    @Test
    void shouldReturnTrueWhenQuantityInMilimeterIsEqualToQuantityInCentimeter() {
        Quantity oneMilimeter = new Quantity(new BigDecimal(10), Unit.MILLIMETER);
        Quantity pointOneCm = new Quantity(new BigDecimal(1), Unit.CENTIMETER);
        assertTrue(oneMilimeter.equals(pointOneCm));
    }

    @Test
    void shouldReturnTrueWhenQuantityInGallonIsEqualToQuantityInLiters() {
        Quantity oneGallon = new Quantity(new BigDecimal(1), Unit.GALLON);
        Quantity threeLitters = new Quantity(new BigDecimal(3.79), Unit.LITRE);
        assertTrue(oneGallon.equals(threeLitters));
    }

    @Test
    void shouldReturnFalseWhenQuantityInGallonIsNotEqualToQuantityInLiters() {
        Quantity oneGallon = new Quantity(new BigDecimal(2), Unit.GALLON);
        Quantity threePointSevenNineLitters = new Quantity(new BigDecimal(3.79), Unit.LITRE);
        assertFalse(oneGallon.equals(threePointSevenNineLitters));
    }

    @Test
    void shouldReturnFourInchesWhenTwoQuantitiesOfTwoInchesEachAreAdded() throws QuantityTypeMismatchException {
        Quantity twoInches = new Quantity(new BigDecimal(2), Unit.INCHES);
        Quantity expectedInches = new Quantity(new BigDecimal(4), Unit.INCHES);
        assertEquals(expectedInches, twoInches.add(twoInches));
    }

    @Test
    void shouldThrowExceptionWhenTwoDifferentTypeQuantitiesAreAdded(){
        Quantity twoInches = new Quantity(new BigDecimal(2), Unit.INCHES);
        Quantity fourLitres = new Quantity(new BigDecimal(4), Unit.LITRE);
        assertThrows(QuantityTypeMismatchException.class, () -> twoInches.add(fourLitres));
    }

    @Test
    void shouldReturnThreeInchesWhenTwoInchIsAddedToTwoPointFiveCentimeter() throws QuantityTypeMismatchException {
        Quantity twoInches = new Quantity(new BigDecimal(2), Unit.INCHES);
        Quantity twoPointFiveCm = new Quantity(new BigDecimal(2.5), Unit.CENTIMETER);
        Quantity expectedInches = new Quantity(new BigDecimal(3), Unit.INCHES);
        assertEquals(expectedInches, twoInches.add(twoPointFiveCm));
    }

    @Test
    void shouldReturnResultOfAdditionInInchesWhenTheOperandsAreInDifferentUnits() throws QuantityTypeMismatchException {
        Quantity twoFeet = new Quantity(new BigDecimal(2), Unit.FEET);
        Quantity twoPointFiveCm = new Quantity(new BigDecimal(2.5), Unit.CENTIMETER);
        Quantity expectedInches = new Quantity(new BigDecimal(25), Unit.INCHES);
        assertEquals(expectedInches, twoFeet.add(twoPointFiveCm));
    }
}