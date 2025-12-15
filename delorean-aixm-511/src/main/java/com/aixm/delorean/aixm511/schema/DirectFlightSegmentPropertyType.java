
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for DirectFlightSegmentPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DirectFlightSegmentPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}DirectFlightSegment"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectFlightSegmentPropertyType", propOrder = {
    "directFlightSegment"
})
@Entity(name = "DirectFlightSegmentPropertyType")
@Table(name = "directflightsegment_pt", schema = "route")
public class DirectFlightSegmentPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "DirectFlightSegment", required = true)
    protected DirectFlightSegmentType directFlightSegment;

    /**
     * Gets the value of the directFlightSegment property.
     * 
     * @return
     *     possible object is
     *     {@link DirectFlightSegmentType }
     *     
     */
    @OneToOne(targetEntity = DirectFlightSegmentType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "directflightsegment_id", referencedColumnName = "hjid")
    public DirectFlightSegmentType getDirectFlightSegment() {
        return directFlightSegment;
    }

    /**
     * Sets the value of the directFlightSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectFlightSegmentType }
     *     
     */
    public void setDirectFlightSegment(DirectFlightSegmentType value) {
        this.directFlightSegment = value;
    }

    @Transient
    public boolean isSetDirectFlightSegment() {
        return (this.directFlightSegment!= null);
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
        final DirectFlightSegmentPropertyType that = ((DirectFlightSegmentPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetDirectFlightSegment();
            boolean rhsFieldIsSet = that.isSetDirectFlightSegment();
            DirectFlightSegmentType lhsField;
            lhsField = this.getDirectFlightSegment();
            DirectFlightSegmentType rhsField;
            rhsField = that.getDirectFlightSegment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "directFlightSegment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "directFlightSegment", rhsField);
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
            boolean theFieldIsSet = this.isSetDirectFlightSegment();
            DirectFlightSegmentType theField;
            theField = this.getDirectFlightSegment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "directFlightSegment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDirectFlightSegment();
            DirectFlightSegmentType theField;
            theField = this.getDirectFlightSegment();
            strategy.appendField(locator, this, "directFlightSegment", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
