package com.aixm.delorean.aixm511.gis.type;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;

import java.util.List;

import com.aixm.delorean.aixm511.gis.type.components.Pos;
import com.aixm.delorean.aixm511.org.gml.v_3_2.AbstractGMLType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "point", schema = "gml")
public class Point extends AbstractGMLType {

    protected Long hjid;
    protected Pos pos;

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
    
    @Embedded
    @AttributeOverrides({
        @jakarta.persistence.AttributeOverride(name = "srsName", column = @Column(name = "pos_srs_name", length = 128)),
        @jakarta.persistence.AttributeOverride(name = "value", column = @Column(name = "pos", length = 2048))
    })
    public Pos getPos() {
        return pos;
    }

    public void setPos(Pos value) {
        this.pos = value;
    }

    public List<String> aggregateEpsgCode() {
        if (pos != null && pos.getSrsName() != null) {
            return List.of(pos.getSrsName());
        }
        
        throw new IllegalArgumentException("Point geometry must have at least one EPSG code defined.");
    }
}