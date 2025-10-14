package com.aixm.delorean.core.gis.type;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Embedded;
import java.util.List;

@Entity(name = "Geodesic")
@Table(name = "geodesic", schema = "gml")
public class Geodesic extends Segment {

    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "srsName", column = @Column(name = "pos_list_srs_name", length = 128)),
        @jakarta.persistence.AttributeOverride(name = "posList", column = @Column(name = "pos_list", length = 2048))
    })
    protected PosList posList;

    @ElementCollection
    @CollectionTable(name = "geodesic_pos", schema = "gml", joinColumns = @JoinColumn(name = "geodesic_id"))
    @AttributeOverrides({  
        @jakarta.persistence.AttributeOverride(name = "srsName", column = @Column(name = "pos_srs_name", length = 128)),
        @jakarta.persistence.AttributeOverride(name = "pos", column = @Column(name = "pos", length = 2048))
    })
    @OrderColumn(name = "sequence_index")
    protected List<Pos> pos;

    @ElementCollection
    @CollectionTable(name = "geodesic_point_property", schema = "gml", joinColumns = @JoinColumn(name = "geodesic_id"))
    @AttributeOverrides({  
        @jakarta.persistence.AttributeOverride(name = "href", column = @Column(name = "href", length = 256)),
        @jakarta.persistence.AttributeOverride(name = "title", column = @Column(name = "title", length = 256))
    })  
    @OrderColumn(name = "sequence_index")
    protected List<PointProperty> pointProperty;

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name = "content_type", length = 20, nullable = false)
    protected ContentType contentType;

    public PosList getPosList() {
        return posList;
    }

    public void setPosList(PosList value) {
        this.posList = value;
    }

    public List<Pos> getPos() {
        return pos;
    }

    public void setPos(List<Pos> value) {
        this.pos = value;
    }

    public List<PointProperty> getPointProperty() {
        return pointProperty;
    }

    public void setPointProperty(List<PointProperty> value) {
        this.pointProperty = value;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType value) {
        this.contentType = value;
    }
}
