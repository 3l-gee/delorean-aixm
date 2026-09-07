package com.delorean.aixm.core.config;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.FileAppender;
import org.slf4j.LoggerFactory;

public class GlobalLoggingConfig {
    private String level = "INFO";
    private boolean logToConsole = true;
    private boolean logToFile = false;
    private String filePath = "logs/delorean.log";

    public String getLevel() { return level; }
    public void setLevel(String level) { 
        this.level = level; 
        applyLogbackConfiguration();
    }

    public boolean isLogToConsole() { return logToConsole; }
    public void setLogToConsole(boolean logToConsole) { 
        this.logToConsole = logToConsole; 
        applyLogbackConfiguration();
    }

    public boolean isLogToFile() { return logToFile; }
    public void setLogToFile(boolean logToFile) { 
        this.logToFile = logToFile; 
        applyLogbackConfiguration();
    }

    public String getFilePath() { return filePath; }
    public void setFilePath(String filePath) { 
        this.filePath = filePath; 
        applyLogbackConfiguration();
    }

    public synchronized void applyLogbackConfiguration() {
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        Logger rootLogger = context.getLogger(Logger.ROOT_LOGGER_NAME);
        Logger deloreanLogger = context.getLogger("com.delorean");

        // 1. Update Log Levels
        Level targetLevel = Level.toLevel(this.level, Level.INFO);
        rootLogger.setLevel(targetLevel);
        if (deloreanLogger != null) {
            deloreanLogger.setLevel(targetLevel);
        }

        // 2. Toggle Console Appender
        if (!logToConsole) {
            rootLogger.detachAppender("STANDARD_CONSOLE");
        }

        // 3. Dynamically Attach/Detach File Appender
        String fileAppenderName = "DYNAMIC_FILE_APPENDER";
        rootLogger.detachAppender(fileAppenderName);

        if (logToFile && filePath != null && !filePath.trim().isEmpty()) {
            PatternLayoutEncoder encoder = new PatternLayoutEncoder();
            encoder.setContext(context);
            encoder.setPattern("[%d{yyyy-MM-dd HH:mm:ss}] [%-5level] [%-5level] %msg%n%ex{0}");
            encoder.start();

            FileAppender<ILoggingEvent> fileAppender = new FileAppender<>();
            fileAppender.setName(fileAppenderName);
            fileAppender.setContext(context);
            fileAppender.setFile(filePath);
            fileAppender.setEncoder(encoder);
            fileAppender.start();

            rootLogger.addAppender(fileAppender);
        }
    }
}


