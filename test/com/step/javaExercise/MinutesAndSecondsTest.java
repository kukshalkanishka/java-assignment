package com.step.javaExercise;

import com.step.assignments.MinutesAndSeconds;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesAndSecondsTest {

    @Test
    void shouldReturnInvalidValue() {
        String actual = MinutesAndSeconds.getDurationString(-3, -2);
        assertEquals(actual, "Invalid Value");
    }

    @Test
    void shouldReturnHoursMinutesAndSecondsValue() {
        String actual = MinutesAndSeconds.getDurationString(65, 45);
        assertEquals(actual, "1 hours 5 minutes45seconds");
    }
}