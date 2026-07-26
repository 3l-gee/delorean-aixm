package com.delorean.aixm.aixm51.filter.type;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.delorean.aixm.aixm51.schema.AbstractAIXMTimeSliceBaseType;
import com.delorean.aixm.core.DeloreanUtility;
import com.delorean.aixm.core.filter.AbstractFilterSpecification;
import com.delorean.aixm.core.filter.FilterType;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeSliceValidTimeSpecification extends AbstractFilterSpecification<AbstractAIXMTimeSliceBaseType> {
    private final Instant beforeBegin;
    private final Instant afterBegin;
    private final Instant atBegin;
    private final Instant beforeEnd;
    private final Instant afterEnd;
    private final Instant atEnd;

    @Override
    public String getDescription() {
        List<String> criteria = new ArrayList<>();

            if (beforeBegin != null) {
                criteria.add("starting before " + beforeBegin);
            }
            if (afterBegin != null) {
                criteria.add("starting after " + afterBegin);
            }
            if (atBegin != null) {
                criteria.add("starting at " + atBegin);
            }
            if (beforeEnd != null) {
                criteria.add("ending before " + beforeEnd);
            }
            if (afterEnd != null) {
                criteria.add("ending after " + afterEnd);
            }
            if (atEnd != null) {
                criteria.add("ending at " + atEnd);
            }

            String timeCriteria = criteria.isEmpty() 
                ? "with any valid time" 
                : "with valid time " + String.join(" and ", criteria);

            return String.format("%s features %s (missing data will %s)", 
                getEvaluationType().getValue(), 
                timeCriteria, 
                getNullHandling().getValue());
    }

    public TimeSliceValidTimeSpecification(String nullHandling, String evaluationType, Instant beforeBegin, Instant afterBegin, Instant atBeign, Instant beforeEnd, Instant afterEnd, Instant atEnd) {
        super(nullHandling, evaluationType);
        this.beforeBegin = beforeBegin;
        this.afterBegin = afterBegin;
        this.atBegin = atBeign;
        this.beforeEnd = beforeEnd;
        this.afterEnd = afterEnd;
        this.atEnd = atEnd;
    }

    public TimeSliceValidTimeSpecification(JsonNode json){
        super(json);
        setType(FilterType.TIMESLICE);

        if (json == null || json.isNull() || json.isEmpty()) {
            throw new IllegalArgumentException("Cannot construct TimeSliceValidTimeSpecification from null or empty JSON.");
        }
        log.atDebug().setMessage("Parsing following json for TimeSliceValidTimeSpecification: {}").addArgument(() -> json).log();

        Instant beforeBegin = DeloreanUtility.parseInstantSafely(json, "beforeBegin");
        Instant afterBegin  = DeloreanUtility.parseInstantSafely(json, "afterBegin");
        Instant atBegin     = DeloreanUtility.parseInstantSafely(json, "atBegin");
        Instant beforeEnd   = DeloreanUtility.parseInstantSafely(json, "beforeEnd");
        Instant afterEnd    = DeloreanUtility.parseInstantSafely(json, "afterEnd");
        Instant atEnd       = DeloreanUtility.parseInstantSafely(json, "atEnd");

        this.beforeBegin    = beforeBegin;
        this.afterBegin     = afterBegin;
        this.atBegin        = atBegin;
        this.beforeEnd      = beforeEnd;
        this.afterEnd       = afterEnd;
        this.atEnd          = atEnd;
    }

    /**
     * Creates a TimeSliceValidTimeSpecification that filters time slices with valid time starting before the specified instant.
     * @param begin
     * @return
     */
    public static TimeSliceValidTimeSpecification startingBefore(String nullHandling, String evaluationType, Instant begin) {
        return new TimeSliceValidTimeSpecification(nullHandling, evaluationType, begin, null, null, null,null, null);
    }

    /**
     * Creates a TimeSliceValidTimeSpecification that filters time slices with valid time starting after the specified instant.
     * @param begin
     * @return
     */
    public static TimeSliceValidTimeSpecification startingAfter(String nullHandling, String evaluationType, Instant begin) {
        return new TimeSliceValidTimeSpecification(nullHandling, evaluationType, null, begin, null, null,null, null);
    }

    /**
     * Creates a TimeSliceValidTimeSpecification that filters time slices with valid time starting at the specified instant.
     * @param begin
     * @return
     */
    public static TimeSliceValidTimeSpecification startingAt(String nullHandling, String evaluationType, Instant begin) {
        return new TimeSliceValidTimeSpecification(nullHandling, evaluationType, null, null, begin, null,null, null);
    }

    /**
     * Creates a TimeSliceValidTimeSpecification that filters time slices with valid time ending before the specified instant.
     * @param end
     * @return
     */
    public static TimeSliceValidTimeSpecification endingBefore(String nullHandling, String evaluationType, Instant end) {
        return new TimeSliceValidTimeSpecification(nullHandling, evaluationType, null, null, null, end,null, null);
    }

    /**
     * Creates a TimeSliceValidTimeSpecification that filters time slices with valid time ending after the specified instant.
     * @param end
     * @return
     */
    public static TimeSliceValidTimeSpecification endingAfter(String nullHandling, String evaluationType, Instant end) {
        return new TimeSliceValidTimeSpecification(nullHandling, evaluationType, null, null, null,null ,end, null);
    }

    /**
     * Creates a TimeSliceValidTimeSpecification that filters time slices with valid time ending at the specified instant.
     * @param end
     * @return
     */
    public static TimeSliceValidTimeSpecification endingAt(String nullHandling, String evaluationType, Instant end) {
        return new TimeSliceValidTimeSpecification(nullHandling, evaluationType, null, null, null, null,null, end);
    }

    @Override
    public boolean matchesCriteria(AbstractAIXMTimeSliceBaseType timeSlice) {
        if (timeSlice == null) {
            return handleNullCase();
        }

        if (timeSlice.getValidTime() == null) {
            return handleNullCase();
        }

        Instant validTimeBegin = timeSlice.getValidTime().getBeginPosition();
        Instant validTimeEnd = timeSlice.getValidTime().getEndPosition();
        
        // Check begin time constraints
        if (beforeBegin != null) {
            if (validTimeBegin == null) return handleNullCase();
            if (!validTimeBegin.isBefore(beforeBegin)) return false;
        }

        if (afterBegin != null) {
            if (validTimeBegin == null) return handleNullCase();
            if (!validTimeBegin.isAfter(afterBegin)) return false;
        }

        if (atBegin != null) {
            if (validTimeBegin == null) return handleNullCase();
            if (!validTimeBegin.equals(atBegin)) return false;
        }

        // Check end time constraints
        if (beforeEnd != null) {
            if (validTimeEnd == null) return handleNullCase();
            if (!validTimeEnd.isBefore(beforeEnd)) return false;
        }

        if (afterEnd != null) {
            if (validTimeEnd == null) return handleNullCase();
            if (!validTimeEnd.isAfter(afterEnd)) return false;
        }

        if (atEnd != null) {
            if (validTimeEnd == null) return handleNullCase();
            if (!validTimeEnd.equals(atEnd)) return false;
        }

        return true;

    }
    
}
