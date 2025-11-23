
package com.aixm.delorean.core.org.gml.v_3_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for GridType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GridType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGeometryType">
 *       <sequence>
 *         <element name="limits" type="{http://www.opengis.net/gml/3.2}GridLimitsType"/>
 *         <choice>
 *           <element name="axisLabels" type="{http://www.opengis.net/gml/3.2}NCNameList"/>
 *           <element name="axisName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="dimension" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridType", propOrder = {
    "limits",
    "gridAxisLabels",
    "axisName"
})
@XmlSeeAlso({
    RectifiedGridType.class
})
public class GridType
    extends AbstractGeometryType
{

    @XmlElement(required = true)
    protected GridLimitsType limits;
    @XmlList
    @XmlElement(name = "axisLabels")
    protected List<String> gridAxisLabels;
    protected List<String> axisName;
    @XmlAttribute(name = "dimension", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dimension;

    /**
     * Gets the value of the limits property.
     * 
     * @return
     *     possible object is
     *     {@link GridLimitsType }
     *     
     */
    public GridLimitsType getLimits() {
        return limits;
    }

    /**
     * Sets the value of the limits property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridLimitsType }
     *     
     */
    public void setLimits(GridLimitsType value) {
        this.limits = value;
    }

    /**
     * Gets the value of the gridAxisLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gridAxisLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGridAxisLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGridAxisLabels() {
        if (gridAxisLabels == null) {
            gridAxisLabels = new ArrayList<>();
        }
        return this.gridAxisLabels;
    }

    /**
     * 
     * 
     */
    public void setGridAxisLabels(List<String> gridAxisLabels) {
        this.gridAxisLabels = gridAxisLabels;
    }

    /**
     * Gets the value of the axisName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAxisName() {
        if (axisName == null) {
            axisName = new ArrayList<>();
        }
        return this.axisName;
    }

    /**
     * 
     * 
     */
    public void setAxisName(List<String> axisName) {
        this.axisName = axisName;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDimension() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDimension(BigInteger value) {
        this.dimension = value;
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
        final GridType that = ((GridType) object);
        {
            boolean lhsFieldIsSet = (this.limits!= null);
            boolean rhsFieldIsSet = (that.limits!= null);
            GridLimitsType lhsField;
            lhsField = this.getLimits();
            GridLimitsType rhsField;
            rhsField = that.getLimits();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "limits", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "limits", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.axisName!= null)&&(!this.axisName.isEmpty()));
            boolean rhsFieldIsSet = ((that.axisName!= null)&&(!that.axisName.isEmpty()));
            List<String> lhsField;
            lhsField = (((this.axisName!= null)&&(!this.axisName.isEmpty()))?this.getAxisName():null);
            List<String> rhsField;
            rhsField = (((that.axisName!= null)&&(!that.axisName.isEmpty()))?that.getAxisName():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "axisName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "axisName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.dimension!= null);
            boolean rhsFieldIsSet = (that.dimension!= null);
            BigInteger lhsField;
            lhsField = this.getDimension();
            BigInteger rhsField;
            rhsField = that.getDimension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dimension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dimension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.gridAxisLabels!= null)&&(!this.gridAxisLabels.isEmpty()));
            boolean rhsFieldIsSet = ((that.gridAxisLabels!= null)&&(!that.gridAxisLabels.isEmpty()));
            List<String> lhsField;
            lhsField = (((this.gridAxisLabels!= null)&&(!this.gridAxisLabels.isEmpty()))?this.getGridAxisLabels():null);
            List<String> rhsField;
            rhsField = (((that.gridAxisLabels!= null)&&(!that.gridAxisLabels.isEmpty()))?that.getGridAxisLabels():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "gridAxisLabels", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "gridAxisLabels", rhsField);
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
            boolean theFieldIsSet = (this.limits!= null);
            GridLimitsType theField;
            theField = this.getLimits();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "limits", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.gridAxisLabels!= null)&&(!this.gridAxisLabels.isEmpty()));
            List<String> theField;
            theField = (((this.gridAxisLabels!= null)&&(!this.gridAxisLabels.isEmpty()))?this.getGridAxisLabels():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "gridAxisLabels", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.axisName!= null)&&(!this.axisName.isEmpty()));
            List<String> theField;
            theField = (((this.axisName!= null)&&(!this.axisName.isEmpty()))?this.getAxisName():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "axisName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dimension!= null);
            BigInteger theField;
            theField = this.getDimension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dimension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.limits!= null);
            GridLimitsType theField;
            theField = this.getLimits();
            strategy.appendField(locator, this, "limits", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.gridAxisLabels!= null)&&(!this.gridAxisLabels.isEmpty()));
            List<String> theField;
            theField = (((this.gridAxisLabels!= null)&&(!this.gridAxisLabels.isEmpty()))?this.getGridAxisLabels():null);
            strategy.appendField(locator, this, "gridAxisLabels", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.axisName!= null)&&(!this.axisName.isEmpty()));
            List<String> theField;
            theField = (((this.axisName!= null)&&(!this.axisName.isEmpty()))?this.getAxisName():null);
            strategy.appendField(locator, this, "axisName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dimension!= null);
            BigInteger theField;
            theField = this.getDimension();
            strategy.appendField(locator, this, "dimension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
