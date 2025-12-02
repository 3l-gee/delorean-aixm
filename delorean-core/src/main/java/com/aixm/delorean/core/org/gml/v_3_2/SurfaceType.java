
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for SurfaceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SurfaceType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractSurfaceType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}patches"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceType", propOrder = {
    "patches"
})
@XmlSeeAlso({
    TinType.class
})
public class SurfaceType
    extends AbstractSurfaceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    /**
     * The patches property element contains the sequence of surface patches. The order of the elements is significant and shall be preserved when processing the array.
     * 
     */
    @XmlElementRef(name = "patches", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<SurfacePatchArrayPropertyType> patches;

    /**
     * The patches property element contains the sequence of surface patches. The order of the elements is significant and shall be preserved when processing the array.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     
     */
    public JAXBElement<SurfacePatchArrayPropertyType> getPatches() {
        return patches;
    }

    /**
     * Sets the value of the patches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     
     * @see #getPatches()
     */
    public void setPatches(JAXBElement<SurfacePatchArrayPropertyType> value) {
        this.patches = value;
    }

    public boolean isSetPatches() {
        return (this.patches!= null);
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
        final SurfaceType that = ((SurfaceType) object);
        {
            boolean lhsFieldIsSet = this.isSetPatches();
            boolean rhsFieldIsSet = that.isSetPatches();
            JAXBElement<SurfacePatchArrayPropertyType> lhsField;
            lhsField = this.getPatches();
            JAXBElement<SurfacePatchArrayPropertyType> rhsField;
            rhsField = that.getPatches();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "patches", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "patches", rhsField);
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
            boolean theFieldIsSet = this.isSetPatches();
            JAXBElement<SurfacePatchArrayPropertyType> theField;
            theField = this.getPatches();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "patches", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPatches();
            JAXBElement<SurfacePatchArrayPropertyType> theField;
            theField = this.getPatches();
            strategy.appendField(locator, this, "patches", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
