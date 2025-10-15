
package com.aixm.delorean.core.schema.a5_2.aixm;

import java.io.Serializable;
import com.aixm.delorean.core.gis.adapter.a5_2.gis.ElevatedPointTypeAdapter;
import com.aixm.delorean.core.gis.type.a5_2.DeloreanElevatedPointType;
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
 * <p>Java class for ElevatedPointPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ElevatedPointPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element name="ElevatedPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevatedPointPropertyType", propOrder = {
    "elevatedPoint"
})
@Entity(name = "AIXMElevatedPointPropertyType")
@Table(name = "aixm_elevatedpoint_pt", schema = "gml")
public class AIXMElevatedPointPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(name = "ElevatedPoint", required = true, type = ElevatedPointType.class)
    @XmlJavaTypeAdapter(ElevatedPointTypeAdapter.class)
    protected DeloreanElevatedPointType elevatedPoint;

    /**
     * Gets the value of the elevatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Transient
    public DeloreanElevatedPointType getElevatedPoint() {
        return elevatedPoint;
    }

    /**
     * Sets the value of the elevatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevatedPoint(DeloreanElevatedPointType value) {
        this.elevatedPoint = value;
    }

    @Transient
    public boolean isSetElevatedPoint() {
        return (this.elevatedPoint!= null);
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
        final AIXMElevatedPointPropertyType that = ((AIXMElevatedPointPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetElevatedPoint();
            boolean rhsFieldIsSet = that.isSetElevatedPoint();
            DeloreanElevatedPointType lhsField;
            lhsField = this.getElevatedPoint();
            DeloreanElevatedPointType rhsField;
            rhsField = that.getElevatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elevatedPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elevatedPoint", rhsField);
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
            boolean theFieldIsSet = this.isSetElevatedPoint();
            DeloreanElevatedPointType theField;
            theField = this.getElevatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elevatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetElevatedPoint();
            DeloreanElevatedPointType theField;
            theField = this.getElevatedPoint();
            strategy.appendField(locator, this, "elevatedPoint", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
