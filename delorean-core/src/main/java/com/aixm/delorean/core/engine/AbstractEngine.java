package com.aixm.delorean.core.engine;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import org.apache.commons.lang3.builder.EqualsBuilder;

import com.aixm.delorean.core.filter.AbstractFilterConfig;

public abstract class AbstractEngine<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> {

    public AbstractEngine() {
    }


    /**
     * Computes information about the AIXM message like the earliest and latest feature lifetime, valid time, and counts of different slice types. It combines the temporality information of all features in the message to provide an overall summary.
     * @param message The AIXM message to analyze.
     */
    public abstract void temporalityInspection(ROOT message);

    /**
     * Computes statistics about the AIXM message, such as the number of features and time slices.
     * @param message The AIXM message to analyze.
     * @return A string summarizing the statistics of the message.
     */
    public abstract String statistics(ROOT message);

    public abstract ROOT filter(ROOT message, AbstractFilterConfig config);

    public abstract ROOT combine(ROOT message);

    public abstract ROOT clone(ROOT message);

    public abstract ROOT integrate(ROOT oldMessage, ROOT newMessage);

    public abstract ROOT diff(ROOT message);

    public static boolean isDifferentIntegrate(List<?> oldList, List<?> newList) {
        // A: both missing → no change
        if (oldList == null && newList == null) {
            return false;
        }

        // B: new omitted → no change (inherit)
        if (oldList != null && newList == null) {
            return false;
        }

        // C: new present but old missing → changed
        if (oldList == null && newList != null) {
            return true;
        }

        // D: both exist but different sizes → change
        if (oldList.size() != newList.size()) {
            return true;
        }

        List<Object> sortedOld = new ArrayList<>(oldList);
        List<Object> sortedNew = new ArrayList<>(newList);
        sortedOld.sort(Comparator.nullsFirst(Comparator.comparing(String::valueOf)));
        sortedNew.sort(Comparator.nullsFirst(Comparator.comparing(String::valueOf)));

        // E: both exist → check actual content
        for (int i = 0; i < oldList.size(); i++) {
            Object oldObj = oldList.get(i);
            Object newObj = newList.get(i);
            if (!EqualsBuilder.reflectionEquals(oldObj, newObj, "hjid", "hjversion")) {
                return true;
            }
        }

        return false;
    }

    public static boolean isDifferentDiff(List<?> oldList, List<?> newList) {
        // A: both missing → no change
        if (oldList == null && newList == null) {
            return false;
        }

        // B: new omitted → change
        if (oldList != null && newList == null) {
            return true;
        }

        // C: new present but old missing → changed
        if (oldList == null && newList != null) {
            return true;
        }

        // D: both exist but different sizes → change
        if (oldList.size() != newList.size()) {
            return true;
        }

        List<Object> sortedOld = new ArrayList<>(oldList);
        List<Object> sortedNew = new ArrayList<>(newList);
        sortedOld.sort(Comparator.nullsFirst(Comparator.comparing(String::valueOf)));
        sortedNew.sort(Comparator.nullsFirst(Comparator.comparing(String::valueOf)));

        // E: both exist → check actual content
        for (int i = 0; i < oldList.size(); i++) {
            Object oldObj = oldList.get(i);
            Object newObj = newList.get(i);
            if (!EqualsBuilder.reflectionEquals(oldObj, newObj, "hjid", "hjversion")) {
                System.out.println("Difference found at index " + i + " → change");
                return true;
            }
        }

        return false;
    }

    public static boolean isDifferentIntegrate(JAXBElement<?> oldObj, JAXBElement<?> newObj) {
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
        return !EqualsBuilder.reflectionEquals(oldVal, newVal, "hjid", "hjversion");
    }

    public static boolean isDifferentDiff(JAXBElement<?> oldObj, JAXBElement<?> newObj) {
        // A: both missing → no change
        if (oldObj == null && newObj == null) {
            return false;
        }

        // B: new omitted → change
        if (oldObj != null && newObj == null) {
            return true;
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
        return !EqualsBuilder.reflectionEquals(oldVal, newVal, "hjid", "hjversion");
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
}
