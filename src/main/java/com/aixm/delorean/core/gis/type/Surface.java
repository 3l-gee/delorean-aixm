package com.aixm.delorean.core.gis.type;

import com.aixm.delorean.core.org.gml.v_3_2.AbstractGMLType;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity(name = "Surface")
@Table(name = "abstract_surface", schema = "gml")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Surface extends AbstractGMLType {

    protected Long hjid;
    protected String srsName;
    protected String geomWkt;

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

    @Column(name = "srs_name")
    public String getSrsName() {
        return srsName;
    }

    public void setSrsName(String value) {
        this.srsName = value;
    }

    @Column(name = "geom_wkt", length = 2048)
    public String getGeomWkt() {
        return geomWkt;
    }

    public void setGeomWkt(String value) {
        this.geomWkt = value;
    }
}
