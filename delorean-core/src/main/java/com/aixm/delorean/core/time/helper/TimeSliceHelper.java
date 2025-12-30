package com.aixm.delorean.core.time.helper;

import com.aixm.delorean.core.org.gml.v_3_2.AbstractTimePrimitiveType;
import com.aixm.delorean.core.org.gml.v_3_2.TimeEdgeType;
import com.aixm.delorean.core.org.gml.v_3_2.TimeInstantType;
import com.aixm.delorean.core.org.gml.v_3_2.TimeNodeType;
import com.aixm.delorean.core.org.gml.v_3_2.TimePeriodType;
import com.aixm.delorean.core.org.gml.v_3_2.TimePositionType;
import com.aixm.delorean.core.org.gml.v_3_2.TimePrimitivePropertyType;
import com.aixm.delorean.core.time.type.DeloreanTimeSliceType;
import com.aixm.delorean.core.org.gml.v_3_2.TimeIndeterminateValueType;

import jakarta.xml.bind.JAXBElement;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;

import javax.xml.namespace.QName;

public class TimeSliceHelper {

    public static DeloreanTimeSliceType parseValidTime(TimePrimitivePropertyType validTime){
        if (validTime != null) {

            DeloreanTimeSliceType result;

            if (validTime.getAbstractTimePrimitive() == null) {
                throw new IllegalArgumentException("AbstractTimePrimitiveType cannot be null");
            }

            JAXBElement<? extends AbstractTimePrimitiveType> abstractTimePrimitive = validTime.getAbstractTimePrimitive();
            if (abstractTimePrimitive.getValue() instanceof TimeEdgeType) {
                throw new IllegalArgumentException("Unsupoorted type" + abstractTimePrimitive.getValue().getClass().getName());

            } else if (abstractTimePrimitive.getValue() instanceof TimeInstantType) {
                throw new IllegalArgumentException("Unsupoorted type" + abstractTimePrimitive.getValue().getClass().getName());

            } else if (abstractTimePrimitive.getValue() instanceof TimeNodeType) {
                throw new IllegalArgumentException("Unsupoorted type" + abstractTimePrimitive.getValue().getClass().getName());

            } else if (abstractTimePrimitive.getValue() instanceof TimePeriodType) {
                result = parseTimePeriodType((TimePeriodType) abstractTimePrimitive.getValue());

            } else {
                throw new IllegalArgumentException("Unsupported type " + abstractTimePrimitive.getValue().getClass().getName());
            }

            if (result == null){
                throw new IllegalArgumentException("DeloreanTimeSliceType cannot be null");
            } else {
                return result;
            }
        } else {
            throw new IllegalArgumentException("ValidTime cannot be null");
        }
    }

    public static TimePrimitivePropertyType printValidTime(DeloreanTimeSliceType aixmTime){
        if (aixmTime == null) {
            throw new IllegalArgumentException("ValidTime cannot be null");
        }

        TimePrimitivePropertyType validTime = new TimePrimitivePropertyType();
        TimePeriodType timePeriod = printTimePeriodType(aixmTime);
        if (timePeriod.getBeginPosition() == null || timePeriod.getBeginPosition().getIndeterminatePosition() == TimeIndeterminateValueType.UNKNOWN) {
            throw new IllegalArgumentException("TimePeriodType BeginPosition cannot be null or unknown");
        }
        JAXBElement<TimePeriodType> timePeriodElement = new JAXBElement<TimePeriodType>(new QName("http://www.opengis.net/gml/3.2", "TimePeriod"), TimePeriodType.class, timePeriod);
        validTime.setAbstractTimePrimitive(timePeriodElement);
        return validTime;
    }

    public static DeloreanTimeSliceType parseFeatureLifetime(TimePrimitivePropertyType lifeTime){
        if (lifeTime == null) {
            return null;
        }

        if (lifeTime.getAbstractTimePrimitive() == null) {
            return null;
        }

        JAXBElement<? extends AbstractTimePrimitiveType> abstractTimePrimitive = lifeTime.getAbstractTimePrimitive();
        if (abstractTimePrimitive.getValue() instanceof TimeEdgeType) {
            throw new IllegalArgumentException("Unsupoorted type " + abstractTimePrimitive.getValue().getClass().getName());

        } else if (abstractTimePrimitive.getValue() instanceof TimeInstantType) {
            throw new IllegalArgumentException("Unsupoorted type " + abstractTimePrimitive.getValue().getClass().getName());

        } else if (abstractTimePrimitive.getValue() instanceof TimeNodeType) {
            throw new IllegalArgumentException("Unsupoorted type " + abstractTimePrimitive.getValue().getClass().getName());

        } else if (abstractTimePrimitive.getValue() instanceof TimePeriodType) {
            return parseTimePeriodType((TimePeriodType) abstractTimePrimitive.getValue());

        } else {
            throw new IllegalArgumentException("Unsupported type " + abstractTimePrimitive.getValue().getClass().getName());
        }
    }

    public static TimePrimitivePropertyType printFeatureLifetime(DeloreanTimeSliceType aixmTime){
        if (aixmTime == null) {
            return null;
        }

        TimePrimitivePropertyType lifeTime = new TimePrimitivePropertyType();
        TimePeriodType timePeriod = printTimePeriodType(aixmTime);
        JAXBElement<TimePeriodType> timePeriodElement = new JAXBElement<TimePeriodType>(new QName("http://www.opengis.net/gml/3.2", "TimePeriod"), TimePeriodType.class, timePeriod);
        lifeTime.setAbstractTimePrimitive(timePeriodElement);
        return lifeTime;

    }

    // public static DeloreanTimeSliceType parseAbstractTimeGeometricPrimitiveType (AbstractTimeGeometricPrimitiveType v){
    //     throw new IllegalArgumentException("Unsupoorted type" + v.getClass().getName());
    // }

    // public static DeloreanTimeSliceType parseAbstractTimePrimitiveType (AbstractTimePrimitiveType v){
    //     throw new IllegalArgumentException("Unsupoorted type" + v.getClass().getName());
    // }

    // public static DeloreanTimeSliceType parseAbstractTimeTopologyPrimitiveType (AbstractTimeTopologyPrimitiveType v){
    //     throw new IllegalArgumentException("Unsupoorted type" + v.getClass().getName());
    // }

    // public static DeloreanTimeSliceType parseTimeEdgeType (TimeEdgeType v){
    //     throw new IllegalArgumentException("Unsupoorted type" + v.getClass().getName());
    // }

    // public static DeloreanTimeSliceType parseTimeInstantType (TimeInstantType v){
    //     throw new IllegalArgumentException("Unsupoorted type" + v.getClass().getName());
    // }

    // public static DeloreanTimeSliceType parseTimeNodeType (TimeNodeType v){
    //     throw new IllegalArgumentException("Unsupoorted type" + v.getClass().getName());
    // }

    public static DeloreanTimeSliceType parseTimePeriodType (TimePeriodType v){
        if (v == null){
            return null;
        }

        if (v.getBeginPosition() == null){
            throw new IllegalArgumentException("TimePositionType (beginPosition) cannot be null");
        }

        if (v.getEndPosition() == null){
            throw new IllegalArgumentException("TimePositionType (endPosition) cannot be null");
        }

        TimePositionType beginPosition = v.getBeginPosition();
        TimePositionType endPosition = v.getEndPosition(); 

        String beginString = beginPosition.getValue().isEmpty() ? null : beginPosition.getValue().get(0);
        String endString = endPosition.getValue().isEmpty() ? null : endPosition.getValue().get(0);

        TimeIndeterminateValueType beginIndeterminate = beginPosition.getIndeterminatePosition();
        TimeIndeterminateValueType endIndeterminate = endPosition.getIndeterminatePosition();

        Instant begin = parseTimeString(beginString);   
        Instant end = parseTimeString(endString);

        DeloreanTimeSliceType aixmTime = new DeloreanTimeSliceType();

        aixmTime.setTimePeriodId(v.getId());

        if (begin == null && end == null) {
            throw new IllegalArgumentException("Invalid time period " + v.getClass().getName());

        } else if (begin == null && end != null) {
            throw new IllegalArgumentException("Invalid time period " + v.getClass().getName());

        } else if (begin != null && end == null) {
            aixmTime.setBeginPosition(begin);
            aixmTime.setEndPosition((parseTimeIndeterminateValueType(endIndeterminate)));
            return aixmTime;

        } else if (begin != null && end != null) {
            aixmTime.setBeginPosition(begin);
            aixmTime.setEndPosition(end);
            return aixmTime;
        }

        return null;
    }

    public static TimePeriodType printTimePeriodType (DeloreanTimeSliceType v){
        TimePeriodType timePeriod = new TimePeriodType();
        TimePositionType beginPosition = new TimePositionType();
        TimePositionType endPosition = new TimePositionType();

        if (v == null) {
            // ConsoleLogger.log(LogLevel.FATAL, "value can't be null : " + v, new Exception().getStackTrace()[0]);
            // throw new IllegalArgumentException("value can't be null");
            return null;
        }
        
        if (v.getBeginPosition() == null) {
            beginPosition.setIndeterminatePosition(TimeIndeterminateValueType.UNKNOWN);
        } else {
            beginPosition.getValue().add(v.getBeginPosition().toString());
        }

        if (v.getEndPosition() == null) {
            endPosition.setIndeterminatePosition(TimeIndeterminateValueType.UNKNOWN);
        } else {
            endPosition.getValue().add(v.getEndPosition().toString());
        }

        timePeriod.setBeginPosition(beginPosition);
        timePeriod.setEndPosition(endPosition);
        timePeriod.setId(v.getTimePeriodId());

        return timePeriod;
    }


    public static Instant parseTimeIndeterminateValueType (TimeIndeterminateValueType v){
        if (v == TimeIndeterminateValueType.AFTER) {
            throw new IllegalArgumentException("Unsupported type " + v.getClass().getName());
        } else if (v == TimeIndeterminateValueType.BEFORE) {
            throw new IllegalArgumentException("Unsupported type " + v.getClass().getName());
        } else if (v == TimeIndeterminateValueType.NOW) {
            throw new IllegalArgumentException("Unsupported type " + v.getClass().getName());
        } else if (v == TimeIndeterminateValueType.UNKNOWN) {
            return null;
        } else {
            throw new IllegalArgumentException("Unsupported type " + v.getClass().getName());
        }
    }

    public static Instant parseTimeString(String timeString) {
        if (timeString == null || timeString.isBlank()) {
            return null;
        }

        String s = timeString.trim();

        try {
            // Full date-time with zone
            return Instant.parse(s);
        } catch (DateTimeParseException ignored) {
        }

        try {
            // Date-time without zone → assume UTC
            return LocalDateTime.parse(s).toInstant(ZoneOffset.UTC);
        } catch (DateTimeParseException ignored) {
        }

        try {
            // Date-only → start of day UTC (AIXM convention)
            return LocalDate.parse(s).atStartOfDay(ZoneOffset.UTC).toInstant();
        } catch (DateTimeParseException ignored) {
        }

        throw new IllegalArgumentException("Invalid GML/AIXM time value: " + timeString);
    }


}
