package com.aixm.delorean.core.time.helper;

import java.util.ArrayList;

import com.aixm.delorean.core.schema.a5_2.aixm.DMETimeSliceType;

import jakarta.xml.bind.JAXBElement;

import java.util.List;

public class TemporalityHelper {

    private TemporalityHelper() {
        // Private constructor to prevent instantiation of utility class
    }

    private static boolean isDifferent(Object obj1, Object obj2) {
        if (obj1 == null && obj2 == null) {
            return false;
        }
        if (obj1 == null || obj2 == null) {
            return true;
        }
        if (obj1 instanceof JAXBElement && obj2 instanceof JAXBElement) {
            return !unwrap((JAXBElement<?>) obj1).equals(unwrap((JAXBElement<?>) obj2));
        }
        return !obj1.equals(obj2);
    }

    private static Object unwrap(JAXBElement<?> element) {
        return element == null ? null : element.getValue();
    }

    public static DMETimeSliceType merge(DMETimeSliceType oldObj, DMETimeSliceType newObj) {
        oldObj.setId(newObj.getId());
        oldObj.setInterpretation("BASELINE");
        oldObj.setSequenceNumber(newObj.getSequenceNumber());
        oldObj.setCorrectionNumber(newObj.getCorrectionNumber());
        oldObj.setTimeSliceMetadata(newObj.getTimeSliceMetadata());
        oldObj.setValidTime(newObj.getValidTime());
        if (newObj != null) {
            List list3;
            if (newObj.getLocation() != null) {
                oldObj.setLocation(newObj.getLocation());
            }

            if (newObj.getDirection() != null) {
                oldObj.setDirection(newObj.getDirection());
            }

            if (newObj.getArea() != null) {
                oldObj.setArea(newObj.getArea());
            }

            if (newObj.getPlace() != null) {
                oldObj.setPlace(newObj.getPlace());
            }

            if (newObj.getOrientation() != null) {
                oldObj.setOrientation(newObj.getOrientation());
            }

            if (newObj.getSurface() != null) {
                oldObj.setSurface(newObj.getSurface());
            }

            if (oldObj.getAnnotation() != null) {
                list3 = newObj.getAnnotation();
                if (list3 != null) {
                    oldObj.getAnnotation().clear();
                    oldObj.getAnnotation().addAll(list3);
                }
            } else {
                list3 = newObj.getAnnotation();
                if (list3 != null) {
                    oldObj.setAnnotation(new ArrayList(list3));
                }
            }

            if (oldObj.getExtension() != null) {
                list3 = newObj.getExtension();
                if (list3 != null) {
                    oldObj.getExtension().clear();
                    oldObj.getExtension().addAll(list3);
                }
            } else {
                list3 = newObj.getExtension();
                if (list3 != null) {
                    oldObj.setExtension(new ArrayList(list3));
                }
            }

            if (newObj.getDesignatorItem() != null) {
                oldObj.setDesignatorItem(newObj.getDesignatorItem());
            }

            if (newObj.getAixmNameItem() != null) {
                oldObj.setAixmNameItem(newObj.getAixmNameItem());
            }

            if (newObj.getEmissionClassItem() != null) {
                oldObj.setEmissionClassItem(newObj.getEmissionClassItem());
            }

            if (newObj.getMobileItem() != null) {
                oldObj.setMobileItem(newObj.getMobileItem());
            }

            if (newObj.getMagneticVariationItem() != null) {
                oldObj.setMagneticVariationItem(newObj.getMagneticVariationItem());
            }

            if (newObj.getDateMagneticVariationItem() != null) {
                oldObj.setDateMagneticVariationItem(newObj.getDateMagneticVariationItem());
            }

            if (newObj.getFlightCheckedItem() != null) {
                oldObj.setFlightCheckedItem(newObj.getFlightCheckedItem());
            }

            if (newObj.getLocationItem() != null) {
                oldObj.setLocationItem(newObj.getLocationItem());
            }

            if (newObj.getDirectionItem() != null) {
                oldObj.setDirectionItem(newObj.getDirectionItem());
            }

            if (newObj.getAreaItem() != null) {
                oldObj.setAreaItem(newObj.getAreaItem());
            }

            if (newObj.getPlaceItem() != null) {
                oldObj.setPlaceItem(newObj.getPlaceItem());
            }

            if (newObj.getOrientationItem() != null) {
                oldObj.setOrientationItem(newObj.getOrientationItem());
            }

            if (newObj.getSurfaceItem() != null) {
                oldObj.setSurfaceItem(newObj.getSurfaceItem());
            }

            if (newObj.getTypeItem() != null) {
                oldObj.setTypeItem(newObj.getTypeItem());
            }

            if (newObj.getChannelItem() != null) {
                oldObj.setChannelItem(newObj.getChannelItem());
            }

            if (newObj.getDisplaceItem() != null) {
                oldObj.setDisplaceItem(newObj.getDisplaceItem());
            }

            if (newObj.getTuningFrequencyVHFItem() != null) {
                oldObj.setTuningFrequencyVHFItem(newObj.getTuningFrequencyVHFItem());
            }

        }

        return oldObj;
    }

    public static DMETimeSliceType delta(DMETimeSliceType oldObj, DMETimeSliceType newObj) {
        DMETimeSliceType result = new DMETimeSliceType();
        result.setId(newObj.getId());
        result.setInterpretation("PERMDELTA");
        result.setSequenceNumber(newObj.getSequenceNumber());
        result.setCorrectionNumber(newObj.getCorrectionNumber());
        result.setTimeSliceMetadata(newObj.getTimeSliceMetadata());
        result.setValidTime(newObj.getValidTime());
        // result.setFeatureLifetime(newObj.getFeatureLifetime());
        if (newObj != null && oldObj != null) {
            List list3;
            if (isDifferent(newObj.getLocation(), oldObj.getLocation())) {
                result.setLocation(newObj.getLocation());
            }

            if (isDifferent(newObj.getDirection(), oldObj.getDirection())) {
                result.setDirection(newObj.getDirection());
            }

            if (isDifferent(newObj.getArea(), oldObj.getArea())) {
                result.setArea(newObj.getArea());
            }

            if (isDifferent(newObj.getPlace(), oldObj.getPlace())) {
                result.setPlace(newObj.getPlace());
            }

            if (isDifferent(newObj.getOrientation(), oldObj.getOrientation())) {
                result.setOrientation(newObj.getOrientation());
            }

            if (isDifferent(newObj.getSurface(), oldObj.getSurface())) {
                result.setSurface(newObj.getSurface());
            }

            if (isDifferent(oldObj.getAnnotation(), newObj.getAnnotation())) {
                list3 = newObj.getAnnotation();
                if (list3 != null) {
                    result.getAnnotation().clear();
                    result.getAnnotation().addAll(list3);
                }
            }

            if (isDifferent(oldObj.getExtension(), newObj.getExtension())) {
                list3 = newObj.getExtension();
                if (list3 != oldObj.getExtension()) {
                    result.getExtension().clear();
                    result.getExtension().addAll(list3);
                }
            }

            if (isDifferent(newObj.getDesignatorItem(), oldObj.getDesignatorItem())) {
                result.setDesignatorItem(newObj.getDesignatorItem());
            }

            if (isDifferent(newObj.getAixmNameItem(), oldObj.getAixmNameItem())) {
                result.setAixmNameItem(newObj.getAixmNameItem());
            }

            if (isDifferent(newObj.getEmissionClassItem(), oldObj.getEmissionClassItem())) {
                result.setEmissionClassItem(newObj.getEmissionClassItem());
            }

            if (isDifferent(newObj.getMobileItem(), oldObj.getMobileItem())) {
                result.setMobileItem(newObj.getMobileItem());
            }

            if (isDifferent(newObj.getMagneticVariationItem(), oldObj.getMagneticVariationItem())) {
                result.setMagneticVariationItem(newObj.getMagneticVariationItem());
            }

            if (isDifferent(newObj.getDateMagneticVariationItem(), oldObj.getDateMagneticVariationItem())) {
                result.setDateMagneticVariationItem(newObj.getDateMagneticVariationItem());
            }

            if (isDifferent(newObj.getFlightCheckedItem(), oldObj.getFlightCheckedItem())) {
                result.setFlightCheckedItem(newObj.getFlightCheckedItem());
            }

            if (isDifferent(newObj.getLocationItem(), oldObj.getLocationItem())) {
                result.setLocationItem(newObj.getLocationItem());
            }

            if (isDifferent(newObj.getDirectionItem(), oldObj.getDirectionItem())) {
                result.setDirectionItem(newObj.getDirectionItem());
            }

            if (isDifferent(newObj.getAreaItem(), oldObj.getAreaItem())) {
                result.setAreaItem(newObj.getAreaItem());
            }

            if (isDifferent(newObj.getPlaceItem(), oldObj.getPlaceItem())) {
                result.setPlaceItem(newObj.getPlaceItem());
            }

            if (isDifferent(newObj.getOrientationItem(), oldObj.getOrientationItem())) {
                result.setOrientationItem(newObj.getOrientationItem());
            }

            if (isDifferent(newObj.getSurfaceItem(), oldObj.getSurfaceItem())) {
                result.setSurfaceItem(newObj.getSurfaceItem());
            }

            if (isDifferent(newObj.getTypeItem(), oldObj.getTypeItem())) {
                result.setTypeItem(newObj.getTypeItem());
            }

            if (isDifferent(newObj.getChannelItem(), oldObj.getChannelItem())) {
                result.setChannelItem(newObj.getChannelItem());
            }

            if (isDifferent(newObj.getDisplaceItem(), oldObj.getDisplaceItem())) {
                result.setDisplaceItem(newObj.getDisplaceItem());
            }

            if (isDifferent(newObj.getTuningFrequencyVHFItem(), oldObj.getTuningFrequencyVHFItem())) {
                result.setTuningFrequencyVHFItem(newObj.getTuningFrequencyVHFItem());
            }

        }

        return result;
    }

}