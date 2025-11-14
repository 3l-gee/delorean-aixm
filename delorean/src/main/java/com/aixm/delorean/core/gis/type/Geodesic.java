package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Access;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import java.util.List;
import java.util.ArrayList;

import com.aixm.delorean.core.gis.AbstractSegment;
import com.aixm.delorean.core.gis.type.components.PosList;
import com.aixm.delorean.core.gis.type.gml.GmlPointType;

@Access(jakarta.persistence.AccessType.PROPERTY)
@Entity(name = "Geodesic")
@Table(name = "geodesic", schema = "gml")
public class Geodesic extends Segment implements java.io.Serializable{

    private static final long serialVersionUID = 20250910L;
    protected PosList posList;
    protected List<GmlPointType> gmlPoint;

    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "srsName", column = @Column(name = "srs_name", length = 255)),
        @jakarta.persistence.AttributeOverride(name = "value", column = @Column(name = "pos_list", columnDefinition = "TEXT"))
    })
    public PosList getPosList() {
        return posList;
    }

    public void setPosList(PosList value) {
        this.posList = value;
    }

    @OneToMany(targetEntity = GmlPointType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "gml_point_id", nullable = true)
    public List<GmlPointType> getGmlPoint() {
        if (gmlPoint == null) {
            gmlPoint = new ArrayList<>();
        }
        return gmlPoint;
    }

    public void setGmlPoint(List<GmlPointType> gmlPoint) {
        this.gmlPoint = gmlPoint;
    }

    @Override
    public List<String> aggregateEpsgCode() {
        List<String> espgCodes = new ArrayList<>();

        for (GmlPointType point : getGmlPoint()) {
            espgCodes.addAll(point.aggregateEpsgCode());
        }

        if (posList != null && posList.getSrsName() != null) {
            espgCodes.add(posList.getSrsName());
        }

        if (espgCodes.isEmpty()) {
            throw new IllegalArgumentException("Geodesic geometry must have at least one EPSG code defined.");
        }     

        return espgCodes;
    }
}
