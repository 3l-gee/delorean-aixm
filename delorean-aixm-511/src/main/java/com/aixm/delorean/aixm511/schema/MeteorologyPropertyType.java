
package com.aixm.delorean.aixm511.schema;

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
 * <p>Java class for MeteorologyPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MeteorologyPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}Meteorology"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologyPropertyType", propOrder = {
    "meteorology"
})
@Entity(name = "MeteorologyPropertyType")
@Table(name = "meteorology_pt", schema = "shared")
public class MeteorologyPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "Meteorology", required = true)
    protected MeteorologyType meteorology;

    /**
     * Gets the value of the meteorology property.
     * 
     * @return
     *     possible object is
     *     {@link MeteorologyType }
     *     
     */
    @OneToOne(targetEntity = MeteorologyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "meteorology_id", referencedColumnName = "hjid")
    public MeteorologyType getMeteorology() {
        return meteorology;
    }

    /**
     * Sets the value of the meteorology property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteorologyType }
     *     
     */
    public void setMeteorology(MeteorologyType value) {
        this.meteorology = value;
    }

    @Transient
    public boolean isSetMeteorology() {
        return (this.meteorology!= null);
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
        final MeteorologyPropertyType that = ((MeteorologyPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetMeteorology();
            boolean rhsFieldIsSet = that.isSetMeteorology();
            MeteorologyType lhsField;
            lhsField = this.getMeteorology();
            MeteorologyType rhsField;
            rhsField = that.getMeteorology();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "meteorology", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "meteorology", rhsField);
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
            boolean theFieldIsSet = this.isSetMeteorology();
            MeteorologyType theField;
            theField = this.getMeteorology();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "meteorology", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMeteorology();
            MeteorologyType theField;
            theField = this.getMeteorology();
            strategy.appendField(locator, this, "meteorology", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
