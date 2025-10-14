package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.AttributeOverrides;

import com.aixm.delorean.core.org.gml.v_3_2.AbstractGMLType;
import com.aixm.delorean.core.gis.type.Pos;

@MappedSuperclass
public class Point extends AbstractGMLType {

    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "srsName", column = @Column(name = "pos_srs_name", length = 128)),
        @jakarta.persistence.AttributeOverride(name = "pos", column = @Column(name = "pos", length = 2048))
    })
    protected Pos pos;
    
    public Pos getPos() {
        return pos;
    }

    public void setPos(Pos value) {
        this.pos = value;
    }
}