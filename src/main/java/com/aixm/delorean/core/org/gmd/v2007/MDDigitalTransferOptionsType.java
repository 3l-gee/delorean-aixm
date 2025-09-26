
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.RealPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Technical means and media by which a dataset is obtained from the distributor
 * 
 * <p>Java class for MD_DigitalTransferOptions_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_DigitalTransferOptions_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="unitsOfDistribution" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="transferSize" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         <element name="onLine" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="offLine" type="{http://www.isotc211.org/2005/gmd}MD_Medium_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_DigitalTransferOptions_Type", propOrder = {
    "unitsOfDistribution",
    "transferSize",
    "onLine",
    "offLine"
})
public class MDDigitalTransferOptionsType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected CharacterStringPropertyType unitsOfDistribution;
    protected RealPropertyType transferSize;
    protected List<CIOnlineResourcePropertyType> onLine;
    protected MDMediumPropertyType offLine;

    /**
     * Gets the value of the unitsOfDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getUnitsOfDistribution() {
        return unitsOfDistribution;
    }

    /**
     * Sets the value of the unitsOfDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setUnitsOfDistribution(CharacterStringPropertyType value) {
        this.unitsOfDistribution = value;
    }

    public boolean isSetUnitsOfDistribution() {
        return (this.unitsOfDistribution!= null);
    }

    /**
     * Gets the value of the transferSize property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getTransferSize() {
        return transferSize;
    }

    /**
     * Sets the value of the transferSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setTransferSize(RealPropertyType value) {
        this.transferSize = value;
    }

    public boolean isSetTransferSize() {
        return (this.transferSize!= null);
    }

    /**
     * Gets the value of the onLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIOnlineResourcePropertyType }
     * 
     * 
     */
    public List<CIOnlineResourcePropertyType> getOnLine() {
        if (onLine == null) {
            onLine = new ArrayList<>();
        }
        return this.onLine;
    }

    /**
     * 
     * 
     */
    public void setOnLine(List<CIOnlineResourcePropertyType> onLine) {
        this.onLine = onLine;
    }

    public boolean isSetOnLine() {
        return ((this.onLine!= null)&&(!this.onLine.isEmpty()));
    }

    public void unsetOnLine() {
        this.onLine = null;
    }

    /**
     * Gets the value of the offLine property.
     * 
     * @return
     *     possible object is
     *     {@link MDMediumPropertyType }
     *     
     */
    public MDMediumPropertyType getOffLine() {
        return offLine;
    }

    /**
     * Sets the value of the offLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMediumPropertyType }
     *     
     */
    public void setOffLine(MDMediumPropertyType value) {
        this.offLine = value;
    }

    public boolean isSetOffLine() {
        return (this.offLine!= null);
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
        final MDDigitalTransferOptionsType that = ((MDDigitalTransferOptionsType) object);
        {
            boolean lhsFieldIsSet = this.isSetOffLine();
            boolean rhsFieldIsSet = that.isSetOffLine();
            MDMediumPropertyType lhsField;
            lhsField = this.getOffLine();
            MDMediumPropertyType rhsField;
            rhsField = that.getOffLine();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "offLine", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "offLine", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOnLine();
            boolean rhsFieldIsSet = that.isSetOnLine();
            List<CIOnlineResourcePropertyType> lhsField;
            lhsField = (this.isSetOnLine()?this.getOnLine():null);
            List<CIOnlineResourcePropertyType> rhsField;
            rhsField = (that.isSetOnLine()?that.getOnLine():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "onLine", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "onLine", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTransferSize();
            boolean rhsFieldIsSet = that.isSetTransferSize();
            RealPropertyType lhsField;
            lhsField = this.getTransferSize();
            RealPropertyType rhsField;
            rhsField = that.getTransferSize();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "transferSize", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "transferSize", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUnitsOfDistribution();
            boolean rhsFieldIsSet = that.isSetUnitsOfDistribution();
            CharacterStringPropertyType lhsField;
            lhsField = this.getUnitsOfDistribution();
            CharacterStringPropertyType rhsField;
            rhsField = that.getUnitsOfDistribution();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "unitsOfDistribution", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "unitsOfDistribution", rhsField);
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
            boolean theFieldIsSet = this.isSetUnitsOfDistribution();
            CharacterStringPropertyType theField;
            theField = this.getUnitsOfDistribution();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "unitsOfDistribution", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransferSize();
            RealPropertyType theField;
            theField = this.getTransferSize();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "transferSize", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOnLine();
            List<CIOnlineResourcePropertyType> theField;
            theField = (this.isSetOnLine()?this.getOnLine():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "onLine", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOffLine();
            MDMediumPropertyType theField;
            theField = this.getOffLine();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "offLine", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetUnitsOfDistribution();
            CharacterStringPropertyType theField;
            theField = this.getUnitsOfDistribution();
            strategy.appendField(locator, this, "unitsOfDistribution", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransferSize();
            RealPropertyType theField;
            theField = this.getTransferSize();
            strategy.appendField(locator, this, "transferSize", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOnLine();
            List<CIOnlineResourcePropertyType> theField;
            theField = (this.isSetOnLine()?this.getOnLine():null);
            strategy.appendField(locator, this, "onLine", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOffLine();
            MDMediumPropertyType theField;
            theField = this.getOffLine();
            strategy.appendField(locator, this, "offLine", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
