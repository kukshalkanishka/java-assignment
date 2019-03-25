package com.step.activity_log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ActivityLog {

    private List<String> logs;

    ActivityLog() {
        this.logs = new ArrayList<>();
    }

    void addLog(String message) {
        this.logs.add(message);
    }

    List<String> getLogs() {
        return Collections.unmodifiableList(this.logs);
    }
}
