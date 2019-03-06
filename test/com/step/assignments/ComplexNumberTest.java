package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

        ComplexNumber complexNumber1 = new ComplexNumber(1.0,1.0);
    @Test
    void add() {
        complexNumber1.add(1,1);
        assertEquals(2, complexNumber1.getReal());
        assertEquals(2, complexNumber1.getImaginary());
    }

    @Test
    void add1() {
        ComplexNumber complexNumber2 = new ComplexNumber(2.5,-1.5);
        complexNumber1.add(complexNumber2);
        assertEquals(3.5, complexNumber1.getReal());
        assertEquals(-0.5, complexNumber1.getImaginary());
    }

    @Test
    void subtract() {
        complexNumber1.subtract(1,1);
        assertEquals(0, complexNumber1.getReal());
        assertEquals(0, complexNumber1.getImaginary());
    }

    @Test
    void subtract1() {
        ComplexNumber complexNumber2 = new ComplexNumber(2.5,-1.5);
        complexNumber1.subtract(complexNumber2);
        assertEquals(-1.5, complexNumber1.getReal());
        assertEquals(2.5, complexNumber1.getImaginary());
    }
}