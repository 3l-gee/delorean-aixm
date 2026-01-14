package com.aixm.delorean.core.gis.type;


import java.util.ArrayList;
import java.util.List;

import com.aixm.delorean.core.gis.type.gml.GmlCurveType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "Polygon")
@Table(name = "polygon", schema = "gml")
public class Polygon implements java.io.Serializable{
    
    private static final long serialVersionUID = 20250910L;
    protected Long hjid;    
    protected Long index;
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

    @Column(name = "index")
    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "exterior_id")
    public Ring getExterior() {
        return exterior;
    }

    public void setExterior(Ring value) {
        this.exterior = value;
    }

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
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
