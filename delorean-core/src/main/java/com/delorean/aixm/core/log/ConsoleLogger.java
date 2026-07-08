package com.delorean.aixm.core.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ConsoleLogger {
    // Standard SLF4J Logger
    private static final Logger log = LoggerFactory.getLogger(ConsoleLogger.class);

    // Define ANSI color codes
    private static final String RESET = "\u001B[0m";
    private static final String CYAN = "\u001B[36m";

    // Progress Configuration
    private static final int BAR_WIDTH = 50; 
    private static String currentTask = "";
    private static long current = 0;
    private static long total = 0;
    private static long lastUpdateTime = 0;

    // Delegate standard logging directly to SLF4J
    public static void info(String message) { log.info(message); }
    public static void warn(String message) { log.warn(message); }
    public static void error(String message) { log.error(message); }
    public static void debug(String message) { log.debug(message); }
    public static void error(String message, Throwable t) { log.error(message, t); }


    // Start a progress bar for a given task
    public static synchronized void startProgress(String taskName, long totalSteps) {
        currentTask = taskName;
        total = totalSteps;
        current = 0;
        lastUpdateTime = 0;
        renderProgress();
    }

    // Increment the progress bar based on current and total values
    public static synchronized void incrementProgress(long steps) {
        current += steps;
        long now = System.currentTimeMillis();
        // Update every 500ms or on completion
        if (now - lastUpdateTime >= 500 || current >= total) {
            renderProgress();
            lastUpdateTime = now;
        }
    }

    // Render the progress bar in the console
    private static void renderProgress() {
        double percentage = (total <= 0) ? 0 : ((double) current / total) * 100;
        if (percentage > 100) percentage = 100;

        int completedBars = (int) ((percentage / 100) * BAR_WIDTH);
        int remainingBars = BAR_WIDTH - completedBars;

        StringBuilder bar = new StringBuilder("[");
        for (int i = 0; i < completedBars; i++) bar.append("#");
        for (int i = 0; i < remainingBars; i++) bar.append("-");
        bar.append("]");

        // Directly printing to stdout to handle backslash-r correctly without log line endings
        System.out.print(String.format("\r[%sINFO%s] %s : %s %.2f%%", 
            CYAN, RESET, currentTask, bar.toString(), percentage));
    }

    // Stop the progress bar and reset values
    public static synchronized void stopProgress() {
        current = total;
        renderProgress();
        System.out.println(); // Break the line so subsequent SLF4J logs don't overwrite it
        
        // Reset state
        currentTask = ""; 
        total = 0;
        current = 0;
        lastUpdateTime = 0;
    }
}
