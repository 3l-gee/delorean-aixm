package com.aixm.delorean.aixm511.time.type;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class DeloreanTimestampType {

    @Column(name = "value", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    protected LocalDateTime value;

    @Column(name = "nilReason", length = 255)
    protected String nilReason;

    public LocalDateTime getTimestamp() {
        return value;
    }

    public void setTimestamp(LocalDateTime value) {
        this.value = value;
    }

    public String getNilReason() {
        return nilReason;
    }

    public void setNilReason(String nilReason) {
        this.nilReason = nilReason;
    }
     
}