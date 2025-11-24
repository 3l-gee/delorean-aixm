package com.aixm.delorean.aixm511.gis.type;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;

import com.aixm.delorean.aixm511.schema.CodeVerticalDatumType;
import com.aixm.delorean.aixm511.schema.ElevatedSurfaceType;
import com.aixm.delorean.aixm511.schema.ElevatedSurfaceTypeExtension;
import com.aixm.delorean.aixm511.schema.NotePropertyType;
import com.aixm.delorean.aixm511.schema.ValDistanceSignedType;
import com.aixm.delorean.aixm511.schema.ValDistanceType;
import com.aixm.delorean.aixm511.schema.ValDistanceVerticalType;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.xml.bind.JAXBElement;

@Entity(name = "AixmElevatedSurfaceType")
@Table(name = "aixm_elevated_surface", schema = "gml")
public class AixmElevatedSurfaceType extends com.aixm.delorean.core.gis.type.Surface implements java.io.Serializable{
    
    private static final long serialVersionUID = 20250910L;
    protected JAXBElement<ValDistanceVerticalType> elevation;
    protected JAXBElement<ValDistanceSignedType> geoidUndulation;
    protected JAXBElement<CodeVerticalDatumType> verticalDatum;
    protected JAXBElement<ValDistanceType> horizontalAccuracy;
    protected List<NotePropertyType> annotation;
    protected List<ElevatedSurfaceTypeExtension> extension;

    @Transient
    public JAXBElement<ValDistanceVerticalType> getElevation() {
        return elevation;
    }

    public void setElevation(JAXBElement<ValDistanceVerticalType> value) {
        this.elevation = value;
    }

    @Transient
    public boolean isSetElevation() {
        return (this.elevation!= null);
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "ELEVATION", length = 255)),
        @AttributeOverride(name = "uom", column = @Column(name = "ELEVATION_UOM")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "ELEVATION_NIL"))
    })
    public ValDistanceVerticalType getElevationItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getElevation());
    }

    public void setElevationItem(ValDistanceVerticalType target) {
        setElevation(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "elevation"), ElevatedSurfaceType.class, target));
    }

    @Transient
    public JAXBElement<ValDistanceSignedType> getGeoidUndulation() {
        return geoidUndulation;
    }

    public void setGeoidUndulation(JAXBElement<ValDistanceSignedType> value) {
        this.geoidUndulation = value;
    }

    @Transient
    public boolean isSetGeoidUndulation() {
        return (this.geoidUndulation!= null);
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "GEOID_UNDULATION", precision = 20, scale = 10)),
        @AttributeOverride(name = "uom", column = @Column(name = "GEOID_UNDULATION_UOM")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "GEOID_UNDULATION_NIL"))
    })
    public ValDistanceSignedType getGeoidUndulationItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceSignedType.class, this.getGeoidUndulation());
    }

    public void setGeoidUndulationItem(ValDistanceSignedType target) {
        setGeoidUndulation(XmlAdapterUtils.marshallJAXBElement(ValDistanceSignedType.class, new QName("http://www.aixm.aero/schema/5.1.1", "geoidUndulation"), ElevatedSurfaceType.class, target));
    }

    @Transient
    public JAXBElement<CodeVerticalDatumType> getVerticalDatum() {
        return verticalDatum;
    }

    public void setVerticalDatum(JAXBElement<CodeVerticalDatumType> value) {
        this.verticalDatum = value;
    }

    @Transient
    public boolean isSetVerticalDatum() {
        return (this.verticalDatum!= null);
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "VERTICAL_DATUM", length = 60)),
        @AttributeOverride(name = "nilReason", column = @Column(name = "VERTICAL_DATUM_NIL"))
    })
    public CodeVerticalDatumType getVerticalDatumItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalDatumType.class, this.getVerticalDatum());
    }

    public void setVerticalDatumItem(CodeVerticalDatumType target) {
        setVerticalDatum(XmlAdapterUtils.marshallJAXBElement(CodeVerticalDatumType.class, new QName("http://www.aixm.aero/schema/5.1.1", "verticalDatum"), ElevatedSurfaceType.class, target));
    }

    @Transient
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
        @AttributeOverride(name = "value", column = @Column(name = "HORIZONTAL_ACCURACY", precision = 20, scale = 10)),
        @AttributeOverride(name = "uom", column = @Column(name = "HORIZONTAL_ACCURACY_UOM")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "HORIZONTAL_ACCURACY_NIL"))
    })
    public ValDistanceType getHorizontalAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getHorizontalAccuracy());
    }

    public void setHorizontalAccuracyItem(ValDistanceType target) {
        setHorizontalAccuracy(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "horizontalAccuracy"), ElevatedSurfaceType.class, target));
    }

    @OneToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "ANNOTATION_hjid")
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

    @OneToMany(targetEntity = ElevatedSurfaceTypeExtension.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_hjid")
    public List<ElevatedSurfaceTypeExtension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    public void setExtension(List<ElevatedSurfaceTypeExtension> extension) {
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
