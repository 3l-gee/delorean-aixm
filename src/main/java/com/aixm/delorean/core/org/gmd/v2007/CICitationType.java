
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.DatePropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Standardized resource reference
 * 
 * <p>Java class for CI_Citation_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CI_Citation_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="title" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="alternateTitle" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="date" type="{http://www.isotc211.org/2005/gmd}CI_Date_PropertyType" maxOccurs="unbounded"/>
 *         <element name="edition" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="editionDate" type="{http://www.isotc211.org/2005/gco}Date_PropertyType" minOccurs="0"/>
 *         <element name="identifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="citedResponsibleParty" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="presentationForm" type="{http://www.isotc211.org/2005/gmd}CI_PresentationFormCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="series" type="{http://www.isotc211.org/2005/gmd}CI_Series_PropertyType" minOccurs="0"/>
 *         <element name="otherCitationDetails" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="collectiveTitle" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="ISBN" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="ISSN" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Citation_Type", propOrder = {
    "title",
    "alternateTitle",
    "date",
    "edition",
    "editionDate",
    "identifier",
    "citedResponsibleParty",
    "presentationForm",
    "series",
    "otherCitationDetails",
    "collectiveTitle",
    "isbn",
    "issn"
})
public class CICitationType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected CharacterStringPropertyType title;
    protected List<CharacterStringPropertyType> alternateTitle;
    @XmlElement(required = true)
    protected List<CIDatePropertyType> date;
    protected CharacterStringPropertyType edition;
    protected DatePropertyType editionDate;
    protected List<MDIdentifierPropertyType> identifier;
    protected List<CIResponsiblePartyPropertyType> citedResponsibleParty;
    protected List<CIPresentationFormCodePropertyType> presentationForm;
    protected CISeriesPropertyType series;
    protected CharacterStringPropertyType otherCitationDetails;
    protected CharacterStringPropertyType collectiveTitle;
    @XmlElement(name = "ISBN")
    protected CharacterStringPropertyType isbn;
    @XmlElement(name = "ISSN")
    protected CharacterStringPropertyType issn;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setTitle(CharacterStringPropertyType value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the alternateTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getAlternateTitle() {
        if (alternateTitle == null) {
            alternateTitle = new ArrayList<>();
        }
        return this.alternateTitle;
    }

    /**
     * 
     * 
     */
    public void setAlternateTitle(List<CharacterStringPropertyType> alternateTitle) {
        this.alternateTitle = alternateTitle;
    }

    public boolean isSetAlternateTitle() {
        return ((this.alternateTitle!= null)&&(!this.alternateTitle.isEmpty()));
    }

    public void unsetAlternateTitle() {
        this.alternateTitle = null;
    }

    /**
     * Gets the value of the date property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the date property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIDatePropertyType }
     * 
     * 
     */
    public List<CIDatePropertyType> getDate() {
        if (date == null) {
            date = new ArrayList<>();
        }
        return this.date;
    }

    /**
     * 
     * 
     */
    public void setDate(List<CIDatePropertyType> date) {
        this.date = date;
    }

    public boolean isSetDate() {
        return ((this.date!= null)&&(!this.date.isEmpty()));
    }

    public void unsetDate() {
        this.date = null;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setEdition(CharacterStringPropertyType value) {
        this.edition = value;
    }

    public boolean isSetEdition() {
        return (this.edition!= null);
    }

    /**
     * Gets the value of the editionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getEditionDate() {
        return editionDate;
    }

    /**
     * Sets the value of the editionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setEditionDate(DatePropertyType value) {
        this.editionDate = value;
    }

    public boolean isSetEditionDate() {
        return (this.editionDate!= null);
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDIdentifierPropertyType }
     * 
     * 
     */
    public List<MDIdentifierPropertyType> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<>();
        }
        return this.identifier;
    }

    /**
     * 
     * 
     */
    public void setIdentifier(List<MDIdentifierPropertyType> identifier) {
        this.identifier = identifier;
    }

    public boolean isSetIdentifier() {
        return ((this.identifier!= null)&&(!this.identifier.isEmpty()));
    }

    public void unsetIdentifier() {
        this.identifier = null;
    }

    /**
     * Gets the value of the citedResponsibleParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citedResponsibleParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitedResponsibleParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getCitedResponsibleParty() {
        if (citedResponsibleParty == null) {
            citedResponsibleParty = new ArrayList<>();
        }
        return this.citedResponsibleParty;
    }

    /**
     * 
     * 
     */
    public void setCitedResponsibleParty(List<CIResponsiblePartyPropertyType> citedResponsibleParty) {
        this.citedResponsibleParty = citedResponsibleParty;
    }

    public boolean isSetCitedResponsibleParty() {
        return ((this.citedResponsibleParty!= null)&&(!this.citedResponsibleParty.isEmpty()));
    }

    public void unsetCitedResponsibleParty() {
        this.citedResponsibleParty = null;
    }

    /**
     * Gets the value of the presentationForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentationForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentationForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIPresentationFormCodePropertyType }
     * 
     * 
     */
    public List<CIPresentationFormCodePropertyType> getPresentationForm() {
        if (presentationForm == null) {
            presentationForm = new ArrayList<>();
        }
        return this.presentationForm;
    }

    /**
     * 
     * 
     */
    public void setPresentationForm(List<CIPresentationFormCodePropertyType> presentationForm) {
        this.presentationForm = presentationForm;
    }

    public boolean isSetPresentationForm() {
        return ((this.presentationForm!= null)&&(!this.presentationForm.isEmpty()));
    }

    public void unsetPresentationForm() {
        this.presentationForm = null;
    }

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link CISeriesPropertyType }
     *     
     */
    public CISeriesPropertyType getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link CISeriesPropertyType }
     *     
     */
    public void setSeries(CISeriesPropertyType value) {
        this.series = value;
    }

    public boolean isSetSeries() {
        return (this.series!= null);
    }

    /**
     * Gets the value of the otherCitationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOtherCitationDetails() {
        return otherCitationDetails;
    }

    /**
     * Sets the value of the otherCitationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOtherCitationDetails(CharacterStringPropertyType value) {
        this.otherCitationDetails = value;
    }

    public boolean isSetOtherCitationDetails() {
        return (this.otherCitationDetails!= null);
    }

    /**
     * Gets the value of the collectiveTitle property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCollectiveTitle() {
        return collectiveTitle;
    }

    /**
     * Sets the value of the collectiveTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCollectiveTitle(CharacterStringPropertyType value) {
        this.collectiveTitle = value;
    }

    public boolean isSetCollectiveTitle() {
        return (this.collectiveTitle!= null);
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setISBN(CharacterStringPropertyType value) {
        this.isbn = value;
    }

    public boolean isSetISBN() {
        return (this.isbn!= null);
    }

    /**
     * Gets the value of the issn property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getISSN() {
        return issn;
    }

    /**
     * Sets the value of the issn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setISSN(CharacterStringPropertyType value) {
        this.issn = value;
    }

    public boolean isSetISSN() {
        return (this.issn!= null);
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
        final CICitationType that = ((CICitationType) object);
        {
            boolean lhsFieldIsSet = this.isSetEdition();
            boolean rhsFieldIsSet = that.isSetEdition();
            CharacterStringPropertyType lhsField;
            lhsField = this.getEdition();
            CharacterStringPropertyType rhsField;
            rhsField = that.getEdition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "edition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "edition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEditionDate();
            boolean rhsFieldIsSet = that.isSetEditionDate();
            DatePropertyType lhsField;
            lhsField = this.getEditionDate();
            DatePropertyType rhsField;
            rhsField = that.getEditionDate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "editionDate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "editionDate", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPresentationForm();
            boolean rhsFieldIsSet = that.isSetPresentationForm();
            List<CIPresentationFormCodePropertyType> lhsField;
            lhsField = (this.isSetPresentationForm()?this.getPresentationForm():null);
            List<CIPresentationFormCodePropertyType> rhsField;
            rhsField = (that.isSetPresentationForm()?that.getPresentationForm():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "presentationForm", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "presentationForm", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAlternateTitle();
            boolean rhsFieldIsSet = that.isSetAlternateTitle();
            List<CharacterStringPropertyType> lhsField;
            lhsField = (this.isSetAlternateTitle()?this.getAlternateTitle():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (that.isSetAlternateTitle()?that.getAlternateTitle():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "alternateTitle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "alternateTitle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCitedResponsibleParty();
            boolean rhsFieldIsSet = that.isSetCitedResponsibleParty();
            List<CIResponsiblePartyPropertyType> lhsField;
            lhsField = (this.isSetCitedResponsibleParty()?this.getCitedResponsibleParty():null);
            List<CIResponsiblePartyPropertyType> rhsField;
            rhsField = (that.isSetCitedResponsibleParty()?that.getCitedResponsibleParty():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "citedResponsibleParty", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "citedResponsibleParty", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetISBN();
            boolean rhsFieldIsSet = that.isSetISBN();
            CharacterStringPropertyType lhsField;
            lhsField = this.getISBN();
            CharacterStringPropertyType rhsField;
            rhsField = that.getISBN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "isbn", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "isbn", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSeries();
            boolean rhsFieldIsSet = that.isSetSeries();
            CISeriesPropertyType lhsField;
            lhsField = this.getSeries();
            CISeriesPropertyType rhsField;
            rhsField = that.getSeries();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "series", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "series", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDate();
            boolean rhsFieldIsSet = that.isSetDate();
            List<CIDatePropertyType> lhsField;
            lhsField = (this.isSetDate()?this.getDate():null);
            List<CIDatePropertyType> rhsField;
            rhsField = (that.isSetDate()?that.getDate():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "date", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "date", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOtherCitationDetails();
            boolean rhsFieldIsSet = that.isSetOtherCitationDetails();
            CharacterStringPropertyType lhsField;
            lhsField = this.getOtherCitationDetails();
            CharacterStringPropertyType rhsField;
            rhsField = that.getOtherCitationDetails();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "otherCitationDetails", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "otherCitationDetails", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCollectiveTitle();
            boolean rhsFieldIsSet = that.isSetCollectiveTitle();
            CharacterStringPropertyType lhsField;
            lhsField = this.getCollectiveTitle();
            CharacterStringPropertyType rhsField;
            rhsField = that.getCollectiveTitle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "collectiveTitle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "collectiveTitle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetISSN();
            boolean rhsFieldIsSet = that.isSetISSN();
            CharacterStringPropertyType lhsField;
            lhsField = this.getISSN();
            CharacterStringPropertyType rhsField;
            rhsField = that.getISSN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "issn", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "issn", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTitle();
            boolean rhsFieldIsSet = that.isSetTitle();
            CharacterStringPropertyType lhsField;
            lhsField = this.getTitle();
            CharacterStringPropertyType rhsField;
            rhsField = that.getTitle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "title", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "title", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIdentifier();
            boolean rhsFieldIsSet = that.isSetIdentifier();
            List<MDIdentifierPropertyType> lhsField;
            lhsField = (this.isSetIdentifier()?this.getIdentifier():null);
            List<MDIdentifierPropertyType> rhsField;
            rhsField = (that.isSetIdentifier()?that.getIdentifier():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "identifier", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "identifier", rhsField);
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
            boolean theFieldIsSet = this.isSetTitle();
            CharacterStringPropertyType theField;
            theField = this.getTitle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "title", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAlternateTitle();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetAlternateTitle()?this.getAlternateTitle():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "alternateTitle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDate();
            List<CIDatePropertyType> theField;
            theField = (this.isSetDate()?this.getDate():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "date", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEdition();
            CharacterStringPropertyType theField;
            theField = this.getEdition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "edition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEditionDate();
            DatePropertyType theField;
            theField = this.getEditionDate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "editionDate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIdentifier();
            List<MDIdentifierPropertyType> theField;
            theField = (this.isSetIdentifier()?this.getIdentifier():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "identifier", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCitedResponsibleParty();
            List<CIResponsiblePartyPropertyType> theField;
            theField = (this.isSetCitedResponsibleParty()?this.getCitedResponsibleParty():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "citedResponsibleParty", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPresentationForm();
            List<CIPresentationFormCodePropertyType> theField;
            theField = (this.isSetPresentationForm()?this.getPresentationForm():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "presentationForm", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSeries();
            CISeriesPropertyType theField;
            theField = this.getSeries();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "series", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOtherCitationDetails();
            CharacterStringPropertyType theField;
            theField = this.getOtherCitationDetails();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "otherCitationDetails", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCollectiveTitle();
            CharacterStringPropertyType theField;
            theField = this.getCollectiveTitle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "collectiveTitle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetISBN();
            CharacterStringPropertyType theField;
            theField = this.getISBN();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "isbn", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetISSN();
            CharacterStringPropertyType theField;
            theField = this.getISSN();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "issn", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetTitle();
            CharacterStringPropertyType theField;
            theField = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAlternateTitle();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetAlternateTitle()?this.getAlternateTitle():null);
            strategy.appendField(locator, this, "alternateTitle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDate();
            List<CIDatePropertyType> theField;
            theField = (this.isSetDate()?this.getDate():null);
            strategy.appendField(locator, this, "date", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEdition();
            CharacterStringPropertyType theField;
            theField = this.getEdition();
            strategy.appendField(locator, this, "edition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEditionDate();
            DatePropertyType theField;
            theField = this.getEditionDate();
            strategy.appendField(locator, this, "editionDate", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIdentifier();
            List<MDIdentifierPropertyType> theField;
            theField = (this.isSetIdentifier()?this.getIdentifier():null);
            strategy.appendField(locator, this, "identifier", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCitedResponsibleParty();
            List<CIResponsiblePartyPropertyType> theField;
            theField = (this.isSetCitedResponsibleParty()?this.getCitedResponsibleParty():null);
            strategy.appendField(locator, this, "citedResponsibleParty", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPresentationForm();
            List<CIPresentationFormCodePropertyType> theField;
            theField = (this.isSetPresentationForm()?this.getPresentationForm():null);
            strategy.appendField(locator, this, "presentationForm", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSeries();
            CISeriesPropertyType theField;
            theField = this.getSeries();
            strategy.appendField(locator, this, "series", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOtherCitationDetails();
            CharacterStringPropertyType theField;
            theField = this.getOtherCitationDetails();
            strategy.appendField(locator, this, "otherCitationDetails", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCollectiveTitle();
            CharacterStringPropertyType theField;
            theField = this.getCollectiveTitle();
            strategy.appendField(locator, this, "collectiveTitle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetISBN();
            CharacterStringPropertyType theField;
            theField = this.getISBN();
            strategy.appendField(locator, this, "isbn", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetISSN();
            CharacterStringPropertyType theField;
            theField = this.getISSN();
            strategy.appendField(locator, this, "issn", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
