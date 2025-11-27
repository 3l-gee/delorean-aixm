
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 * A property with the content model of gml:ShellPropertyType encapsulates a shell to represent a component of a solid boundary.
 * 
 * <p>Java class for ShellPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ShellPropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}Shell"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShellPropertyType", propOrder = {
    "shell"
})
public class ShellPropertyType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    /**
     * A shell is used to represent a single connected component of a solid boundary as specified in ISO 19107:2003, 6.3.8.
     * Every gml:surfaceMember references or contains one surface, i.e. any element which is substitutable for gml:AbstractSurface. In the context of a shell, the surfaces describe the boundary of the solid. 
     * If provided, the aggregationType attribute shall have the value "set".
     * 
     */
    @XmlElement(name = "Shell", required = true)
    protected ShellType shell;

    /**
     * A shell is used to represent a single connected component of a solid boundary as specified in ISO 19107:2003, 6.3.8.
     * Every gml:surfaceMember references or contains one surface, i.e. any element which is substitutable for gml:AbstractSurface. In the context of a shell, the surfaces describe the boundary of the solid. 
     * If provided, the aggregationType attribute shall have the value "set".
     * 
     * @return
     *     possible object is
     *     {@link ShellType }
     *     
     */
    public ShellType getShell() {
        return shell;
    }

    /**
     * Sets the value of the shell property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShellType }
     *     
     * @see #getShell()
     */
    public void setShell(ShellType value) {
        this.shell = value;
    }

    public boolean isSetShell() {
        return (this.shell!= null);
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
        final ShellPropertyType that = ((ShellPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetShell();
            boolean rhsFieldIsSet = that.isSetShell();
            ShellType lhsField;
            lhsField = this.getShell();
            ShellType rhsField;
            rhsField = that.getShell();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "shell", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "shell", rhsField);
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
            boolean theFieldIsSet = this.isSetShell();
            ShellType theField;
            theField = this.getShell();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "shell", theField);
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
            boolean theFieldIsSet = this.isSetShell();
            ShellType theField;
            theField = this.getShell();
            strategy.appendField(locator, this, "shell", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
