
package com.aixm.delorean.core.schema.a5_2.aixm;

import java.io.Serializable;
import com.aixm.delorean.core.gis.adapter.a5_2.gis.SurfaceTypeAdapter;
import com.aixm.delorean.core.gis.type.a5_2.AixmSurfaceType;
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
 * <p>Java class for SurfacePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SurfacePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element name="Surface" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfacePropertyType", propOrder = {
    "surface"
})
@Entity(name = "AIXMSurfacePropertyType")
@Table(name = "aixm_surface_pt", schema = "gml")
public class AIXMSurfacePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(name = "Surface", required = true, type = SurfaceType.class)
    @XmlJavaTypeAdapter(SurfaceTypeAdapter.class)
    protected AixmSurfaceType surface;

    /**
     * Gets the value of the surface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
@jakarta.persistence.OneToOne(cascade = jakarta.persistence.CascadeType.ALL, fetch = jakarta.persistence.FetchType.EAGER)
@jakarta.persistence.JoinColumn(name = "surface_id", referencedColumnName = "hjid")
    public AixmSurfaceType getSurface() {
        return surface;
    }

    /**
     * Sets the value of the surface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurface(AixmSurfaceType value) {
        this.surface = value;
    }

    @Transient
    public boolean isSetSurface() {
        return (this.surface!= null);
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
        final AIXMSurfacePropertyType that = ((AIXMSurfacePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetSurface();
            boolean rhsFieldIsSet = that.isSetSurface();
            AixmSurfaceType lhsField;
            lhsField = this.getSurface();
            AixmSurfaceType rhsField;
            rhsField = that.getSurface();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surface", rhsField);
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
            boolean theFieldIsSet = this.isSetSurface();
            AixmSurfaceType theField;
            theField = this.getSurface();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surface", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSurface();
            AixmSurfaceType theField;
            theField = this.getSurface();
            strategy.appendField(locator, this, "surface", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
