
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import com.aixm.delorean.core.schema.a5_2.aixm.ElevatedCurveType;
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
 * <p>Java class for CurveType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CurveType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCurveType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}segments"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveType", propOrder = {
    "segments"
})
@XmlSeeAlso({
    com.aixm.delorean.core.schema.a5_2.aixm.CurveType.class,
    ElevatedCurveType.class
})
public class CurveType
    extends AbstractCurveType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * This property element contains a list of curve segments. The order of the elements is significant and shall be preserved when processing the array.
     * 
     */
    @XmlElement(required = true)
    protected CurveSegmentArrayPropertyType segments;

    /**
     * This property element contains a list of curve segments. The order of the elements is significant and shall be preserved when processing the array.
     * 
     * @return
     *     possible object is
     *     {@link CurveSegmentArrayPropertyType }
     *     
     */
    public CurveSegmentArrayPropertyType getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveSegmentArrayPropertyType }
     *     
     * @see #getSegments()
     */
    public void setSegments(CurveSegmentArrayPropertyType value) {
        this.segments = value;
    }

    public boolean isSetSegments() {
        return (this.segments!= null);
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
        final CurveType that = ((CurveType) object);
        {
            boolean lhsFieldIsSet = this.isSetSegments();
            boolean rhsFieldIsSet = that.isSetSegments();
            CurveSegmentArrayPropertyType lhsField;
            lhsField = this.getSegments();
            CurveSegmentArrayPropertyType rhsField;
            rhsField = that.getSegments();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "segments", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "segments", rhsField);
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
            boolean theFieldIsSet = this.isSetSegments();
            CurveSegmentArrayPropertyType theField;
            theField = this.getSegments();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "segments", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSegments();
            CurveSegmentArrayPropertyType theField;
            theField = this.getSegments();
            strategy.appendField(locator, this, "segments", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
