package com.aixm.delorean.aixm511.engine;

import java.lang.reflect.Field;
import java.util.List;

import com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm511.schema.AbstractAIXMTimeSliceType;
import com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType;
import com.aixm.delorean.aixm511.schema.message.BasicMessageMemberAIXMPropertyType;

import jakarta.xml.bind.JAXBElement;

public class Aixm511Engine extends com.aixm.delorean.core.engine.AbstractEngine {

    public Aixm511Engine() {
        super();
    }

    @Override
    public void statistics(Object container) {

        Integer featureCount = 0;
        Integer timeSliceCount = 0;

        AIXMBasicMessageType message = (AIXMBasicMessageType) container;

        for (BasicMessageMemberAIXMPropertyType member : message.getHasMember()) {
            AbstractAIXMFeatureType feature = member.getAbstractAIXMFeature().getValue();
            if (feature != null) {
                featureCount += 1;
            }

        }

        System.out.println("Features: " + featureCount + ", TimeSlices: " + timeSliceCount);
    }

    @Override
    public Object filter(Object container, String filterExpression) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object merge(Object firstObject, Object secondObject) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object integrate(Class<?> type, Object oldObj, Object newObj) {
        if (AbstractAIXMTimeSliceType.class.isAssignableFrom(type) == false) {
            throw new RuntimeException("Unsupported type for integration: " + type);
        }
        AbstractAIXMTimeSliceType oldTS = (AbstractAIXMTimeSliceType) oldObj;
        AbstractAIXMTimeSliceType newTS = (AbstractAIXMTimeSliceType) newObj;
        @SuppressWarnings("unchecked")
        Object result = integrateAixmTimeSlice((Class<? extends AbstractAIXMTimeSliceType>) type, oldTS, newTS);
        return result;
    }

    @Override
    public Object delta(Class<?> type, Object oldObj, Object newObj) {
        if (AbstractAIXMTimeSliceType.class.isAssignableFrom(type) == false) {
            throw new RuntimeException("Unsupported type for integration: " + type);
        }
        AbstractAIXMTimeSliceType oldTS = (AbstractAIXMTimeSliceType) oldObj;
        AbstractAIXMTimeSliceType newTS = (AbstractAIXMTimeSliceType) newObj;
        @SuppressWarnings("unchecked")
        Object result = deltaAixmTimeSlice((Class<? extends AbstractAIXMTimeSliceType>) type, oldTS, newTS);
        return result;
    }

    
    private <CT extends AbstractAIXMTimeSliceType> CT integrateAixmTimeSlice(Class<CT> type, AbstractAIXMTimeSliceType oldObj, AbstractAIXMTimeSliceType newObj) {
        CT result;
        try {
            result = type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + type, e);
        }

        result.setId(newObj.getId());
        result.setInterpretation("BASELINE");
        result.setSequenceNumber(newObj.getSequenceNumber());
        result.setCorrectionNumber(newObj.getCorrectionNumber());
        result.setTimeSliceMetadata(newObj.getTimeSliceMetadata());
        result.setValidTime(newObj.getValidTime());
        result.setFeatureLifetime(oldObj.getFeatureLifetime());

        for (Field field : type.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object oldVal = field.get(oldObj);
                Object newVal = field.get(newObj);

                if (field.getName().equals("serialVersionUID")) {
                    continue;

                } else if (oldVal == null && newVal == null) {
                    continue;

                } else if (oldVal == null && newVal != null) {
                    field.set(result, newVal);

                } else if (oldVal != null && newVal == null) {
                    field.set(result, oldVal);

                } else if (oldVal instanceof JAXBElement<?> || newVal instanceof JAXBElement<?>) {
                    if (isDifferent(oldVal, newVal)) {
                        field.set(result, newVal);
                    } else {
                        field.set(result, oldVal);
                    }
                    
                } else if (oldVal instanceof List<?> || newVal instanceof List<?>) {
                    if (isDifferent(oldVal, newVal)) {
                        field.set(result, newVal);
                    } else {
                        field.set(result, oldVal);
                    }

                } else {
                    throw new RuntimeException("AXIM feature should only contain JAXBElement or List fields, got : " + field.getName() + " / " + oldVal.getClass());
                }

            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access field " + field.getName(), e);

            }
        }

        return result;
    }

    public <CT extends AbstractAIXMTimeSliceType> CT deltaAixmTimeSlice(Class<CT> type, AbstractAIXMTimeSliceType oldObj, AbstractAIXMTimeSliceType newObj) {
        CT result;
        try {
            result = type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + type, e);
        }

        result.setId(newObj.getId());
        result.setInterpretation("PERMDELTA");
        result.setSequenceNumber(newObj.getSequenceNumber());
        result.setCorrectionNumber(newObj.getCorrectionNumber());
        result.setTimeSliceMetadata(newObj.getTimeSliceMetadata());
        result.setValidTime(newObj.getValidTime());

        for (Field field : type.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object oldVal = field.get(oldObj);
                Object newVal = field.get(newObj);

                if (field.getName().equals("serialVersionUID")) {
                    continue;

                } else if (oldVal == null && newVal == null) {
                    continue;

                } else if (oldVal == null && newVal != null) {
                    field.set(result, newVal);

                } else if (oldVal != null && newVal == null) {
                    field.set(result, oldVal);

                } else if (oldVal instanceof JAXBElement<?> || newVal instanceof JAXBElement<?>) {
                    if (isDifferent(oldVal, newVal)) {
                        field.set(result, newVal);
                    }
                    
                } else if (oldVal instanceof List<?> || newVal instanceof List<?>) {
                    if (isDifferent(oldVal, newVal)) {
                        field.set(result, newVal);
                    }

                } else {
                    throw new RuntimeException("AXIM feature should only contain JAXBElement or List fields, got : " + field.getName() + " / " + oldVal.getClass());
                }

            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access field " + field.getName(), e);

            }
        }

        return result;
    }
     
        
}
