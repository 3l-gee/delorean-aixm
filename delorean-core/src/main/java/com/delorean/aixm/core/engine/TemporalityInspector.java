package com.delorean.aixm.core.engine;

import java.time.Instant;

import com.delorean.aixm.core.inspection.InspectionBindingService;
import com.delorean.aixm.core.inspection.ValidationSeverity;
import com.delorean.aixm.core.inspection.InspectionSource;

// Define this class/record once
public record TemporalityInspector(
    Instant earliestFeatureLifetimeStart,
    Instant latestFeatureLifetimeStart,
    Instant earliestValidTimeStart,
    Instant latestValidTimeEnd,
    Integer baselineCount,
    Integer snapshotCount,
    Integer tempDeltaCount,
    Integer permDeltaCount,
    Integer featureCount,
    Integer timeSliceCount) {

    public TemporalityInspector combine(TemporalityInspector other) {
        return new TemporalityInspector(
            other.earliestFeatureLifetimeStart == null ? this.earliestFeatureLifetimeStart : earliestFeatureLifetimeStart.isBefore(other.earliestFeatureLifetimeStart) ? earliestFeatureLifetimeStart : other.earliestFeatureLifetimeStart,
            other.latestFeatureLifetimeStart == null ? this.latestFeatureLifetimeStart : latestFeatureLifetimeStart.isAfter(other.latestFeatureLifetimeStart) ? latestFeatureLifetimeStart : other.latestFeatureLifetimeStart,
            other.earliestValidTimeStart == null ? this.earliestValidTimeStart : earliestValidTimeStart.isBefore(other.earliestValidTimeStart) ? earliestValidTimeStart : other.earliestValidTimeStart,
            other.latestValidTimeEnd == null ? this.latestValidTimeEnd : latestValidTimeEnd.isAfter(other.latestValidTimeEnd) ? latestValidTimeEnd : other.latestValidTimeEnd,
            baselineCount + other.baselineCount,
            snapshotCount + other.snapshotCount,
            tempDeltaCount + other.tempDeltaCount,
            permDeltaCount + other.permDeltaCount,
            featureCount + other.featureCount,
            timeSliceCount + other.timeSliceCount
        );
    }

    public void validateTemporality() {

        InspectionBindingService.recordEvent(InspectionSource.TEMPORALITY, ValidationSeverity.INFO, "Temporality Information", "Feature Lifetime fromm : " + earliestFeatureLifetimeStart + " to " + latestFeatureLifetimeStart);
        InspectionBindingService.recordEvent(InspectionSource.TEMPORALITY, ValidationSeverity.INFO, "Temporality Information", "Time Slice Valid from : " + earliestFeatureLifetimeStart + " to " + latestFeatureLifetimeStart);
        InspectionBindingService.recordEvent(InspectionSource.TEMPORALITY, ValidationSeverity.INFO, "Temporality Information", "Feature Count : " + featureCount);
        InspectionBindingService.recordEvent(InspectionSource.TEMPORALITY, ValidationSeverity.INFO, "Temporality Information", "Time Slice Count : " + timeSliceCount);
        
        int totalCount = baselineCount + snapshotCount + tempDeltaCount + permDeltaCount;
        InspectionBindingService.recordEvent(InspectionSource.TEMPORALITY, ValidationSeverity.INFO, "Temporality Information", "Baseline Count : " + baselineCount + " (" + String.format("%.2f", baselineCount * 100.0 / totalCount) + "%)");
        InspectionBindingService.recordEvent(InspectionSource.TEMPORALITY, ValidationSeverity.INFO, "Temporality Information", "Snapshot Count : " + snapshotCount + " (" + String.format("%.2f", snapshotCount * 100.0 / totalCount) + "%)");
        InspectionBindingService.recordEvent(InspectionSource.TEMPORALITY, ValidationSeverity.INFO, "Temporality Information", "Temporary Delta Count : " + tempDeltaCount + " (" + String.format("%.2f", tempDeltaCount * 100.0 / totalCount) + "%)");
        InspectionBindingService.recordEvent(InspectionSource.TEMPORALITY, ValidationSeverity.INFO, "Temporality Information", "Permanent Delta Count : " + permDeltaCount + " (" + String.format("%.2f", permDeltaCount * 100.0 / totalCount) + "%)");

    }
}

