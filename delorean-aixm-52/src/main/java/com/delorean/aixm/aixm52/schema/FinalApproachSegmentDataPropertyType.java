
package com.delorean.aixm.aixm52.schema;

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
import java.io.Serializable;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for FinalApproachSegmentDataPropertyType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="FinalApproachSegmentDataPropertyType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref=
"{http://www.aixm.aero/schema/5.2}FinalApproachSegmentData"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinalApproachSegmentDataPropertyType", propOrder = {"finalApproachSegmentData"})
@Entity(name = "FinalApproachSegmentDataPropertyType")
@Table(name = "finalapproachsegmentdatapropertytype", schema = "procedure")
public class FinalApproachSegmentDataPropertyType extends AbstractAIXMPropertyType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FinalApproachSegmentData", required = true)
    protected FinalApproachSegmentDataType finalApproachSegmentData;

    /**
     * Gets the value of the finalApproachSegmentData property.
     *
     * @return possible object is {@link FinalApproachSegmentDataType }
     *
     */
    @OneToOne(targetEntity = FinalApproachSegmentDataType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalapproachsegmentdata_hjid", referencedColumnName = "hjid")
    public FinalApproachSegmentDataType getFinalApproachSegmentData() {
        return finalApproachSegmentData;
    }

    /**
     * Sets the value of the finalApproachSegmentData property.
     *
     * @param value
     *            allowed object is {@link FinalApproachSegmentDataType }
     *
     */
    public void setFinalApproachSegmentData(FinalApproachSegmentDataType value) {
        this.finalApproachSegmentData = value;
    }

    @Transient
    public boolean isSetFinalApproachSegmentData() {
        return (this.finalApproachSegmentData != null);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
            EqualsStrategy strategy) {
        if ((object == null) || (this.getClass() != object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FinalApproachSegmentDataPropertyType that = ((FinalApproachSegmentDataPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFinalApproachSegmentData();
            boolean rhsFieldIsSet = that.isSetFinalApproachSegmentData();
            FinalApproachSegmentDataType lhsField;
            lhsField = this.getFinalApproachSegmentData();
            FinalApproachSegmentDataType rhsField;
            rhsField = that.getFinalApproachSegmentData();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalApproachSegmentData", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalApproachSegmentData", rhsField);
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
            boolean theFieldIsSet = this.isSetFinalApproachSegmentData();
            FinalApproachSegmentDataType theField;
            theField = this.getFinalApproachSegmentData();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalApproachSegmentData", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFinalApproachSegmentData();
            FinalApproachSegmentDataType theField;
            theField = this.getFinalApproachSegmentData();
            strategy.appendField(locator, this, "finalApproachSegmentData", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
