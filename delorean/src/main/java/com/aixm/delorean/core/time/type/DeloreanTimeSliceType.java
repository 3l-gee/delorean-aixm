package com.aixm.delorean.core.time.type;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.time.Instant;

@Embeddable
public class DeloreanTimeSliceType {

    @Column(name = "begin_position", columnDefinition = "TIMESTAMP")
    protected Instant beginPosition;
    
    @Column(name = "end_position", columnDefinition = "TIMESTAMP")
    protected Instant endPosition;
    

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
