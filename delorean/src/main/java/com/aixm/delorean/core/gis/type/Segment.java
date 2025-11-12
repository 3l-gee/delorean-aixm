package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Access;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;

import com.aixm.delorean.core.gis.AbstractSegment;
import com.aixm.delorean.core.gis.type.components.SegmentType;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Access(jakarta.persistence.AccessType.PROPERTY)
@Entity(name = "Segment")
@Table(name = "segment", schema = "gml")
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)    
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Segment extends AbstractSegment{

    protected Long index;
    protected SegmentType segmentType;


    @Column(name = "index")
    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name = "segment_type", length = 10, nullable = false)
    public SegmentType getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(SegmentType segmentType) {
        this.segmentType = segmentType;
    }


    public List<String> aggregateEpsgCode() {
        return null;
    }
}
