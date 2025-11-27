package com.aixm.delorean.aixm511.gis.type.components;

import java.math.BigDecimal;

import com.aixm.delorean.aixm511.unit.DistanceUom;

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
