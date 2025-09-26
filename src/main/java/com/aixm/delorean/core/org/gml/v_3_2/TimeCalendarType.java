
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for TimeCalendarType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeCalendarType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}TimeReferenceSystemType">
 *       <sequence>
 *         <element name="referenceFrame" type="{http://www.opengis.net/gml/3.2}TimeCalendarEraPropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCalendarType", propOrder = {
    "referenceFrame"
})
public class TimeCalendarType
    extends TimeReferenceSystemType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected List<TimeCalendarEraPropertyType> referenceFrame;

    /**
     * Gets the value of the referenceFrame property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceFrame property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceFrame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeCalendarEraPropertyType }
     * 
     * 
     */
    public List<TimeCalendarEraPropertyType> getReferenceFrame() {
        if (referenceFrame == null) {
            referenceFrame = new ArrayList<>();
        }
        return this.referenceFrame;
    }

    /**
     * 
     * 
     */
    public void setReferenceFrame(List<TimeCalendarEraPropertyType> referenceFrame) {
        this.referenceFrame = referenceFrame;
    }

    public boolean isSetReferenceFrame() {
        return ((this.referenceFrame!= null)&&(!this.referenceFrame.isEmpty()));
    }

    public void unsetReferenceFrame() {
        this.referenceFrame = null;
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
        final TimeCalendarType that = ((TimeCalendarType) object);
        {
            boolean lhsFieldIsSet = this.isSetReferenceFrame();
            boolean rhsFieldIsSet = that.isSetReferenceFrame();
            List<TimeCalendarEraPropertyType> lhsField;
            lhsField = (this.isSetReferenceFrame()?this.getReferenceFrame():null);
            List<TimeCalendarEraPropertyType> rhsField;
            rhsField = (that.isSetReferenceFrame()?that.getReferenceFrame():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceFrame", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceFrame", rhsField);
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
            boolean theFieldIsSet = this.isSetReferenceFrame();
            List<TimeCalendarEraPropertyType> theField;
            theField = (this.isSetReferenceFrame()?this.getReferenceFrame():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceFrame", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetReferenceFrame();
            List<TimeCalendarEraPropertyType> theField;
            theField = (this.isSetReferenceFrame()?this.getReferenceFrame():null);
            strategy.appendField(locator, this, "referenceFrame", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
