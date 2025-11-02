
package com.aixm.delorean.core.schema.a5_2.aixm.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.schema.a5_2.aixm.AbstractAIXMMessageType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AIXMBasicMessageType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AIXMBasicMessageType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMMessageType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.2/message}AIXMBasicMessagePropertyGroup"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AIXMBasicMessageType", propOrder = {
    "hasMember"
})
@XmlRootElement
@Entity(name = "AIXMBasicMessageType")
@Table(name = "aixm_basic_message", schema = "aixm")
public class AIXMBasicMessageType
    extends AbstractAIXMMessageType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected List<BasicMessageMemberAIXMPropertyType> hasMember;

    /**
     * Gets the value of the hasMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicMessageMemberAIXMPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = BasicMessageMemberAIXMPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "HAS_MEMBER_AIXMBASIC_MESSAGE_0")
    public List<BasicMessageMemberAIXMPropertyType> getHasMember() {
        if (hasMember == null) {
            hasMember = new ArrayList<>();
        }
        return this.hasMember;
    }

    /**
     * 
     * 
     */
    public void setHasMember(List<BasicMessageMemberAIXMPropertyType> hasMember) {
        this.hasMember = hasMember;
    }

    @Transient
    public boolean isSetHasMember() {
        return ((this.hasMember!= null)&&(!this.hasMember.isEmpty()));
    }

    public void unsetHasMember() {
        this.hasMember = null;
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
        final AIXMBasicMessageType that = ((AIXMBasicMessageType) object);
        {
            boolean lhsFieldIsSet = this.isSetHasMember();
            boolean rhsFieldIsSet = that.isSetHasMember();
            List<BasicMessageMemberAIXMPropertyType> lhsField;
            lhsField = (this.isSetHasMember()?this.getHasMember():null);
            List<BasicMessageMemberAIXMPropertyType> rhsField;
            rhsField = (that.isSetHasMember()?that.getHasMember():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "hasMember", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "hasMember", rhsField);
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
            boolean theFieldIsSet = this.isSetHasMember();
            List<BasicMessageMemberAIXMPropertyType> theField;
            theField = (this.isSetHasMember()?this.getHasMember():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "hasMember", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetHasMember();
            List<BasicMessageMemberAIXMPropertyType> theField;
            theField = (this.isSetHasMember()?this.getHasMember():null);
            strategy.appendField(locator, this, "hasMember", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
