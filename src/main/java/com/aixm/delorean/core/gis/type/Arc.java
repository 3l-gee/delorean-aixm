package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity(name = "Arc")
@Table(name = "arc", schema = "gml")
public class Arc extends Segment {

    @Column(name = "srs_name", length = 128)
    protected String srsName;

    @Column(name = "geom_wkt", length = 2048)
    protected String geomWkt;

    @Column(name = "radius")
    protected Double radius;

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name = "radius_uom", length = 10, nullable = false)
    protected DistanceUom radiusUom;

    @Column(name = "start_angle")
    protected Double startAngle;

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name = "start_angle_uom",length = 10, nullable = false)
    protected AngleUom startAngleUom;

    @Column(name = "end_angle")
    protected Double endAngle;

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name = "end_angle_uom", length = 10, nullable = false)
    protected AngleUom endAngleUom;

    public String getSrsName() {
        return srsName;
    }

    public void setSrsName(String srsName) {
        this.srsName = srsName;
    }

    public String getGeomWkt() {
        return geomWkt;
    }

    public void setGeomWkt(String geomWkt) {
        this.geomWkt = geomWkt;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public DistanceUom getRadiusUom() {
        return radiusUom;
    }

    public void setRadiusUom(DistanceUom radiusUom) {
        this.radiusUom = radiusUom;
    }

    public Double getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(Double startAngle) {
        this.startAngle = startAngle;
    }

    public AngleUom getStartAngleUom() {
        return startAngleUom;
    }

    public void setStartAngleUom(AngleUom startAngleUom) {
        this.startAngleUom = startAngleUom;
    }

    public Double getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(Double endAngle) {
        this.endAngle = endAngle;
    }

    public AngleUom getEndAngleUom() {
        return endAngleUom;
    }

    public void setEndAngleUom(AngleUom endAngleUom) {
        this.endAngleUom = endAngleUom;
    }
}
