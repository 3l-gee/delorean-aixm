package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Access;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import java.util.List;
import java.util.ArrayList;

import com.aixm.delorean.core.gis.type.components.PosList;
import com.aixm.delorean.core.gis.type.gml.GmlPointType;

@Access(jakarta.persistence.AccessType.PROPERTY)
@Entity(name = "Geodesic")
@Table(name = "geodesic", schema = "gml")
public class Geodesic extends LinearSegment implements java.io.Serializable{

    /**
     * Maps the PostGIS column so Hibernate creates it, but ignores it during read/write cycles.
     * * - insertable = false, updatable = false: Tells Hibernate never to write to this column.
     * - generatedAs: Instructs Hibernate's schema exporter to create it as a native generated column.
     */
    @Column(
        name = "geom", 
        columnDefinition = "geometry(LineString) GENERATED ALWAYS AS (CASE WHEN pos_list IS NOT NULL AND pos_list <> '' THEN ST_GeomFromText(pos_list, srs_name::integer) ELSE NULL END) STORED",
        insertable = false, 
        updatable = false
    )
    public String getGeom() {
        return null; // Return null so Hibernate doesn't pass around any heavy spatial objects
    }

    public void setGeom(String geom) {
        // No-op: Hibernate will never try to populate this unless forced, 
        // and your Java layer ignores it.
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
