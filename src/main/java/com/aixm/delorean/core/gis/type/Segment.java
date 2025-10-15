package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;
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

    private static final long serialVersionUID = 20250910L;
    protected Long hjid;
    protected Long hjversion;
    protected String href;
    protected String title;

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

    @Version
    @Column(name = "hjversion")
    public Long gethjversion() {
        return hjversion;
    }

    public void sethjversion(Long value) {
        this.hjversion = value;
    }

    @Column(name = "href")
    public String getHref() {
        return href;
    }

    public void setHref(String value) {
        this.href = value;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public SegmentType getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(SegmentType segmentType) {
        this.segmentType = segmentType;
    }
    
}
