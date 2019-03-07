package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {
Cuboid cuboid = new Cuboid(5,10,5);
    @Test
    void getVolume() {
        assertEquals(250, cuboid.getVolume());
    }
}