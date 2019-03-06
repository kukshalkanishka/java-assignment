package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getTotalCost() {
        Floor floor = new Floor(2.75,4.0);
        Carpet carpet = new Carpet(3.5);
        Calculator calculator = new Calculator(floor,carpet);
        assertEquals(38.5, calculator.getTotalCost());
    }
}