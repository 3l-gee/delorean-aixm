package com.aixm.delorean.core.gis.type;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.MappedSuperclass;

import java.util.ArrayList;
import java.util.List;

import com.aixm.delorean.core.org.gml.v_3_2.AbstractGMLType;

@MappedSuperclass
public class Curve extends AbstractGMLType {

    protected Long hjid;
    protected List<Segment> segments;

    @Id
    @Column(name = "HJID")
    @GeneratedValue(generator = "delorean_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "delorean_seq_gen", sequenceName = "delorean_seq_gen", allocationSize = 1)
    public Long getHjid() {
        return hjid;
    }

    public void setHjid(Long value) {
        this.hjid = value;
    }

    @OneToMany(targetEntity = Segment.class, cascade = {
    CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "curve_id")
    public List<Segment> getSegments() {
        if (segments == null) {
            segments = new ArrayList<>();
        }
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }


    public List<String> aggregateEpsgCode() {
        List<String> epsgCodes = new ArrayList<>();

        for (Segment segment : getSegments()) {
            epsgCodes.addAll(segment.aggregateEpsgCode());
        }

        if (epsgCodes.isEmpty()) {
            throw new IllegalArgumentException("Curve geometry must have at least one EPSG code defined.");
        }

        return epsgCodes;
    }
}
