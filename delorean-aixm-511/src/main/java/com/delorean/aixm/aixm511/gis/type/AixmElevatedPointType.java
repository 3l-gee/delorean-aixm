package com.delorean.aixm.aixm511.gis.type;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;

import com.delorean.aixm.aixm511.schema.ElevatedPointTypeExtension;
import com.delorean.aixm.aixm511.schema.NotePropertyType;
import com.delorean.aixm.aixm511.schema.ValDistanceSignedType;
import com.delorean.aixm.aixm511.schema.ValDistanceType;
import com.delorean.aixm.aixm511.schema.ValDistanceVerticalType;
import com.delorean.aixm.aixm511.schema.CodeVerticalDatumType;
import com.delorean.aixm.aixm511.schema.ElevatedPointType;
import com.delorean.aixm.aixm511.schema.PointType;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.xml.bind.JAXBElement;

@Entity(name = "AixmElevatedPointType")
@Table(name = "aixm_elevated_point", schema = "gml")
public class AixmElevatedPointType extends com.delorean.aixm.core.gis.type.Point implements java.io.Serializable {

    private static final long serialVersionUID = 20250910L;
    protected JAXBElement<ValDistanceVerticalType> elevation;
    protected JAXBElement<ValDistanceSignedType> geoidUndulation;
    protected JAXBElement<CodeVerticalDatumType> verticalDatum;
    protected JAXBElement<ValDistanceType> horizontalAccuracy;
    protected JAXBElement<ValDistanceType> verticalAccuracy;
    protected List<NotePropertyType> annotation;
    protected List<ElevatedPointTypeExtension> extension;

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
        @AttributeOverride(name = "value", column = @Column(name = "elevation", length = 255)),
        @AttributeOverride(name = "uom", column = @Column(name = "elevation_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "elevation_nilreason"))
    })
    public ValDistanceVerticalType getElevationItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getElevation());
    }

    public void setElevationItem(ValDistanceVerticalType target) {
        setElevation(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "elevation"), ElevatedPointType.class, target));
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
        @AttributeOverride(name = "value", column = @Column(name = "geoidUndulation", precision = 20, scale = 10)),
        @AttributeOverride(name = "uom", column = @Column(name = "geoidUndulation_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "geoidUndulation_nilreason"))
    })
    public ValDistanceSignedType getGeoidUndulationItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceSignedType.class, this.getGeoidUndulation());
    }

    public void setGeoidUndulationItem(ValDistanceSignedType target) {
        setGeoidUndulation(XmlAdapterUtils.marshallJAXBElement(ValDistanceSignedType.class, new QName("http://www.aixm.aero/schema/5.1.1", "geoidUndulation"), ElevatedPointType.class, target));
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
        @AttributeOverride(name = "value", column = @Column(name = "verticalDatum", length = 60)),
        @AttributeOverride(name = "nilReason", column = @Column(name = "verticalDatum_nilreason"))
    })
    public CodeVerticalDatumType getVerticalDatumItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalDatumType.class, this.getVerticalDatum());
    }

    public void setVerticalDatumItem(CodeVerticalDatumType target) {
        setVerticalDatum(XmlAdapterUtils.marshallJAXBElement(CodeVerticalDatumType.class, new QName("http://www.aixm.aero/schema/5.1.1", "verticalDatum"), ElevatedPointType.class, target));
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
        @AttributeOverride(name = "value", column = @Column(name = "horizontalAccuracy", precision = 20, scale = 10)),
        @AttributeOverride(name = "uom", column = @Column(name = "horizontalAccuracy_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "horizontalAccuracy_nilreason"))
    })
    public ValDistanceType getHorizontalAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getHorizontalAccuracy());
    }

    public void setHorizontalAccuracyItem(ValDistanceType target) {
        setHorizontalAccuracy(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "horizontalAccuracy"), PointType.class, target));
    }

    @Transient
    public JAXBElement<ValDistanceType> getVerticalAccuracy() {
        return verticalAccuracy;
    }

    public void setVerticalAccuracy(JAXBElement<ValDistanceType> value) {
        this.verticalAccuracy = value;
    }

    @Transient
    public boolean isSetVerticalAccuracy() {
        return (this.verticalAccuracy!= null);
    }
    
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "verticalAccuracy", precision = 20, scale = 10)),
        @AttributeOverride(name = "uom", column = @Column(name = "verticalAccuracy_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "verticalAccuracy_nilreason"))
    })
    public ValDistanceType getVerticalAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getVerticalAccuracy());
    }

    public void setVerticalAccuracyItem(ValDistanceType target) {
        setVerticalAccuracy(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "verticalAccuracy"), ElevatedPointType.class, target));
    }

    @OneToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "aixm_elevated_point_annotation_link", schema = "gml", joinColumns = {
        @JoinColumn(name = "aixm_elevated_point_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "annotation_hjid", referencedColumnName = "hjid")
    })
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

    @OneToMany(targetEntity = ElevatedPointTypeExtension.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_hjid")
    public List<ElevatedPointTypeExtension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    public void setExtension(List<ElevatedPointTypeExtension> extension) {
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
