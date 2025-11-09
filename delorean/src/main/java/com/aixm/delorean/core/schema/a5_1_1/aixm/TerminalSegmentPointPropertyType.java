
package com.aixm.delorean.core.schema.a5_1_1.aixm;

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
 * <p>Java class for TerminalSegmentPointPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TerminalSegmentPointPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}TerminalSegmentPoint"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalSegmentPointPropertyType", propOrder = {
    "terminalSegmentPoint"
})
@Entity(name = "TerminalSegmentPointPropertyType")
@Table(name = "terminalsegmentpoint_pt", schema = "navaids_point")
public class TerminalSegmentPointPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "TerminalSegmentPoint", required = true)
    protected TerminalSegmentPointType terminalSegmentPoint;

    /**
     * Gets the value of the terminalSegmentPoint property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalSegmentPointType }
     *     
     */
    @OneToOne(targetEntity = TerminalSegmentPointType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "terminalsegmentpoint_id", referencedColumnName = "hjid")
    public TerminalSegmentPointType getTerminalSegmentPoint() {
        return terminalSegmentPoint;
    }

    /**
     * Sets the value of the terminalSegmentPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalSegmentPointType }
     *     
     */
    public void setTerminalSegmentPoint(TerminalSegmentPointType value) {
        this.terminalSegmentPoint = value;
    }

    @Transient
    public boolean isSetTerminalSegmentPoint() {
        return (this.terminalSegmentPoint!= null);
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
        final TerminalSegmentPointPropertyType that = ((TerminalSegmentPointPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetTerminalSegmentPoint();
            boolean rhsFieldIsSet = that.isSetTerminalSegmentPoint();
            TerminalSegmentPointType lhsField;
            lhsField = this.getTerminalSegmentPoint();
            TerminalSegmentPointType rhsField;
            rhsField = that.getTerminalSegmentPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "terminalSegmentPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "terminalSegmentPoint", rhsField);
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
            boolean theFieldIsSet = this.isSetTerminalSegmentPoint();
            TerminalSegmentPointType theField;
            theField = this.getTerminalSegmentPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "terminalSegmentPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetTerminalSegmentPoint();
            TerminalSegmentPointType theField;
            theField = this.getTerminalSegmentPoint();
            strategy.appendField(locator, this, "terminalSegmentPoint", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
