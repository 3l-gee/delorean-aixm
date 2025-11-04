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
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Surface extends AbstractGMLType {

    protected Long hjid;
    protected Ring exterior;
    protected List<Ring> interior;

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

    @OneToOne(targetEntity = Segment.class, cascade = {
    CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "exterior_id")
    public Ring getExterior() {
        return exterior;
    }

    public void setExterior(Ring value) {
        this.exterior = value;
    }

    @OneToMany(targetEntity = Segment.class, cascade = {
    CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "interior_id")
    public List<Ring> getInterior() {
        if (interior == null) {
            interior = new ArrayList<>();
        }
        return interior;
    }

    public void setInterior(List<Ring> value) {
        this.interior = value;
    }

    public List<String> aggregateEpsgCode() {
        List<String> epsgCodes = new ArrayList<>();

        epsgCodes.addAll(exterior.aggregateEpsgCode());

        for (Ring ring : getInterior()) {
            epsgCodes.addAll(ring.aggregateEpsgCode());
        }

        if (epsgCodes.isEmpty()) {
            throw new IllegalArgumentException("Surface geometry must have at least one EPSG code defined.");
        }

        return epsgCodes;
    }

}
