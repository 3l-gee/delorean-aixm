package com.aixm.delorean.aixm51.filter.type;

import java.time.Instant;

import com.aixm.delorean.aixm51.schema.AbstractAIXMTimeSliceBaseType;
import com.aixm.delorean.core.filter.AbstractFilterSpecification;

/**
 * Filter specification for AIXM time slices based on their valid time. This specification allows filtering time slices based on their valid time's begin and end positions, using various criteria such as being before, after, or at specific instants.
 */
public class TimeSliceValidTimeSpecification implements AbstractFilterSpecification<AbstractAIXMTimeSliceBaseType> {
    private final Instant beforeBegin;
    private final Instant afterBegin;
    private final Instant atBeign;
    private final Instant beforeEnd;
    private final Instant afterEnd;
    private final Instant atEnd;

    public TimeSliceValidTimeSpecification(Instant beforeBegin, Instant afterBegin, Instant atBeign, Instant beforeEnd, Instant afterEnd, Instant atEnd) {
        this.beforeBegin = beforeBegin;
        this.afterBegin = afterBegin;
        this.atBeign = atBeign;
        this.beforeEnd = beforeEnd;
        this.afterEnd = afterEnd;
        this.atEnd = atEnd;
    }

    /**
     * Creates a TimeSliceValidTimeSpecification that filters time slices with valid time starting before the specified instant.
     * @param begin
     * @return
     */
    public static TimeSliceValidTimeSpecification startingBefore(Instant begin) {
        return new TimeSliceValidTimeSpecification(begin, null, null, null, null, null);
    }

    /**
     * Creates a TimeSliceValidTimeSpecification that filters time slices with valid time starting after the specified instant.
     * @param begin
     * @return
     */
    public static TimeSliceValidTimeSpecification startingAfter(Instant begin) {
        return new TimeSliceValidTimeSpecification(null, begin, null, null, null, null);
    }

    /**
     * Creates a TimeSliceValidTimeSpecification that filters time slices with valid time starting at the specified instant.
     * @param begin
     * @return
     */
    public static TimeSliceValidTimeSpecification startingAt(Instant begin) {
        return new TimeSliceValidTimeSpecification(null, null, begin, null, null, null);
    }

    /**
     * Creates a TimeSliceValidTimeSpecification that filters time slices with valid time ending before the specified instant.
     * @param end
     * @return
     */
    public static TimeSliceValidTimeSpecification endingBefore(Instant end) {
        return new TimeSliceValidTimeSpecification(null, null, null, end, null, null);
    }

    /**
     * Creates a TimeSliceValidTimeSpecification that filters time slices with valid time ending after the specified instant.
     * @param end
     * @return
     */
    public static TimeSliceValidTimeSpecification endingAfter(Instant end) {
        return new TimeSliceValidTimeSpecification(null, null, null, null, end, null);
    }

    /**
     * Creates a TimeSliceValidTimeSpecification that filters time slices with valid time ending at the specified instant.
     * @param end
     * @return
     */
    public static TimeSliceValidTimeSpecification endingAt(Instant end) {
        return new TimeSliceValidTimeSpecification(null, null, null, null, null, end);
    }

    @Override
    public boolean isSatisfiedBy(AbstractAIXMTimeSliceBaseType timeSlice) {
        if (timeSlice == null) {
            return false;
        }

        if (timeSlice.getValidTime() == null) {
            return false;
        }

        Instant validTimeBegin = timeSlice.getValidTime().getBeginPosition();
        Instant validTimeEnd = timeSlice.getValidTime().getEndPosition();
        
        if (beforeBegin != null && validTimeBegin != null && validTimeBegin.isBefore(beforeBegin)) {
            return false;
        }

        if (afterBegin != null && validTimeBegin != null && validTimeBegin.isAfter(afterBegin)) {
            return false;
        }

        if (atBeign != null && validTimeBegin != null && !validTimeBegin.equals(atBeign)) {
            return false;
        }

        if (beforeEnd != null && validTimeEnd != null && validTimeEnd.isBefore(beforeEnd)) {
            return false;
        }

        if (afterEnd != null && validTimeEnd != null && validTimeEnd.isAfter(afterEnd)) {
            return false;
        }

        if (atEnd != null && validTimeEnd != null && !validTimeEnd.equals(atEnd)) {
            return false;
        }

        return true;

    }
    
}
