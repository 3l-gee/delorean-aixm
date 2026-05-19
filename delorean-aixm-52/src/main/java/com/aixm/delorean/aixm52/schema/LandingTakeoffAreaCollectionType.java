
package com.aixm.delorean.aixm52.schema;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for LandingTakeoffAreaCollectionType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="LandingTakeoffAreaCollectionType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="TLOF" type=
"{http://www.aixm.aero/schema/5.2}TouchDownLiftOffPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="runwayDirection" type=
"{http://www.aixm.aero/schema/5.2}RunwayDirectionPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractLandingTakeoffAreaCollectionExtension"/>
 *                 </choice>
 *                 <attGroup ref=
"{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandingTakeoffAreaCollectionType", propOrder = {"tlof", "annotation", "runwayDirection", "extension"})
@Entity(name = "LandingTakeoffAreaCollectionType")
@Table(name = "landingtakeoffareacollection_o", schema = "procedure")
public class LandingTakeoffAreaCollectionType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "TLOF", nillable = true)
    protected List<TouchDownLiftOffPropertyType> tlof;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<RunwayDirectionPropertyType> runwayDirection;
    protected List<LandingTakeoffAreaCollectionTypeExtensionType> extension;

    /**
     * Gets the value of the tlof property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the tlof property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getTLOF().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TouchDownLiftOffPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "lndngtkffarcllctntp_tlof_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "landingtakeoffareacollection_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "tlof_hjid", referencedColumnName = "hjid")})
    public List<TouchDownLiftOffPropertyType> getTLOF() {
        if (tlof == null) {
            tlof = new ArrayList<>();
        }
        return this.tlof;
    }

    /**
     *
     *
     */
    public void setTLOF(List<TouchDownLiftOffPropertyType> tlof) {
        this.tlof = tlof;
    }

    @Transient
    public boolean isSetTLOF() {
        return ((this.tlof != null) && (!this.tlof.isEmpty()));
    }

    public void unsetTLOF() {
        this.tlof = null;
    }

    /**
     * Gets the value of the annotation property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the annotation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAnnotation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "lndngtkffarcllctntp_annttn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "landingtakeoffareacollection_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "annotation_hjid", referencedColumnName = "hjid")})
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<>();
        }
        return this.annotation;
    }

    /**
     *
     *
     */
    public void setAnnotation(List<NotePropertyType> annotation) {
        this.annotation = annotation;
    }

    @Transient
    public boolean isSetAnnotation() {
        return ((this.annotation != null) && (!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the runwayDirection property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the runwayDirection property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getRunwayDirection().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayDirectionPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = RunwayDirectionPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "lndngtkffarcllctntp_rnwdrctn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "landingtakeoffareacollection_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "runwaydirection_hjid", referencedColumnName = "hjid")})
    public List<RunwayDirectionPropertyType> getRunwayDirection() {
        if (runwayDirection == null) {
            runwayDirection = new ArrayList<>();
        }
        return this.runwayDirection;
    }

    /**
     *
     *
     */
    public void setRunwayDirection(List<RunwayDirectionPropertyType> runwayDirection) {
        this.runwayDirection = runwayDirection;
    }

    @Transient
    public boolean isSetRunwayDirection() {
        return ((this.runwayDirection != null) && (!this.runwayDirection.isEmpty()));
    }

    public void unsetRunwayDirection() {
        this.runwayDirection = null;
    }

    /**
     * Gets the value of the extension property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the extension property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getExtension().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandingTakeoffAreaCollectionTypeExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = LandingTakeoffAreaCollectionTypeExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "landingtakeoffareacollectione_hjid", referencedColumnName = "hjid")
    public List<LandingTakeoffAreaCollectionTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<LandingTakeoffAreaCollectionTypeExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension != null) && (!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
            EqualsStrategy strategy) {
        if ((object == null) || (this.getClass() != object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final LandingTakeoffAreaCollectionType that = ((LandingTakeoffAreaCollectionType) object);
        {
            boolean lhsFieldIsSet = this.isSetRunwayDirection();
            boolean rhsFieldIsSet = that.isSetRunwayDirection();
            List<RunwayDirectionPropertyType> lhsField;
            lhsField = (this.isSetRunwayDirection() ? this.getRunwayDirection() : null);
            List<RunwayDirectionPropertyType> rhsField;
            rhsField = (that.isSetRunwayDirection() ? that.getRunwayDirection() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAnnotation();
            boolean rhsFieldIsSet = that.isSetAnnotation();
            List<NotePropertyType> lhsField;
            lhsField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            List<NotePropertyType> rhsField;
            rhsField = (that.isSetAnnotation() ? that.getAnnotation() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "annotation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "annotation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<LandingTakeoffAreaCollectionTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<LandingTakeoffAreaCollectionTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTLOF();
            boolean rhsFieldIsSet = that.isSetTLOF();
            List<TouchDownLiftOffPropertyType> lhsField;
            lhsField = (this.isSetTLOF() ? this.getTLOF() : null);
            List<TouchDownLiftOffPropertyType> rhsField;
            rhsField = (that.isSetTLOF() ? that.getTLOF() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "tlof", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "tlof", rhsField);
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
            boolean theFieldIsSet = this.isSetTLOF();
            List<TouchDownLiftOffPropertyType> theField;
            theField = (this.isSetTLOF() ? this.getTLOF() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "tlof", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayDirection();
            List<RunwayDirectionPropertyType> theField;
            theField = (this.isSetRunwayDirection() ? this.getRunwayDirection() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<LandingTakeoffAreaCollectionTypeExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetTLOF();
            List<TouchDownLiftOffPropertyType> theField;
            theField = (this.isSetTLOF() ? this.getTLOF() : null);
            strategy.appendField(locator, this, "tlof", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayDirection();
            List<RunwayDirectionPropertyType> theField;
            theField = (this.isSetRunwayDirection() ? this.getRunwayDirection() : null);
            strategy.appendField(locator, this, "runwayDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<LandingTakeoffAreaCollectionTypeExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
