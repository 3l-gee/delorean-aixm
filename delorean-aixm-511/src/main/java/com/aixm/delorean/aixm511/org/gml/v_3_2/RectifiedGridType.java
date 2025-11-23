
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for RectifiedGridType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RectifiedGridType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}GridType">
 *       <sequence>
 *         <element name="origin" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/>
 *         <element name="offsetVector" type="{http://www.opengis.net/gml/3.2}VectorType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RectifiedGridType", propOrder = {
    "origin",
    "offsetVector"
})
public class RectifiedGridType
    extends GridType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected PointPropertyType origin;
    @XmlElement(required = true)
    protected List<VectorType> offsetVector;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setOrigin(PointPropertyType value) {
        this.origin = value;
    }

    public boolean isSetOrigin() {
        return (this.origin!= null);
    }

    /**
     * Gets the value of the offsetVector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offsetVector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffsetVector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VectorType }
     * 
     * 
     */
    public List<VectorType> getOffsetVector() {
        if (offsetVector == null) {
            offsetVector = new ArrayList<>();
        }
        return this.offsetVector;
    }

    /**
     * 
     * 
     */
    public void setOffsetVector(List<VectorType> offsetVector) {
        this.offsetVector = offsetVector;
    }

    public boolean isSetOffsetVector() {
        return ((this.offsetVector!= null)&&(!this.offsetVector.isEmpty()));
    }

    public void unsetOffsetVector() {
        this.offsetVector = null;
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
        final RectifiedGridType that = ((RectifiedGridType) object);
        {
            boolean lhsFieldIsSet = this.isSetOrigin();
            boolean rhsFieldIsSet = that.isSetOrigin();
            PointPropertyType lhsField;
            lhsField = this.getOrigin();
            PointPropertyType rhsField;
            rhsField = that.getOrigin();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "origin", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "origin", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOffsetVector();
            boolean rhsFieldIsSet = that.isSetOffsetVector();
            List<VectorType> lhsField;
            lhsField = (this.isSetOffsetVector()?this.getOffsetVector():null);
            List<VectorType> rhsField;
            rhsField = (that.isSetOffsetVector()?that.getOffsetVector():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "offsetVector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "offsetVector", rhsField);
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
            boolean theFieldIsSet = this.isSetOrigin();
            PointPropertyType theField;
            theField = this.getOrigin();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "origin", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOffsetVector();
            List<VectorType> theField;
            theField = (this.isSetOffsetVector()?this.getOffsetVector():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "offsetVector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetOrigin();
            PointPropertyType theField;
            theField = this.getOrigin();
            strategy.appendField(locator, this, "origin", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOffsetVector();
            List<VectorType> theField;
            theField = (this.isSetOffsetVector()?this.getOffsetVector():null);
            strategy.appendField(locator, this, "offsetVector", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
