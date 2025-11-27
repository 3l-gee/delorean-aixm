package com.aixm.delorean.aixm511.gis.type;

import jakarta.persistence.Access;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

import com.aixm.delorean.aixm511.gis.type.components.DistanceType;
import com.aixm.delorean.aixm511.gis.type.gml.GmlPointType;

@Access(jakarta.persistence.AccessType.PROPERTY)
@Entity(name = "Circle")
@Table(name = "circle", schema = "gml")
public class Circle extends Segment implements java.io.Serializable {
    
    private static final long serialVersionUID = 20250910L;
    protected GmlPointType gmlPoint;
    protected DistanceType radius;
    
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

    @OneToOne(targetEntity = GmlPointType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "gml_point_id", nullable = true)
    public GmlPointType getGmlPoint() {
        return gmlPoint;
    }

    public void setGmlPoint(GmlPointType gmlPoint) {
        this.gmlPoint = gmlPoint;
    }

    @Override
    public List<String> aggregateEpsgCode() {
        if (gmlPoint != null) {
            return gmlPoint.aggregateEpsgCode();
        }

        throw new IllegalArgumentException("Circle geometry must have at least one EPSG code defined.");
    }
}
