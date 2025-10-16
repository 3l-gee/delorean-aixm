package com.aixm.delorean.core.gis.type;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Access;
import jakarta.persistence.AccessType;

import java.util.ArrayList;
import java.util.List;

import com.aixm.delorean.core.org.gml.v_3_2.AbstractGMLType;

@Access(AccessType.PROPERTY)
@Entity(name = "Curve")
@Table(name = "abstract_curve", schema = "gml")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Curve extends AbstractGMLType {

    protected Long hjid;
    private List<Segment> segments;

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
}
