
package com.aixm.delorean.core.org.gml.v_3_2;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
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
{

    @XmlElement(required = true)
    protected ClothoidType.RefLocation refLocation;
    @XmlElement(required = true)
    protected BigDecimal scaleFactor;
    protected double startParameter;
    protected double endParameter;
    @XmlAttribute(name = "interpolation")
    protected CurveInterpolationType interpolation;

    /**
     * Gets the value of the refLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ClothoidType.RefLocation }
     *     
     */
    public ClothoidType.RefLocation getRefLocation() {
        return refLocation;
    }

    /**
     * Sets the value of the refLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClothoidType.RefLocation }
     *     
     */
    public void setRefLocation(ClothoidType.RefLocation value) {
        this.refLocation = value;
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

    /**
     * Gets the value of the interpolation property.
     * 
     * @return
     *     possible object is
     *     {@link CurveInterpolationType }
     *     
     */
    public CurveInterpolationType getInterpolation() {
        if (interpolation == null) {
            return CurveInterpolationType.CLOTHOID;
        } else {
            return interpolation;
        }
    }

    /**
     * Sets the value of the interpolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveInterpolationType }
     *     
     */
    public void setInterpolation(CurveInterpolationType value) {
        this.interpolation = value;
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
            boolean lhsFieldIsSet = (this.refLocation!= null);
            boolean rhsFieldIsSet = (that.refLocation!= null);
            ClothoidType.RefLocation lhsField;
            lhsField = this.getRefLocation();
            ClothoidType.RefLocation rhsField;
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
        {
            boolean lhsFieldIsSet = (this.scaleFactor!= null);
            boolean rhsFieldIsSet = (that.scaleFactor!= null);
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
            boolean lhsFieldIsSet = (this.interpolation!= null);
            boolean rhsFieldIsSet = (that.interpolation!= null);
            CurveInterpolationType lhsField;
            lhsField = this.getInterpolation();
            CurveInterpolationType rhsField;
            rhsField = that.getInterpolation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "interpolation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "interpolation", rhsField);
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
            boolean theFieldIsSet = (this.refLocation!= null);
            ClothoidType.RefLocation theField;
            theField = this.getRefLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "refLocation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.scaleFactor!= null);
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
        {
            boolean theFieldIsSet = (this.interpolation!= null);
            CurveInterpolationType theField;
            theField = this.getInterpolation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "interpolation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.refLocation!= null);
            ClothoidType.RefLocation theField;
            theField = this.getRefLocation();
            strategy.appendField(locator, this, "refLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.scaleFactor!= null);
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
        {
            boolean theFieldIsSet = (this.interpolation!= null);
            CurveInterpolationType theField;
            theField = this.getInterpolation();
            strategy.appendField(locator, this, "interpolation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element ref="{http://www.opengis.net/gml/3.2}AffinePlacement"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affinePlacement"
    })
    @Entity(name = "ClothoidType$RefLocation")
    @Table(name = "REF_LOCATION")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class RefLocation implements Equals, HashCode, ToString
    {

        /**
         * location, refDirection, inDimension and outDimension have the same meaning as specified in ISO 19107:2003, 6.4.21.
         * 
         */
        @XmlElement(name = "AffinePlacement", required = true)
        protected AffinePlacementType affinePlacement;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;

        /**
         * location, refDirection, inDimension and outDimension have the same meaning as specified in ISO 19107:2003, 6.4.21.
         * 
         * @return
         *     possible object is
         *     {@link AffinePlacementType }
         *     
         */
        @Transient
        public AffinePlacementType getAffinePlacement() {
            return affinePlacement;
        }

        /**
         * Sets the value of the affinePlacement property.
         * 
         * @param value
         *     allowed object is
         *     {@link AffinePlacementType }
         *     
         * @see #getAffinePlacement()
         */
        public void setAffinePlacement(AffinePlacementType value) {
            this.affinePlacement = value;
        }

        /**
         * Gets the value of the hjid property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Id
        @Column(name = "HJID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getHjid() {
            return hjid;
        }

        /**
         * Sets the value of the hjid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHjid(Long value) {
            this.hjid = value;
        }

        @Override
        public boolean equals(Object object) {
            ObjectLocator thisLocator = null;
            ObjectLocator thatLocator = null;
            final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
            if (strategy.isDebugEnabled()) {
                thisLocator = new DefaultRootObjectLocator(this);
                thatLocator = new DefaultRootObjectLocator(object);
            }
            return equals(thisLocator, thatLocator, object, strategy);
        }

        @Override
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ClothoidType.RefLocation that = ((ClothoidType.RefLocation) object);
            {
                boolean lhsFieldIsSet = (this.affinePlacement!= null);
                boolean rhsFieldIsSet = (that.affinePlacement!= null);
                AffinePlacementType lhsField;
                lhsField = this.getAffinePlacement();
                AffinePlacementType rhsField;
                rhsField = that.getAffinePlacement();
                ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "affinePlacement", lhsField);
                ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "affinePlacement", rhsField);
                if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int hashCode() {
            ObjectLocator theLocator = null;
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
            if (strategy.isDebugEnabled()) {
                theLocator = new DefaultRootObjectLocator(this);
            }
            return this.hashCode(theLocator, strategy);
        }

        @Override
        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                boolean theFieldIsSet = (this.affinePlacement!= null);
                AffinePlacementType theField;
                theField = this.getAffinePlacement();
                ObjectLocator theFieldLocator = LocatorUtils.property(locator, "affinePlacement", theField);
                currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
            }
            return currentHashCode;
        }

        @Override
        public String toString() {
            ObjectLocator theLocator = null;
            final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
            if (strategy.isTraceEnabled()) {
                theLocator = new DefaultRootObjectLocator(this);
            }
            final StringBuilder buffer = new StringBuilder();
            append(theLocator, buffer, strategy);
            return buffer.toString();
        }

        @Override
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Override
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                boolean theFieldIsSet = (this.affinePlacement!= null);
                AffinePlacementType theField;
                theField = this.getAffinePlacement();
                strategy.appendField(locator, this, "affinePlacement", buffer, theField, theFieldIsSet);
            }
            return buffer;
        }

    }

}
