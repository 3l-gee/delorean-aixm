
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
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
 * Information about the distributor
 * 
 * <p>Java class for MD_Distributor_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Distributor_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="distributorContact" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType"/>
 *         <element name="distributionOrderProcess" type="{http://www.isotc211.org/2005/gmd}MD_StandardOrderProcess_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="distributorFormat" type="{http://www.isotc211.org/2005/gmd}MD_Format_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="distributorTransferOptions" type="{http://www.isotc211.org/2005/gmd}MD_DigitalTransferOptions_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Distributor_Type", propOrder = {
    "distributorContact",
    "distributionOrderProcess",
    "distributorFormat",
    "distributorTransferOptions"
})
public class MDDistributorType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected CIResponsiblePartyPropertyType distributorContact;
    protected List<MDStandardOrderProcessPropertyType> distributionOrderProcess;
    protected List<MDFormatPropertyType> distributorFormat;
    protected List<MDDigitalTransferOptionsPropertyType> distributorTransferOptions;

    /**
     * Gets the value of the distributorContact property.
     * 
     * @return
     *     possible object is
     *     {@link CIResponsiblePartyPropertyType }
     *     
     */
    public CIResponsiblePartyPropertyType getDistributorContact() {
        return distributorContact;
    }

    /**
     * Sets the value of the distributorContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIResponsiblePartyPropertyType }
     *     
     */
    public void setDistributorContact(CIResponsiblePartyPropertyType value) {
        this.distributorContact = value;
    }

    public boolean isSetDistributorContact() {
        return (this.distributorContact!= null);
    }

    /**
     * Gets the value of the distributionOrderProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionOrderProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionOrderProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDStandardOrderProcessPropertyType }
     * 
     * 
     */
    public List<MDStandardOrderProcessPropertyType> getDistributionOrderProcess() {
        if (distributionOrderProcess == null) {
            distributionOrderProcess = new ArrayList<>();
        }
        return this.distributionOrderProcess;
    }

    /**
     * 
     * 
     */
    public void setDistributionOrderProcess(List<MDStandardOrderProcessPropertyType> distributionOrderProcess) {
        this.distributionOrderProcess = distributionOrderProcess;
    }

    public boolean isSetDistributionOrderProcess() {
        return ((this.distributionOrderProcess!= null)&&(!this.distributionOrderProcess.isEmpty()));
    }

    public void unsetDistributionOrderProcess() {
        this.distributionOrderProcess = null;
    }

    /**
     * Gets the value of the distributorFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributorFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributorFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDFormatPropertyType }
     * 
     * 
     */
    public List<MDFormatPropertyType> getDistributorFormat() {
        if (distributorFormat == null) {
            distributorFormat = new ArrayList<>();
        }
        return this.distributorFormat;
    }

    /**
     * 
     * 
     */
    public void setDistributorFormat(List<MDFormatPropertyType> distributorFormat) {
        this.distributorFormat = distributorFormat;
    }

    public boolean isSetDistributorFormat() {
        return ((this.distributorFormat!= null)&&(!this.distributorFormat.isEmpty()));
    }

    public void unsetDistributorFormat() {
        this.distributorFormat = null;
    }

    /**
     * Gets the value of the distributorTransferOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributorTransferOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributorTransferOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDigitalTransferOptionsPropertyType }
     * 
     * 
     */
    public List<MDDigitalTransferOptionsPropertyType> getDistributorTransferOptions() {
        if (distributorTransferOptions == null) {
            distributorTransferOptions = new ArrayList<>();
        }
        return this.distributorTransferOptions;
    }

    /**
     * 
     * 
     */
    public void setDistributorTransferOptions(List<MDDigitalTransferOptionsPropertyType> distributorTransferOptions) {
        this.distributorTransferOptions = distributorTransferOptions;
    }

    public boolean isSetDistributorTransferOptions() {
        return ((this.distributorTransferOptions!= null)&&(!this.distributorTransferOptions.isEmpty()));
    }

    public void unsetDistributorTransferOptions() {
        this.distributorTransferOptions = null;
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
        final MDDistributorType that = ((MDDistributorType) object);
        {
            boolean lhsFieldIsSet = this.isSetDistributionOrderProcess();
            boolean rhsFieldIsSet = that.isSetDistributionOrderProcess();
            List<MDStandardOrderProcessPropertyType> lhsField;
            lhsField = (this.isSetDistributionOrderProcess()?this.getDistributionOrderProcess():null);
            List<MDStandardOrderProcessPropertyType> rhsField;
            rhsField = (that.isSetDistributionOrderProcess()?that.getDistributionOrderProcess():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distributionOrderProcess", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distributionOrderProcess", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDistributorTransferOptions();
            boolean rhsFieldIsSet = that.isSetDistributorTransferOptions();
            List<MDDigitalTransferOptionsPropertyType> lhsField;
            lhsField = (this.isSetDistributorTransferOptions()?this.getDistributorTransferOptions():null);
            List<MDDigitalTransferOptionsPropertyType> rhsField;
            rhsField = (that.isSetDistributorTransferOptions()?that.getDistributorTransferOptions():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distributorTransferOptions", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distributorTransferOptions", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDistributorContact();
            boolean rhsFieldIsSet = that.isSetDistributorContact();
            CIResponsiblePartyPropertyType lhsField;
            lhsField = this.getDistributorContact();
            CIResponsiblePartyPropertyType rhsField;
            rhsField = that.getDistributorContact();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distributorContact", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distributorContact", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDistributorFormat();
            boolean rhsFieldIsSet = that.isSetDistributorFormat();
            List<MDFormatPropertyType> lhsField;
            lhsField = (this.isSetDistributorFormat()?this.getDistributorFormat():null);
            List<MDFormatPropertyType> rhsField;
            rhsField = (that.isSetDistributorFormat()?that.getDistributorFormat():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distributorFormat", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distributorFormat", rhsField);
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
            boolean theFieldIsSet = this.isSetDistributorContact();
            CIResponsiblePartyPropertyType theField;
            theField = this.getDistributorContact();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distributorContact", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistributionOrderProcess();
            List<MDStandardOrderProcessPropertyType> theField;
            theField = (this.isSetDistributionOrderProcess()?this.getDistributionOrderProcess():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distributionOrderProcess", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistributorFormat();
            List<MDFormatPropertyType> theField;
            theField = (this.isSetDistributorFormat()?this.getDistributorFormat():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distributorFormat", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistributorTransferOptions();
            List<MDDigitalTransferOptionsPropertyType> theField;
            theField = (this.isSetDistributorTransferOptions()?this.getDistributorTransferOptions():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distributorTransferOptions", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDistributorContact();
            CIResponsiblePartyPropertyType theField;
            theField = this.getDistributorContact();
            strategy.appendField(locator, this, "distributorContact", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistributionOrderProcess();
            List<MDStandardOrderProcessPropertyType> theField;
            theField = (this.isSetDistributionOrderProcess()?this.getDistributionOrderProcess():null);
            strategy.appendField(locator, this, "distributionOrderProcess", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistributorFormat();
            List<MDFormatPropertyType> theField;
            theField = (this.isSetDistributorFormat()?this.getDistributorFormat():null);
            strategy.appendField(locator, this, "distributorFormat", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistributorTransferOptions();
            List<MDDigitalTransferOptionsPropertyType> theField;
            theField = (this.isSetDistributorTransferOptions()?this.getDistributorTransferOptions():null);
            strategy.appendField(locator, this, "distributorTransferOptions", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
