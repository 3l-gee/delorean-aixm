
package com.aixm.delorean.core.org.gml.v_3_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for EnvelopeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EnvelopeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <sequence>
 *           <element name="lowerCorner" type="{http://www.opengis.net/gml/3.2}DirectPositionType"/>
 *           <element name="upperCorner" type="{http://www.opengis.net/gml/3.2}DirectPositionType"/>
 *         </sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}pos" maxOccurs="2" minOccurs="2"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}coordinates"/>
 *       </choice>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}SRSReferenceGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeType", propOrder = {
    "lowerCorner",
    "upperCorner",
    "pos",
    "coordinates"
})
@XmlSeeAlso({
    EnvelopeWithTimePeriodType.class
})
public class EnvelopeType implements Equals, HashCode, ToString
{

    protected DirectPositionType lowerCorner;
    protected DirectPositionType upperCorner;
    protected List<DirectPositionType> pos;
    protected CoordinatesType coordinates;
    @XmlAttribute(name = "srsName")
    @XmlSchemaType(name = "anyURI")
    protected String srsName;
    @XmlAttribute(name = "srsDimension")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger srsDimension;
    @XmlAttribute
    protected List<String> axisLabels;
    @XmlAttribute
    protected List<String> uomLabels;

    /**
     * Gets the value of the lowerCorner property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getLowerCorner() {
        return lowerCorner;
    }

    /**
     * Sets the value of the lowerCorner property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setLowerCorner(DirectPositionType value) {
        this.lowerCorner = value;
    }

    /**
     * Gets the value of the upperCorner property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getUpperCorner() {
        return upperCorner;
    }

    /**
     * Sets the value of the upperCorner property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setUpperCorner(DirectPositionType value) {
        this.upperCorner = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectPositionType }
     * 
     * 
     */
    public List<DirectPositionType> getPos() {
        if (pos == null) {
            pos = new ArrayList<>();
        }
        return this.pos;
    }

    /**
     * 
     * 
     */
    public void setPos(List<DirectPositionType> pos) {
        this.pos = pos;
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
     * Gets the value of the srsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Sets the value of the srsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    /**
     * Gets the value of the srsDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSrsDimension() {
        return srsDimension;
    }

    /**
     * Sets the value of the srsDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSrsDimension(BigInteger value) {
        this.srsDimension = value;
    }

    /**
     * Gets the value of the axisLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAxisLabels() {
        if (axisLabels == null) {
            axisLabels = new ArrayList<>();
        }
        return this.axisLabels;
    }

    /**
     * 
     * 
     */
    public void setAxisLabels(List<String> axisLabels) {
        this.axisLabels = axisLabels;
    }

    /**
     * Gets the value of the uomLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uomLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUomLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUomLabels() {
        if (uomLabels == null) {
            uomLabels = new ArrayList<>();
        }
        return this.uomLabels;
    }

    /**
     * 
     * 
     */
    public void setUomLabels(List<String> uomLabels) {
        this.uomLabels = uomLabels;
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
        final EnvelopeType that = ((EnvelopeType) object);
        {
            boolean lhsFieldIsSet = (this.upperCorner!= null);
            boolean rhsFieldIsSet = (that.upperCorner!= null);
            DirectPositionType lhsField;
            lhsField = this.getUpperCorner();
            DirectPositionType rhsField;
            rhsField = that.getUpperCorner();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperCorner", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperCorner", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()));
            boolean rhsFieldIsSet = ((that.uomLabels!= null)&&(!that.uomLabels.isEmpty()));
            List<String> lhsField;
            lhsField = (((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()))?this.getUomLabels():null);
            List<String> rhsField;
            rhsField = (((that.uomLabels!= null)&&(!that.uomLabels.isEmpty()))?that.getUomLabels():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "uomLabels", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "uomLabels", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.lowerCorner!= null);
            boolean rhsFieldIsSet = (that.lowerCorner!= null);
            DirectPositionType lhsField;
            lhsField = this.getLowerCorner();
            DirectPositionType rhsField;
            rhsField = that.getLowerCorner();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowerCorner", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowerCorner", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.pos!= null)&&(!this.pos.isEmpty()));
            boolean rhsFieldIsSet = ((that.pos!= null)&&(!that.pos.isEmpty()));
            List<DirectPositionType> lhsField;
            lhsField = (((this.pos!= null)&&(!this.pos.isEmpty()))?this.getPos():null);
            List<DirectPositionType> rhsField;
            rhsField = (((that.pos!= null)&&(!that.pos.isEmpty()))?that.getPos():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pos", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pos", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.srsDimension!= null);
            boolean rhsFieldIsSet = (that.srsDimension!= null);
            BigInteger lhsField;
            lhsField = this.getSrsDimension();
            BigInteger rhsField;
            rhsField = that.getSrsDimension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "srsDimension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "srsDimension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()));
            boolean rhsFieldIsSet = ((that.axisLabels!= null)&&(!that.axisLabels.isEmpty()));
            List<String> lhsField;
            lhsField = (((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()))?this.getAxisLabels():null);
            List<String> rhsField;
            rhsField = (((that.axisLabels!= null)&&(!that.axisLabels.isEmpty()))?that.getAxisLabels():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "axisLabels", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "axisLabels", rhsField);
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
            boolean lhsFieldIsSet = (this.srsName!= null);
            boolean rhsFieldIsSet = (that.srsName!= null);
            String lhsField;
            lhsField = this.getSrsName();
            String rhsField;
            rhsField = that.getSrsName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "srsName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "srsName", rhsField);
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
            boolean theFieldIsSet = (this.lowerCorner!= null);
            DirectPositionType theField;
            theField = this.getLowerCorner();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerCorner", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.upperCorner!= null);
            DirectPositionType theField;
            theField = this.getUpperCorner();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperCorner", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.pos!= null)&&(!this.pos.isEmpty()));
            List<DirectPositionType> theField;
            theField = (((this.pos!= null)&&(!this.pos.isEmpty()))?this.getPos():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pos", theField);
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
            boolean theFieldIsSet = (this.srsName!= null);
            String theField;
            theField = this.getSrsName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "srsName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.srsDimension!= null);
            BigInteger theField;
            theField = this.getSrsDimension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "srsDimension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()));
            List<String> theField;
            theField = (((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()))?this.getAxisLabels():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "axisLabels", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()));
            List<String> theField;
            theField = (((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()))?this.getUomLabels():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "uomLabels", theField);
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
            boolean theFieldIsSet = (this.lowerCorner!= null);
            DirectPositionType theField;
            theField = this.getLowerCorner();
            strategy.appendField(locator, this, "lowerCorner", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.upperCorner!= null);
            DirectPositionType theField;
            theField = this.getUpperCorner();
            strategy.appendField(locator, this, "upperCorner", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.pos!= null)&&(!this.pos.isEmpty()));
            List<DirectPositionType> theField;
            theField = (((this.pos!= null)&&(!this.pos.isEmpty()))?this.getPos():null);
            strategy.appendField(locator, this, "pos", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.coordinates!= null);
            CoordinatesType theField;
            theField = this.getCoordinates();
            strategy.appendField(locator, this, "coordinates", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.srsName!= null);
            String theField;
            theField = this.getSrsName();
            strategy.appendField(locator, this, "srsName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.srsDimension!= null);
            BigInteger theField;
            theField = this.getSrsDimension();
            strategy.appendField(locator, this, "srsDimension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()));
            List<String> theField;
            theField = (((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()))?this.getAxisLabels():null);
            strategy.appendField(locator, this, "axisLabels", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()));
            List<String> theField;
            theField = (((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()))?this.getUomLabels():null);
            strategy.appendField(locator, this, "uomLabels", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
