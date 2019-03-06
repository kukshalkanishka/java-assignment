package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void distance() {
        Point point1 = new Point(2,2);
        assertEquals(2.8284271247461903, point1.distance());
    }

    @Test
    void distance1() {
        Point point1 = new Point(6,5);
        assertEquals(5.0, point1.distance(2,2));
    }

    @Test
    void distance2() {
        Point point1 = new Point(6,5);
        Point point2 = new Point(3,1);
        assertEquals(5.0, point1.distance(point2));
    }
}