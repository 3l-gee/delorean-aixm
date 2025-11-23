
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
 * <p>Java class for RunwayContaminationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RunwayContaminationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}RunwayContamination"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwayContaminationPropertyType", propOrder = {
    "runwayContamination"
})
@Entity(name = "RunwayContaminationPropertyType")
@Table(name = "runwaycontamination_pt", schema = "airport_heliport")
public class RunwayContaminationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "RunwayContamination", required = true)
    protected RunwayContaminationType runwayContamination;

    /**
     * Gets the value of the runwayContamination property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayContaminationType }
     *     
     */
    @OneToOne(targetEntity = RunwayContaminationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "runwaycontamination_id", referencedColumnName = "hjid")
    public RunwayContaminationType getRunwayContamination() {
        return runwayContamination;
    }

    /**
     * Sets the value of the runwayContamination property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayContaminationType }
     *     
     */
    public void setRunwayContamination(RunwayContaminationType value) {
        this.runwayContamination = value;
    }

    @Transient
    public boolean isSetRunwayContamination() {
        return (this.runwayContamination!= null);
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
        final RunwayContaminationPropertyType that = ((RunwayContaminationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetRunwayContamination();
            boolean rhsFieldIsSet = that.isSetRunwayContamination();
            RunwayContaminationType lhsField;
            lhsField = this.getRunwayContamination();
            RunwayContaminationType rhsField;
            rhsField = that.getRunwayContamination();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayContamination", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayContamination", rhsField);
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
            boolean theFieldIsSet = this.isSetRunwayContamination();
            RunwayContaminationType theField;
            theField = this.getRunwayContamination();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayContamination", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetRunwayContamination();
            RunwayContaminationType theField;
            theField = this.getRunwayContamination();
            strategy.appendField(locator, this, "runwayContamination", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
