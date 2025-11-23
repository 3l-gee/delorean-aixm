
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
 * <p>Java class for TimeTopologyComplexType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeTopologyComplexType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTimeComplexType">
 *       <sequence>
 *         <element name="primitive" type="{http://www.opengis.net/gml/3.2}TimeTopologyPrimitivePropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTopologyComplexType", propOrder = {
    "primitive"
})
public abstract class TimeTopologyComplexType
    extends AbstractTimeComplexType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected List<TimeTopologyPrimitivePropertyType> primitive;

    /**
     * Gets the value of the primitive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primitive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimitive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeTopologyPrimitivePropertyType }
     * 
     * 
     */
    public List<TimeTopologyPrimitivePropertyType> getPrimitive() {
        if (primitive == null) {
            primitive = new ArrayList<>();
        }
        return this.primitive;
    }

    /**
     * 
     * 
     */
    public void setPrimitive(List<TimeTopologyPrimitivePropertyType> primitive) {
        this.primitive = primitive;
    }

    public boolean isSetPrimitive() {
        return ((this.primitive!= null)&&(!this.primitive.isEmpty()));
    }

    public void unsetPrimitive() {
        this.primitive = null;
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
        final TimeTopologyComplexType that = ((TimeTopologyComplexType) object);
        {
            boolean lhsFieldIsSet = this.isSetPrimitive();
            boolean rhsFieldIsSet = that.isSetPrimitive();
            List<TimeTopologyPrimitivePropertyType> lhsField;
            lhsField = (this.isSetPrimitive()?this.getPrimitive():null);
            List<TimeTopologyPrimitivePropertyType> rhsField;
            rhsField = (that.isSetPrimitive()?that.getPrimitive():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "primitive", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "primitive", rhsField);
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
            boolean theFieldIsSet = this.isSetPrimitive();
            List<TimeTopologyPrimitivePropertyType> theField;
            theField = (this.isSetPrimitive()?this.getPrimitive():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "primitive", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPrimitive();
            List<TimeTopologyPrimitivePropertyType> theField;
            theField = (this.isSetPrimitive()?this.getPrimitive():null);
            strategy.appendField(locator, this, "primitive", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
