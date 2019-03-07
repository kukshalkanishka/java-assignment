package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
Rectangle rectangle = new Rectangle(5,10);
    @Test
    void getArea() {
        assertEquals(50, rectangle.getArea());
    }
}