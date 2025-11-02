
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AbstractGriddedSurfaceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractGriddedSurfaceType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractParametricCurveSurfaceType">
 *       <sequence>
 *         <group ref="{http://www.opengis.net/gml/3.2}PointGrid"/>
 *       </sequence>
 *       <attribute name="rows" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="columns" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGriddedSurfaceType", propOrder = {
    "pointGridRows"
})
@XmlSeeAlso({
    ConeType.class,
    CylinderType.class,
    SphereType.class
})
public abstract class AbstractGriddedSurfaceType
    extends AbstractParametricCurveSurfaceType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(name = "rows", required = true)
    protected Rows pointGridRows;
    @XmlAttribute(name = "rows")
    protected BigInteger rows;
    @XmlAttribute(name = "columns")
    protected BigInteger columns;

    /**
     * Gets the value of the pointGridRows property.
     * 
     * @return
     *     possible object is
     *     {@link Rows }
     *     
     */
    public Rows getPointGridRows() {
        return pointGridRows;
    }

    /**
     * Sets the value of the pointGridRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rows }
     *     
     */
    public void setPointGridRows(Rows value) {
        this.pointGridRows = value;
    }

    public boolean isSetPointGridRows() {
        return (this.pointGridRows!= null);
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRows(BigInteger value) {
        this.rows = value;
    }

    public boolean isSetRows() {
        return (this.rows!= null);
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumns(BigInteger value) {
        this.columns = value;
    }

    public boolean isSetColumns() {
        return (this.columns!= null);
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
        final AbstractGriddedSurfaceType that = ((AbstractGriddedSurfaceType) object);
        {
            boolean lhsFieldIsSet = this.isSetPointGridRows();
            boolean rhsFieldIsSet = that.isSetPointGridRows();
            Rows lhsField;
            lhsField = this.getPointGridRows();
            Rows rhsField;
            rhsField = that.getPointGridRows();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointGridRows", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointGridRows", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRows();
            boolean rhsFieldIsSet = that.isSetRows();
            BigInteger lhsField;
            lhsField = this.getRows();
            BigInteger rhsField;
            rhsField = that.getRows();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rows", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rows", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetColumns();
            boolean rhsFieldIsSet = that.isSetColumns();
            BigInteger lhsField;
            lhsField = this.getColumns();
            BigInteger rhsField;
            rhsField = that.getColumns();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "columns", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "columns", rhsField);
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
            boolean theFieldIsSet = this.isSetPointGridRows();
            Rows theField;
            theField = this.getPointGridRows();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointGridRows", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRows();
            BigInteger theField;
            theField = this.getRows();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rows", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetColumns();
            BigInteger theField;
            theField = this.getColumns();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "columns", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPointGridRows();
            Rows theField;
            theField = this.getPointGridRows();
            strategy.appendField(locator, this, "pointGridRows", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRows();
            BigInteger theField;
            theField = this.getRows();
            strategy.appendField(locator, this, "rows", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetColumns();
            BigInteger theField;
            theField = this.getColumns();
            strategy.appendField(locator, this, "columns", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
