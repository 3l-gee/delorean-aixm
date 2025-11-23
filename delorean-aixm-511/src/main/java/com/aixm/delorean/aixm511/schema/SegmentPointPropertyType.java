
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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
import org.jvnet.hyperjaxb.xml.bind.JAXBElementUtils;


/**
 * <p>Java class for SegmentPointPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SegmentPointPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSegmentPoint"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentPointPropertyType", propOrder = {
    "abstractSegmentPoint"
})
@Entity(name = "SegmentPointPropertyType")
@Table(name = "segmentpoint_pt", schema = "navaids_point")
public class SegmentPointPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "AbstractSegmentPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractSegmentPointType> abstractSegmentPoint;

    /**
     * Gets the value of the abstractSegmentPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<? extends AbstractSegmentPointType> getAbstractSegmentPoint() {
        return abstractSegmentPoint;
    }

    /**
     * Sets the value of the abstractSegmentPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointType }{@code >}
     *     
     */
    public void setAbstractSegmentPoint(JAXBElement<? extends AbstractSegmentPointType> value) {
        this.abstractSegmentPoint = value;
    }

    @Transient
    public boolean isSetAbstractSegmentPoint() {
        return (this.abstractSegmentPoint!= null);
    }

    @Basic
    @Column(name = "ABSTRACT_SEGMENT_POINT_NAME")
    public String getAbstractSegmentPointName() {
        if (this.getAbstractSegmentPoint() instanceof JAXBElement) {
            return JAXBElementUtils.getName(AbstractSegmentPointType.class, this.getAbstractSegmentPoint());
        } else {
            return null;
        }
    }

    public void setAbstractSegmentPointName(String target) {
        if (target!= null) {
            setAbstractSegmentPoint(JAXBElementUtils.wrap(this.getAbstractSegmentPoint(), target, AbstractSegmentPointType.class));
        }
    }

    @ManyToOne(targetEntity = AbstractSegmentPointType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    public AbstractSegmentPointType getAbstractSegmentPointValue() {
        if (this.getAbstractSegmentPoint() instanceof JAXBElement) {
            return JAXBElementUtils.getValue(AbstractSegmentPointType.class, this.getAbstractSegmentPoint());
        } else {
            return null;
        }
    }

    public void setAbstractSegmentPointValue(AbstractSegmentPointType target) {
        if (target!= null) {
            setAbstractSegmentPoint(JAXBElementUtils.wrap(this.getAbstractSegmentPoint(), target));
        }
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
        final SegmentPointPropertyType that = ((SegmentPointPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractSegmentPoint();
            boolean rhsFieldIsSet = that.isSetAbstractSegmentPoint();
            JAXBElement<? extends AbstractSegmentPointType> lhsField;
            lhsField = this.getAbstractSegmentPoint();
            JAXBElement<? extends AbstractSegmentPointType> rhsField;
            rhsField = that.getAbstractSegmentPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractSegmentPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractSegmentPoint", rhsField);
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
            boolean theFieldIsSet = this.isSetAbstractSegmentPoint();
            JAXBElement<? extends AbstractSegmentPointType> theField;
            theField = this.getAbstractSegmentPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractSegmentPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAbstractSegmentPoint();
            JAXBElement<? extends AbstractSegmentPointType> theField;
            theField = this.getAbstractSegmentPoint();
            strategy.appendField(locator, this, "abstractSegmentPoint", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
