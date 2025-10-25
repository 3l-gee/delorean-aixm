package com.aixm.delorean.core.time.helper;

import java.util.ArrayList;

import com.aixm.delorean.core.schema.a5_2.aixm.DMETimeSliceType;
import com.aixm.delorean.core.schema.a5_2.aixm.AbstractAIXMTimeSliceType;

import jakarta.xml.bind.JAXBElement;

import java.lang.reflect.Field;

import java.util.List;
import java.util.Objects;

public class TemporalityHelper {

    private TemporalityHelper() {
        // Private constructor to prevent instantiation of utility class
    }

    public static boolean isDifferent(Object oldObj, Object newObj) {
        // A: both missing → no change
        if (oldObj == null && newObj == null) {
            return false;
        }

        // B: new omitted → no change (inherit)
        if (oldObj != null && newObj == null) {
            return false;
        }

        // C: new present but old missing → changed
        if (oldObj == null && newObj != null) {
            return true;
        }

        // D: both exist → check actual values
        return !oldObj.equals(newObj);
    }

    public static boolean isDifferent(JAXBElement<?> oldObj, JAXBElement<?> newObj) {
        // A: both missing → no change
        if (oldObj == null && newObj == null) {
            return false;
        }

        // B: new omitted → no change (inherit)
        if (oldObj != null && newObj == null) {
            return false;
        }

        // C: new present but old missing → changed
        if (oldObj == null && newObj != null) {
            return true;
        }

        // D: both exist → compare nil status and values
        boolean oldNil = oldObj.isNil();
        boolean newNil = newObj.isNil();

        // D.1: One is nil, the other is not → different
        if (oldNil != newNil) {
            return true;
        }
        
        // D.2: both nil → check nilReason
        if (oldNil && newNil) {
            String oldNilReason = getNilReason(oldObj);
            String newNilReason = getNilReason(newObj);
            return !Objects.equals(oldNilReason, newNilReason);
        }

        // D.3: Neither nil → compare values
        Object oldVal = oldObj.getValue();
        Object newVal = newObj.getValue();

        if (oldVal == null && newVal == null) return false;
        if (oldVal == null || newVal == null) return true;

        // Finally, compare actual values
        return !oldVal.equals(newVal);
    }

    private static String getNilReason(JAXBElement<?> obj) {
        if (obj == null) return null;
        Object val = obj.getValue();
        if (val == null) return null;
        try {
            return (String) val.getClass().getMethod("getNilReason").invoke(val);
        } catch (Exception e) {
            return null;
        }
    }

    public static <T extends AbstractAIXMTimeSliceType> T merge(Class<T> type, T oldObj, T newObj) {
        T result;
        try {
            result = type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + type, e);
        }

        result.setId(newObj.getId());
        result.setInterpretation("BASELINE");
        result.setSequenceNumber(newObj.getSequenceNumber());
        result.setCorrectionNumber(newObj.getCorrectionNumber());
        result.setTimeSliceMetadata(newObj.getTimeSliceMetadata());
        result.setValidTime(newObj.getValidTime());
        result.setFeatureLifetime(oldObj.getFeatureLifetime());

        for (Field field : type.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object oldVal = field.get(oldObj);
                Object newVal = field.get(newObj);

                if (isDifferent(oldVal, newVal)) {
                    field.set(result, newVal);
                } else {
                    field.set(result, oldVal);
                }

            } catch (IllegalAccessException e) {
                // Allow serialVersionUID to be skipped silently, but all other fields must throw
                if (!field.getName().equals("serialVersionUID")) {
                    throw new RuntimeException("Failed to access field " + field.getName(), e);
                }
            }
        }

        return result;
    }

    // public static <T extends AbstractAIXMTimeSliceType> T delta(Class<T> type, T oldObj, T newObj) {
    //     T result;
    //     try {
    //         result = type.getDeclaredConstructor().newInstance();
    //     } catch (Exception e) {
    //         throw new RuntimeException("Failed to instantiate " + type, e);
    //     }

    //     result.setId(newObj.getId());
    //     result.setInterpretation("PERMDELTA");
    //     result.setSequenceNumber(newObj.getSequenceNumber());
    //     result.setCorrectionNumber(newObj.getCorrectionNumber());
    //     result.setTimeSliceMetadata(newObj.getTimeSliceMetadata());
    //     result.setValidTime(newObj.getValidTime());

    //     for (Field field : type.getDeclaredFields()) {
    //         try {
    //             field.setAccessible(true);
    //             Object oldVal = field.get(oldObj);
    //             Object newVal = field.get(newObj);

    //             if (isDifferent(oldVal, newVal)) {
    //                 field.set(result, newVal);
    //             }

    //         } catch (IllegalAccessException e) {
    //             // Allow serialVersionUID to be skipped silently, but all other fields must throw
    //             if (!field.getName().equals("serialVersionUID")) {
    //                 throw new RuntimeException("Failed to access field " + field.getName(), e);
    //             }
    //         }
    //     }

    //     return result;
    // }

    public static DMETimeSliceType delta(Class<DMETimeSliceType> type, DMETimeSliceType oldObj, DMETimeSliceType newObj) {
        DMETimeSliceType result = new DMETimeSliceType();
        result.setId(newObj.getId());
        result.setInterpretation("PERMDELTA");
        result.setSequenceNumber(newObj.getSequenceNumber());
        result.setCorrectionNumber(newObj.getCorrectionNumber());
        result.setTimeSliceMetadata(newObj.getTimeSliceMetadata());
        result.setValidTime(newObj.getValidTime());
        // result.setFeatureLifetime(newObj.getFeatureLifetime());
        if (newObj != null && oldObj != null) {
            if (isDifferent(oldObj.getDesignator(), newObj.getDesignator())) {
                result.setDesignator(newObj.getDesignator());
            }

            if (isDifferent(oldObj.getAnnotation(), newObj.getAnnotation())) {
                result.setAnnotation(newObj.getAnnotation());
            }
        }

        return result;
    }
}