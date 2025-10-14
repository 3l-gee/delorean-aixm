package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import com.aixm.delorean.core.org.gml.v_3_2.AbstractGMLType;

@MappedSuperclass
public class Curve extends AbstractGMLType {
    
    @Column(name = "srs_name", length = 128)
    protected String srsName;

    @Column(name = "geom_wkt", length = 2048)
    protected String geomWkt;

    public String getSrsName() {
        return srsName;
    }

    public void setSrsName(String value) {
        this.srsName = value;
    }

    public String getGeomWkt() {
        return geomWkt;
    }

    public void setGeomWkt(String value) {
        this.geomWkt = value;
    }
}
