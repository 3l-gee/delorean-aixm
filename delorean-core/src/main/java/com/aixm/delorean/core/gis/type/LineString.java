package com.aixm.delorean.core.gis.type;

import java.util.ArrayList;
import java.util.List;

import com.aixm.delorean.core.gis.type.gml.GmlPointType;

import org.locationtech.jts.geom.Geometry;
import jakarta.persistence.Access;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;


@Access(jakarta.persistence.AccessType.PROPERTY)
@Entity(name = "LineString")
@Table(name = "linestring", schema = "gml")
public class LineString extends LinearSegment{

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
    public Geometry getGeom() {
        return null; // Return null so Hibernate doesn't pass around any heavy spatial objects
    }

    public void setGeom(Geometry geom) {
        // No-op: Hibernate will never try to populate this unless forced, 
        // and your Java layer ignores it.
    }

    @Override
    public List<String> aggregateEpsgCode() {
        List<String> epsgCodes = new ArrayList<>();

        for (GmlPointType point : getGmlPoint()) {
            epsgCodes.addAll(point.aggregateEpsgCode());
        }

        if (posList != null && posList.getSrsName() != null) {
            epsgCodes.add(posList.getSrsName());
        }

        if (epsgCodes.isEmpty()) {
            throw new IllegalArgumentException("LineString geometry must have at least one EPSG code defined.");
        }

        return epsgCodes;
    }
}
