
package com.aixm.delorean.core.org.gml.v_3_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for CubicSplineType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CubicSplineType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType">
 *       <sequence>
 *         <choice>
 *           <choice maxOccurs="unbounded" minOccurs="2">
 *             <element ref="{http://www.opengis.net/gml/3.2}pos"/>
 *             <element ref="{http://www.opengis.net/gml/3.2}pointProperty"/>
 *             <element ref="{http://www.opengis.net/gml/3.2}pointRep"/>
 *           </choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}posList"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}coordinates"/>
 *         </choice>
 *         <element name="vectorAtStart" type="{http://www.opengis.net/gml/3.2}VectorType"/>
 *         <element name="vectorAtEnd" type="{http://www.opengis.net/gml/3.2}VectorType"/>
 *       </sequence>
 *       <attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="cubicSpline" />
 *       <attribute name="degree" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="3" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CubicSplineType", propOrder = {
    "posOrPointPropertyOrPointRep",
    "posList",
    "coordinates",
    "vectorAtStart",
    "vectorAtEnd"
})
public class CubicSplineType
    extends AbstractCurveSegmentType
{

    @XmlElementRefs({
        @XmlElementRef(name = "pos", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class),
        @XmlElementRef(name = "pointProperty", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class),
        @XmlElementRef(name = "pointRep", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> posOrPointPropertyOrPointRep;
    protected DirectPositionListType posList;
    protected CoordinatesType coordinates;
    @XmlElement(required = true)
    protected VectorType vectorAtStart;
    @XmlElement(required = true)
    protected VectorType vectorAtEnd;
    @XmlAttribute(name = "interpolation")
    protected CurveInterpolationType interpolation;
    @XmlAttribute(name = "degree")
    protected BigInteger degree;

    /**
     * Gets the value of the posOrPointPropertyOrPointRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posOrPointPropertyOrPointRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosOrPointPropertyOrPointRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DirectPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPosOrPointPropertyOrPointRep() {
        if (posOrPointPropertyOrPointRep == null) {
            posOrPointPropertyOrPointRep = new ArrayList<>();
        }
        return this.posOrPointPropertyOrPointRep;
    }

    /**
     * 
     * 
     */
    public void setPosOrPointPropertyOrPointRep(List<JAXBElement<?>> posOrPointPropertyOrPointRep) {
        this.posOrPointPropertyOrPointRep = posOrPointPropertyOrPointRep;
    }

    /**
     * Gets the value of the posList property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionListType }
     *     
     */
    public DirectPositionListType getPosList() {
        return posList;
    }

    /**
     * Sets the value of the posList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionListType }
     *     
     */
    public void setPosList(DirectPositionListType value) {
        this.posList = value;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the vectorAtStart property.
     * 
     * @return
     *     possible object is
     *     {@link VectorType }
     *     
     */
    public VectorType getVectorAtStart() {
        return vectorAtStart;
    }

    /**
     * Sets the value of the vectorAtStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorType }
     *     
     */
    public void setVectorAtStart(VectorType value) {
        this.vectorAtStart = value;
    }

    /**
     * Gets the value of the vectorAtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link VectorType }
     *     
     */
    public VectorType getVectorAtEnd() {
        return vectorAtEnd;
    }

    /**
     * Sets the value of the vectorAtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorType }
     *     
     */
    public void setVectorAtEnd(VectorType value) {
        this.vectorAtEnd = value;
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
            return CurveInterpolationType.CUBIC_SPLINE;
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

    /**
     * Gets the value of the degree property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDegree() {
        if (degree == null) {
            return new BigInteger("3");
        } else {
            return degree;
        }
    }

    /**
     * Sets the value of the degree property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDegree(BigInteger value) {
        this.degree = value;
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
        final CubicSplineType that = ((CubicSplineType) object);
        {
            boolean lhsFieldIsSet = (this.degree!= null);
            boolean rhsFieldIsSet = (that.degree!= null);
            BigInteger lhsField;
            lhsField = this.getDegree();
            BigInteger rhsField;
            rhsField = that.getDegree();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "degree", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "degree", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.vectorAtStart!= null);
            boolean rhsFieldIsSet = (that.vectorAtStart!= null);
            VectorType lhsField;
            lhsField = this.getVectorAtStart();
            VectorType rhsField;
            rhsField = that.getVectorAtStart();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "vectorAtStart", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "vectorAtStart", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.vectorAtEnd!= null);
            boolean rhsFieldIsSet = (that.vectorAtEnd!= null);
            VectorType lhsField;
            lhsField = this.getVectorAtEnd();
            VectorType rhsField;
            rhsField = that.getVectorAtEnd();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "vectorAtEnd", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "vectorAtEnd", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.coordinates!= null);
            boolean rhsFieldIsSet = (that.coordinates!= null);
            CoordinatesType lhsField;
            lhsField = this.getCoordinates();
            CoordinatesType rhsField;
            rhsField = that.getCoordinates();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "coordinates", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "coordinates", rhsField);
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
        {
            boolean lhsFieldIsSet = (this.posList!= null);
            boolean rhsFieldIsSet = (that.posList!= null);
            DirectPositionListType lhsField;
            lhsField = this.getPosList();
            DirectPositionListType rhsField;
            rhsField = that.getPosList();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "posList", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "posList", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.posOrPointPropertyOrPointRep!= null)&&(!this.posOrPointPropertyOrPointRep.isEmpty()));
            boolean rhsFieldIsSet = ((that.posOrPointPropertyOrPointRep!= null)&&(!that.posOrPointPropertyOrPointRep.isEmpty()));
            List<JAXBElement<?>> lhsField;
            lhsField = (((this.posOrPointPropertyOrPointRep!= null)&&(!this.posOrPointPropertyOrPointRep.isEmpty()))?this.getPosOrPointPropertyOrPointRep():null);
            List<JAXBElement<?>> rhsField;
            rhsField = (((that.posOrPointPropertyOrPointRep!= null)&&(!that.posOrPointPropertyOrPointRep.isEmpty()))?that.getPosOrPointPropertyOrPointRep():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "posOrPointPropertyOrPointRep", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "posOrPointPropertyOrPointRep", rhsField);
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
            boolean theFieldIsSet = ((this.posOrPointPropertyOrPointRep!= null)&&(!this.posOrPointPropertyOrPointRep.isEmpty()));
            List<JAXBElement<?>> theField;
            theField = (((this.posOrPointPropertyOrPointRep!= null)&&(!this.posOrPointPropertyOrPointRep.isEmpty()))?this.getPosOrPointPropertyOrPointRep():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "posOrPointPropertyOrPointRep", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.posList!= null);
            DirectPositionListType theField;
            theField = this.getPosList();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "posList", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.coordinates!= null);
            CoordinatesType theField;
            theField = this.getCoordinates();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "coordinates", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.vectorAtStart!= null);
            VectorType theField;
            theField = this.getVectorAtStart();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "vectorAtStart", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.vectorAtEnd!= null);
            VectorType theField;
            theField = this.getVectorAtEnd();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "vectorAtEnd", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.interpolation!= null);
            CurveInterpolationType theField;
            theField = this.getInterpolation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "interpolation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.degree!= null);
            BigInteger theField;
            theField = this.getDegree();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "degree", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = ((this.posOrPointPropertyOrPointRep!= null)&&(!this.posOrPointPropertyOrPointRep.isEmpty()));
            List<JAXBElement<?>> theField;
            theField = (((this.posOrPointPropertyOrPointRep!= null)&&(!this.posOrPointPropertyOrPointRep.isEmpty()))?this.getPosOrPointPropertyOrPointRep():null);
            strategy.appendField(locator, this, "posOrPointPropertyOrPointRep", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.posList!= null);
            DirectPositionListType theField;
            theField = this.getPosList();
            strategy.appendField(locator, this, "posList", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.coordinates!= null);
            CoordinatesType theField;
            theField = this.getCoordinates();
            strategy.appendField(locator, this, "coordinates", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.vectorAtStart!= null);
            VectorType theField;
            theField = this.getVectorAtStart();
            strategy.appendField(locator, this, "vectorAtStart", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.vectorAtEnd!= null);
            VectorType theField;
            theField = this.getVectorAtEnd();
            strategy.appendField(locator, this, "vectorAtEnd", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.interpolation!= null);
            CurveInterpolationType theField;
            theField = this.getInterpolation();
            strategy.appendField(locator, this, "interpolation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.degree!= null);
            BigInteger theField;
            theField = this.getDegree();
            strategy.appendField(locator, this, "degree", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
