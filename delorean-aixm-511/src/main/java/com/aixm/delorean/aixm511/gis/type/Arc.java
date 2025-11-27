package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Access;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.List;

import com.aixm.delorean.core.gis.type.components.AngleType;
import com.aixm.delorean.core.gis.type.components.DistanceType;
import com.aixm.delorean.core.gis.type.gml.GmlPointType;

@Access(jakarta.persistence.AccessType.PROPERTY)
@Entity(name = "Arc")
@Table(name = "arc", schema = "gml")
public class Arc extends Segment implements java.io.Serializable {

    
    private static final long serialVersionUID = 20250910L;
    protected GmlPointType gmlPoint;
    protected DistanceType radius;
    protected AngleType startAngle;
    protected AngleType endAngle;
    
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


    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "value", column = @Column(name = "start_angle_value")),
        @jakarta.persistence.AttributeOverride(name = "uom", column = @Column(name = "start_angle_uom", length = 10))
    })
    public AngleType getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(AngleType startAngle) {
        this.startAngle = startAngle;
    }

    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "value", column = @Column(name = "end_angle_value")),
        @jakarta.persistence.AttributeOverride(name = "uom", column = @Column(name = "end_angle_uom", length = 10))
    })
    public AngleType getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(AngleType endAngle) {
        this.endAngle = endAngle;
    }

    @Override
    public List<String> aggregateEpsgCode() {
        if (gmlPoint != null) {
            return gmlPoint.aggregateEpsgCode();
        }

        throw new IllegalArgumentException("Arc geometry must have at least one EPSG code defined.");
    }
}
