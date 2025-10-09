package com.aixm.delorean.core.gis.type.a5_2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;

import com.aixm.delorean.core.schema.a5_2.aixm.NotePropertyType;
import com.aixm.delorean.core.schema.a5_2.aixm.SurfaceType;
import com.aixm.delorean.core.schema.a5_2.aixm.SurfaceTypeExtension;
import com.aixm.delorean.core.schema.a5_2.aixm.ValDistanceType;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;

@Access(AccessType.PROPERTY)
@Entity(name = "DeloreanSurfaceType")
@Table(name = "surface", schema = "gml")
public class DeloreanSurfaceType extends com.aixm.delorean.core.gis.type.DeloreanSurfaceType {

    private static final long serialVersionUID = 20250910L;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;
    protected JAXBElement<ValDistanceType> horizontalAccuracy;
    protected List<NotePropertyType> annotation;
    protected List<SurfaceTypeExtension> extension;

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

    public JAXBElement<ValDistanceType> getHorizontalAccuracy() {
        return horizontalAccuracy;
    }

    public void setHorizontalAccuracy(JAXBElement<ValDistanceType> value) {
        this.horizontalAccuracy = value;
    }

    @Transient
    public boolean isSetHorizontalAccuracy() {
        return (this.horizontalAccuracy!= null);
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "HORIZONTAL_ACCURACY_VAL", precision = 20, scale = 10)),
        @AttributeOverride(name = "uom", column = @Column(name = "HORIZONTAL_ACCURACY_UOM")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "HORIZONTAL_ACCURACY_ACC", length = 255)),
        @AttributeOverride(name = "nilReason", column = @Column(name = "HORIZONTAL_ACCURACY_NIL"))
    })
    public ValDistanceType getHorizontalAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getHorizontalAccuracy());
    }

    public void setHorizontalAccuracyItem(ValDistanceType target) {
        setHorizontalAccuracy(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.2", "horizontalAccuracy"), SurfaceType.class, target));
    }

    @OneToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "ANNOTATION_AIXMELEVATED")
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<>();
        }
        return this.annotation;
    }

    public void setAnnotation(List<NotePropertyType> annotation) {
        this.annotation = annotation;
    }

    @Transient
    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    @OneToMany(targetEntity = SurfaceTypeExtension.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_AIXMPOINT_TYPE_HJID")
    public List<SurfaceTypeExtension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    public void setExtension(List<SurfaceTypeExtension> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }
    
}
