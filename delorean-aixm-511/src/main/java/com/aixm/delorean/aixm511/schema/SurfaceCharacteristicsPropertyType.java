
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
 * <p>Java class for SurfaceCharacteristicsPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SurfaceCharacteristicsPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}SurfaceCharacteristics"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceCharacteristicsPropertyType", propOrder = {
    "surfaceCharacteristics"
})
@Entity(name = "SurfaceCharacteristicsPropertyType")
@Table(name = "surfacecharacteristics_pt", schema = "airport_heliport")
public class SurfaceCharacteristicsPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "SurfaceCharacteristics", required = true)
    protected SurfaceCharacteristicsType surfaceCharacteristics;

    /**
     * Gets the value of the surfaceCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceCharacteristicsType }
     *     
     */
    @OneToOne(targetEntity = SurfaceCharacteristicsType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "surfacecharacteristics_id", referencedColumnName = "hjid")
    public SurfaceCharacteristicsType getSurfaceCharacteristics() {
        return surfaceCharacteristics;
    }

    /**
     * Sets the value of the surfaceCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceCharacteristicsType }
     *     
     */
    public void setSurfaceCharacteristics(SurfaceCharacteristicsType value) {
        this.surfaceCharacteristics = value;
    }

    @Transient
    public boolean isSetSurfaceCharacteristics() {
        return (this.surfaceCharacteristics!= null);
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
        final SurfaceCharacteristicsPropertyType that = ((SurfaceCharacteristicsPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetSurfaceCharacteristics();
            boolean rhsFieldIsSet = that.isSetSurfaceCharacteristics();
            SurfaceCharacteristicsType lhsField;
            lhsField = this.getSurfaceCharacteristics();
            SurfaceCharacteristicsType rhsField;
            rhsField = that.getSurfaceCharacteristics();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surfaceCharacteristics", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surfaceCharacteristics", rhsField);
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
            boolean theFieldIsSet = this.isSetSurfaceCharacteristics();
            SurfaceCharacteristicsType theField;
            theField = this.getSurfaceCharacteristics();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surfaceCharacteristics", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSurfaceCharacteristics();
            SurfaceCharacteristicsType theField;
            theField = this.getSurfaceCharacteristics();
            strategy.appendField(locator, this, "surfaceCharacteristics", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
