package com.aixm.delorean.core.gis.type;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.AttributeOverrides;

import java.util.ArrayList;
import java.util.List;

import com.aixm.delorean.core.gis.type.components.ContentType;
import com.aixm.delorean.core.gis.type.components.CurveProperty;
import com.aixm.delorean.core.org.gml.v_3_2.AbstractGMLType;

@Access(AccessType.PROPERTY)
@Entity(name = "Curve")
@Table(name = "abstract_curve", schema = "gml")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Curve extends AbstractGMLType {

    protected Long hjid;
    protected Long index;
    protected List<Segment> segments;
    protected CurveProperty curveProperty;
    protected ContentType contentType;

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

    @Column(name = "index")
    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
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

    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "id", column = @Column(name = "curve_id")),
        @jakarta.persistence.AttributeOverride(name = "href", column = @Column(name = "href", length = 256)),
        @jakarta.persistence.AttributeOverride(name = "title", column = @Column(name = "title", length = 256)),
        @jakarta.persistence.AttributeOverride(name = "hrefType", column = @Column(name = "href_type", length = 20))
    })
    public CurveProperty getCurveProperty() {
        return curveProperty;
    }

    public void setCurveProperty(CurveProperty curveProperty) {
        this.curveProperty = curveProperty;
    }

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name = "content_type", length = 20, nullable = false)
    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }
}
