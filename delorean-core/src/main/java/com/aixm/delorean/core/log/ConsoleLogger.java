package com.aixm.delorean.core.log;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConsoleLogger implements Logger {
    private static ConsoleLogger instance;
    private LogLevel currentLevel;
    private static final ObjectMapper mapper = new ObjectMapper();

    // Define ANSI color codes
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String YELLOW = "\u001B[33m";
    private static final String GREEN = "\u001B[32m";
    private static final String CYAN = "\u001B[36m";

    // Progress Configuration
    private static final int BAR_WIDTH = 50; 
    private String currentTask = "";
    private long current = 0;
    private long total = 0;
    private long lastUpdateTime = 0;

    // Method to get the color based on the log level
    private String getColor(LogLevel level) {
        switch (level) {
            case ERROR:
                return RED;
            case WARN:
                return YELLOW;
            case INFO:
                return GREEN;
            case DEBUG:
                return CYAN;
            default:
                return RESET;
        }
    }

    // Private constructor to prevent external instantiation
    private ConsoleLogger(LogLevel level) {
        this.currentLevel = level;
    }

    // Thread-safe Singleton initialization
    public static synchronized ConsoleLogger getInstance() {
        if (instance == null) {
            instance = new ConsoleLogger(LogLevel.INFO);
        }
        return instance;
    }

    // Static method to set the global log level
    public static void setGlobalLogLevel(LogLevel level) {
        getInstance().setLevel(level);
    }

    // log a message at the specified level (Logger interface)
    @Override
    public void logOverride(LogLevel level, String message) {
        if (level.ordinal() >= currentLevel.ordinal()) {
            System.out.println(formatMessage(level, message));
        }
    }

    //  log a message along with an exception (Logger interface)
    @Override
    public void logOverride(LogLevel level, String message, Throwable throwable) {
        if (level.ordinal() >= currentLevel.ordinal()) {
            System.out.println(formatMessage(level, message));
            throwable.printStackTrace(System.out);
        }
    }

    // log a message along with an exception (Logger interface)
    @Override
    public void logOverride(LogLevel level, String message, StackTraceElement element) {
        if (level.ordinal() >= currentLevel.ordinal()) {
            System.out.println(formatMessage(level, message, element));
        }
    }

    // log a message along with a JSON payload (Logger interface)
    @Override
    public void logOverride(LogLevel level, String message, Object jsonPayload) {
        if (level.ordinal() >= currentLevel.ordinal()) {
            System.out.println(formatMessage(level, message, jsonPayload));
        }
    }

    // log a message at the specified level
    public static void log(LogLevel level, String message) {
        ConsoleLogger logger = getInstance();
        logger.logOverride(level, message);
    }

    // og a message along with an 
    public static void log(LogLevel level, String message, Throwable throwable) {
        ConsoleLogger logger = getInstance();
        logger.logOverride(level, message, throwable);
    }

    // log a message along with an exception
    public static void log(LogLevel level, String message, StackTraceElement element) {
        ConsoleLogger logger = getInstance();
        logger.logOverride(level, message, element);
    }

    // Start a progress bar for a given task
    public static void startProgress(String taskName, long total) {
        ConsoleLogger logger = getInstance();
        logger.currentTask = taskName;
        logger.total = total;
        logger.current = 0;
        logger.lastUpdateTime = 0;
        renderProgress();
    }

    // Increment the progress bar based on current and total values
    public static void incrementProgress(long steps) {
        ConsoleLogger logger = getInstance();
        logger.current += steps;
        
        long now = System.currentTimeMillis();
        // only if 500ms passed OR if we reached the total
        if (now - logger.lastUpdateTime >= 500 || logger.current >= logger.total) {
            renderProgress();
            logger.lastUpdateTime = now;
        }
    }

    // Render the progress bar in the console
    private static void renderProgress() {
        ConsoleLogger logger = getInstance();
        double percentage = (logger.total <= 0) ? 0 : ((double) logger.current / logger.total) * 100;
        
        if (percentage > 100) percentage = 100;

        int completedBars = (int) ((percentage / 100) * BAR_WIDTH);
        int remainingBars = BAR_WIDTH - completedBars;

        StringBuilder bar = new StringBuilder("[");
        for (int i = 0; i < completedBars; i++) bar.append("#");
        for (int i = 0; i < remainingBars; i++) bar.append("-");
        bar.append("]");

        System.out.print(String.format("\r%s[INFO]%s %s : %s %.2f%%", 
            CYAN, RESET, logger.currentTask, bar.toString(), percentage));
    }

    // Stop the progress bar and reset values
    public static void stopProgress() {
        ConsoleLogger logger = getInstance();
        logger.current = logger.total;
        renderProgress();
        System.out.println();
        
        // Reset state
        logger.currentTask = ""; 
        logger.total = 0;
        logger.current = 0;
        logger.lastUpdateTime = 0;
    }

    // Method to format the log message
    private String formatMessage(LogLevel level, String message) {
        String color = getColor(level);
        return String.format("[%s%s%s] %s", color, level, RESET, message);
    }

    // Method to format the log message
    private String formatMessage(LogLevel level, String message, StackTraceElement element) {
        String color = getColor(level);
        return String.format("[%s%s%s] %s : %s", color, level, RESET, element, message);
    }

    private String formatMessage(LogLevel level, String message, Object jsonPayload) {
        String color = getColor(level);
        try {             
            jsonPayload = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonPayload);
        } catch (Exception e) {
            jsonPayload = "Failed to serialize JSON: " + e.getMessage();
        }
        return String.format("[%s%s%s] %s : %s", color, level, RESET, message, jsonPayload);
    }

    // Set the log level dynamically if needed
    private void setLevel(LogLevel level) {
        this.currentLevel = level;
    }
}
