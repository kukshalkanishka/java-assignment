package com.step.logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsoleLoggerTest {

    @Test
    void log() {
        Logger consoleLogger = new ConsoleLogger();
        String logMessage = "this is log message";
        String expectedMessage = logMessage + " logging in console";
        assertEquals(expectedMessage, consoleLogger.log(logMessage));
    }
}