
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import com.aixm.delorean.core.gis.adapter.a5_1_1.gis.CurveTypeAdapter;
import com.aixm.delorean.core.gis.type.a5_1_1.AixmCurveType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.CurveType;
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
 * <p>Java class for CurvePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CurvePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element name="Curve" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurvePropertyType", propOrder = {
    "curve"
})
@Entity(name = "AIXMCurvePropertyType")
@Table(name = "aixm_curve_pt", schema = "gml")
public class AIXMCurvePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "Curve", required = true, type = CurveType.class)
    @XmlJavaTypeAdapter(CurveTypeAdapter.class)
    protected AixmCurveType curve;

    /**
     * Gets the value of the curve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Transient
    public AixmCurveType getCurve() {
        return curve;
    }

    /**
     * Sets the value of the curve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurve(AixmCurveType value) {
        this.curve = value;
    }

    @Transient
    public boolean isSetCurve() {
        return (this.curve!= null);
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
        final AIXMCurvePropertyType that = ((AIXMCurvePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetCurve();
            boolean rhsFieldIsSet = that.isSetCurve();
            AixmCurveType lhsField;
            lhsField = this.getCurve();
            AixmCurveType rhsField;
            rhsField = that.getCurve();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "curve", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "curve", rhsField);
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
            boolean theFieldIsSet = this.isSetCurve();
            AixmCurveType theField;
            theField = this.getCurve();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "curve", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetCurve();
            AixmCurveType theField;
            theField = this.getCurve();
            strategy.appendField(locator, this, "curve", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
