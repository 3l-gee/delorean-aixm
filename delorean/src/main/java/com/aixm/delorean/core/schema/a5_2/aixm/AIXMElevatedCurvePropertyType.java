
package com.aixm.delorean.core.schema.a5_2.aixm;

import java.io.Serializable;
import com.aixm.delorean.core.gis.adapter.a5_2.gis.ElevatedCurveTypeAdapter;
import com.aixm.delorean.core.gis.type.a5_2.DeloreanElevatedCurveType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for ElevatedCurvePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ElevatedCurvePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element name="ElevatedCurve" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevatedCurvePropertyType", propOrder = {
    "elevatedCurve"
})
@Entity(name = "AIXMElevatedCurvePropertyType")
@Table(name = "aixm_elevatedcurve_pt", schema = "gml")
public class AIXMElevatedCurvePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(name = "ElevatedCurve", required = true, type = ElevatedCurveType.class)
    @XmlJavaTypeAdapter(ElevatedCurveTypeAdapter.class)
    protected DeloreanElevatedCurveType elevatedCurve;

    /**
     * Gets the value of the elevatedCurve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
@jakarta.persistence.OneToOne(cascade = jakarta.persistence.CascadeType.ALL, fetch = jakarta.persistence.FetchType.EAGER)
@jakarta.persistence.JoinColumn(name = "elevated_curve_id")
    public DeloreanElevatedCurveType getElevatedCurve() {
        return elevatedCurve;
    }

    /**
     * Sets the value of the elevatedCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevatedCurve(DeloreanElevatedCurveType value) {
        this.elevatedCurve = value;
    }

    @Transient
    public boolean isSetElevatedCurve() {
        return (this.elevatedCurve!= null);
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
        final AIXMElevatedCurvePropertyType that = ((AIXMElevatedCurvePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetElevatedCurve();
            boolean rhsFieldIsSet = that.isSetElevatedCurve();
            DeloreanElevatedCurveType lhsField;
            lhsField = this.getElevatedCurve();
            DeloreanElevatedCurveType rhsField;
            rhsField = that.getElevatedCurve();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elevatedCurve", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elevatedCurve", rhsField);
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
            boolean theFieldIsSet = this.isSetElevatedCurve();
            DeloreanElevatedCurveType theField;
            theField = this.getElevatedCurve();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elevatedCurve", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetElevatedCurve();
            DeloreanElevatedCurveType theField;
            theField = this.getElevatedCurve();
            strategy.appendField(locator, this, "elevatedCurve", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
