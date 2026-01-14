package com.aixm.delorean.core.gis.type;

import java.util.ArrayList;
import java.util.List;

import com.aixm.delorean.core.org.gml.v_3_2.AbstractGMLType;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity(name="Surface")
@Table(name = "surface", schema = "gml")
@Inheritance(strategy = InheritanceType.JOINED)
public class Surface extends AbstractGMLType {

    protected Long hjid;
    protected List<Polygon> polygon;

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

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "polygon_id")
    public List<Polygon> getPolygon() {
        if (polygon == null) {
            polygon = new ArrayList<>();
        }
        return polygon;
    }

    public void setPolygon(List<Polygon> value) {
        this.polygon = value;
    }

    public List<String> aggregateEpsgCode() {
        List<String> epsgCodes = new ArrayList<>();

        for (Polygon polygon : getPolygon()) {
            epsgCodes.addAll(polygon.aggregateEpsgCode());
        }

        if (epsgCodes.isEmpty()) {
            throw new IllegalArgumentException("Surface geometry must have at least one EPSG code defined.");
        }

        return epsgCodes;
    }

}
