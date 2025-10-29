package com.aixm.delorean.core.gis.type;

import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Enumerated;

import java.util.ArrayList;
import java.util.List;

import com.aixm.delorean.core.gis.type.components.AngleType;
import com.aixm.delorean.core.gis.type.components.ContentType;
import com.aixm.delorean.core.gis.type.components.DistanceType;
import com.aixm.delorean.core.gis.type.components.Pos;
import com.aixm.delorean.core.gis.type.components.PointProperty;


public class Circle extends Segment {
    
    protected Pos pos;
    protected PointProperty pointProperty;
    protected DistanceType radius;
    protected ContentType contentType;
    
    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "index", column = @Column(name = "pos_index")), 
        @jakarta.persistence.AttributeOverride(name = "srsName", column = @Column(name = "pos_srs_name", length = 128)),
        @jakarta.persistence.AttributeOverride(name = "pos", column = @Column(name = "pos", length = 2048))
    })
    public Pos getPos() {
        return pos;
    }

    public void setPos(Pos pos) {
        this.pos = pos;
    }

    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "index", column = @Column(name = "prop_index")),
        @jakarta.persistence.AttributeOverride(name = "href", column = @Column(name = "prop_href", length = 256)),
        @jakarta.persistence.AttributeOverride(name = "title", column = @Column(name = "prop_title", length = 256)),
        @jakarta.persistence.AttributeOverride(name = "hrefType", column = @Column(name = "prop_href_type", length = 20))
    })
    public PointProperty getPointProperty() {
        return pointProperty;
    }

    public void setPointProperty(PointProperty pointProperty) {
        this.pointProperty = pointProperty;
    }

    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "value", column = @Column(name = "radius_value")),
        @jakarta.persistence.AttributeOverride(name = "uom", column = @Column(name = "radius_uom", length = 10))
    })
    public DistanceType getRadius() {
        return radius;
    }

    public void setRadius(DistanceType radius) {
        this.radius = radius;
    }

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name = "content_type", length = 20, nullable = false)
    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }
    
    @Override
    public List<String> aggregateSrsNames() {
        List<String> srsNames = new ArrayList<>();

        if (pos != null && pos.getSrsName() != null) {
            srsNames.add(pos.getSrsName());
        }

        return srsNames;
    }
}
