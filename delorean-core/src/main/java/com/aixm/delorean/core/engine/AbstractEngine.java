package com.aixm.delorean.core.engine;

import java.util.Objects;

import jakarta.xml.bind.JAXBElement;

public abstract class AbstractEngine<ROOT, FEATURE, TIMESLICE, OBJECT> {

    public AbstractEngine() {
    }

    public abstract void info(ROOT message);

    public abstract String statistics(ROOT message);

    public abstract ROOT filter(ROOT message, String filterExpression);

    public abstract ROOT merge(ROOT message);

    public abstract ROOT integrate(ROOT oldMessage, ROOT newMessage);

    public abstract ROOT delta(ROOT oldMessage, ROOT newMessage);

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
}
