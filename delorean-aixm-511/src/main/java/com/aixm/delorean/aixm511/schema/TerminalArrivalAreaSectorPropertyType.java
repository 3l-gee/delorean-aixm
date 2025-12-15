
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
 * <p>Java class for TerminalArrivalAreaSectorPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TerminalArrivalAreaSectorPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}TerminalArrivalAreaSector"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalArrivalAreaSectorPropertyType", propOrder = {
    "terminalArrivalAreaSector"
})
@Entity(name = "TerminalArrivalAreaSectorPropertyType")
@Table(name = "terminalarrivalareasector_pt", schema = "procedure")
public class TerminalArrivalAreaSectorPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "TerminalArrivalAreaSector", required = true)
    protected TerminalArrivalAreaSectorType terminalArrivalAreaSector;

    /**
     * Gets the value of the terminalArrivalAreaSector property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalArrivalAreaSectorType }
     *     
     */
    @OneToOne(targetEntity = TerminalArrivalAreaSectorType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "terminalarrivalareasector_id", referencedColumnName = "hjid")
    public TerminalArrivalAreaSectorType getTerminalArrivalAreaSector() {
        return terminalArrivalAreaSector;
    }

    /**
     * Sets the value of the terminalArrivalAreaSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalArrivalAreaSectorType }
     *     
     */
    public void setTerminalArrivalAreaSector(TerminalArrivalAreaSectorType value) {
        this.terminalArrivalAreaSector = value;
    }

    @Transient
    public boolean isSetTerminalArrivalAreaSector() {
        return (this.terminalArrivalAreaSector!= null);
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
        final TerminalArrivalAreaSectorPropertyType that = ((TerminalArrivalAreaSectorPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetTerminalArrivalAreaSector();
            boolean rhsFieldIsSet = that.isSetTerminalArrivalAreaSector();
            TerminalArrivalAreaSectorType lhsField;
            lhsField = this.getTerminalArrivalAreaSector();
            TerminalArrivalAreaSectorType rhsField;
            rhsField = that.getTerminalArrivalAreaSector();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "terminalArrivalAreaSector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "terminalArrivalAreaSector", rhsField);
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
            boolean theFieldIsSet = this.isSetTerminalArrivalAreaSector();
            TerminalArrivalAreaSectorType theField;
            theField = this.getTerminalArrivalAreaSector();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "terminalArrivalAreaSector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetTerminalArrivalAreaSector();
            TerminalArrivalAreaSectorType theField;
            theField = this.getTerminalArrivalAreaSector();
            strategy.appendField(locator, this, "terminalArrivalAreaSector", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
