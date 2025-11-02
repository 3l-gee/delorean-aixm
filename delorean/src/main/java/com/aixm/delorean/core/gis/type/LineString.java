package com.aixm.delorean.core.gis.type;

import java.util.ArrayList;
import java.util.List;

import com.aixm.delorean.core.gis.type.components.PosList;
import com.aixm.delorean.core.gis.type.gml.GmlPointType;

import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;

@Entity(name = "LineString")
@Table(name = "linestring", schema = "gml")
public class LineString extends Segment {

    protected PosList posList;
    protected List<GmlPointType> gmlPoint;

    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "srsName", column = @Column(name = "pos_list_srs_name", length = 128)),
        @jakarta.persistence.AttributeOverride(name = "posList", column = @Column(name = "pos_list", length = 2048))
    })
    public PosList getPosList() {
        return posList;
    }

    public void setPosList(PosList value) {
        this.posList = value;
    }

    @OneToMany(targetEntity = GmlPointType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST,
        CascadeType.DETACH,
        CascadeType.REFRESH
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
    public List<String> aggregateSrsNames() {
        List<String> srsNames = new ArrayList<>();

        for (GmlPointType point : getGmlPoint()) {
            srsNames.addAll(point.aggregateSrsNames());
        }

        srsNames.add(posList.getSrsName());

        return srsNames;
    }
}
