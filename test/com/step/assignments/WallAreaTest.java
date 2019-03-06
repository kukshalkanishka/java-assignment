package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallAreaTest {

    @Test
    void getArea() {
        Wall wallArea = new Wall(5,4);
        double actual = wallArea.getArea();
        assertEquals(actual, 20);
    }
}