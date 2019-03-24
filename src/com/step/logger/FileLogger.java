package com.step.logger;

public class FileLogger implements Logger {

    @Override
    public String log(String logMessage) {
        return logMessage + " logging in file";
    }
}
