
package com.aixm.delorean.core.schema.a5_1_1.aixm;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.JAXBElementUtils;


/**
 * <p>Java class for PropertiesWithSchedulePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PropertiesWithSchedulePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPropertiesWithSchedule"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertiesWithSchedulePropertyType", propOrder = {
    "abstractPropertiesWithSchedule"
})
@Entity(name = "PropertiesWithSchedulePropertyType")
@Table(name = "propertieswithschedule_pt", schema = "shared")
public class PropertiesWithSchedulePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "AbstractPropertiesWithSchedule", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractPropertiesWithScheduleType> abstractPropertiesWithSchedule;

    /**
     * Gets the value of the abstractPropertiesWithSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractPropertiesWithScheduleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportResponsibilityOrganisationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceActivationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceLayerClassType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltimeterSourceStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronAreaAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CirclingRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConditionCombinationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlightConditionCombinationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroundLightingAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LightElementStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManoeuvringAreaAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidEquipmentMonitoringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PostalAddressType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcedureAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDeclaredDistanceValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TelephoneContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnitAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructureLightingStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructurePartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WorkareaActivityType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<? extends AbstractPropertiesWithScheduleType> getAbstractPropertiesWithSchedule() {
        return abstractPropertiesWithSchedule;
    }

    /**
     * Sets the value of the abstractPropertiesWithSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractPropertiesWithScheduleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportResponsibilityOrganisationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceActivationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceLayerClassType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltimeterSourceStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronAreaAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CirclingRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConditionCombinationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlightConditionCombinationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroundLightingAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LightElementStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManoeuvringAreaAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidEquipmentMonitoringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PostalAddressType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcedureAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDeclaredDistanceValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TelephoneContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnitAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructureLightingStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructurePartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WorkareaActivityType }{@code >}
     *     
     */
    public void setAbstractPropertiesWithSchedule(JAXBElement<? extends AbstractPropertiesWithScheduleType> value) {
        this.abstractPropertiesWithSchedule = value;
    }

    @Transient
    public boolean isSetAbstractPropertiesWithSchedule() {
        return (this.abstractPropertiesWithSchedule!= null);
    }

    @Basic
    @Column(name = "ABSTRACT_PROPERTIES_WITH_SCH_0")
    public String getAbstractPropertiesWithScheduleName() {
        if (this.getAbstractPropertiesWithSchedule() instanceof JAXBElement) {
            return JAXBElementUtils.getName(AbstractPropertiesWithScheduleType.class, this.getAbstractPropertiesWithSchedule());
        } else {
            return null;
        }
    }

    public void setAbstractPropertiesWithScheduleName(String target) {
        if (target!= null) {
            setAbstractPropertiesWithSchedule(JAXBElementUtils.wrap(this.getAbstractPropertiesWithSchedule(), target, AbstractPropertiesWithScheduleType.class));
        }
    }

@jakarta.persistence.OneToOne(cascade = jakarta.persistence.CascadeType.ALL, fetch = jakarta.persistence.FetchType.EAGER)
@jakarta.persistence.JoinColumn(name = "properties_with_schedule_id", referencedColumnName = "hjid")
    public AbstractPropertiesWithScheduleType getAbstractPropertiesWithScheduleValue() {
        if (this.getAbstractPropertiesWithSchedule() instanceof JAXBElement) {
            return JAXBElementUtils.getValue(AbstractPropertiesWithScheduleType.class, this.getAbstractPropertiesWithSchedule());
        } else {
            return null;
        }
    }

    public void setAbstractPropertiesWithScheduleValue(AbstractPropertiesWithScheduleType target) {
        if (target!= null) {
            setAbstractPropertiesWithSchedule(JAXBElementUtils.wrap(this.getAbstractPropertiesWithSchedule(), target));
        }
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
        final PropertiesWithSchedulePropertyType that = ((PropertiesWithSchedulePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractPropertiesWithSchedule();
            boolean rhsFieldIsSet = that.isSetAbstractPropertiesWithSchedule();
            JAXBElement<? extends AbstractPropertiesWithScheduleType> lhsField;
            lhsField = this.getAbstractPropertiesWithSchedule();
            JAXBElement<? extends AbstractPropertiesWithScheduleType> rhsField;
            rhsField = that.getAbstractPropertiesWithSchedule();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractPropertiesWithSchedule", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractPropertiesWithSchedule", rhsField);
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
            boolean theFieldIsSet = this.isSetAbstractPropertiesWithSchedule();
            JAXBElement<? extends AbstractPropertiesWithScheduleType> theField;
            theField = this.getAbstractPropertiesWithSchedule();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractPropertiesWithSchedule", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAbstractPropertiesWithSchedule();
            JAXBElement<? extends AbstractPropertiesWithScheduleType> theField;
            theField = this.getAbstractPropertiesWithSchedule();
            strategy.appendField(locator, this, "abstractPropertiesWithSchedule", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
