package com.step.activity_log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ActivityLogWithSeconds implements Logger {
    private List<String> logs;

    public ActivityLogWithSeconds() {
        this.logs = new ArrayList<>();
    }

    @Override
    public List<String> addLog(String message) {
        Date currentTime = new Date();
        message += currentTime.toString();
        this.logs.add(message);

        return Collections.unmodifiableList(this.logs);
    }
}
