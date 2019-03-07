package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
Circle circle = new Circle(3.75);
    @Test
    void getArea() {
     assertEquals(44.178646691106465, circle.getArea());
    }
}