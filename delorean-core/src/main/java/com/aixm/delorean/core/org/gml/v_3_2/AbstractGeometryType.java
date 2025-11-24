
package com.aixm.delorean.core.org.gml.v_3_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * All geometry elements are derived directly or indirectly from this abstract supertype. A geometry element may have an identifying attribute (gml:id), one or more names (elements identifier and name) and a description (elements description and descriptionReference) . It may be associated with a spatial reference system (attribute group gml:SRSReferenceGroup).
 * The following rules shall be adhered to:
 * -	Every geometry type shall derive from this abstract type.
 * -	Every geometry element (i.e. an element of a geometry type) shall be directly or indirectly in the substitution group of AbstractGeometry.
 * 
 * <p>Java class for AbstractGeometryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractGeometryType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}SRSReferenceGroup"/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeometryType")
@XmlSeeAlso({
    AbstractGeometricAggregateType.class,
    GeometricComplexType.class,
    AbstractGeometricPrimitiveType.class,
    GridType.class
})
public abstract class AbstractGeometryType
    extends AbstractGMLType
{

    @XmlAttribute(name = "srsName")
    @XmlSchemaType(name = "anyURI")
    protected String srsName;
    @XmlAttribute(name = "srsDimension")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger srsDimension;
    @XmlAttribute
    protected List<String> axisLabels;
    @XmlAttribute
    protected List<String> uomLabels;

    /**
     * Gets the value of the srsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Sets the value of the srsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    /**
     * Gets the value of the srsDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSrsDimension() {
        return srsDimension;
    }

    /**
     * Sets the value of the srsDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSrsDimension(BigInteger value) {
        this.srsDimension = value;
    }

    /**
     * Gets the value of the axisLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAxisLabels() {
        if (axisLabels == null) {
            axisLabels = new ArrayList<>();
        }
        return this.axisLabels;
    }

    /**
     * 
     * 
     */
    public void setAxisLabels(List<String> axisLabels) {
        this.axisLabels = axisLabels;
    }

    /**
     * Gets the value of the uomLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uomLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUomLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUomLabels() {
        if (uomLabels == null) {
            uomLabels = new ArrayList<>();
        }
        return this.uomLabels;
    }

    /**
     * 
     * 
     */
    public void setUomLabels(List<String> uomLabels) {
        this.uomLabels = uomLabels;
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
        final AbstractGeometryType that = ((AbstractGeometryType) object);
        {
            boolean lhsFieldIsSet = (this.srsDimension!= null);
            boolean rhsFieldIsSet = (that.srsDimension!= null);
            BigInteger lhsField;
            lhsField = this.getSrsDimension();
            BigInteger rhsField;
            rhsField = that.getSrsDimension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "srsDimension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "srsDimension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.srsName!= null);
            boolean rhsFieldIsSet = (that.srsName!= null);
            String lhsField;
            lhsField = this.getSrsName();
            String rhsField;
            rhsField = that.getSrsName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "srsName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "srsName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()));
            boolean rhsFieldIsSet = ((that.uomLabels!= null)&&(!that.uomLabels.isEmpty()));
            List<String> lhsField;
            lhsField = (((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()))?this.getUomLabels():null);
            List<String> rhsField;
            rhsField = (((that.uomLabels!= null)&&(!that.uomLabels.isEmpty()))?that.getUomLabels():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "uomLabels", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "uomLabels", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()));
            boolean rhsFieldIsSet = ((that.axisLabels!= null)&&(!that.axisLabels.isEmpty()));
            List<String> lhsField;
            lhsField = (((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()))?this.getAxisLabels():null);
            List<String> rhsField;
            rhsField = (((that.axisLabels!= null)&&(!that.axisLabels.isEmpty()))?that.getAxisLabels():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "axisLabels", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "axisLabels", rhsField);
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
            boolean theFieldIsSet = (this.srsName!= null);
            String theField;
            theField = this.getSrsName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "srsName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.srsDimension!= null);
            BigInteger theField;
            theField = this.getSrsDimension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "srsDimension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()));
            List<String> theField;
            theField = (((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()))?this.getAxisLabels():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "axisLabels", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()));
            List<String> theField;
            theField = (((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()))?this.getUomLabels():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "uomLabels", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.srsName!= null);
            String theField;
            theField = this.getSrsName();
            strategy.appendField(locator, this, "srsName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.srsDimension!= null);
            BigInteger theField;
            theField = this.getSrsDimension();
            strategy.appendField(locator, this, "srsDimension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()));
            List<String> theField;
            theField = (((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()))?this.getAxisLabels():null);
            strategy.appendField(locator, this, "axisLabels", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()));
            List<String> theField;
            theField = (((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()))?this.getUomLabels():null);
            strategy.appendField(locator, this, "uomLabels", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
