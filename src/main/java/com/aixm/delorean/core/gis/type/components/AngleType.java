package com.aixm.delorean.core.gis.type.components;

import com.aixm.delorean.core.util.AngleUom;

import jakarta.persistence.Embeddable;

@Embeddable
public class AngleType {
    protected Double value;
    protected AngleUom uom;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public AngleUom getUom() {
        return uom;
    }

    public void setUom(AngleUom uom) {
        this.uom = uom;
    }
}
