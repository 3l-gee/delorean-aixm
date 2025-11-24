
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Information about the distributor of and options for obtaining the dataset
 * 
 * <p>Java class for MD_Distribution_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Distribution_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="distributionFormat" type="{http://www.isotc211.org/2005/gmd}MD_Format_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="distributor" type="{http://www.isotc211.org/2005/gmd}MD_Distributor_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="transferOptions" type="{http://www.isotc211.org/2005/gmd}MD_DigitalTransferOptions_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Distribution_Type", propOrder = {
    "distributionFormat",
    "distributor",
    "transferOptions"
})
public class MDDistributionType
    extends AbstractObjectType
{

    protected List<MDFormatPropertyType> distributionFormat;
    protected List<MDDistributorPropertyType> distributor;
    protected List<MDDigitalTransferOptionsPropertyType> transferOptions;

    /**
     * Gets the value of the distributionFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDFormatPropertyType }
     * 
     * 
     */
    public List<MDFormatPropertyType> getDistributionFormat() {
        if (distributionFormat == null) {
            distributionFormat = new ArrayList<>();
        }
        return this.distributionFormat;
    }

    /**
     * 
     * 
     */
    public void setDistributionFormat(List<MDFormatPropertyType> distributionFormat) {
        this.distributionFormat = distributionFormat;
    }

    /**
     * Gets the value of the distributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDistributorPropertyType }
     * 
     * 
     */
    public List<MDDistributorPropertyType> getDistributor() {
        if (distributor == null) {
            distributor = new ArrayList<>();
        }
        return this.distributor;
    }

    /**
     * 
     * 
     */
    public void setDistributor(List<MDDistributorPropertyType> distributor) {
        this.distributor = distributor;
    }

    /**
     * Gets the value of the transferOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDigitalTransferOptionsPropertyType }
     * 
     * 
     */
    public List<MDDigitalTransferOptionsPropertyType> getTransferOptions() {
        if (transferOptions == null) {
            transferOptions = new ArrayList<>();
        }
        return this.transferOptions;
    }

    /**
     * 
     * 
     */
    public void setTransferOptions(List<MDDigitalTransferOptionsPropertyType> transferOptions) {
        this.transferOptions = transferOptions;
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
        final MDDistributionType that = ((MDDistributionType) object);
        {
            boolean lhsFieldIsSet = ((this.distributor!= null)&&(!this.distributor.isEmpty()));
            boolean rhsFieldIsSet = ((that.distributor!= null)&&(!that.distributor.isEmpty()));
            List<MDDistributorPropertyType> lhsField;
            lhsField = (((this.distributor!= null)&&(!this.distributor.isEmpty()))?this.getDistributor():null);
            List<MDDistributorPropertyType> rhsField;
            rhsField = (((that.distributor!= null)&&(!that.distributor.isEmpty()))?that.getDistributor():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distributor", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distributor", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.transferOptions!= null)&&(!this.transferOptions.isEmpty()));
            boolean rhsFieldIsSet = ((that.transferOptions!= null)&&(!that.transferOptions.isEmpty()));
            List<MDDigitalTransferOptionsPropertyType> lhsField;
            lhsField = (((this.transferOptions!= null)&&(!this.transferOptions.isEmpty()))?this.getTransferOptions():null);
            List<MDDigitalTransferOptionsPropertyType> rhsField;
            rhsField = (((that.transferOptions!= null)&&(!that.transferOptions.isEmpty()))?that.getTransferOptions():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "transferOptions", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "transferOptions", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.distributionFormat!= null)&&(!this.distributionFormat.isEmpty()));
            boolean rhsFieldIsSet = ((that.distributionFormat!= null)&&(!that.distributionFormat.isEmpty()));
            List<MDFormatPropertyType> lhsField;
            lhsField = (((this.distributionFormat!= null)&&(!this.distributionFormat.isEmpty()))?this.getDistributionFormat():null);
            List<MDFormatPropertyType> rhsField;
            rhsField = (((that.distributionFormat!= null)&&(!that.distributionFormat.isEmpty()))?that.getDistributionFormat():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distributionFormat", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distributionFormat", rhsField);
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
            boolean theFieldIsSet = ((this.distributionFormat!= null)&&(!this.distributionFormat.isEmpty()));
            List<MDFormatPropertyType> theField;
            theField = (((this.distributionFormat!= null)&&(!this.distributionFormat.isEmpty()))?this.getDistributionFormat():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distributionFormat", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.distributor!= null)&&(!this.distributor.isEmpty()));
            List<MDDistributorPropertyType> theField;
            theField = (((this.distributor!= null)&&(!this.distributor.isEmpty()))?this.getDistributor():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distributor", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.transferOptions!= null)&&(!this.transferOptions.isEmpty()));
            List<MDDigitalTransferOptionsPropertyType> theField;
            theField = (((this.transferOptions!= null)&&(!this.transferOptions.isEmpty()))?this.getTransferOptions():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "transferOptions", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = ((this.distributionFormat!= null)&&(!this.distributionFormat.isEmpty()));
            List<MDFormatPropertyType> theField;
            theField = (((this.distributionFormat!= null)&&(!this.distributionFormat.isEmpty()))?this.getDistributionFormat():null);
            strategy.appendField(locator, this, "distributionFormat", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.distributor!= null)&&(!this.distributor.isEmpty()));
            List<MDDistributorPropertyType> theField;
            theField = (((this.distributor!= null)&&(!this.distributor.isEmpty()))?this.getDistributor():null);
            strategy.appendField(locator, this, "distributor", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.transferOptions!= null)&&(!this.transferOptions.isEmpty()));
            List<MDDigitalTransferOptionsPropertyType> theField;
            theField = (((this.transferOptions!= null)&&(!this.transferOptions.isEmpty()))?this.getTransferOptions():null);
            strategy.appendField(locator, this, "transferOptions", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
