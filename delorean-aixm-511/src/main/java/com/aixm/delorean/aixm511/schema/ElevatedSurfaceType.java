
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for ElevatedSurfaceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ElevatedSurfaceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}SurfaceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ElevatedSurfacePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractElevatedSurfaceExtension"/>
 *                 </choice>
 *                 <attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevatedSurfaceType", propOrder = {
    "elevation",
    "geoidUndulation",
    "verticalDatum",
    "verticalAccuracy",
    "extension"
})
public class ElevatedSurfaceType
    extends SurfaceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "elevation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> elevation;
    @XmlElementRef(name = "geoidUndulation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> geoidUndulation;
    @XmlElementRef(name = "verticalDatum", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalDatumType> verticalDatum;
    @XmlElementRef(name = "verticalAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> verticalAccuracy;
    protected List<ElevatedSurfaceTypeExtension> extension;

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setElevation(JAXBElement<ValDistanceVerticalType> value) {
        this.elevation = value;
    }

    public boolean isSetElevation() {
        return (this.elevation!= null);
    }

    /**
     * Gets the value of the geoidUndulation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceSignedType> getGeoidUndulation() {
        return geoidUndulation;
    }

    /**
     * Sets the value of the geoidUndulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public void setGeoidUndulation(JAXBElement<ValDistanceSignedType> value) {
        this.geoidUndulation = value;
    }

    public boolean isSetGeoidUndulation() {
        return (this.geoidUndulation!= null);
    }

    /**
     * Gets the value of the verticalDatum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalDatumType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalDatumType> getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * Sets the value of the verticalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalDatumType }{@code >}
     *     
     */
    public void setVerticalDatum(JAXBElement<CodeVerticalDatumType> value) {
        this.verticalDatum = value;
    }

    public boolean isSetVerticalDatum() {
        return (this.verticalDatum!= null);
    }

    /**
     * Gets the value of the verticalAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getVerticalAccuracy() {
        return verticalAccuracy;
    }

    /**
     * Sets the value of the verticalAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setVerticalAccuracy(JAXBElement<ValDistanceType> value) {
        this.verticalAccuracy = value;
    }

    public boolean isSetVerticalAccuracy() {
        return (this.verticalAccuracy!= null);
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElevatedSurfaceTypeExtension }
     * 
     * 
     */
    public List<ElevatedSurfaceTypeExtension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ElevatedSurfaceTypeExtension> extension) {
        this.extension = extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
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
        final ElevatedSurfaceType that = ((ElevatedSurfaceType) object);
        {
            boolean lhsFieldIsSet = this.isSetGeoidUndulation();
            boolean rhsFieldIsSet = that.isSetGeoidUndulation();
            JAXBElement<ValDistanceSignedType> lhsField;
            lhsField = this.getGeoidUndulation();
            JAXBElement<ValDistanceSignedType> rhsField;
            rhsField = that.getGeoidUndulation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "geoidUndulation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "geoidUndulation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetElevation();
            boolean rhsFieldIsSet = that.isSetElevation();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getElevation();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getElevation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elevation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elevation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalAccuracy();
            boolean rhsFieldIsSet = that.isSetVerticalAccuracy();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getVerticalAccuracy();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getVerticalAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalAccuracy", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalDatum();
            boolean rhsFieldIsSet = that.isSetVerticalDatum();
            JAXBElement<CodeVerticalDatumType> lhsField;
            lhsField = this.getVerticalDatum();
            JAXBElement<CodeVerticalDatumType> rhsField;
            rhsField = that.getVerticalDatum();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalDatum", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalDatum", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ElevatedSurfaceTypeExtension> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ElevatedSurfaceTypeExtension> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean theFieldIsSet = this.isSetElevation();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getElevation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elevation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeoidUndulation();
            JAXBElement<ValDistanceSignedType> theField;
            theField = this.getGeoidUndulation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "geoidUndulation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalDatum();
            JAXBElement<CodeVerticalDatumType> theField;
            theField = this.getVerticalDatum();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalDatum", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalAccuracy();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVerticalAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalAccuracy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ElevatedSurfaceTypeExtension> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetElevation();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getElevation();
            strategy.appendField(locator, this, "elevation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeoidUndulation();
            JAXBElement<ValDistanceSignedType> theField;
            theField = this.getGeoidUndulation();
            strategy.appendField(locator, this, "geoidUndulation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalDatum();
            JAXBElement<CodeVerticalDatumType> theField;
            theField = this.getVerticalDatum();
            strategy.appendField(locator, this, "verticalDatum", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalAccuracy();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVerticalAccuracy();
            strategy.appendField(locator, this, "verticalAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ElevatedSurfaceTypeExtension> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
