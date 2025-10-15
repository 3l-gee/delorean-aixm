package com.aixm.delorean.core.gis.type;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderColumn;

import java.util.List;

import com.aixm.delorean.core.org.gml.v_3_2.AbstractGMLType;

@MappedSuperclass
public class Curve extends AbstractGMLType {

    @OneToMany(targetEntity = Segment.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "curve_id")
    @OrderColumn(name = "segment_order")
    List<Segment> segments;

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }
}
