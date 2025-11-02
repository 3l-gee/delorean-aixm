package com.aixm.delorean.core.gis.type.components;

import java.math.BigDecimal;

import com.aixm.delorean.core.util.DistanceUom;

import jakarta.persistence.Embeddable;

@Embeddable
public class DistanceType {
    protected BigDecimal value;
    protected DistanceUom uom;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public DistanceUom getUom() {
        return uom;
    }

    public void setUom(DistanceUom uom) {
        this.uom = uom;
    }
}
