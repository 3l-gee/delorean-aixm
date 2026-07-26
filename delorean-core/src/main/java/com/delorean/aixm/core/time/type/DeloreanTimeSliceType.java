package com.delorean.aixm.core.time.type;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.time.Instant;

@Embeddable
public class DeloreanTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20240610L;

    @Column(name = "time_period_id", length = 255)
    protected String timePeriodId;

    @Column(name = "begin_position", columnDefinition = "TIMESTAMPTZ")
    protected Instant beginPosition;
    
    @Column(name = "end_position", columnDefinition = "TIMESTAMPTZ")
    protected Instant endPosition;
    
    public void setTimePeriodId(String timePeriodId) {
        this.timePeriodId = timePeriodId;
    }

    public String getTimePeriodId() {
        return this.timePeriodId;
    }

    public void setBeginPosition(Instant beginPosition) {
        this.beginPosition = beginPosition;
    }

    public Instant getBeginPosition() {
        return beginPosition;
    }

    public void setEndPosition(Instant endPosition) {
        this.endPosition = endPosition;
    }

    public Instant getEndPosition() {
        return endPosition;
    }
}
