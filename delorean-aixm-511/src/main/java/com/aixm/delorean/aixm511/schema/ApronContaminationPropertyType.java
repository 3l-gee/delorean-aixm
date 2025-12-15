
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
 * <p>Java class for ApronContaminationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApronContaminationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ApronContamination"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApronContaminationPropertyType", propOrder = {
    "apronContamination"
})
@Entity(name = "ApronContaminationPropertyType")
@Table(name = "aproncontamination_pt", schema = "airport_heliport")
public class ApronContaminationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ApronContamination", required = true)
    protected ApronContaminationType apronContamination;

    /**
     * Gets the value of the apronContamination property.
     * 
     * @return
     *     possible object is
     *     {@link ApronContaminationType }
     *     
     */
    @OneToOne(targetEntity = ApronContaminationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "aproncontamination_id", referencedColumnName = "hjid")
    public ApronContaminationType getApronContamination() {
        return apronContamination;
    }

    /**
     * Sets the value of the apronContamination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApronContaminationType }
     *     
     */
    public void setApronContamination(ApronContaminationType value) {
        this.apronContamination = value;
    }

    @Transient
    public boolean isSetApronContamination() {
        return (this.apronContamination!= null);
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
        final ApronContaminationPropertyType that = ((ApronContaminationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetApronContamination();
            boolean rhsFieldIsSet = that.isSetApronContamination();
            ApronContaminationType lhsField;
            lhsField = this.getApronContamination();
            ApronContaminationType rhsField;
            rhsField = that.getApronContamination();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "apronContamination", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "apronContamination", rhsField);
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
            boolean theFieldIsSet = this.isSetApronContamination();
            ApronContaminationType theField;
            theField = this.getApronContamination();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "apronContamination", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetApronContamination();
            ApronContaminationType theField;
            theField = this.getApronContamination();
            strategy.appendField(locator, this, "apronContamination", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
