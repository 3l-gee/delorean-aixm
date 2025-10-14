package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Embeddable;

@Embeddable
public class Pos{
    protected String srsName;
    protected String value;

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
