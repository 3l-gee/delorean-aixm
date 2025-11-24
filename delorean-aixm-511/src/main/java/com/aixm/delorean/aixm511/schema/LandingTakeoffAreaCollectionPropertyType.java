
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
 * <p>Java class for LandingTakeoffAreaCollectionPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LandingTakeoffAreaCollectionPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}LandingTakeoffAreaCollection"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandingTakeoffAreaCollectionPropertyType", propOrder = {
    "landingTakeoffAreaCollection"
})
@Entity(name = "LandingTakeoffAreaCollectionPropertyType")
@Table(name = "landingtakeoffareacollection_pt", schema = "procedure")
public class LandingTakeoffAreaCollectionPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "LandingTakeoffAreaCollection", required = true)
    protected LandingTakeoffAreaCollectionType landingTakeoffAreaCollection;

    /**
     * Gets the value of the landingTakeoffAreaCollection property.
     * 
     * @return
     *     possible object is
     *     {@link LandingTakeoffAreaCollectionType }
     *     
     */
    @OneToOne(targetEntity = LandingTakeoffAreaCollectionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "landingtakeoffareacollection_id", referencedColumnName = "hjid")
    public LandingTakeoffAreaCollectionType getLandingTakeoffAreaCollection() {
        return landingTakeoffAreaCollection;
    }

    /**
     * Sets the value of the landingTakeoffAreaCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandingTakeoffAreaCollectionType }
     *     
     */
    public void setLandingTakeoffAreaCollection(LandingTakeoffAreaCollectionType value) {
        this.landingTakeoffAreaCollection = value;
    }

    @Transient
    public boolean isSetLandingTakeoffAreaCollection() {
        return (this.landingTakeoffAreaCollection!= null);
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
        final LandingTakeoffAreaCollectionPropertyType that = ((LandingTakeoffAreaCollectionPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetLandingTakeoffAreaCollection();
            boolean rhsFieldIsSet = that.isSetLandingTakeoffAreaCollection();
            LandingTakeoffAreaCollectionType lhsField;
            lhsField = this.getLandingTakeoffAreaCollection();
            LandingTakeoffAreaCollectionType rhsField;
            rhsField = that.getLandingTakeoffAreaCollection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "landingTakeoffAreaCollection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "landingTakeoffAreaCollection", rhsField);
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
            boolean theFieldIsSet = this.isSetLandingTakeoffAreaCollection();
            LandingTakeoffAreaCollectionType theField;
            theField = this.getLandingTakeoffAreaCollection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "landingTakeoffAreaCollection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetLandingTakeoffAreaCollection();
            LandingTakeoffAreaCollectionType theField;
            theField = this.getLandingTakeoffAreaCollection();
            strategy.appendField(locator, this, "landingTakeoffAreaCollection", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
