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
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity(name = "Ring")
@Table(name = "ring", schema = "gml")
public class Ring implements java.io.Serializable {

    
    private static final long serialVersionUID = 20250910L;
    protected Long hjid;    
    protected Long index;
    protected List<GmlCurveType> gmlCurve;

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

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "gml_curve_id")
    public List<GmlCurveType> getGmlCurve() {
        if (gmlCurve == null) {
            gmlCurve = new ArrayList<>();
        }
        return gmlCurve;
    }

    public void setGmlCurve(List<GmlCurveType> value) {
        this.gmlCurve = value;
    }

    public List<String> aggregateEpsgCode() {
        List<String> epsgCodes = new ArrayList<>();

        for (GmlCurveType curve : getGmlCurve()) {
            epsgCodes.addAll(curve.aggregateEpsgCode());
        }

        if (epsgCodes.isEmpty()) {
            throw new IllegalArgumentException("Ring geometry must have at least one EPSG code defined.");
        }

        return epsgCodes;
    }

    
}
