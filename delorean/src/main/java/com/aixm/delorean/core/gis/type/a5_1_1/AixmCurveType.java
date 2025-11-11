package com.aixm.delorean.core.gis.type.a5_1_1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;

import com.aixm.delorean.core.schema.a5_1_1.aixm.CurveType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.NotePropertyType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ValDistanceType;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.xml.bind.JAXBElement;

@Entity(name = "DeloreanCurveType")
@Table(name = "aixm_curve", schema = "gml")
public class AixmCurveType extends com.aixm.delorean.core.gis.type.Curve {
    
    private static final long serialVersionUID = 20250910L;
    protected JAXBElement<ValDistanceType> horizontalAccuracy;
    protected List<NotePropertyType> annotation;

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
        setHorizontalAccuracy(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "horizontalAccuracy"), CurveType.class, target));
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
}
