
package com.aixm.delorean.core.org.gml.v_3_2;

import com.aixm.delorean.core.org.w3.xlink.ActuateType;
import com.aixm.delorean.core.org.w3.xlink.ShowType;
import com.aixm.delorean.core.org.w3.xlink.TypeType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * gml:CoordinateOperationPropertyType is a property type for association roles to a coordinate operation, either referencing or containing the definition of that coordinate operation.
 * 
 * <p>Java class for CoordinateOperationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CoordinateOperationPropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence minOccurs="0">
 *         <element ref="{http://www.opengis.net/gml/3.2}AbstractCoordinateOperation"/>
 *       </sequence>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinateOperationPropertyType", propOrder = {
    "abstractCoordinateOperation"
})
public class CoordinateOperationPropertyType implements Equals, HashCode, ToString
{

    /**
     * gml:AbstractCoordinateOperation is a mathematical operation on coordinates that transforms or converts coordinates to another coordinate reference system. Many but not all coordinate operations (from CRS A to CRS B) also uniquely define the inverse operation (from CRS B to CRS A). In some cases, the operation method algorithm for the inverse operation is the same as for the forward algorithm, but the signs of some operation parameter values shall be reversed. In other cases, different algorithms are required for the forward and inverse operations, but the same operation parameter values are used. If (some) entirely different parameter values are needed, a different coordinate operation shall be defined.
     * The optional coordinateOperationAccuracy property elements provide estimates of the impact of this coordinate operation on point position accuracy.
     * 
     */
    @XmlElementRef(name = "AbstractCoordinateOperation", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractCoordinateOperationType> abstractCoordinateOperation;
    @XmlAttribute(name = "nilReason")
    protected String nilReason;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String simpleLinkTitle;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * gml:AbstractCoordinateOperation is a mathematical operation on coordinates that transforms or converts coordinates to another coordinate reference system. Many but not all coordinate operations (from CRS A to CRS B) also uniquely define the inverse operation (from CRS B to CRS A). In some cases, the operation method algorithm for the inverse operation is the same as for the forward algorithm, but the signs of some operation parameter values shall be reversed. In other cases, different algorithms are required for the forward and inverse operations, but the same operation parameter values are used. If (some) entirely different parameter values are needed, a different coordinate operation shall be defined.
     * The optional coordinateOperationAccuracy property elements provide estimates of the impact of this coordinate operation on point position accuracy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeneralConversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeneralTransformationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConcatenatedOperationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassThroughOperationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransformationType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractCoordinateOperationType> getAbstractCoordinateOperation() {
        return abstractCoordinateOperation;
    }

    /**
     * Sets the value of the abstractCoordinateOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeneralConversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeneralTransformationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConcatenatedOperationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassThroughOperationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransformationType }{@code >}
     *     
     * @see #getAbstractCoordinateOperation()
     */
    public void setAbstractCoordinateOperation(JAXBElement<? extends AbstractCoordinateOperationType> value) {
        this.abstractCoordinateOperation = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNilReason() {
        return nilReason;
    }

    /**
     * Sets the value of the nilReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNilReason(String value) {
        this.nilReason = value;
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the simpleLinkTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleLinkTitle() {
        return simpleLinkTitle;
    }

    /**
     * Sets the value of the simpleLinkTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleLinkTitle(String value) {
        this.simpleLinkTitle = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    @Override
    public boolean equals(Object object) {
        ObjectLocator thisLocator = null;
        ObjectLocator thatLocator = null;
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            thisLocator = new DefaultRootObjectLocator(this);
            thatLocator = new DefaultRootObjectLocator(object);
        }
        return equals(thisLocator, thatLocator, object, strategy);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CoordinateOperationPropertyType that = ((CoordinateOperationPropertyType) object);
        {
            boolean lhsFieldIsSet = (this.remoteSchema!= null);
            boolean rhsFieldIsSet = (that.remoteSchema!= null);
            String lhsField;
            lhsField = this.getRemoteSchema();
            String rhsField;
            rhsField = that.getRemoteSchema();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "remoteSchema", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "remoteSchema", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.simpleLinkTitle!= null);
            boolean rhsFieldIsSet = (that.simpleLinkTitle!= null);
            String lhsField;
            lhsField = this.getSimpleLinkTitle();
            String rhsField;
            rhsField = that.getSimpleLinkTitle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "simpleLinkTitle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "simpleLinkTitle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.nilReason!= null);
            boolean rhsFieldIsSet = (that.nilReason!= null);
            String lhsField;
            lhsField = this.getNilReason();
            String rhsField;
            rhsField = that.getNilReason();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "nilReason", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "nilReason", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.type!= null);
            boolean rhsFieldIsSet = (that.type!= null);
            TypeType lhsField;
            lhsField = this.getType();
            TypeType rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.arcrole!= null);
            boolean rhsFieldIsSet = (that.arcrole!= null);
            String lhsField;
            lhsField = this.getArcrole();
            String rhsField;
            rhsField = that.getArcrole();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "arcrole", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "arcrole", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.href!= null);
            boolean rhsFieldIsSet = (that.href!= null);
            String lhsField;
            lhsField = this.getHref();
            String rhsField;
            rhsField = that.getHref();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "href", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "href", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.actuate!= null);
            boolean rhsFieldIsSet = (that.actuate!= null);
            ActuateType lhsField;
            lhsField = this.getActuate();
            ActuateType rhsField;
            rhsField = that.getActuate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "actuate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "actuate", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.show!= null);
            boolean rhsFieldIsSet = (that.show!= null);
            ShowType lhsField;
            lhsField = this.getShow();
            ShowType rhsField;
            rhsField = that.getShow();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "show", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "show", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.abstractCoordinateOperation!= null);
            boolean rhsFieldIsSet = (that.abstractCoordinateOperation!= null);
            JAXBElement<? extends AbstractCoordinateOperationType> lhsField;
            lhsField = this.getAbstractCoordinateOperation();
            JAXBElement<? extends AbstractCoordinateOperationType> rhsField;
            rhsField = that.getAbstractCoordinateOperation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractCoordinateOperation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractCoordinateOperation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.role!= null);
            boolean rhsFieldIsSet = (that.role!= null);
            String lhsField;
            lhsField = this.getRole();
            String rhsField;
            rhsField = that.getRole();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "role", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "role", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        ObjectLocator theLocator = null;
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        return this.hashCode(theLocator, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theFieldIsSet = (this.abstractCoordinateOperation!= null);
            JAXBElement<? extends AbstractCoordinateOperationType> theField;
            theField = this.getAbstractCoordinateOperation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractCoordinateOperation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.nilReason!= null);
            String theField;
            theField = this.getNilReason();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nilReason", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.remoteSchema!= null);
            String theField;
            theField = this.getRemoteSchema();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "remoteSchema", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.type!= null);
            TypeType theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.href!= null);
            String theField;
            theField = this.getHref();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "href", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.role!= null);
            String theField;
            theField = this.getRole();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "role", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.arcrole!= null);
            String theField;
            theField = this.getArcrole();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "arcrole", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.simpleLinkTitle!= null);
            String theField;
            theField = this.getSimpleLinkTitle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "simpleLinkTitle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.show!= null);
            ShowType theField;
            theField = this.getShow();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "show", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.actuate!= null);
            ActuateType theField;
            theField = this.getActuate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "actuate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        ObjectLocator theLocator = null;
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        if (strategy.isTraceEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        final StringBuilder buffer = new StringBuilder();
        append(theLocator, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theFieldIsSet = (this.abstractCoordinateOperation!= null);
            JAXBElement<? extends AbstractCoordinateOperationType> theField;
            theField = this.getAbstractCoordinateOperation();
            strategy.appendField(locator, this, "abstractCoordinateOperation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.nilReason!= null);
            String theField;
            theField = this.getNilReason();
            strategy.appendField(locator, this, "nilReason", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.remoteSchema!= null);
            String theField;
            theField = this.getRemoteSchema();
            strategy.appendField(locator, this, "remoteSchema", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.type!= null);
            TypeType theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.href!= null);
            String theField;
            theField = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.role!= null);
            String theField;
            theField = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.arcrole!= null);
            String theField;
            theField = this.getArcrole();
            strategy.appendField(locator, this, "arcrole", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.simpleLinkTitle!= null);
            String theField;
            theField = this.getSimpleLinkTitle();
            strategy.appendField(locator, this, "simpleLinkTitle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.show!= null);
            ShowType theField;
            theField = this.getShow();
            strategy.appendField(locator, this, "show", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.actuate!= null);
            ActuateType theField;
            theField = this.getActuate();
            strategy.appendField(locator, this, "actuate", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
