
package com.aixm.delorean.core.schema.a5_1_1.aixm;

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
 * <p>Java class for RunwayDeclaredDistancePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RunwayDeclaredDistancePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}RunwayDeclaredDistance"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwayDeclaredDistancePropertyType", propOrder = {
    "runwayDeclaredDistance"
})
@Entity(name = "RunwayDeclaredDistancePropertyType")
@Table(name = "runwaydeclareddistance_pt", schema = "airport_heliport")
public class RunwayDeclaredDistancePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "RunwayDeclaredDistance", required = true)
    protected RunwayDeclaredDistanceType runwayDeclaredDistance;

    /**
     * Gets the value of the runwayDeclaredDistance property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayDeclaredDistanceType }
     *     
     */
    @OneToOne(targetEntity = RunwayDeclaredDistanceType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "runwaydeclareddistance_id", referencedColumnName = "hjid")
    public RunwayDeclaredDistanceType getRunwayDeclaredDistance() {
        return runwayDeclaredDistance;
    }

    /**
     * Sets the value of the runwayDeclaredDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDeclaredDistanceType }
     *     
     */
    public void setRunwayDeclaredDistance(RunwayDeclaredDistanceType value) {
        this.runwayDeclaredDistance = value;
    }

    @Transient
    public boolean isSetRunwayDeclaredDistance() {
        return (this.runwayDeclaredDistance!= null);
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
        final RunwayDeclaredDistancePropertyType that = ((RunwayDeclaredDistancePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetRunwayDeclaredDistance();
            boolean rhsFieldIsSet = that.isSetRunwayDeclaredDistance();
            RunwayDeclaredDistanceType lhsField;
            lhsField = this.getRunwayDeclaredDistance();
            RunwayDeclaredDistanceType rhsField;
            rhsField = that.getRunwayDeclaredDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayDeclaredDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayDeclaredDistance", rhsField);
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
            boolean theFieldIsSet = this.isSetRunwayDeclaredDistance();
            RunwayDeclaredDistanceType theField;
            theField = this.getRunwayDeclaredDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayDeclaredDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetRunwayDeclaredDistance();
            RunwayDeclaredDistanceType theField;
            theField = this.getRunwayDeclaredDistance();
            strategy.appendField(locator, this, "runwayDeclaredDistance", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
