
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
 * <p>Java class for SectorDesignPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SectorDesignPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}SectorDesign"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectorDesignPropertyType", propOrder = {
    "sectorDesign"
})
@Entity(name = "SectorDesignPropertyType")
@Table(name = "sectordesign_pt", schema = "procedure")
public class SectorDesignPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "SectorDesign", required = true)
    protected SectorDesignType sectorDesign;

    /**
     * Gets the value of the sectorDesign property.
     * 
     * @return
     *     possible object is
     *     {@link SectorDesignType }
     *     
     */
    @OneToOne(targetEntity = SectorDesignType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "sectordesign_id", referencedColumnName = "hjid")
    public SectorDesignType getSectorDesign() {
        return sectorDesign;
    }

    /**
     * Sets the value of the sectorDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorDesignType }
     *     
     */
    public void setSectorDesign(SectorDesignType value) {
        this.sectorDesign = value;
    }

    @Transient
    public boolean isSetSectorDesign() {
        return (this.sectorDesign!= null);
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
        final SectorDesignPropertyType that = ((SectorDesignPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetSectorDesign();
            boolean rhsFieldIsSet = that.isSetSectorDesign();
            SectorDesignType lhsField;
            lhsField = this.getSectorDesign();
            SectorDesignType rhsField;
            rhsField = that.getSectorDesign();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sectorDesign", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sectorDesign", rhsField);
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
            boolean theFieldIsSet = this.isSetSectorDesign();
            SectorDesignType theField;
            theField = this.getSectorDesign();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sectorDesign", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSectorDesign();
            SectorDesignType theField;
            theField = this.getSectorDesign();
            strategy.appendField(locator, this, "sectorDesign", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
