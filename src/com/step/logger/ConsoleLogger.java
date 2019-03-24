package com.step.logger;

public class ConsoleLogger implements Logger {
    @Override
    public String log(String logMessage) {
        return logMessage + " logging in console";
    }
}
