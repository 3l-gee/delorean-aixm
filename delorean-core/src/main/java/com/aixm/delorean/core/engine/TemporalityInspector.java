package com.aixm.delorean.core.engine;

import java.time.Instant;

// Define this class/record once
public record TemporalityInspector(
    Instant earliestFeatureLifetimeStart,
    Instant latestFeatureLifetimeStart,
    Instant earliestValidTimeStart,
    Instant latestValidTimeEnd,
    Integer baselineCount,
    Integer snapshotCount,
    Integer tempDeltaCount,
    Integer permDeltaCount) {

    public TemporalityInspector combine(TemporalityInspector other) {
        return new TemporalityInspector(
            other.earliestFeatureLifetimeStart == null ? this.earliestFeatureLifetimeStart : earliestFeatureLifetimeStart.isBefore(other.earliestFeatureLifetimeStart) ? earliestFeatureLifetimeStart : other.earliestFeatureLifetimeStart,
            other.latestFeatureLifetimeStart == null ? this.latestFeatureLifetimeStart : latestFeatureLifetimeStart.isAfter(other.latestFeatureLifetimeStart) ? latestFeatureLifetimeStart : other.latestFeatureLifetimeStart,
            other.earliestValidTimeStart == null ? this.earliestValidTimeStart : earliestValidTimeStart.isBefore(other.earliestValidTimeStart) ? earliestValidTimeStart : other.earliestValidTimeStart,
            other.latestValidTimeEnd == null ? this.latestValidTimeEnd : latestValidTimeEnd.isAfter(other.latestValidTimeEnd) ? latestValidTimeEnd : other.latestValidTimeEnd,
            baselineCount + other.baselineCount,
            snapshotCount + other.snapshotCount,
            tempDeltaCount + other.tempDeltaCount,
            permDeltaCount + other.permDeltaCount
        );
    }

    public void printSummary() {
        
        System.out.println(" Summary of Temporality Inspection ");
        System.out.println("Feature Lifetime from   : " + earliestFeatureLifetimeStart + " to " + latestFeatureLifetimeStart);
        System.out.println("Time Slice Valid from   : " + earliestValidTimeStart + " to " + latestValidTimeEnd);
        int totalCount = baselineCount + snapshotCount + tempDeltaCount + permDeltaCount;
        System.out.println("Baseline Count          : " + baselineCount + " (" + String.format("%.2f", baselineCount * 100.0 / totalCount) + "%)");
        System.out.println("Snapshot Count          : " + snapshotCount + " (" + String.format("%.2f", snapshotCount * 100.0 / totalCount) + "%)");
        System.out.println("Temporary Delta Count   : " + tempDeltaCount + " (" + String.format("%.2f", tempDeltaCount * 100.0 / totalCount) + "%)");
        System.out.println("Permanent Delta Count   : " + permDeltaCount + " (" + String.format("%.2f", permDeltaCount * 100.0 / totalCount) + "%)");
    }
}

