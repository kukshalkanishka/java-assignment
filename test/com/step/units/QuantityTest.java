package com.step.units;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void shouldReturnTrueWhenBothQuantitiesAreEqual() {
        Quantity oneFeet = new Quantity(new BigDecimal(1), LengthUnit.FEET);
        Quantity twelveInches = new Quantity(new BigDecimal(12), LengthUnit.INCHES);
        assertTrue(oneFeet.equals(twelveInches));
    }

    @Test
    void shouldNotReturnTrueWhenBothQuantitiesAreNotEqual() {
        Quantity twoFeet = new Quantity(new BigDecimal(2), LengthUnit.FEET);
        Quantity twelveInches = new Quantity(new BigDecimal(12), LengthUnit.INCHES);
        assertFalse(twoFeet.equals(twelveInches));
    }

    @Test
    void shouldReturnTrueWhenQuantityInInchesIsEqualToQuantityInCentimeter() {
        Quantity twoInches = new Quantity(new BigDecimal(2), LengthUnit.INCHES);
        Quantity fiveCentimeters = new Quantity(new BigDecimal(5), LengthUnit.CENTIMETER);
        assertTrue(twoInches.equals(fiveCentimeters));
    }

    @Test
    void shouldNotReturnTrueWhenQuantityInInchesIsNotEqualToQuantityInCentimeter() {
        Quantity twoInches = new Quantity(new BigDecimal(1), LengthUnit.INCHES);
        Quantity fiveCentimeters = new Quantity(new BigDecimal(5), LengthUnit.CENTIMETER);
        assertFalse(twoInches.equals(fiveCentimeters));
    }

    @Test
    void shouldReturnTrueWhenQuantityInMillimeterIsEqualToQuantityInCentimeter() {
        Quantity oneMillimeter = new Quantity(new BigDecimal(10), LengthUnit.MILLIMETER);
        Quantity pointOneCm = new Quantity(new BigDecimal(1), LengthUnit.CENTIMETER);
        assertTrue(oneMillimeter.equals(pointOneCm));
    }

    @Test
    void shouldReturnTrueWhenQuantityInGallonIsEqualToQuantityInLiters() {
        Quantity oneGallon = new Quantity(new BigDecimal(1), VolumeUnit.GALLON);
        Quantity threeLitters = new Quantity(new BigDecimal(3.79), VolumeUnit.LITRE);
        assertTrue(oneGallon.equals(threeLitters));
    }

    @Test
    void shouldReturnFalseWhenQuantityInGallonIsNotEqualToQuantityInLiters() {
        Quantity oneGallon = new Quantity(new BigDecimal(2), VolumeUnit.GALLON);
        Quantity threePointSevenNineLitters = new Quantity(new BigDecimal(3.79), VolumeUnit.LITRE);
        assertFalse(oneGallon.equals(threePointSevenNineLitters));
    }

    @Test
    void shouldReturnFourInchesWhenTwoQuantitiesOfTwoInchesEachAreAdded() throws QuantityTypeMismatchException, NoSuchMethodException {
        Quantity twoInches = new Quantity(new BigDecimal(2), LengthUnit.INCHES);
        Quantity expectedInches = new Quantity(new BigDecimal(4), LengthUnit.INCHES);
        assertEquals(expectedInches, twoInches.add(twoInches));
    }

    @Test
    void shouldThrowExceptionWhenTwoDifferentTypeQuantitiesAreAdded() {
        Quantity twoInches = new Quantity(new BigDecimal(2), LengthUnit.INCHES);
        Quantity fourLitres = new Quantity(new BigDecimal(4), VolumeUnit.LITRE);
        assertThrows(QuantityTypeMismatchException.class, () -> twoInches.add(fourLitres));
    }

    @Test
    void shouldReturnThreeInchesWhenTwoInchIsAddedToTwoPointFiveCentimeter() throws QuantityTypeMismatchException {
        Quantity twoInches = new Quantity(new BigDecimal(2), LengthUnit.INCHES);
        Quantity twoPointFiveCm = new Quantity(new BigDecimal(2.5), LengthUnit.CENTIMETER);
        Quantity expectedInches = new Quantity(new BigDecimal(3), LengthUnit.INCHES);
        assertEquals(expectedInches, twoInches.add(twoPointFiveCm));
    }

    @Test
    void shouldReturnResultOfAdditionInInchesWhenTheOperandsAreInDifferentUnits() throws QuantityTypeMismatchException {
        Quantity twoFeet = new Quantity(new BigDecimal(2), LengthUnit.FEET);
        Quantity twoPointFiveCm = new Quantity(new BigDecimal(2.5), LengthUnit.CENTIMETER);
        Quantity expectedInches = new Quantity(new BigDecimal(2), LengthUnit.FEET);
        assertEquals(expectedInches, twoFeet.add(twoPointFiveCm));
    }

    @Test
    void shouldReturnFalseWhenThreeCelciusIsComparedWithThirtyThreeFahrenheit() {
        Quantity threeCelcius = new Quantity(new BigDecimal(3), TemperatureUnit.CELSIUS);
        Quantity thirtyThreeF = new Quantity(new BigDecimal(33), TemperatureUnit.FAHRENHEIT);
        assertFalse(threeCelcius.equals(thirtyThreeF));
    }

    @Test
    void shouldReturnTrueWhenHundredCelciusIsComparedWithTwoHundredTwelveFahrenheit() {
        Quantity hundredCelsius = new Quantity(new BigDecimal(100), TemperatureUnit.CELSIUS);
        Quantity twoHundredTwelveF = new Quantity(new BigDecimal(212), TemperatureUnit.FAHRENHEIT);
        assertTrue(hundredCelsius.equals(twoHundredTwelveF));
    }
}