package com.aixm.delorean.core.gis.type.components;

import java.math.BigDecimal;

import com.aixm.delorean.core.util.AngleUom;

import jakarta.persistence.Embeddable;

@Embeddable
public class AngleType implements java.io.Serializable {
    
    private static final long serialVersionUID = 20250910L;
    protected BigDecimal value;
    protected AngleUom uom;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public AngleUom getUom() {
        return uom;
    }

    public void setUom(AngleUom uom) {
        this.uom = uom;
    }
}
