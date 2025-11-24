
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
 * <p>Java class for RunwaySectionContaminationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RunwaySectionContaminationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}RunwaySectionContamination"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwaySectionContaminationPropertyType", propOrder = {
    "runwaySectionContamination"
})
@Entity(name = "RunwaySectionContaminationPropertyType")
@Table(name = "runwaysectioncontamination_pt", schema = "airport_heliport")
public class RunwaySectionContaminationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "RunwaySectionContamination", required = true)
    protected RunwaySectionContaminationType runwaySectionContamination;

    /**
     * Gets the value of the runwaySectionContamination property.
     * 
     * @return
     *     possible object is
     *     {@link RunwaySectionContaminationType }
     *     
     */
    @OneToOne(targetEntity = RunwaySectionContaminationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "runwaysectioncontamination_id", referencedColumnName = "hjid")
    public RunwaySectionContaminationType getRunwaySectionContamination() {
        return runwaySectionContamination;
    }

    /**
     * Sets the value of the runwaySectionContamination property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwaySectionContaminationType }
     *     
     */
    public void setRunwaySectionContamination(RunwaySectionContaminationType value) {
        this.runwaySectionContamination = value;
    }

    @Transient
    public boolean isSetRunwaySectionContamination() {
        return (this.runwaySectionContamination!= null);
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
        final RunwaySectionContaminationPropertyType that = ((RunwaySectionContaminationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetRunwaySectionContamination();
            boolean rhsFieldIsSet = that.isSetRunwaySectionContamination();
            RunwaySectionContaminationType lhsField;
            lhsField = this.getRunwaySectionContamination();
            RunwaySectionContaminationType rhsField;
            rhsField = that.getRunwaySectionContamination();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwaySectionContamination", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwaySectionContamination", rhsField);
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
            boolean theFieldIsSet = this.isSetRunwaySectionContamination();
            RunwaySectionContaminationType theField;
            theField = this.getRunwaySectionContamination();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwaySectionContamination", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetRunwaySectionContamination();
            RunwaySectionContaminationType theField;
            theField = this.getRunwaySectionContamination();
            strategy.appendField(locator, this, "runwaySectionContamination", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
