package com.aixm.delorean.core.gis.type;

import java.util.ArrayList;
import java.util.List;

import com.aixm.delorean.core.gis.type.components.ContentType;
import com.aixm.delorean.core.gis.type.components.PointProperty;
import com.aixm.delorean.core.gis.type.components.Pos;
import com.aixm.delorean.core.gis.type.components.PosList;

import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;

@Entity(name = "LineString")
@Table(name = "linestring", schema = "gml")
public class LineString extends Segment {

    protected PosList posList;
    protected List<Pos> pos;
    protected List<PointProperty> pointProperty;
    protected ContentType contentType;

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

    @ElementCollection
    @CollectionTable(name = "geodesic_pos", schema = "gml", joinColumns = @JoinColumn(name = "geodesic_id"))
    @AttributeOverrides({  
        @jakarta.persistence.AttributeOverride(name = "srsName", column = @Column(name = "pos_srs_name", length = 128)),
        @jakarta.persistence.AttributeOverride(name = "pos", column = @Column(name = "pos", length = 2048))
    })
    @OrderColumn(name = "sequence_index")
    public List<Pos> getPos() {
        if (pos == null) {
            pos = new ArrayList<>();
        }
        return pos;
    }

    public void setPos(List<Pos> value) {
        this.pos = value;
    }

    @ElementCollection
    @CollectionTable(name = "geodesic_point_property", schema = "gml", joinColumns = @JoinColumn(name = "geodesic_id"))
    @AttributeOverrides({  
        @jakarta.persistence.AttributeOverride(name = "href", column = @Column(name = "href", length = 256)),
        @jakarta.persistence.AttributeOverride(name = "title", column = @Column(name = "title", length = 256)),
        @jakarta.persistence.AttributeOverride(name = "hrefType", column = @Column(name = "href_type", length = 20))
    })  
    @OrderColumn(name = "sequence_index")
    public List<PointProperty> getPointProperty() {
        if (pointProperty == null) {
            pointProperty = new ArrayList<>();
        }
        return pointProperty;
    }

    public void setPointProperty(List<PointProperty> value) {
        this.pointProperty = value;
    }

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name = "content_type", length = 20, nullable = false)
    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType value) {
        this.contentType = value;
    }
}
