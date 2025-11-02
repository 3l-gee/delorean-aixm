package com.aixm.delorean.core.gis.type.components;

import jakarta.persistence.Embeddable;

@Embeddable
public class Pos{
    protected Long index;
    protected String srsName;
    protected String value;

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public String getSrsName() {
        return srsName;
    }

    public void setSrsName(String srsName) {
        this.srsName = srsName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
