
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
 * <p>Java class for WorkareaActivityPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WorkareaActivityPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}WorkareaActivity"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkareaActivityPropertyType", propOrder = {
    "workareaActivity"
})
@Entity(name = "WorkareaActivityPropertyType")
@Table(name = "workareaactivity_pt", schema = "airport_heliport")
public class WorkareaActivityPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "WorkareaActivity", required = true)
    protected WorkareaActivityType workareaActivity;

    /**
     * Gets the value of the workareaActivity property.
     * 
     * @return
     *     possible object is
     *     {@link WorkareaActivityType }
     *     
     */
    @OneToOne(targetEntity = WorkareaActivityType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "workareaactivity_id", referencedColumnName = "hjid")
    public WorkareaActivityType getWorkareaActivity() {
        return workareaActivity;
    }

    /**
     * Sets the value of the workareaActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkareaActivityType }
     *     
     */
    public void setWorkareaActivity(WorkareaActivityType value) {
        this.workareaActivity = value;
    }

    @Transient
    public boolean isSetWorkareaActivity() {
        return (this.workareaActivity!= null);
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
        final WorkareaActivityPropertyType that = ((WorkareaActivityPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetWorkareaActivity();
            boolean rhsFieldIsSet = that.isSetWorkareaActivity();
            WorkareaActivityType lhsField;
            lhsField = this.getWorkareaActivity();
            WorkareaActivityType rhsField;
            rhsField = that.getWorkareaActivity();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "workareaActivity", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "workareaActivity", rhsField);
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
            boolean theFieldIsSet = this.isSetWorkareaActivity();
            WorkareaActivityType theField;
            theField = this.getWorkareaActivity();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "workareaActivity", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetWorkareaActivity();
            WorkareaActivityType theField;
            theField = this.getWorkareaActivity();
            strategy.appendField(locator, this, "workareaActivity", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
