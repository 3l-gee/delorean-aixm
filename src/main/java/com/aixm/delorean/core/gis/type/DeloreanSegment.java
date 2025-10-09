package com.aixm.delorean.core.gis.type;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.persistence.Access;
import jakarta.persistence.Entity;
import jakarta.persistence.AccessType;
import jakarta.persistence.Table;

@Access(AccessType.PROPERTY)
@Entity(name = "DeloreanSegment")
@Table(name = "curve", schema = "gml")
public class DeloreanSegment {

    private static final long serialVersionUID = 20250910L;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

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

    @Version
    @Column(name = "hjversion")
    public Long gethjversion() {
        return hjversion;
    }

    public void sethjversion(Long value) {
        this.hjversion = value;
    }
    
}
