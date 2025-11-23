
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
 * <p>Java class for AerialRefuellingType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AerialRefuellingType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMFeatureType">
 *       <sequence>
 *         <element name="timeSlice" type="{http://www.aixm.aero/schema/5.1.1}AerialRefuellingTimeSlicePropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerialRefuellingType", propOrder = {
    "timeSlice"
})
@Entity(name = "AerialRefuellingType")
@Table(name = "aerialrefuelling", schema = "aerial_refuelling")
public class AerialRefuellingType
    extends AbstractAIXMFeatureType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected List<AerialRefuellingTimeSlicePropertyType> timeSlice;

    /**
     * Gets the value of the timeSlice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSlice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSlice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerialRefuellingTimeSlicePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AerialRefuellingTimeSlicePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "timeslice_aerialrefuelling_link", schema = "aerial_refuelling", joinColumns = {
        @JoinColumn(name = "timeslice", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "aerialrefuellingtype", referencedColumnName = "hjid")
    })
    public List<AerialRefuellingTimeSlicePropertyType> getTimeSlice() {
        if (timeSlice == null) {
            timeSlice = new ArrayList<>();
        }
        return this.timeSlice;
    }

    /**
     * 
     * 
     */
    public void setTimeSlice(List<AerialRefuellingTimeSlicePropertyType> timeSlice) {
        this.timeSlice = timeSlice;
    }

    @Transient
    public boolean isSetTimeSlice() {
        return ((this.timeSlice!= null)&&(!this.timeSlice.isEmpty()));
    }

    public void unsetTimeSlice() {
        this.timeSlice = null;
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
        final AerialRefuellingType that = ((AerialRefuellingType) object);
        {
            boolean lhsFieldIsSet = this.isSetTimeSlice();
            boolean rhsFieldIsSet = that.isSetTimeSlice();
            List<AerialRefuellingTimeSlicePropertyType> lhsField;
            lhsField = (this.isSetTimeSlice()?this.getTimeSlice():null);
            List<AerialRefuellingTimeSlicePropertyType> rhsField;
            rhsField = (that.isSetTimeSlice()?that.getTimeSlice():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timeSlice", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timeSlice", rhsField);
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
            boolean theFieldIsSet = this.isSetTimeSlice();
            List<AerialRefuellingTimeSlicePropertyType> theField;
            theField = (this.isSetTimeSlice()?this.getTimeSlice():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timeSlice", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetTimeSlice();
            List<AerialRefuellingTimeSlicePropertyType> theField;
            theField = (this.isSetTimeSlice()?this.getTimeSlice():null);
            strategy.appendField(locator, this, "timeSlice", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
