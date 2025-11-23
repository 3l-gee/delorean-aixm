package com.aixm.delorean.core.gis.type.gml;

import java.util.ArrayList;
import java.util.List;

import com.aixm.delorean.core.gis.type.components.GeometricProperty;
import com.aixm.delorean.core.gis.type.components.GeometricType;

import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Access;
import jakarta.persistence.AccessType;

@Entity(name = "GmlPointType")
@Table(name = "gml_point", schema = "gml")
public class GmlPointType extends com.aixm.delorean.core.gis.type.Point implements java.io.Serializable{

    private static final long serialVersionUID = 20250910L;
    protected Long index;
    protected GeometricType geometricType;
    protected GeometricProperty geometricProperty;

    @Column(name = "index")
    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }


    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name = "geometric_type", length = 20, nullable = false)
    public GeometricType getGeometricType() {
        return geometricType;
    }

    public void setGeometricType(GeometricType pointType) {
        this.geometricType = pointType;
    }

    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "index", column = @Column(name = "prop_index")),
        @jakarta.persistence.AttributeOverride(name = "href", column = @Column(name = "prop_href", length = 256)),
        @jakarta.persistence.AttributeOverride(name = "title", column = @Column(name = "prop_title", length = 256)),
        @jakarta.persistence.AttributeOverride(name = "hrefType", column = @Column(name = "prop_href_type", length = 20))
    })
    public GeometricProperty getGeometricProperty() {
        return geometricProperty;
    }

    public void setGeometricProperty(GeometricProperty geometricProperty) {
        this.geometricProperty = geometricProperty;
    }

    @Override
    public List<String> aggregateEpsgCode() {
        if (pos != null && pos.getSrsName() != null){
            return List.of(pos.getSrsName());
        }

        if (geometricProperty != null && geometricProperty.getSrsName() != null){
            return List.of(geometricProperty.getSrsName());
        }

        throw new IllegalArgumentException("GmlPointType geometry must have at least one EPSG code defined.");
    }
}