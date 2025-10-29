package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;

import com.aixm.delorean.core.gis.type.components.SegmentType;

import java.util.List;

import jakarta.persistence.Access;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.AccessType;
import jakarta.persistence.Table;

@Access(AccessType.PROPERTY)
@Entity(name = "Segment")
@Table(name = "segment", schema = "gml")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Segment {

    protected Long hjid;
    protected Long index;

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name = "segment_type", length = 10, nullable = false)
    protected SegmentType segmentType;

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

    @Column(name ="index")
    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public SegmentType getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(SegmentType segmentType) {
        this.segmentType = segmentType;
    }

    public List<String> aggregateSrsNames() {
        return null;
    }
    
}
