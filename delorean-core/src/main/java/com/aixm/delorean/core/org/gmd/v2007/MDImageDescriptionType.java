
package com.aixm.delorean.core.org.gmd.v2007;

import com.aixm.delorean.core.org.gco.v2007.BooleanPropertyType;
import com.aixm.delorean.core.org.gco.v2007.IntegerPropertyType;
import com.aixm.delorean.core.org.gco.v2007.RealPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Information about an image's suitability for use
 * 
 * <p>Java class for MD_ImageDescription_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_ImageDescription_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}MD_CoverageDescription_Type">
 *       <sequence>
 *         <element name="illuminationElevationAngle" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         <element name="illuminationAzimuthAngle" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         <element name="imagingCondition" type="{http://www.isotc211.org/2005/gmd}MD_ImagingConditionCode_PropertyType" minOccurs="0"/>
 *         <element name="imageQualityCode" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         <element name="cloudCoverPercentage" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         <element name="processingLevelCode" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         <element name="compressionGenerationQuantity" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         <element name="triangulationIndicator" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         <element name="radiometricCalibrationDataAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         <element name="cameraCalibrationInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         <element name="filmDistortionInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         <element name="lensDistortionInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ImageDescription_Type", propOrder = {
    "illuminationElevationAngle",
    "illuminationAzimuthAngle",
    "imagingCondition",
    "imageQualityCode",
    "cloudCoverPercentage",
    "processingLevelCode",
    "compressionGenerationQuantity",
    "triangulationIndicator",
    "radiometricCalibrationDataAvailability",
    "cameraCalibrationInformationAvailability",
    "filmDistortionInformationAvailability",
    "lensDistortionInformationAvailability"
})
public class MDImageDescriptionType
    extends MDCoverageDescriptionType
{

    protected RealPropertyType illuminationElevationAngle;
    protected RealPropertyType illuminationAzimuthAngle;
    protected MDImagingConditionCodePropertyType imagingCondition;
    protected MDIdentifierPropertyType imageQualityCode;
    protected RealPropertyType cloudCoverPercentage;
    protected MDIdentifierPropertyType processingLevelCode;
    protected IntegerPropertyType compressionGenerationQuantity;
    protected BooleanPropertyType triangulationIndicator;
    protected BooleanPropertyType radiometricCalibrationDataAvailability;
    protected BooleanPropertyType cameraCalibrationInformationAvailability;
    protected BooleanPropertyType filmDistortionInformationAvailability;
    protected BooleanPropertyType lensDistortionInformationAvailability;

    /**
     * Gets the value of the illuminationElevationAngle property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getIlluminationElevationAngle() {
        return illuminationElevationAngle;
    }

    /**
     * Sets the value of the illuminationElevationAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setIlluminationElevationAngle(RealPropertyType value) {
        this.illuminationElevationAngle = value;
    }

    /**
     * Gets the value of the illuminationAzimuthAngle property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getIlluminationAzimuthAngle() {
        return illuminationAzimuthAngle;
    }

    /**
     * Sets the value of the illuminationAzimuthAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setIlluminationAzimuthAngle(RealPropertyType value) {
        this.illuminationAzimuthAngle = value;
    }

    /**
     * Gets the value of the imagingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link MDImagingConditionCodePropertyType }
     *     
     */
    public MDImagingConditionCodePropertyType getImagingCondition() {
        return imagingCondition;
    }

    /**
     * Sets the value of the imagingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDImagingConditionCodePropertyType }
     *     
     */
    public void setImagingCondition(MDImagingConditionCodePropertyType value) {
        this.imagingCondition = value;
    }

    /**
     * Gets the value of the imageQualityCode property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getImageQualityCode() {
        return imageQualityCode;
    }

    /**
     * Sets the value of the imageQualityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setImageQualityCode(MDIdentifierPropertyType value) {
        this.imageQualityCode = value;
    }

    /**
     * Gets the value of the cloudCoverPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getCloudCoverPercentage() {
        return cloudCoverPercentage;
    }

    /**
     * Sets the value of the cloudCoverPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setCloudCoverPercentage(RealPropertyType value) {
        this.cloudCoverPercentage = value;
    }

    /**
     * Gets the value of the processingLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getProcessingLevelCode() {
        return processingLevelCode;
    }

    /**
     * Sets the value of the processingLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setProcessingLevelCode(MDIdentifierPropertyType value) {
        this.processingLevelCode = value;
    }

    /**
     * Gets the value of the compressionGenerationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getCompressionGenerationQuantity() {
        return compressionGenerationQuantity;
    }

    /**
     * Sets the value of the compressionGenerationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setCompressionGenerationQuantity(IntegerPropertyType value) {
        this.compressionGenerationQuantity = value;
    }

    /**
     * Gets the value of the triangulationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getTriangulationIndicator() {
        return triangulationIndicator;
    }

    /**
     * Sets the value of the triangulationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setTriangulationIndicator(BooleanPropertyType value) {
        this.triangulationIndicator = value;
    }

    /**
     * Gets the value of the radiometricCalibrationDataAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getRadiometricCalibrationDataAvailability() {
        return radiometricCalibrationDataAvailability;
    }

    /**
     * Sets the value of the radiometricCalibrationDataAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setRadiometricCalibrationDataAvailability(BooleanPropertyType value) {
        this.radiometricCalibrationDataAvailability = value;
    }

    /**
     * Gets the value of the cameraCalibrationInformationAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getCameraCalibrationInformationAvailability() {
        return cameraCalibrationInformationAvailability;
    }

    /**
     * Sets the value of the cameraCalibrationInformationAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setCameraCalibrationInformationAvailability(BooleanPropertyType value) {
        this.cameraCalibrationInformationAvailability = value;
    }

    /**
     * Gets the value of the filmDistortionInformationAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getFilmDistortionInformationAvailability() {
        return filmDistortionInformationAvailability;
    }

    /**
     * Sets the value of the filmDistortionInformationAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setFilmDistortionInformationAvailability(BooleanPropertyType value) {
        this.filmDistortionInformationAvailability = value;
    }

    /**
     * Gets the value of the lensDistortionInformationAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getLensDistortionInformationAvailability() {
        return lensDistortionInformationAvailability;
    }

    /**
     * Sets the value of the lensDistortionInformationAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setLensDistortionInformationAvailability(BooleanPropertyType value) {
        this.lensDistortionInformationAvailability = value;
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
        final MDImageDescriptionType that = ((MDImageDescriptionType) object);
        {
            boolean lhsFieldIsSet = (this.triangulationIndicator!= null);
            boolean rhsFieldIsSet = (that.triangulationIndicator!= null);
            BooleanPropertyType lhsField;
            lhsField = this.getTriangulationIndicator();
            BooleanPropertyType rhsField;
            rhsField = that.getTriangulationIndicator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "triangulationIndicator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "triangulationIndicator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.cloudCoverPercentage!= null);
            boolean rhsFieldIsSet = (that.cloudCoverPercentage!= null);
            RealPropertyType lhsField;
            lhsField = this.getCloudCoverPercentage();
            RealPropertyType rhsField;
            rhsField = that.getCloudCoverPercentage();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "cloudCoverPercentage", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "cloudCoverPercentage", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.filmDistortionInformationAvailability!= null);
            boolean rhsFieldIsSet = (that.filmDistortionInformationAvailability!= null);
            BooleanPropertyType lhsField;
            lhsField = this.getFilmDistortionInformationAvailability();
            BooleanPropertyType rhsField;
            rhsField = that.getFilmDistortionInformationAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "filmDistortionInformationAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "filmDistortionInformationAvailability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.lensDistortionInformationAvailability!= null);
            boolean rhsFieldIsSet = (that.lensDistortionInformationAvailability!= null);
            BooleanPropertyType lhsField;
            lhsField = this.getLensDistortionInformationAvailability();
            BooleanPropertyType rhsField;
            rhsField = that.getLensDistortionInformationAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lensDistortionInformationAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lensDistortionInformationAvailability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.processingLevelCode!= null);
            boolean rhsFieldIsSet = (that.processingLevelCode!= null);
            MDIdentifierPropertyType lhsField;
            lhsField = this.getProcessingLevelCode();
            MDIdentifierPropertyType rhsField;
            rhsField = that.getProcessingLevelCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "processingLevelCode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "processingLevelCode", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.cameraCalibrationInformationAvailability!= null);
            boolean rhsFieldIsSet = (that.cameraCalibrationInformationAvailability!= null);
            BooleanPropertyType lhsField;
            lhsField = this.getCameraCalibrationInformationAvailability();
            BooleanPropertyType rhsField;
            rhsField = that.getCameraCalibrationInformationAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "cameraCalibrationInformationAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "cameraCalibrationInformationAvailability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.radiometricCalibrationDataAvailability!= null);
            boolean rhsFieldIsSet = (that.radiometricCalibrationDataAvailability!= null);
            BooleanPropertyType lhsField;
            lhsField = this.getRadiometricCalibrationDataAvailability();
            BooleanPropertyType rhsField;
            rhsField = that.getRadiometricCalibrationDataAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radiometricCalibrationDataAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radiometricCalibrationDataAvailability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.illuminationAzimuthAngle!= null);
            boolean rhsFieldIsSet = (that.illuminationAzimuthAngle!= null);
            RealPropertyType lhsField;
            lhsField = this.getIlluminationAzimuthAngle();
            RealPropertyType rhsField;
            rhsField = that.getIlluminationAzimuthAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "illuminationAzimuthAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "illuminationAzimuthAngle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.imagingCondition!= null);
            boolean rhsFieldIsSet = (that.imagingCondition!= null);
            MDImagingConditionCodePropertyType lhsField;
            lhsField = this.getImagingCondition();
            MDImagingConditionCodePropertyType rhsField;
            rhsField = that.getImagingCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "imagingCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "imagingCondition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.illuminationElevationAngle!= null);
            boolean rhsFieldIsSet = (that.illuminationElevationAngle!= null);
            RealPropertyType lhsField;
            lhsField = this.getIlluminationElevationAngle();
            RealPropertyType rhsField;
            rhsField = that.getIlluminationElevationAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "illuminationElevationAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "illuminationElevationAngle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.imageQualityCode!= null);
            boolean rhsFieldIsSet = (that.imageQualityCode!= null);
            MDIdentifierPropertyType lhsField;
            lhsField = this.getImageQualityCode();
            MDIdentifierPropertyType rhsField;
            rhsField = that.getImageQualityCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "imageQualityCode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "imageQualityCode", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.compressionGenerationQuantity!= null);
            boolean rhsFieldIsSet = (that.compressionGenerationQuantity!= null);
            IntegerPropertyType lhsField;
            lhsField = this.getCompressionGenerationQuantity();
            IntegerPropertyType rhsField;
            rhsField = that.getCompressionGenerationQuantity();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "compressionGenerationQuantity", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "compressionGenerationQuantity", rhsField);
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
            boolean theFieldIsSet = (this.illuminationElevationAngle!= null);
            RealPropertyType theField;
            theField = this.getIlluminationElevationAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "illuminationElevationAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.illuminationAzimuthAngle!= null);
            RealPropertyType theField;
            theField = this.getIlluminationAzimuthAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "illuminationAzimuthAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.imagingCondition!= null);
            MDImagingConditionCodePropertyType theField;
            theField = this.getImagingCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "imagingCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.imageQualityCode!= null);
            MDIdentifierPropertyType theField;
            theField = this.getImageQualityCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "imageQualityCode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.cloudCoverPercentage!= null);
            RealPropertyType theField;
            theField = this.getCloudCoverPercentage();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "cloudCoverPercentage", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.processingLevelCode!= null);
            MDIdentifierPropertyType theField;
            theField = this.getProcessingLevelCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "processingLevelCode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.compressionGenerationQuantity!= null);
            IntegerPropertyType theField;
            theField = this.getCompressionGenerationQuantity();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "compressionGenerationQuantity", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.triangulationIndicator!= null);
            BooleanPropertyType theField;
            theField = this.getTriangulationIndicator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "triangulationIndicator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.radiometricCalibrationDataAvailability!= null);
            BooleanPropertyType theField;
            theField = this.getRadiometricCalibrationDataAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radiometricCalibrationDataAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.cameraCalibrationInformationAvailability!= null);
            BooleanPropertyType theField;
            theField = this.getCameraCalibrationInformationAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "cameraCalibrationInformationAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.filmDistortionInformationAvailability!= null);
            BooleanPropertyType theField;
            theField = this.getFilmDistortionInformationAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "filmDistortionInformationAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.lensDistortionInformationAvailability!= null);
            BooleanPropertyType theField;
            theField = this.getLensDistortionInformationAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lensDistortionInformationAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.illuminationElevationAngle!= null);
            RealPropertyType theField;
            theField = this.getIlluminationElevationAngle();
            strategy.appendField(locator, this, "illuminationElevationAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.illuminationAzimuthAngle!= null);
            RealPropertyType theField;
            theField = this.getIlluminationAzimuthAngle();
            strategy.appendField(locator, this, "illuminationAzimuthAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.imagingCondition!= null);
            MDImagingConditionCodePropertyType theField;
            theField = this.getImagingCondition();
            strategy.appendField(locator, this, "imagingCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.imageQualityCode!= null);
            MDIdentifierPropertyType theField;
            theField = this.getImageQualityCode();
            strategy.appendField(locator, this, "imageQualityCode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.cloudCoverPercentage!= null);
            RealPropertyType theField;
            theField = this.getCloudCoverPercentage();
            strategy.appendField(locator, this, "cloudCoverPercentage", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.processingLevelCode!= null);
            MDIdentifierPropertyType theField;
            theField = this.getProcessingLevelCode();
            strategy.appendField(locator, this, "processingLevelCode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.compressionGenerationQuantity!= null);
            IntegerPropertyType theField;
            theField = this.getCompressionGenerationQuantity();
            strategy.appendField(locator, this, "compressionGenerationQuantity", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.triangulationIndicator!= null);
            BooleanPropertyType theField;
            theField = this.getTriangulationIndicator();
            strategy.appendField(locator, this, "triangulationIndicator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.radiometricCalibrationDataAvailability!= null);
            BooleanPropertyType theField;
            theField = this.getRadiometricCalibrationDataAvailability();
            strategy.appendField(locator, this, "radiometricCalibrationDataAvailability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.cameraCalibrationInformationAvailability!= null);
            BooleanPropertyType theField;
            theField = this.getCameraCalibrationInformationAvailability();
            strategy.appendField(locator, this, "cameraCalibrationInformationAvailability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.filmDistortionInformationAvailability!= null);
            BooleanPropertyType theField;
            theField = this.getFilmDistortionInformationAvailability();
            strategy.appendField(locator, this, "filmDistortionInformationAvailability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.lensDistortionInformationAvailability!= null);
            BooleanPropertyType theField;
            theField = this.getLensDistortionInformationAvailability();
            strategy.appendField(locator, this, "lensDistortionInformationAvailability", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
