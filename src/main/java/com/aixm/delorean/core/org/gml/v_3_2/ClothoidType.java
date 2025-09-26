
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for ClothoidType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClothoidType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType">
 *       <sequence>
 *         <element name="refLocation">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.opengis.net/gml/3.2}AffinePlacement"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="scaleFactor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="startParameter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="endParameter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *       <attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="clothoid" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClothoidType", propOrder = {
    "refLocation",
    "scaleFactor",
    "startParameter",
    "endParameter"
})
public class ClothoidType
    extends AbstractCurveSegmentType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected RefLocation refLocation;
    @XmlElement(required = true)
    protected BigDecimal scaleFactor;
    protected double startParameter;
    protected double endParameter;
    @XmlAttribute(name = "interpolation")
    public static final CurveInterpolationType INTERPOLATION = CurveInterpolationType.CLOTHOID;

    /**
     * Gets the value of the refLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RefLocation }
     *     
     */
    public RefLocation getRefLocation() {
        return refLocation;
    }

    /**
     * Sets the value of the refLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefLocation }
     *     
     */
    public void setRefLocation(RefLocation value) {
        this.refLocation = value;
    }

    public boolean isSetRefLocation() {
        return (this.refLocation!= null);
    }

    /**
     * Gets the value of the scaleFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScaleFactor() {
        return scaleFactor;
    }

    /**
     * Sets the value of the scaleFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScaleFactor(BigDecimal value) {
        this.scaleFactor = value;
    }

    public boolean isSetScaleFactor() {
        return (this.scaleFactor!= null);
    }

    /**
     * Gets the value of the startParameter property.
     * 
     */
    public double getStartParameter() {
        return startParameter;
    }

    /**
     * Sets the value of the startParameter property.
     * 
     */
    public void setStartParameter(double value) {
        this.startParameter = value;
    }

    public boolean isSetStartParameter() {
        return true;
    }

    /**
     * Gets the value of the endParameter property.
     * 
     */
    public double getEndParameter() {
        return endParameter;
    }

    /**
     * Sets the value of the endParameter property.
     * 
     */
    public void setEndParameter(double value) {
        this.endParameter = value;
    }

    public boolean isSetEndParameter() {
        return true;
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
        final ClothoidType that = ((ClothoidType) object);
        {
            boolean lhsFieldIsSet = this.isSetScaleFactor();
            boolean rhsFieldIsSet = that.isSetScaleFactor();
            BigDecimal lhsField;
            lhsField = this.getScaleFactor();
            BigDecimal rhsField;
            rhsField = that.getScaleFactor();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "scaleFactor", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "scaleFactor", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = true;
            boolean rhsFieldIsSet = true;
            double lhsField;
            lhsField = this.getStartParameter();
            double rhsField;
            rhsField = that.getStartParameter();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startParameter", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startParameter", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRefLocation();
            boolean rhsFieldIsSet = that.isSetRefLocation();
            RefLocation lhsField;
            lhsField = this.getRefLocation();
            RefLocation rhsField;
            rhsField = that.getRefLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "refLocation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "refLocation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = true;
            boolean rhsFieldIsSet = true;
            double lhsField;
            lhsField = this.getEndParameter();
            double rhsField;
            rhsField = that.getEndParameter();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endParameter", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endParameter", rhsField);
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
            boolean theFieldIsSet = this.isSetRefLocation();
            RefLocation theField;
            theField = this.getRefLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "refLocation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetScaleFactor();
            BigDecimal theField;
            theField = this.getScaleFactor();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "scaleFactor", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = true;
            double theField;
            theField = this.getStartParameter();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startParameter", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = true;
            double theField;
            theField = this.getEndParameter();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endParameter", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetRefLocation();
            RefLocation theField;
            theField = this.getRefLocation();
            strategy.appendField(locator, this, "refLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetScaleFactor();
            BigDecimal theField;
            theField = this.getScaleFactor();
            strategy.appendField(locator, this, "scaleFactor", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = true;
            double theField;
            theField = this.getStartParameter();
            strategy.appendField(locator, this, "startParameter", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = true;
            double theField;
            theField = this.getEndParameter();
            strategy.appendField(locator, this, "endParameter", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
