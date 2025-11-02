package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;

import com.aixm.delorean.core.gis.type.components.Pos;
import com.aixm.delorean.core.org.gml.v_3_2.AbstractGMLType;

@Entity(name = "Point")
@Table(name = "abstract_point", schema = "gml")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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
        @jakarta.persistence.AttributeOverride(name = "pos", column = @Column(name = "pos", length = 2048))
    })
    public Pos getPos() {
        return pos;
    }

    public void setPos(Pos value) {
        this.pos = value;
    }
}