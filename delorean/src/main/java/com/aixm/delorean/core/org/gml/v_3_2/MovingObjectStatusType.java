
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
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
 * <p>Java class for MovingObjectStatusType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MovingObjectStatusType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTimeSliceType">
 *       <sequence>
 *         <choice>
 *           <element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}pos"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}locationName"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}locationReference"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}location"/>
 *         </choice>
 *         <element name="speed" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/>
 *         <element name="bearing" type="{http://www.opengis.net/gml/3.2}DirectionPropertyType" minOccurs="0"/>
 *         <element name="acceleration" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/>
 *         <element name="elevation" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}status" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}statusReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovingObjectStatusType", propOrder = {
    "position",
    "pos",
    "locationName",
    "locationReference",
    "location",
    "speed",
    "bearing",
    "acceleration",
    "elevation",
    "status",
    "statusReference"
})
public class MovingObjectStatusType
    extends AbstractTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected GeometryPropertyType position;
    protected DirectPositionType pos;
    /**
     * The gml:locationName property element is a convenience property where the text value describes the location of the feature. If the location names are selected from a controlled list, then the list shall be identified in the codeSpace attribute.
     * 
     */
    protected CodeType locationName;
    /**
     * The gml:locationReference property element is a convenience property where the text value referenced by the xlink:href attribute describes the location of the feature.
     * 
     */
    protected ReferenceType locationReference;
    @XmlElementRef(name = "location", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LocationPropertyType> location;
    protected MeasureType speed;
    protected DirectionPropertyType bearing;
    protected MeasureType acceleration;
    protected MeasureType elevation;
    protected StringOrRefType status;
    protected ReferenceType statusReference;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setPosition(GeometryPropertyType value) {
        this.position = value;
    }

    public boolean isSetPosition() {
        return (this.position!= null);
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setPos(DirectPositionType value) {
        this.pos = value;
    }

    public boolean isSetPos() {
        return (this.pos!= null);
    }

    /**
     * The gml:locationName property element is a convenience property where the text value describes the location of the feature. If the location names are selected from a controlled list, then the list shall be identified in the codeSpace attribute.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     * @see #getLocationName()
     */
    public void setLocationName(CodeType value) {
        this.locationName = value;
    }

    public boolean isSetLocationName() {
        return (this.locationName!= null);
    }

    /**
     * The gml:locationReference property element is a convenience property where the text value referenced by the xlink:href attribute describes the location of the feature.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     * @see #getLocationReference()
     */
    public void setLocationReference(ReferenceType value) {
        this.locationReference = value;
    }

    public boolean isSetLocationReference() {
        return (this.locationReference!= null);
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     
     */
    public JAXBElement<? extends LocationPropertyType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<? extends LocationPropertyType> value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSpeed(MeasureType value) {
        this.speed = value;
    }

    public boolean isSetSpeed() {
        return (this.speed!= null);
    }

    /**
     * Gets the value of the bearing property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionPropertyType }
     *     
     */
    public DirectionPropertyType getBearing() {
        return bearing;
    }

    /**
     * Sets the value of the bearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionPropertyType }
     *     
     */
    public void setBearing(DirectionPropertyType value) {
        this.bearing = value;
    }

    public boolean isSetBearing() {
        return (this.bearing!= null);
    }

    /**
     * Gets the value of the acceleration property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAcceleration() {
        return acceleration;
    }

    /**
     * Sets the value of the acceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAcceleration(MeasureType value) {
        this.acceleration = value;
    }

    public boolean isSetAcceleration() {
        return (this.acceleration!= null);
    }

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setElevation(MeasureType value) {
        this.elevation = value;
    }

    public boolean isSetElevation() {
        return (this.elevation!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setStatus(StringOrRefType value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the statusReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getStatusReference() {
        return statusReference;
    }

    /**
     * Sets the value of the statusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setStatusReference(ReferenceType value) {
        this.statusReference = value;
    }

    public boolean isSetStatusReference() {
        return (this.statusReference!= null);
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
        final MovingObjectStatusType that = ((MovingObjectStatusType) object);
        {
            boolean lhsFieldIsSet = this.isSetElevation();
            boolean rhsFieldIsSet = that.isSetElevation();
            MeasureType lhsField;
            lhsField = this.getElevation();
            MeasureType rhsField;
            rhsField = that.getElevation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elevation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elevation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStatus();
            boolean rhsFieldIsSet = that.isSetStatus();
            StringOrRefType lhsField;
            lhsField = this.getStatus();
            StringOrRefType rhsField;
            rhsField = that.getStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "status", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "status", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAcceleration();
            boolean rhsFieldIsSet = that.isSetAcceleration();
            MeasureType lhsField;
            lhsField = this.getAcceleration();
            MeasureType rhsField;
            rhsField = that.getAcceleration();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "acceleration", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "acceleration", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPosition();
            boolean rhsFieldIsSet = that.isSetPosition();
            GeometryPropertyType lhsField;
            lhsField = this.getPosition();
            GeometryPropertyType rhsField;
            rhsField = that.getPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "position", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "position", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocationName();
            boolean rhsFieldIsSet = that.isSetLocationName();
            CodeType lhsField;
            lhsField = this.getLocationName();
            CodeType rhsField;
            rhsField = that.getLocationName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBearing();
            boolean rhsFieldIsSet = that.isSetBearing();
            DirectionPropertyType lhsField;
            lhsField = this.getBearing();
            DirectionPropertyType rhsField;
            rhsField = that.getBearing();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "bearing", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "bearing", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocationReference();
            boolean rhsFieldIsSet = that.isSetLocationReference();
            ReferenceType lhsField;
            lhsField = this.getLocationReference();
            ReferenceType rhsField;
            rhsField = that.getLocationReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPos();
            boolean rhsFieldIsSet = that.isSetPos();
            DirectPositionType lhsField;
            lhsField = this.getPos();
            DirectPositionType rhsField;
            rhsField = that.getPos();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pos", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pos", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpeed();
            boolean rhsFieldIsSet = that.isSetSpeed();
            MeasureType lhsField;
            lhsField = this.getSpeed();
            MeasureType rhsField;
            rhsField = that.getSpeed();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speed", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speed", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocation();
            boolean rhsFieldIsSet = that.isSetLocation();
            JAXBElement<? extends LocationPropertyType> lhsField;
            lhsField = this.getLocation();
            JAXBElement<? extends LocationPropertyType> rhsField;
            rhsField = that.getLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "location", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "location", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStatusReference();
            boolean rhsFieldIsSet = that.isSetStatusReference();
            ReferenceType lhsField;
            lhsField = this.getStatusReference();
            ReferenceType rhsField;
            rhsField = that.getStatusReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "statusReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "statusReference", rhsField);
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
            boolean theFieldIsSet = this.isSetPosition();
            GeometryPropertyType theField;
            theField = this.getPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "position", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPos();
            DirectPositionType theField;
            theField = this.getPos();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pos", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationName();
            CodeType theField;
            theField = this.getLocationName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationReference();
            ReferenceType theField;
            theField = this.getLocationReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<? extends LocationPropertyType> theField;
            theField = this.getLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "location", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeed();
            MeasureType theField;
            theField = this.getSpeed();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speed", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBearing();
            DirectionPropertyType theField;
            theField = this.getBearing();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "bearing", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAcceleration();
            MeasureType theField;
            theField = this.getAcceleration();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "acceleration", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElevation();
            MeasureType theField;
            theField = this.getElevation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elevation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStatus();
            StringOrRefType theField;
            theField = this.getStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "status", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStatusReference();
            ReferenceType theField;
            theField = this.getStatusReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "statusReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPosition();
            GeometryPropertyType theField;
            theField = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPos();
            DirectPositionType theField;
            theField = this.getPos();
            strategy.appendField(locator, this, "pos", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationName();
            CodeType theField;
            theField = this.getLocationName();
            strategy.appendField(locator, this, "locationName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationReference();
            ReferenceType theField;
            theField = this.getLocationReference();
            strategy.appendField(locator, this, "locationReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<? extends LocationPropertyType> theField;
            theField = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeed();
            MeasureType theField;
            theField = this.getSpeed();
            strategy.appendField(locator, this, "speed", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBearing();
            DirectionPropertyType theField;
            theField = this.getBearing();
            strategy.appendField(locator, this, "bearing", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAcceleration();
            MeasureType theField;
            theField = this.getAcceleration();
            strategy.appendField(locator, this, "acceleration", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElevation();
            MeasureType theField;
            theField = this.getElevation();
            strategy.appendField(locator, this, "elevation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStatus();
            StringOrRefType theField;
            theField = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStatusReference();
            ReferenceType theField;
            theField = this.getStatusReference();
            strategy.appendField(locator, this, "statusReference", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
