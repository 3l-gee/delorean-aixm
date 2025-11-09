
package com.aixm.delorean.core.schema.a5_1_1.aixm;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;


/**
 * <p>Java class for AbstractPropertiesWithScheduleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractPropertiesWithScheduleType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPropertiesWithScheduleType")
@XmlSeeAlso({
    AirportHeliportAvailabilityType.class,
    AirportHeliportResponsibilityOrganisationType.class,
    AltimeterSourceStatusType.class,
    ConditionCombinationType.class,
    WorkareaActivityType.class,
    ApronAreaAvailabilityType.class,
    GroundLightingAvailabilityType.class,
    ManoeuvringAreaAvailabilityType.class,
    RunwayDeclaredDistanceValueType.class,
    AirspaceActivationType.class,
    AirspaceLayerClassType.class,
    NavaidEquipmentMonitoringType.class,
    NavaidOperationalStatusType.class,
    SpecialNavigationStationStatusType.class,
    VerticalStructureLightingStatusType.class,
    VerticalStructurePartType.class,
    UnitAvailabilityType.class,
    CirclingRestrictionType.class,
    ProcedureAvailabilityType.class,
    RouteAvailabilityType.class,
    FlightConditionCombinationType.class,
    RadioCommunicationOperationalStatusType.class,
    ServiceOperationalStatusType.class,
    OnlineContactType.class,
    PostalAddressType.class,
    TelephoneContactType.class,
    LightElementStatusType.class
})
@Entity(name = "AbstractPropertiesWithScheduleType")
@Table(name = "abstractpropertieswithschedule", schema = "public")
public class AbstractPropertiesWithScheduleType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;

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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        return buffer;
    }

}
