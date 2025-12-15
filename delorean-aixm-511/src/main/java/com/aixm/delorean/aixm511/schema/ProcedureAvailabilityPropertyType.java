
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
 * <p>Java class for ProcedureAvailabilityPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProcedureAvailabilityPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ProcedureAvailability"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedureAvailabilityPropertyType", propOrder = {
    "procedureAvailability"
})
@Entity(name = "ProcedureAvailabilityPropertyType")
@Table(name = "procedureavailability_pt", schema = "procedure")
public class ProcedureAvailabilityPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ProcedureAvailability", required = true)
    protected ProcedureAvailabilityType procedureAvailability;

    /**
     * Gets the value of the procedureAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureAvailabilityType }
     *     
     */
    @OneToOne(targetEntity = ProcedureAvailabilityType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "procedureavailability_id", referencedColumnName = "hjid")
    public ProcedureAvailabilityType getProcedureAvailability() {
        return procedureAvailability;
    }

    /**
     * Sets the value of the procedureAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureAvailabilityType }
     *     
     */
    public void setProcedureAvailability(ProcedureAvailabilityType value) {
        this.procedureAvailability = value;
    }

    @Transient
    public boolean isSetProcedureAvailability() {
        return (this.procedureAvailability!= null);
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
        final ProcedureAvailabilityPropertyType that = ((ProcedureAvailabilityPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetProcedureAvailability();
            boolean rhsFieldIsSet = that.isSetProcedureAvailability();
            ProcedureAvailabilityType lhsField;
            lhsField = this.getProcedureAvailability();
            ProcedureAvailabilityType rhsField;
            rhsField = that.getProcedureAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "procedureAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "procedureAvailability", rhsField);
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
            boolean theFieldIsSet = this.isSetProcedureAvailability();
            ProcedureAvailabilityType theField;
            theField = this.getProcedureAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "procedureAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetProcedureAvailability();
            ProcedureAvailabilityType theField;
            theField = this.getProcedureAvailability();
            strategy.appendField(locator, this, "procedureAvailability", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
