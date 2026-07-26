package com.delorean.aixm.core.log;

public interface Logger {
    void logOverride(LogLevel level, String message);
    void logOverride(LogLevel level, String message, Throwable throwable);
    void logOverride(LogLevel level, String message, StackTraceElement element);
    void logOverride(LogLevel level, String message, Object jsonPayload);
}
