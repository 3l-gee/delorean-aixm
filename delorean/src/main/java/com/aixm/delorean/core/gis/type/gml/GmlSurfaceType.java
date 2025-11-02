package com.aixm.delorean.core.gis.type.gml;

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

@Access(AccessType.PROPERTY)
@Entity(name = "GmlSurfaceType")
@Table(name = "surface", schema = "gml")
public class GmlSurfaceType extends com.aixm.delorean.core.gis.type.Surface {
    
    private static final long serialVersionUID = 20250910L;
    protected Long index;
    protected GeometricProperty geometricProperty;
    protected GeometricType geometricType;

    @Column(name = "index")
    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "id", column = @Column(name = "curve_id")),
        @jakarta.persistence.AttributeOverride(name = "href", column = @Column(name = "href", length = 256)),
        @jakarta.persistence.AttributeOverride(name = "title", column = @Column(name = "title", length = 256)),
        @jakarta.persistence.AttributeOverride(name = "hrefType", column = @Column(name = "href_type", length = 20))
    })
    public GeometricProperty getGeometricProperty() {
        return geometricProperty;
    }

    public void setGeometricProperty(GeometricProperty geometricProperty) {
        this.geometricProperty = geometricProperty;
    }

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name = "geometric_type", length = 20, nullable = false)
    public GeometricType getGeometricType() {
        return geometricType;
    }

    public void setGeometricType(GeometricType geometricType) {
        this.geometricType = geometricType;
    }
}
