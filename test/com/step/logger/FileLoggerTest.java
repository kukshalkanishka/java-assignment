package com.step.logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FileLoggerTest {
    @Test
    void log() {
        Logger fileLogger = new FileLogger();
        String logMessage = "This is log message";
        String expectedMessage = logMessage + " logging in file";
        assertEquals(expectedMessage, fileLogger.log(logMessage));
    }

}