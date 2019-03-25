package com.step.activity_log;


import java.util.List;

public class ActivityLogHandler {
    private Logger logger;

    public ActivityLogHandler(Logger logger) {
        this.logger = logger;
    }

    public List<String> addLog(String message){
        return logger.addLog(message);
    }
}
