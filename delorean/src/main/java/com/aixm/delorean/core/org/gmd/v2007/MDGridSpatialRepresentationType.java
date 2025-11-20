
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.BooleanPropertyType;
import com.aixm.delorean.core.org.gco.v2007.IntegerPropertyType;
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
 * Types and numbers of raster spatial objects in the dataset
 * 
 * <p>Java class for MD_GridSpatialRepresentation_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_GridSpatialRepresentation_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_SpatialRepresentation_Type">
 *       <sequence>
 *         <element name="numberOfDimensions" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType"/>
 *         <element name="axisDimensionProperties" type="{http://www.isotc211.org/2005/gmd}MD_Dimension_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="cellGeometry" type="{http://www.isotc211.org/2005/gmd}MD_CellGeometryCode_PropertyType"/>
 *         <element name="transformationParameterAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_GridSpatialRepresentation_Type", propOrder = {
    "numberOfDimensions",
    "axisDimensionProperties",
    "cellGeometry",
    "transformationParameterAvailability"
})
@XmlSeeAlso({
    MDGeoreferenceableType.class,
    MDGeorectifiedType.class
})
public class MDGridSpatialRepresentationType
    extends AbstractMDSpatialRepresentationType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected IntegerPropertyType numberOfDimensions;
    protected List<MDDimensionPropertyType> axisDimensionProperties;
    @XmlElement(required = true)
    protected MDCellGeometryCodePropertyType cellGeometry;
    @XmlElement(required = true)
    protected BooleanPropertyType transformationParameterAvailability;

    /**
     * Gets the value of the numberOfDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getNumberOfDimensions() {
        return numberOfDimensions;
    }

    /**
     * Sets the value of the numberOfDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setNumberOfDimensions(IntegerPropertyType value) {
        this.numberOfDimensions = value;
    }

    public boolean isSetNumberOfDimensions() {
        return (this.numberOfDimensions!= null);
    }

    /**
     * Gets the value of the axisDimensionProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisDimensionProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisDimensionProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDimensionPropertyType }
     * 
     * 
     */
    public List<MDDimensionPropertyType> getAxisDimensionProperties() {
        if (axisDimensionProperties == null) {
            axisDimensionProperties = new ArrayList<>();
        }
        return this.axisDimensionProperties;
    }

    /**
     * 
     * 
     */
    public void setAxisDimensionProperties(List<MDDimensionPropertyType> axisDimensionProperties) {
        this.axisDimensionProperties = axisDimensionProperties;
    }

    public boolean isSetAxisDimensionProperties() {
        return ((this.axisDimensionProperties!= null)&&(!this.axisDimensionProperties.isEmpty()));
    }

    public void unsetAxisDimensionProperties() {
        this.axisDimensionProperties = null;
    }

    /**
     * Gets the value of the cellGeometry property.
     * 
     * @return
     *     possible object is
     *     {@link MDCellGeometryCodePropertyType }
     *     
     */
    public MDCellGeometryCodePropertyType getCellGeometry() {
        return cellGeometry;
    }

    /**
     * Sets the value of the cellGeometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCellGeometryCodePropertyType }
     *     
     */
    public void setCellGeometry(MDCellGeometryCodePropertyType value) {
        this.cellGeometry = value;
    }

    public boolean isSetCellGeometry() {
        return (this.cellGeometry!= null);
    }

    /**
     * Gets the value of the transformationParameterAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getTransformationParameterAvailability() {
        return transformationParameterAvailability;
    }

    /**
     * Sets the value of the transformationParameterAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setTransformationParameterAvailability(BooleanPropertyType value) {
        this.transformationParameterAvailability = value;
    }

    public boolean isSetTransformationParameterAvailability() {
        return (this.transformationParameterAvailability!= null);
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
        final MDGridSpatialRepresentationType that = ((MDGridSpatialRepresentationType) object);
        {
            boolean lhsFieldIsSet = this.isSetAxisDimensionProperties();
            boolean rhsFieldIsSet = that.isSetAxisDimensionProperties();
            List<MDDimensionPropertyType> lhsField;
            lhsField = (this.isSetAxisDimensionProperties()?this.getAxisDimensionProperties():null);
            List<MDDimensionPropertyType> rhsField;
            rhsField = (that.isSetAxisDimensionProperties()?that.getAxisDimensionProperties():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "axisDimensionProperties", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "axisDimensionProperties", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTransformationParameterAvailability();
            boolean rhsFieldIsSet = that.isSetTransformationParameterAvailability();
            BooleanPropertyType lhsField;
            lhsField = this.getTransformationParameterAvailability();
            BooleanPropertyType rhsField;
            rhsField = that.getTransformationParameterAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "transformationParameterAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "transformationParameterAvailability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNumberOfDimensions();
            boolean rhsFieldIsSet = that.isSetNumberOfDimensions();
            IntegerPropertyType lhsField;
            lhsField = this.getNumberOfDimensions();
            IntegerPropertyType rhsField;
            rhsField = that.getNumberOfDimensions();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "numberOfDimensions", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "numberOfDimensions", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCellGeometry();
            boolean rhsFieldIsSet = that.isSetCellGeometry();
            MDCellGeometryCodePropertyType lhsField;
            lhsField = this.getCellGeometry();
            MDCellGeometryCodePropertyType rhsField;
            rhsField = that.getCellGeometry();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "cellGeometry", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "cellGeometry", rhsField);
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
            boolean theFieldIsSet = this.isSetNumberOfDimensions();
            IntegerPropertyType theField;
            theField = this.getNumberOfDimensions();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "numberOfDimensions", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAxisDimensionProperties();
            List<MDDimensionPropertyType> theField;
            theField = (this.isSetAxisDimensionProperties()?this.getAxisDimensionProperties():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "axisDimensionProperties", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCellGeometry();
            MDCellGeometryCodePropertyType theField;
            theField = this.getCellGeometry();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "cellGeometry", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransformationParameterAvailability();
            BooleanPropertyType theField;
            theField = this.getTransformationParameterAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "transformationParameterAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetNumberOfDimensions();
            IntegerPropertyType theField;
            theField = this.getNumberOfDimensions();
            strategy.appendField(locator, this, "numberOfDimensions", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAxisDimensionProperties();
            List<MDDimensionPropertyType> theField;
            theField = (this.isSetAxisDimensionProperties()?this.getAxisDimensionProperties():null);
            strategy.appendField(locator, this, "axisDimensionProperties", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCellGeometry();
            MDCellGeometryCodePropertyType theField;
            theField = this.getCellGeometry();
            strategy.appendField(locator, this, "cellGeometry", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransformationParameterAvailability();
            BooleanPropertyType theField;
            theField = this.getTransformationParameterAvailability();
            strategy.appendField(locator, this, "transformationParameterAvailability", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
