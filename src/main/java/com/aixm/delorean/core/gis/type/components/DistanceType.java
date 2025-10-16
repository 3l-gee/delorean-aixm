package com.aixm.delorean.core.gis.type.components;

import com.aixm.delorean.core.util.DistanceUom;

import jakarta.persistence.Embeddable;

@Embeddable
public class DistanceType {
    protected Double value;
    protected DistanceUom uom;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public DistanceUom getUom() {
        return uom;
    }

    public void setUom(DistanceUom uom) {
        this.uom = uom;
    }
}
