package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

        Cylinder cylinder = new Cylinder(5.55, 7.25);
    @Test
    void getVolume() {
        assertEquals(701.574580913447, cylinder.getVolume());

    }
}