
package com.aixm.delorean.core.schema.a5_1_1.aixm.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractAIXMMessageType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
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
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMMessageType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1/message}AIXMBasicMessagePropertyGroup"/>
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
@Table(name = "aixm_message", schema = "aixm")
public class AIXMBasicMessageType
    extends AbstractAIXMMessageType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected List<BasicMessageMemberAIXMPropertyType> hasMember;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

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
    @ManyToMany(targetEntity = BasicMessageMemberAIXMPropertyType.class, cascade = {
        CascadeType.REFRESH,
        CascadeType.PERSIST,
        CascadeType.DETACH,
        CascadeType.MERGE
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "message_member_link", schema = "aixm", joinColumns = {
        @JoinColumn(name = "message_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "member_hjid", referencedColumnName = "hjid")
    })
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
    @GeneratedValue(generator = "delorean_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "delorean_seq_gen", sequenceName = "delorean_seq_gen", allocationSize = 1)
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

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Version
    @Column(name = "hjversion")
    public Long gethjversion() {
        return hjversion;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void sethjversion(Long value) {
        this.hjversion = value;
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
