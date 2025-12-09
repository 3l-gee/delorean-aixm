
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
 * Identifiable collection of data
 * 
 * <p>Java class for DS_DataSet_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DS_DataSet_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="has" type="{http://www.isotc211.org/2005/gmd}MD_Metadata_PropertyType" maxOccurs="unbounded"/>
 *         <element name="partOf" type="{http://www.isotc211.org/2005/gmd}DS_Aggregate_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DS_DataSet_Type", propOrder = {
    "has",
    "partOf"
})
public class DSDataSetType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected List<MDMetadataPropertyType> has;
    protected List<DSAggregatePropertyType> partOf;

    /**
     * Gets the value of the has property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the has property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMetadataPropertyType }
     * 
     * 
     */
    public List<MDMetadataPropertyType> getHas() {
        if (has == null) {
            has = new ArrayList<>();
        }
        return this.has;
    }

    /**
     * 
     * 
     */
    public void setHas(List<MDMetadataPropertyType> has) {
        this.has = has;
    }

    public boolean isSetHas() {
        return ((this.has!= null)&&(!this.has.isEmpty()));
    }

    public void unsetHas() {
        this.has = null;
    }

    /**
     * Gets the value of the partOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAggregatePropertyType }
     * 
     * 
     */
    public List<DSAggregatePropertyType> getPartOf() {
        if (partOf == null) {
            partOf = new ArrayList<>();
        }
        return this.partOf;
    }

    /**
     * 
     * 
     */
    public void setPartOf(List<DSAggregatePropertyType> partOf) {
        this.partOf = partOf;
    }

    public boolean isSetPartOf() {
        return ((this.partOf!= null)&&(!this.partOf.isEmpty()));
    }

    public void unsetPartOf() {
        this.partOf = null;
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
        final DSDataSetType that = ((DSDataSetType) object);
        {
            boolean lhsFieldIsSet = this.isSetHas();
            boolean rhsFieldIsSet = that.isSetHas();
            List<MDMetadataPropertyType> lhsField;
            lhsField = (this.isSetHas()?this.getHas():null);
            List<MDMetadataPropertyType> rhsField;
            rhsField = (that.isSetHas()?that.getHas():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "has", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "has", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPartOf();
            boolean rhsFieldIsSet = that.isSetPartOf();
            List<DSAggregatePropertyType> lhsField;
            lhsField = (this.isSetPartOf()?this.getPartOf():null);
            List<DSAggregatePropertyType> rhsField;
            rhsField = (that.isSetPartOf()?that.getPartOf():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "partOf", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "partOf", rhsField);
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
            boolean theFieldIsSet = this.isSetHas();
            List<MDMetadataPropertyType> theField;
            theField = (this.isSetHas()?this.getHas():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "has", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPartOf();
            List<DSAggregatePropertyType> theField;
            theField = (this.isSetPartOf()?this.getPartOf():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "partOf", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetHas();
            List<MDMetadataPropertyType> theField;
            theField = (this.isSetHas()?this.getHas():null);
            strategy.appendField(locator, this, "has", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPartOf();
            List<DSAggregatePropertyType> theField;
            theField = (this.isSetPartOf()?this.getPartOf():null);
            strategy.appendField(locator, this, "partOf", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
