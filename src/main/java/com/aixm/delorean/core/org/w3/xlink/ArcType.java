
package com.aixm.delorean.core.org.w3.xlink;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for arcType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="arcType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <group ref="{http://www.w3.org/1999/xlink}arcModel"/>
 *       <attGroup ref="{http://www.w3.org/1999/xlink}arcAttrs"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arcType", propOrder = {
    "title"
})
public class ArcType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    protected List<TitleEltType> title;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink", required = true)
    public static final TypeType TYPE = TypeType.ARC;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String titleAttribute;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;
    @XmlAttribute(name = "from", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String from;
    /**
     * from and to have default behavior when values are missing
     * 
     */
    @XmlAttribute(name = "to", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String to;

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitleEltType }
     * 
     * 
     */
    public List<TitleEltType> getTitle() {
        if (title == null) {
            title = new ArrayList<>();
        }
        return this.title;
    }

    /**
     * 
     * 
     */
    public void setTitle(List<TitleEltType> title) {
        this.title = title;
    }

    public boolean isSetTitle() {
        return ((this.title!= null)&&(!this.title.isEmpty()));
    }

    public void unsetTitle() {
        this.title = null;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

    /**
     * Gets the value of the titleAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleAttribute() {
        return titleAttribute;
    }

    /**
     * Sets the value of the titleAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAttribute(String value) {
        this.titleAttribute = value;
    }

    public boolean isSetTitleAttribute() {
        return (this.titleAttribute!= null);
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    public boolean isSetActuate() {
        return (this.actuate!= null);
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    public boolean isSetFrom() {
        return (this.from!= null);
    }

    /**
     * from and to have default behavior when values are missing
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTo()
     */
    public void setTo(String value) {
        this.to = value;
    }

    public boolean isSetTo() {
        return (this.to!= null);
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
        final ArcType that = ((ArcType) object);
        {
            boolean lhsFieldIsSet = this.isSetTitle();
            boolean rhsFieldIsSet = that.isSetTitle();
            List<TitleEltType> lhsField;
            lhsField = (this.isSetTitle()?this.getTitle():null);
            List<TitleEltType> rhsField;
            rhsField = (that.isSetTitle()?that.getTitle():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "title", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "title", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTo();
            boolean rhsFieldIsSet = that.isSetTo();
            String lhsField;
            lhsField = this.getTo();
            String rhsField;
            rhsField = that.getTo();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "to", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "to", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTitleAttribute();
            boolean rhsFieldIsSet = that.isSetTitleAttribute();
            String lhsField;
            lhsField = this.getTitleAttribute();
            String rhsField;
            rhsField = that.getTitleAttribute();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "titleAttribute", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "titleAttribute", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFrom();
            boolean rhsFieldIsSet = that.isSetFrom();
            String lhsField;
            lhsField = this.getFrom();
            String rhsField;
            rhsField = that.getFrom();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "from", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "from", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetActuate();
            boolean rhsFieldIsSet = that.isSetActuate();
            ActuateType lhsField;
            lhsField = this.getActuate();
            ActuateType rhsField;
            rhsField = that.getActuate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "actuate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "actuate", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetArcrole();
            boolean rhsFieldIsSet = that.isSetArcrole();
            String lhsField;
            lhsField = this.getArcrole();
            String rhsField;
            rhsField = that.getArcrole();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "arcrole", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "arcrole", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetShow();
            boolean rhsFieldIsSet = that.isSetShow();
            ShowType lhsField;
            lhsField = this.getShow();
            ShowType rhsField;
            rhsField = that.getShow();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "show", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "show", rhsField);
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
            boolean theFieldIsSet = this.isSetTitle();
            List<TitleEltType> theField;
            theField = (this.isSetTitle()?this.getTitle():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "title", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetArcrole();
            String theField;
            theField = this.getArcrole();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "arcrole", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTitleAttribute();
            String theField;
            theField = this.getTitleAttribute();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "titleAttribute", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetShow();
            ShowType theField;
            theField = this.getShow();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "show", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetActuate();
            ActuateType theField;
            theField = this.getActuate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "actuate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrom();
            String theField;
            theField = this.getFrom();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "from", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTo();
            String theField;
            theField = this.getTo();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "to", theField);
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
            boolean theFieldIsSet = this.isSetTitle();
            List<TitleEltType> theField;
            theField = (this.isSetTitle()?this.getTitle():null);
            strategy.appendField(locator, this, "title", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetArcrole();
            String theField;
            theField = this.getArcrole();
            strategy.appendField(locator, this, "arcrole", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTitleAttribute();
            String theField;
            theField = this.getTitleAttribute();
            strategy.appendField(locator, this, "titleAttribute", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetShow();
            ShowType theField;
            theField = this.getShow();
            strategy.appendField(locator, this, "show", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetActuate();
            ActuateType theField;
            theField = this.getActuate();
            strategy.appendField(locator, this, "actuate", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrom();
            String theField;
            theField = this.getFrom();
            strategy.appendField(locator, this, "from", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTo();
            String theField;
            theField = this.getTo();
            strategy.appendField(locator, this, "to", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
