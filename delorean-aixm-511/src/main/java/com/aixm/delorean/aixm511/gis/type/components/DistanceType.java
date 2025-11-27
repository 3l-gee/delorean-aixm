package com.aixm.delorean.core.gis.type.components;

import java.math.BigDecimal;

import com.aixm.delorean.core.unit.DistanceUom;

import jakarta.persistence.Embeddable;

@Embeddable
public class DistanceType implements java.io.Serializable {

    private static final long serialVersionUID = 20250910L;
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
