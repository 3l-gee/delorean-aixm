
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
 * <p>Java class for ProcedureTransitionPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProcedureTransitionPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ProcedureTransition"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedureTransitionPropertyType", propOrder = {
    "procedureTransition"
})
@Entity(name = "ProcedureTransitionPropertyType")
@Table(name = "proceduretransition_pt", schema = "procedure")
public class ProcedureTransitionPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ProcedureTransition", required = true)
    protected ProcedureTransitionType procedureTransition;

    /**
     * Gets the value of the procedureTransition property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureTransitionType }
     *     
     */
    @OneToOne(targetEntity = ProcedureTransitionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "proceduretransition_id", referencedColumnName = "hjid")
    public ProcedureTransitionType getProcedureTransition() {
        return procedureTransition;
    }

    /**
     * Sets the value of the procedureTransition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureTransitionType }
     *     
     */
    public void setProcedureTransition(ProcedureTransitionType value) {
        this.procedureTransition = value;
    }

    @Transient
    public boolean isSetProcedureTransition() {
        return (this.procedureTransition!= null);
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
        final ProcedureTransitionPropertyType that = ((ProcedureTransitionPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetProcedureTransition();
            boolean rhsFieldIsSet = that.isSetProcedureTransition();
            ProcedureTransitionType lhsField;
            lhsField = this.getProcedureTransition();
            ProcedureTransitionType rhsField;
            rhsField = that.getProcedureTransition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "procedureTransition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "procedureTransition", rhsField);
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
            boolean theFieldIsSet = this.isSetProcedureTransition();
            ProcedureTransitionType theField;
            theField = this.getProcedureTransition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "procedureTransition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetProcedureTransition();
            ProcedureTransitionType theField;
            theField = this.getProcedureTransition();
            strategy.appendField(locator, this, "procedureTransition", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
