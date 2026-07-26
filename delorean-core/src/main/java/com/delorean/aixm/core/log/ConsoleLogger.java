package com.delorean.aixm.core.log;

public class ConsoleLogger {

    // Progress Configuration
    private static final int BAR_WIDTH = 50; 
    private static String currentTask = "";
    private static long current = 0;
    private static long total = 0;
    private static long lastUpdateTime = 0;

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

        String progressLine = String.format("\r %s : %s %.2f%%", 
            currentTask, bar.toString(), percentage);
            
        System.out.print(progressLine);
    }

    // Stop the progress bar and reset values
    public static synchronized void stopProgress() {
        current = total;
        renderProgress();
        System.out.println();
        currentTask = ""; 
        total = 0;
        current = 0;
        lastUpdateTime = 0; 
    }
}
