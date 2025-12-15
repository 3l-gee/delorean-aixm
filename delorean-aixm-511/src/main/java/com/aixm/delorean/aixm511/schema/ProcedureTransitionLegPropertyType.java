
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
 * <p>Java class for ProcedureTransitionLegPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProcedureTransitionLegPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ProcedureTransitionLeg"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedureTransitionLegPropertyType", propOrder = {
    "procedureTransitionLeg"
})
@Entity(name = "ProcedureTransitionLegPropertyType")
@Table(name = "proceduretransitionleg_pt", schema = "procedure")
public class ProcedureTransitionLegPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ProcedureTransitionLeg", required = true)
    protected ProcedureTransitionLegType procedureTransitionLeg;

    /**
     * Gets the value of the procedureTransitionLeg property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureTransitionLegType }
     *     
     */
    @OneToOne(targetEntity = ProcedureTransitionLegType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "proceduretransitionleg_id", referencedColumnName = "hjid")
    public ProcedureTransitionLegType getProcedureTransitionLeg() {
        return procedureTransitionLeg;
    }

    /**
     * Sets the value of the procedureTransitionLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureTransitionLegType }
     *     
     */
    public void setProcedureTransitionLeg(ProcedureTransitionLegType value) {
        this.procedureTransitionLeg = value;
    }

    @Transient
    public boolean isSetProcedureTransitionLeg() {
        return (this.procedureTransitionLeg!= null);
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
        final ProcedureTransitionLegPropertyType that = ((ProcedureTransitionLegPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetProcedureTransitionLeg();
            boolean rhsFieldIsSet = that.isSetProcedureTransitionLeg();
            ProcedureTransitionLegType lhsField;
            lhsField = this.getProcedureTransitionLeg();
            ProcedureTransitionLegType rhsField;
            rhsField = that.getProcedureTransitionLeg();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "procedureTransitionLeg", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "procedureTransitionLeg", rhsField);
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
            boolean theFieldIsSet = this.isSetProcedureTransitionLeg();
            ProcedureTransitionLegType theField;
            theField = this.getProcedureTransitionLeg();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "procedureTransitionLeg", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetProcedureTransitionLeg();
            ProcedureTransitionLegType theField;
            theField = this.getProcedureTransitionLeg();
            strategy.appendField(locator, this, "procedureTransitionLeg", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
