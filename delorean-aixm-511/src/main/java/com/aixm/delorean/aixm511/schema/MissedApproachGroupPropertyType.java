
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
 * <p>Java class for MissedApproachGroupPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MissedApproachGroupPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}MissedApproachGroup"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissedApproachGroupPropertyType", propOrder = {
    "missedApproachGroup"
})
@Entity(name = "MissedApproachGroupPropertyType")
@Table(name = "missedapproachgroup_pt", schema = "procedure")
public class MissedApproachGroupPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "MissedApproachGroup", required = true)
    protected MissedApproachGroupType missedApproachGroup;

    /**
     * Gets the value of the missedApproachGroup property.
     * 
     * @return
     *     possible object is
     *     {@link MissedApproachGroupType }
     *     
     */
    @OneToOne(targetEntity = MissedApproachGroupType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "missedapproachgroup_id", referencedColumnName = "hjid")
    public MissedApproachGroupType getMissedApproachGroup() {
        return missedApproachGroup;
    }

    /**
     * Sets the value of the missedApproachGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissedApproachGroupType }
     *     
     */
    public void setMissedApproachGroup(MissedApproachGroupType value) {
        this.missedApproachGroup = value;
    }

    @Transient
    public boolean isSetMissedApproachGroup() {
        return (this.missedApproachGroup!= null);
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
        final MissedApproachGroupPropertyType that = ((MissedApproachGroupPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetMissedApproachGroup();
            boolean rhsFieldIsSet = that.isSetMissedApproachGroup();
            MissedApproachGroupType lhsField;
            lhsField = this.getMissedApproachGroup();
            MissedApproachGroupType rhsField;
            rhsField = that.getMissedApproachGroup();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "missedApproachGroup", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "missedApproachGroup", rhsField);
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
            boolean theFieldIsSet = this.isSetMissedApproachGroup();
            MissedApproachGroupType theField;
            theField = this.getMissedApproachGroup();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "missedApproachGroup", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMissedApproachGroup();
            MissedApproachGroupType theField;
            theField = this.getMissedApproachGroup();
            strategy.appendField(locator, this, "missedApproachGroup", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
