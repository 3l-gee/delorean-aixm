
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Identifiable collection of datasets
 * 
 * <p>Java class for AbstractDS_Aggregate_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractDS_Aggregate_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="composedOf" type="{http://www.isotc211.org/2005/gmd}DS_DataSet_PropertyType" maxOccurs="unbounded"/>
 *         <element name="seriesMetadata" type="{http://www.isotc211.org/2005/gmd}MD_Metadata_PropertyType" maxOccurs="unbounded"/>
 *         <element name="subset" type="{http://www.isotc211.org/2005/gmd}DS_Aggregate_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="superset" type="{http://www.isotc211.org/2005/gmd}DS_Aggregate_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDS_Aggregate_Type", propOrder = {
    "composedOf",
    "seriesMetadata",
    "subset",
    "superset"
})
@XmlSeeAlso({
    DSInitiativeType.class,
    DSSeriesType.class,
    DSOtherAggregateType.class
})
public abstract class AbstractDSAggregateType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected List<DSDataSetPropertyType> composedOf;
    @XmlElement(required = true)
    protected List<MDMetadataPropertyType> seriesMetadata;
    protected List<DSAggregatePropertyType> subset;
    protected List<DSAggregatePropertyType> superset;

    /**
     * Gets the value of the composedOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the composedOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComposedOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSDataSetPropertyType }
     * 
     * 
     */
    public List<DSDataSetPropertyType> getComposedOf() {
        if (composedOf == null) {
            composedOf = new ArrayList<>();
        }
        return this.composedOf;
    }

    /**
     * 
     * 
     */
    public void setComposedOf(List<DSDataSetPropertyType> composedOf) {
        this.composedOf = composedOf;
    }

    public boolean isSetComposedOf() {
        return ((this.composedOf!= null)&&(!this.composedOf.isEmpty()));
    }

    public void unsetComposedOf() {
        this.composedOf = null;
    }

    /**
     * Gets the value of the seriesMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seriesMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeriesMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMetadataPropertyType }
     * 
     * 
     */
    public List<MDMetadataPropertyType> getSeriesMetadata() {
        if (seriesMetadata == null) {
            seriesMetadata = new ArrayList<>();
        }
        return this.seriesMetadata;
    }

    /**
     * 
     * 
     */
    public void setSeriesMetadata(List<MDMetadataPropertyType> seriesMetadata) {
        this.seriesMetadata = seriesMetadata;
    }

    public boolean isSetSeriesMetadata() {
        return ((this.seriesMetadata!= null)&&(!this.seriesMetadata.isEmpty()));
    }

    public void unsetSeriesMetadata() {
        this.seriesMetadata = null;
    }

    /**
     * Gets the value of the subset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAggregatePropertyType }
     * 
     * 
     */
    public List<DSAggregatePropertyType> getSubset() {
        if (subset == null) {
            subset = new ArrayList<>();
        }
        return this.subset;
    }

    /**
     * 
     * 
     */
    public void setSubset(List<DSAggregatePropertyType> subset) {
        this.subset = subset;
    }

    public boolean isSetSubset() {
        return ((this.subset!= null)&&(!this.subset.isEmpty()));
    }

    public void unsetSubset() {
        this.subset = null;
    }

    /**
     * Gets the value of the superset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAggregatePropertyType }
     * 
     * 
     */
    public List<DSAggregatePropertyType> getSuperset() {
        if (superset == null) {
            superset = new ArrayList<>();
        }
        return this.superset;
    }

    /**
     * 
     * 
     */
    public void setSuperset(List<DSAggregatePropertyType> superset) {
        this.superset = superset;
    }

    public boolean isSetSuperset() {
        return ((this.superset!= null)&&(!this.superset.isEmpty()));
    }

    public void unsetSuperset() {
        this.superset = null;
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
        final AbstractDSAggregateType that = ((AbstractDSAggregateType) object);
        {
            boolean lhsFieldIsSet = this.isSetSubset();
            boolean rhsFieldIsSet = that.isSetSubset();
            List<DSAggregatePropertyType> lhsField;
            lhsField = (this.isSetSubset()?this.getSubset():null);
            List<DSAggregatePropertyType> rhsField;
            rhsField = (that.isSetSubset()?that.getSubset():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "subset", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "subset", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSeriesMetadata();
            boolean rhsFieldIsSet = that.isSetSeriesMetadata();
            List<MDMetadataPropertyType> lhsField;
            lhsField = (this.isSetSeriesMetadata()?this.getSeriesMetadata():null);
            List<MDMetadataPropertyType> rhsField;
            rhsField = (that.isSetSeriesMetadata()?that.getSeriesMetadata():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "seriesMetadata", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "seriesMetadata", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSuperset();
            boolean rhsFieldIsSet = that.isSetSuperset();
            List<DSAggregatePropertyType> lhsField;
            lhsField = (this.isSetSuperset()?this.getSuperset():null);
            List<DSAggregatePropertyType> rhsField;
            rhsField = (that.isSetSuperset()?that.getSuperset():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "superset", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "superset", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetComposedOf();
            boolean rhsFieldIsSet = that.isSetComposedOf();
            List<DSDataSetPropertyType> lhsField;
            lhsField = (this.isSetComposedOf()?this.getComposedOf():null);
            List<DSDataSetPropertyType> rhsField;
            rhsField = (that.isSetComposedOf()?that.getComposedOf():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "composedOf", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "composedOf", rhsField);
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
            boolean theFieldIsSet = this.isSetComposedOf();
            List<DSDataSetPropertyType> theField;
            theField = (this.isSetComposedOf()?this.getComposedOf():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "composedOf", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSeriesMetadata();
            List<MDMetadataPropertyType> theField;
            theField = (this.isSetSeriesMetadata()?this.getSeriesMetadata():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "seriesMetadata", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSubset();
            List<DSAggregatePropertyType> theField;
            theField = (this.isSetSubset()?this.getSubset():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "subset", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSuperset();
            List<DSAggregatePropertyType> theField;
            theField = (this.isSetSuperset()?this.getSuperset():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "superset", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetComposedOf();
            List<DSDataSetPropertyType> theField;
            theField = (this.isSetComposedOf()?this.getComposedOf():null);
            strategy.appendField(locator, this, "composedOf", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSeriesMetadata();
            List<MDMetadataPropertyType> theField;
            theField = (this.isSetSeriesMetadata()?this.getSeriesMetadata():null);
            strategy.appendField(locator, this, "seriesMetadata", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSubset();
            List<DSAggregatePropertyType> theField;
            theField = (this.isSetSubset()?this.getSubset():null);
            strategy.appendField(locator, this, "subset", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSuperset();
            List<DSAggregatePropertyType> theField;
            theField = (this.isSetSuperset()?this.getSuperset():null);
            strategy.appendField(locator, this, "superset", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
