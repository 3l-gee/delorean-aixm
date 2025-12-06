package com.aixm.delorean.aixm511.engine;

import java.lang.reflect.Method;
import java.time.Instant;
import java.util.List;

import com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm511.schema.AbstractAIXMTimeSliceType;
import com.aixm.delorean.core.engine.TemporalityInspector;
import com.aixm.delorean.core.time.type.DeloreanTimeSliceType;

public class Aixm511TimeSliceEngine {

    public static int countTimeSlices(AbstractAIXMFeatureType feature){
        if (feature == null) {
            return 0;
        }

        int count = 0;
        String name = feature.getClass().getSimpleName().replace("Type", "");
        List<Object> timeSlicePropertiesObj;
        AbstractAIXMTimeSliceType timeSlice;
        try {
            // Step 1: Reflectively get the List<*TimeSlicePropertyType> from the feature
            Method getTimeSliceMethod = feature.getClass().getMethod("getTimeSlice");
            timeSlicePropertiesObj = (List<Object>) getTimeSliceMethod.invoke(feature);
        } catch (Exception e) {
            throw new RuntimeException("Failed to access timeSlice property", e);
        }

        try {
            for (Object timeSlicePropertyObj : timeSlicePropertiesObj) {
                // Step 2: For each TimeSlicePropertyType, get the AbstractAIXMTimeSliceType
                Method getTimeSliceMethod = timeSlicePropertyObj.getClass().getMethod("get" + name + "TimeSlice");
                timeSlice = (AbstractAIXMTimeSliceType) getTimeSliceMethod.invoke(timeSlicePropertyObj);
                if (timeSlice != null) {
                    count += 1;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to access " + name + "TimeSlice property", e);
        }

        return count;
    }


    

    public static TemporalityInspector getTimeSliceValidityPeriod(AbstractAIXMFeatureType feature) {
        Instant EarliestfeatureLifetimeStart = null;
        Instant LastestfeatureLifetimeEnd = null;
        Instant earlistValidTimeStart = null;
        Instant latestValidTimeEnd = null;
        Integer baselineCount = 0;
        Integer snapshotCount = 0;
        Integer tempDeltaCount = 0;
        Integer permDeltaCount = 0;

        if (feature == null) {
            return null;
        }

        String name = feature.getClass().getSimpleName().replace("Type", "");
        List<Object> timeSlicePropertiesObj;
        AbstractAIXMTimeSliceType timeSlice;
        try {
            // Step 1: Reflectively get the List<*TimeSlicePropertyType> from the feature
            Method getTimeSliceMethod = feature.getClass().getMethod("getTimeSlice");
            timeSlicePropertiesObj = (List<Object>) getTimeSliceMethod.invoke(feature);
        } catch (Exception e) {
            throw new RuntimeException("Failed to access timeSlice property", e);
        }

        try {
            for (Object timeSlicePropertyObj : timeSlicePropertiesObj) {
                // Step 2: For each TimeSlicePropertyType, get the AbstractAIXMTimeSliceType
                Method getTimeSliceMethod = timeSlicePropertyObj.getClass().getMethod("get" + name + "TimeSlice");
                timeSlice = (AbstractAIXMTimeSliceType) getTimeSliceMethod.invoke(timeSlicePropertyObj);
                if (timeSlice != null) {
                    DeloreanTimeSliceType featureLifetime = timeSlice.getFeatureLifetime();
                    DeloreanTimeSliceType validTime = timeSlice.getValidTime();

                    if (featureLifetime == null ) {
                        continue;
                    }

                    Instant featureLifetimeStart = featureLifetime.getBeginPosition();
                    Instant featureLifetimeEnd = featureLifetime.getEndPosition();

                    if (EarliestfeatureLifetimeStart == null || (featureLifetimeStart != null && featureLifetimeStart.isBefore(EarliestfeatureLifetimeStart))) {
                        EarliestfeatureLifetimeStart = featureLifetimeStart;
                    }

                    if (LastestfeatureLifetimeEnd == null || (featureLifetimeEnd != null && featureLifetimeEnd.isAfter(LastestfeatureLifetimeEnd))) {
                        LastestfeatureLifetimeEnd = featureLifetimeEnd;
                    }

                    if (validTime == null ) {
                        continue;
                    }

                    Instant validTimeStart = validTime.getBeginPosition();
                    Instant validTimeEnd = validTime.getEndPosition();

                    if (earlistValidTimeStart == null || (validTimeStart != null && validTimeStart.isBefore(earlistValidTimeStart))) {
                        earlistValidTimeStart = validTimeStart;
                    }

                    if (latestValidTimeEnd == null || (validTimeEnd != null && validTimeEnd.isAfter(latestValidTimeEnd))) {
                        latestValidTimeEnd = validTimeEnd;
                    }

                    String interpretation = timeSlice.getInterpretation();
                    switch (interpretation) {
                        case "BASELINE":
                            baselineCount += 1;
                            break;
                        case "SNAPSHOT":
                            snapshotCount += 1;
                            break;
                        case "TEMPDELTA":
                            tempDeltaCount += 1;
                            break;
                        case "PERMDELTA":
                            permDeltaCount += 1;
                            break;  
                        case null:
                            throw new RuntimeException("TimeSlice interpretation is null");
                        default:
                            throw new RuntimeException("Unknown TimeSlice interpretation: " + interpretation);
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to access " + name + "TimeSlice property", e);
        }

        return new TemporalityInspector(EarliestfeatureLifetimeStart, LastestfeatureLifetimeEnd, earlistValidTimeStart, latestValidTimeEnd, baselineCount, snapshotCount, tempDeltaCount, permDeltaCount);
    }
}
