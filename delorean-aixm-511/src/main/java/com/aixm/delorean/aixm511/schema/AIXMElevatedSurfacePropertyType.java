
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import com.aixm.delorean.core.gis.adapter.a5_1_1.gis.ElevatedSurfaceTypeAdapter;
import com.aixm.delorean.core.gis.type.a5_1_1.AixmElevatedSurfaceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ElevatedSurfaceType;
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
 * <p>Java class for ElevatedSurfacePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ElevatedSurfacePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element name="ElevatedSurface" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevatedSurfacePropertyType", propOrder = {
    "elevatedSurface"
})
@Entity(name = "AIXMElevatedSurfacePropertyType")
@Table(name = "aixm_elevatedsurface_pt", schema = "gml")
public class AIXMElevatedSurfacePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ElevatedSurface", required = true, type = ElevatedSurfaceType.class)
    @XmlJavaTypeAdapter(ElevatedSurfaceTypeAdapter.class)
    protected AixmElevatedSurfaceType elevatedSurface;

    /**
     * Gets the value of the elevatedSurface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Transient
    public AixmElevatedSurfaceType getElevatedSurface() {
        return elevatedSurface;
    }

    /**
     * Sets the value of the elevatedSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevatedSurface(AixmElevatedSurfaceType value) {
        this.elevatedSurface = value;
    }

    @Transient
    public boolean isSetElevatedSurface() {
        return (this.elevatedSurface!= null);
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
        final AIXMElevatedSurfacePropertyType that = ((AIXMElevatedSurfacePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetElevatedSurface();
            boolean rhsFieldIsSet = that.isSetElevatedSurface();
            AixmElevatedSurfaceType lhsField;
            lhsField = this.getElevatedSurface();
            AixmElevatedSurfaceType rhsField;
            rhsField = that.getElevatedSurface();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elevatedSurface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elevatedSurface", rhsField);
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
            boolean theFieldIsSet = this.isSetElevatedSurface();
            AixmElevatedSurfaceType theField;
            theField = this.getElevatedSurface();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elevatedSurface", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetElevatedSurface();
            AixmElevatedSurfaceType theField;
            theField = this.getElevatedSurface();
            strategy.appendField(locator, this, "elevatedSurface", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
