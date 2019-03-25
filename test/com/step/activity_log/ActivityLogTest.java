//package com.step.activity_log;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static java.util.Arrays.asList;
//
//class ActivityLogTest {
//    @Test
//    void shouldAddTheLogMessageToTheActivityLog() {
//
//        ActivityLog activityLog = new ActivityLog();
//        String message1 = "this is first message";
//        activityLog.addLog(message1);
//        String message2 = "this is second message";
//        activityLog.addLog(message2);
//
//        List<String> expectedLogs = new ArrayList<>(asList(message1, message2));
//
//        assertEquals(expectedLogs, activityLog.getLogs());
//    }
//}