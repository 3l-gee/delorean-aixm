
package com.aixm.delorean.aixm511.schema;

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
 * <p>Java class for DirectFlightPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DirectFlightPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractDirectFlight"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectFlightPropertyType", propOrder = {
    "abstractDirectFlight"
})
@Entity(name = "DirectFlightPropertyType")
@Table(name = "directflight_pt", schema = "route")
public class DirectFlightPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "AbstractDirectFlight", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractDirectFlightType> abstractDirectFlight;

    /**
     * Gets the value of the abstractDirectFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractDirectFlightType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectFlightClassType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectFlightSegmentType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<? extends AbstractDirectFlightType> getAbstractDirectFlight() {
        return abstractDirectFlight;
    }

    /**
     * Sets the value of the abstractDirectFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractDirectFlightType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectFlightClassType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectFlightSegmentType }{@code >}
     *     
     */
    public void setAbstractDirectFlight(JAXBElement<? extends AbstractDirectFlightType> value) {
        this.abstractDirectFlight = value;
    }

    @Transient
    public boolean isSetAbstractDirectFlight() {
        return (this.abstractDirectFlight!= null);
    }

    @Basic
    @Column(name = "ABSTRACT_DIRECT_FLIGHT_NAME")
    public String getAbstractDirectFlightName() {
        if (this.getAbstractDirectFlight() instanceof JAXBElement) {
            return JAXBElementUtils.getName(AbstractDirectFlightType.class, this.getAbstractDirectFlight());
        } else {
            return null;
        }
    }

    public void setAbstractDirectFlightName(String target) {
        if (target!= null) {
            setAbstractDirectFlight(JAXBElementUtils.wrap(this.getAbstractDirectFlight(), target, AbstractDirectFlightType.class));
        }
    }

    @ManyToOne(targetEntity = AbstractDirectFlightType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    public AbstractDirectFlightType getAbstractDirectFlightValue() {
        if (this.getAbstractDirectFlight() instanceof JAXBElement) {
            return JAXBElementUtils.getValue(AbstractDirectFlightType.class, this.getAbstractDirectFlight());
        } else {
            return null;
        }
    }

    public void setAbstractDirectFlightValue(AbstractDirectFlightType target) {
        if (target!= null) {
            setAbstractDirectFlight(JAXBElementUtils.wrap(this.getAbstractDirectFlight(), target));
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
        final DirectFlightPropertyType that = ((DirectFlightPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractDirectFlight();
            boolean rhsFieldIsSet = that.isSetAbstractDirectFlight();
            JAXBElement<? extends AbstractDirectFlightType> lhsField;
            lhsField = this.getAbstractDirectFlight();
            JAXBElement<? extends AbstractDirectFlightType> rhsField;
            rhsField = that.getAbstractDirectFlight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractDirectFlight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractDirectFlight", rhsField);
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
            boolean theFieldIsSet = this.isSetAbstractDirectFlight();
            JAXBElement<? extends AbstractDirectFlightType> theField;
            theField = this.getAbstractDirectFlight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractDirectFlight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAbstractDirectFlight();
            JAXBElement<? extends AbstractDirectFlightType> theField;
            theField = this.getAbstractDirectFlight();
            strategy.appendField(locator, this, "abstractDirectFlight", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
