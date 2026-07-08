package com.delorean.aixm.core.time.helper;

import com.delorean.aixm.core.inspection.InspectionBindingService;
import com.delorean.aixm.core.inspection.ValidationSeverity;
import com.delorean.aixm.core.inspection.InspectionSource;
import com.delorean.aixm.core.org.gml.v_3_2.AbstractTimePrimitiveType;
import com.delorean.aixm.core.org.gml.v_3_2.TimeEdgeType;
import com.delorean.aixm.core.org.gml.v_3_2.TimeInstantType;
import com.delorean.aixm.core.org.gml.v_3_2.TimeNodeType;
import com.delorean.aixm.core.org.gml.v_3_2.TimePeriodType;
import com.delorean.aixm.core.org.gml.v_3_2.TimePositionType;
import com.delorean.aixm.core.org.gml.v_3_2.TimePrimitivePropertyType;
import com.delorean.aixm.core.time.type.DeloreanTimeSliceType;
import com.delorean.aixm.core.org.gml.v_3_2.TimeIndeterminateValueType;

import jakarta.xml.bind.JAXBElement;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;

import javax.xml.namespace.QName;

public class TimeSliceHelper {

    /**
     * Parse a GML TimePrimitivePropertyType into a DeloreanTimeSliceType. This method supports TimeInstantType and TimePeriodType, but not TimeEdgeType or TimeNodeType, as these are not used in AIXM.
     * @param validTime the TimePrimitivePropertyType to parse
     * @return a DeloreanTimeSliceType representing the same time period
     */
    public static DeloreanTimeSliceType parseValidTime(TimePrimitivePropertyType validTime){
        if (validTime == null) {
            throw new IllegalArgumentException("validTime cannot be null");
        }

        JAXBElement<? extends AbstractTimePrimitiveType> abstractTimePrimitive = validTime.getAbstractTimePrimitive();

        if (abstractTimePrimitive == null || abstractTimePrimitive.getValue() == null) {
            throw new IllegalArgumentException("validTime must have an AbstractTimePrimitive");
        }

        DeloreanTimeSliceType result;

        if (abstractTimePrimitive.getValue() instanceof TimeEdgeType) {
            throw new IllegalArgumentException("Unsupoorted type" + abstractTimePrimitive.getValue().getClass().getName());

        } else if (abstractTimePrimitive.getValue() instanceof TimeInstantType) {
            result = parseTimePeriodType((TimeInstantType) abstractTimePrimitive.getValue());
            InspectionBindingService.recordEvent(InspectionSource.DELOREAN, ValidationSeverity.INFO, "ParseValidTime", "Converted TimeInstant to TimeSlice", abstractTimePrimitive.getValue().getId());

        } else if (abstractTimePrimitive.getValue() instanceof TimeNodeType) {
            throw new IllegalArgumentException("Unsupoorted type" + abstractTimePrimitive.getValue().getClass().getName());

        } else if (abstractTimePrimitive.getValue() instanceof TimePeriodType) {
            result = parseTimePeriodType((TimePeriodType) abstractTimePrimitive.getValue());

        } else {
            throw new IllegalArgumentException("Unsupported type " + abstractTimePrimitive.getValue().getClass().getName());
        }

        return result;
    }

    public static TimePrimitivePropertyType printValidTime(DeloreanTimeSliceType aixmTime){
        if (aixmTime == null) {
            throw new IllegalArgumentException("DeloreanTimeSlice1 cannot be null");
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

    /**
     * Parse a GML TimeInstantType into a DeloreanTimeSliceType. This converts Snapshot times (TimeInstantType) into TimeSlices with null end position, as per AIXM convention.
     * @param v the TimeInstantType to parse
     * @return a DeloreanTimeSliceType representing the same time instant, with null end position
     */
    public static DeloreanTimeSliceType parseTimePeriodType (TimeInstantType v){
        if (v == null){
            return null;
        }

        if (v.getTimePosition() == null){
            throw new IllegalArgumentException("TimePositionType cannot be null");
        }

        TimePositionType timePosition = v.getTimePosition();

        String timeString = timePosition.getValue().isEmpty() ? null : timePosition.getValue().get(0);

        Instant time = parseTimeString(timeString);
        if (time == null) {
            throw new IllegalArgumentException("Invalid time instant: " + timeString.getClass().getName());
        }

        DeloreanTimeSliceType aixmTime = new DeloreanTimeSliceType();

        aixmTime.setTimePeriodId(v.getId());
        aixmTime.setBeginPosition(time);
        aixmTime.setEndPosition(null);

        return aixmTime;
    }

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
