
package com.delorean.aixm.aixm52.schema;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AltitudeIndicationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AltitudeIndicationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}AltitudeIndication"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltitudeIndicationPropertyType", propOrder = {
    "altitudeIndication"
})
@Entity(name = "AltitudeIndicationPropertyType")
@Table(name = "altitudeindicationpropertytype", schema = "route")
public class AltitudeIndicationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AltitudeIndication", required = true)
    protected AltitudeIndicationType altitudeIndication;

    /**
     * Gets the value of the altitudeIndication property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeIndicationType }
     *     
     */
    @OneToOne(targetEntity = AltitudeIndicationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "altitudeindication_hjid", referencedColumnName = "hjid")
    public AltitudeIndicationType getAltitudeIndication() {
        return altitudeIndication;
    }

    /**
     * Sets the value of the altitudeIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeIndicationType }
     *     
     */
    public void setAltitudeIndication(AltitudeIndicationType value) {
        this.altitudeIndication = value;
    }

    @Transient
    public boolean isSetAltitudeIndication() {
        return (this.altitudeIndication!= null);
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
        final AltitudeIndicationPropertyType that = ((AltitudeIndicationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAltitudeIndication();
            boolean rhsFieldIsSet = that.isSetAltitudeIndication();
            AltitudeIndicationType lhsField;
            lhsField = this.getAltitudeIndication();
            AltitudeIndicationType rhsField;
            rhsField = that.getAltitudeIndication();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeIndication", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeIndication", rhsField);
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
            boolean theFieldIsSet = this.isSetAltitudeIndication();
            AltitudeIndicationType theField;
            theField = this.getAltitudeIndication();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeIndication", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAltitudeIndication();
            AltitudeIndicationType theField;
            theField = this.getAltitudeIndication();
            strategy.appendField(locator, this, "altitudeIndication", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
