
package com.aixm.delorean.core.schema.a5_1_1.aixm;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.JAXBElementUtils;


/**
 * <p>Java class for SurfaceContaminationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SurfaceContaminationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSurfaceContamination"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceContaminationPropertyType", propOrder = {
    "abstractSurfaceContamination"
})
@Entity(name = "SurfaceContaminationPropertyType")
@Table(name = "surfacecontamination_pt", schema = "airport_heliport")
public class SurfaceContaminationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "AbstractSurfaceContamination", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractSurfaceContaminationType> abstractSurfaceContamination;

    /**
     * Gets the value of the abstractSurfaceContamination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractSurfaceContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftStandContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwaySectionContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffContaminationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<? extends AbstractSurfaceContaminationType> getAbstractSurfaceContamination() {
        return abstractSurfaceContamination;
    }

    /**
     * Sets the value of the abstractSurfaceContamination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractSurfaceContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftStandContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwaySectionContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffContaminationType }{@code >}
     *     
     */
    public void setAbstractSurfaceContamination(JAXBElement<? extends AbstractSurfaceContaminationType> value) {
        this.abstractSurfaceContamination = value;
    }

    @Transient
    public boolean isSetAbstractSurfaceContamination() {
        return (this.abstractSurfaceContamination!= null);
    }

    @Basic
    @Column(name = "ABSTRACT_SURFACE_CONTAMINATI_0")
    public String getAbstractSurfaceContaminationName() {
        if (this.getAbstractSurfaceContamination() instanceof JAXBElement) {
            return JAXBElementUtils.getName(AbstractSurfaceContaminationType.class, this.getAbstractSurfaceContamination());
        } else {
            return null;
        }
    }

    public void setAbstractSurfaceContaminationName(String target) {
        if (target!= null) {
            setAbstractSurfaceContamination(JAXBElementUtils.wrap(this.getAbstractSurfaceContamination(), target, AbstractSurfaceContaminationType.class));
        }
    }

@jakarta.persistence.OneToOne(cascade = jakarta.persistence.CascadeType.ALL, fetch = jakarta.persistence.FetchType.EAGER)
@jakarta.persistence.JoinColumn(name = "surface_contamination_id", referencedColumnName = "hjid")
    public AbstractSurfaceContaminationType getAbstractSurfaceContaminationValue() {
        if (this.getAbstractSurfaceContamination() instanceof JAXBElement) {
            return JAXBElementUtils.getValue(AbstractSurfaceContaminationType.class, this.getAbstractSurfaceContamination());
        } else {
            return null;
        }
    }

    public void setAbstractSurfaceContaminationValue(AbstractSurfaceContaminationType target) {
        if (target!= null) {
            setAbstractSurfaceContamination(JAXBElementUtils.wrap(this.getAbstractSurfaceContamination(), target));
        }
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SurfaceContaminationPropertyType that = ((SurfaceContaminationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractSurfaceContamination();
            boolean rhsFieldIsSet = that.isSetAbstractSurfaceContamination();
            JAXBElement<? extends AbstractSurfaceContaminationType> lhsField;
            lhsField = this.getAbstractSurfaceContamination();
            JAXBElement<? extends AbstractSurfaceContaminationType> rhsField;
            rhsField = that.getAbstractSurfaceContamination();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractSurfaceContamination", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractSurfaceContamination", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetAbstractSurfaceContamination();
            JAXBElement<? extends AbstractSurfaceContaminationType> theField;
            theField = this.getAbstractSurfaceContamination();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractSurfaceContamination", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAbstractSurfaceContamination();
            JAXBElement<? extends AbstractSurfaceContaminationType> theField;
            theField = this.getAbstractSurfaceContamination();
            strategy.appendField(locator, this, "abstractSurfaceContamination", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
