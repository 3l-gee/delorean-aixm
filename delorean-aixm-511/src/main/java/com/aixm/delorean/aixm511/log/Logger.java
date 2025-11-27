package com.aixm.delorean.aixm511.log;

public interface Logger {
    void logOverride(LogLevel level, String message);
    void logOverride(LogLevel level, String message, Throwable throwable);
    void logOverride(LogLevel level, String message, StackTraceElement element);
}
