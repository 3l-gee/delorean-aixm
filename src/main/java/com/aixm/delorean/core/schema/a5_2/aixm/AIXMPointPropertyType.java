
package com.aixm.delorean.core.schema.a5_2.aixm;

import java.io.Serializable;
import com.aixm.delorean.core.gis.adapter.a5_2.gis.PointTypeAdapter;
import com.aixm.delorean.core.gis.type.a5_2.DeloreanPointType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for PointPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PointPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element name="Point" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointPropertyType", propOrder = {
    "point"
})
@Entity(name = "AIXMPointPropertyType")
@Table(name = "aixm_point_pt", schema = "gml")
public class AIXMPointPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(name = "Point", required = true, type = PointType.class)
    @XmlJavaTypeAdapter(PointTypeAdapter.class)
    protected DeloreanPointType point;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Transient
    public DeloreanPointType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint(DeloreanPointType value) {
        this.point = value;
    }

    @Transient
    public boolean isSetPoint() {
        return (this.point!= null);
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
        final AIXMPointPropertyType that = ((AIXMPointPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetPoint();
            boolean rhsFieldIsSet = that.isSetPoint();
            DeloreanPointType lhsField;
            lhsField = this.getPoint();
            DeloreanPointType rhsField;
            rhsField = that.getPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "point", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "point", rhsField);
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
            boolean theFieldIsSet = this.isSetPoint();
            DeloreanPointType theField;
            theField = this.getPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "point", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPoint();
            DeloreanPointType theField;
            theField = this.getPoint();
            strategy.appendField(locator, this, "point", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
