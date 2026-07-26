package com.delorean.aixm.aixm52.engine;

import java.lang.reflect.Method;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.delorean.aixm.aixm52.schema.AbstractAIXMFeatureType;
import com.delorean.aixm.aixm52.schema.AbstractAIXMTimeSliceType;
import com.delorean.aixm.core.engine.TemporalityInspector;
import com.delorean.aixm.core.time.type.DeloreanTimeSliceType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Aixm52TimeSliceEngine {

    @SuppressWarnings("unchecked")
    public static int countTimeSlices(AbstractAIXMFeatureType feature){
        if (feature == null) {
            return 0;
        }

        log.atDebug().log("Counting TimeSlices for feature: {}", feature.getIdentifier().getValue());

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

    public static void injectTimeSlice(AbstractAIXMFeatureType feature, AbstractAIXMTimeSliceType timeSlice) {
        if (feature == null) {
            throw new RuntimeException("Failed to inject TimeSlice into Null feature");
        }

        if (timeSlice == null) {
            throw new RuntimeException("Failed to inject Null timeSlice into feature");
        }

        log.atDebug().log("Injecting TimeSlice into feature: {}", feature.getIdentifier().getValue());

        try {
            String featureName = feature.getClass().getSimpleName().replace("Type", "");
            Method getListMethod = feature.getClass().getMethod("getTimeSlice");
            @SuppressWarnings("unchecked")
            List<Object> propertyList = (List<Object>) getListMethod.invoke(feature);
            Class<?> propertyTypeClass = Class.forName(feature.getClass().getPackage().getName() + "." + featureName + "TimeSlicePropertyType");
            Object propertyWrapper = propertyTypeClass.getDeclaredConstructor().newInstance();
            String setterName = "set" + featureName + "TimeSlice";
            Method setTsMethod = propertyTypeClass.getMethod(setterName, timeSlice.getClass());
            setTsMethod.invoke(propertyWrapper, timeSlice);
            propertyList.add(propertyWrapper);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add TimeSlices to feature " + feature.getClass().getSimpleName(), e);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<AbstractAIXMTimeSliceType> invokeTimeSlice(AbstractAIXMFeatureType feature) {
        if (feature == null) {
            return List.of();
        }

        log.atDebug().log("Extracting TimeSlices from feature: {}", feature.getIdentifier().getValue());

        String name = feature.getClass().getSimpleName().replace("Type", "");
        List<AbstractAIXMTimeSliceType> listTimeSlice = new ArrayList<>();
        List<?> listTimeSlicePropertiesObj;

        try {
            Method getTimeSliceMethod = feature.getClass().getMethod("getTimeSlice");
            listTimeSlicePropertiesObj = (List<Object>) getTimeSliceMethod.invoke(feature);
        } catch (Exception e) {
            throw new RuntimeException("Failed to access timeSlice property", e);
        }

        if (listTimeSlicePropertiesObj == null) {
            return listTimeSlice;
        }

        for (Object timeSlicePropertyObj : listTimeSlicePropertiesObj) {
            if (timeSlicePropertyObj == null) {
                continue;
            }
            try {
                Method getSpecificTimeSliceMethod =
                        timeSlicePropertyObj.getClass().getMethod("get" + name + "TimeSlice");

                Object ts = getSpecificTimeSliceMethod.invoke(timeSlicePropertyObj);

                if (ts instanceof AbstractAIXMTimeSliceType timeSlice) {
                    log.atDebug().log("Adding TimeSlice {} to feature: {}", timeSlice.getSequenceNumber(), feature.getIdentifier().getValue());
                    listTimeSlice.add(timeSlice);
                }

            } catch (NoSuchMethodException e) {
                throw new RuntimeException(
                    "Expected method get" + name + "TimeSlice not found on "
                            + timeSlicePropertyObj.getClass().getName(),
                    e
                );
            } catch (Exception e) {
                throw new RuntimeException("Failed to extract timeSlice", e);
            }
        }

        return listTimeSlice;
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
        Integer featureCount = 1;
        Integer timeSliceCount = null;

        if (feature == null) {
            return null;
        }

        List<AbstractAIXMTimeSliceType> listTimeSlice = Aixm52TimeSliceEngine.invokeTimeSlice(feature);
        timeSliceCount = listTimeSlice.size();

        for (AbstractAIXMTimeSliceType timeSlice : listTimeSlice) {
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

        return new TemporalityInspector(EarliestfeatureLifetimeStart, LastestfeatureLifetimeEnd, earlistValidTimeStart, latestValidTimeEnd, baselineCount, snapshotCount, tempDeltaCount, permDeltaCount, featureCount, timeSliceCount);
    }
}