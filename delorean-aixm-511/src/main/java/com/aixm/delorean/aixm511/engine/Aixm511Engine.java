package com.aixm.delorean.aixm511.engine;

import java.lang.reflect.Field;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm511.schema.AbstractAIXMTimeSliceType;
import com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType;
import com.aixm.delorean.aixm511.schema.message.BasicMessageMemberAIXMPropertyType;
import com.aixm.delorean.core.database.MutationFeatureTimeslice;
import com.aixm.delorean.core.engine.TemporalityInspector;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

import jakarta.xml.bind.JAXBElement;

public class Aixm511Engine extends com.aixm.delorean.core.engine.AbstractEngine {

    public Aixm511Engine() {
        super();
    }

    @Override
    public void info(Object container) {
        TemporalityInspector combinedInspector = new TemporalityInspector(Instant.MAX, Instant.MIN, Instant.MAX, Instant.MIN, 0, 0, 0, 0);

        AIXMBasicMessageType message = (AIXMBasicMessageType) container;

        for (BasicMessageMemberAIXMPropertyType member : message.getHasMember()) { 
            AbstractAIXMFeatureType feature = member.getAbstractAIXMFeature().getValue();
            if (feature != null) {
                TemporalityInspector inspector = Aixm511TimeSliceEngine.getTimeSliceValidityPeriod(feature);
                combinedInspector = combinedInspector.combine(inspector);
            }
        }

        combinedInspector.printSummary();
    }

    @Override
    public String statistics(Object container) {

        Integer featureCount = 0;
        Integer timeSliceCount = 0;

        AIXMBasicMessageType message = (AIXMBasicMessageType) container;

        for (BasicMessageMemberAIXMPropertyType member : message.getHasMember()) {
            AbstractAIXMFeatureType feature = member.getAbstractAIXMFeature().getValue();
            if (feature != null) {
                featureCount += 1;
                timeSliceCount += Aixm511TimeSliceEngine.countTimeSlices(feature);
            }

        }

        return new String("F: " + featureCount + " / TS: " + timeSliceCount);
    }

    @Override
    public Object filter(Object container, String filterExpression) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object merge(Object object) {
        return null;
    }

    @Override
    public Object integrate(Object oldObject, Object newObject) {
        AIXMBasicMessageType oldMessage = (AIXMBasicMessageType) oldObject;
        AIXMBasicMessageType newMessage = (AIXMBasicMessageType) newObject;

        Map<String, AbstractAIXMFeatureType> mapIdFeature = new HashMap<>();

        for (BasicMessageMemberAIXMPropertyType member : oldMessage.getHasMember()) {

            AbstractAIXMFeatureType feature = member.getAbstractAIXMFeatureValue();
            if (feature == null || feature.getIdentifier() == null) {
                continue;
            }

            String identifier = feature.getIdentifier().getValue();
            if (identifier == null || identifier.isBlank()) {
                continue;
            }

            AbstractAIXMFeatureType previous = mapIdFeature.putIfAbsent(identifier, feature);

            if (previous != null) {
                ConsoleLogger.log(LogLevel.WARN, "Duplicate AIXM feature identifier detected: " + identifier
                );
            }
        }

        List<BasicMessageMemberAIXMPropertyType> incomingMembers = new ArrayList<>(newMessage.getHasMember());
        newMessage.unsetHasMember();

        for (BasicMessageMemberAIXMPropertyType member  : incomingMembers) {

            AbstractAIXMFeatureType newFeature = member.getAbstractAIXMFeatureValue();
            if (newFeature == null || newFeature.getIdentifier() == null) {
                continue;
            }

            String identifier = newFeature.getIdentifier().getValue();
            if (identifier == null || identifier.isBlank()) {
                continue;
            }

            AbstractAIXMFeatureType oldFeature = mapIdFeature.get(identifier);

            if (oldFeature != null) {
                // Existing feature 

            } else {
                // New feature
                newMessage.getHasMember().add(member);
            }

            AbstractAIXMFeatureType oldFeature = mapIdFeature.get(identifier);
            Class<?> clazz = member.getAbstractAIXMFeatureValue().getClass();
            AbstractAIXMFeatureType newFeature = member.getAbstractAIXMFeatureValue();
            AbstractAIXMFeatureType oldFeature = member.get(newFeature.getIdentifier().getValue());
        }

            if (AbstractAIXMTimeSliceType.class.isAssignableFrom(clazz) == false) {
                throw new RuntimeException("Unsupported type for integration: " + type);
            }
            AbstractAIXMTimeSliceType oldTS = (AbstractAIXMTimeSliceType) oldObj;
            AbstractAIXMTimeSliceType newTS = (AbstractAIXMTimeSliceType) newObj;
            @SuppressWarnings("unchecked")
            Object result = integrateAixmTimeSlice((Class<? extends AbstractAIXMTimeSliceType>) type, oldTS, newTS);
            return result;

        }
    }

    @Override
    public Object delta(Object oldMessage, Object newMessage) {
        if (AbstractAIXMTimeSliceType.class.isAssignableFrom(type) == false) {
            throw new RuntimeException("Unsupported type for integration: " + type);
        }
        AbstractAIXMTimeSliceType oldTS = (AbstractAIXMTimeSliceType) oldObj;
        AbstractAIXMTimeSliceType newTS = (AbstractAIXMTimeSliceType) newObj;
        @SuppressWarnings("unchecked")
        Object result = deltaAixmTimeSlice((Class<? extends AbstractAIXMTimeSliceType>) type, oldTS, newTS);
        return result;
    }
    
    private <FTYPE extends AbstractAIXMFeatureType> FTYPE integrateAixmFeature(Class<FTYPE> featureType, Class<TSTYPE> timeSliceType, AbstractAIXMFeatureType currentFeature, AbstractAIXMFeatureType newPartialFeature) {
        FTYPE outputFeature; 

        Comparator<AbstractAIXMTimeSliceType> timeSliceComparator = Comparator.comparing(
            AbstractAIXMTimeSliceType::getSequenceNumber,Comparator.nullsLast(Long::compare))
            .thenComparing(
                AbstractAIXMTimeSliceType::getCorrectionNumber,Comparator.nullsLast(Long::compare)
            );

        List<AbstractAIXMTimeSliceType> listNewPartialTimeSlice = Aixm511TimeSliceEngine.invokeTimeSlice(newPartialFeature);
        List<AbstractAIXMTimeSliceType> listCurrentTimeSlice = Aixm511TimeSliceEngine.invokeTimeSlice(currentFeature);

        listNewPartialTimeSlice.sort(timeSliceComparator);
        listCurrentTimeSlice.sort(timeSliceComparator);

        AbstractAIXMTimeSliceType currentTimeSlice = listCurrentTimeSlice.getLast();

        for (AbstractAIXMTimeSliceType newTimeSlice: listNewPartialTimeSlice) {

            try {
                TSTYPE newCompletedTimeSlice = timeSliceType.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException("Failed to instantiate " + timeSliceType, e);
            }

            newCompletedTimeSlice.setId(newTimeSlice.getId());
            newCompletedTimeSlice.setInterpretation("BASELINE");
            newCompletedTimeSlice.setSequenceNumber(newTimeSlice.getSequenceNumber());
            newCompletedTimeSlice.setCorrectionNumber(newTimeSlice.getCorrectionNumber());
            newCompletedTimeSlice.setTimeSliceMetadata(newTimeSlice.getTimeSliceMetadata());
            newCompletedTimeSlice.setValidTime(newTimeSlice.getValidTime());
            newCompletedTimeSlice.setFeatureLifetime(currentTimeSlice.getFeatureLifetime());

            for (Field field : timeSliceType.getDeclaredFields()) {
                try {
                    field.setAccessible(true);
                    Object currentVal = field.get(currentTimeSlice);
                    Object newVal = field.get(newTimeSlice);

                    if (field.getName().equals("serialVersionUID")) {
                        continue;

                    } else if (currentVal == null && newVal == null) {
                        continue;

                    } else if (currentVal == null && newVal != null) {
                        field.set(newCompletedTimeSlice, newVal);

                    } else if (currentVal != null && newVal == null) {
                        field.set(newCompletedTimeSlice, currentVal);

                    } else if (currentVal instanceof JAXBElement<?> || newVal instanceof JAXBElement<?>) {
                        if (isDifferent(currentVal, newVal)) {
                            field.set(newCompletedTimeSlice, newVal);
                        } else {
                            field.set(newCompletedTimeSlice, currentVal);
                        }
                        
                    } else if (currentVal instanceof List<?> || newVal instanceof List<?>) {
                        if (isDifferent(currentVal, newVal)) {
                            field.set(newCompletedTimeSlice, newVal);
                        } else {
                            field.set(newCompletedTimeSlice, currentVal);
                        }

                    } else {
                        throw new RuntimeException("AXIM feature should only contain JAXBElement or List fields, got : " + field.getName() + " / " + currentVal.getClass());
                    }

                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Failed to access field " + field.getName(), e);

                }
            }
        }



        result.setId(newTimeSlice.getId());
        result.setInterpretation("BASELINE");
        result.setSequenceNumber(newTimeSlice.getSequenceNumber());
        result.setCorrectionNumber(newTimeSlice.getCorrectionNumber());
        result.setTimeSliceMetadata(newTimeSlice.getTimeSliceMetadata());
        result.setValidTime(newTimeSlice.getValidTime());
        result.setFeatureLifetime(oldTimeSlice.getFeatureLifetime());

        for (Field field : timeSliceType.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object oldVal = field.get(oldTimeSlice);
                Object newVal = field.get(newTimeSlice);

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
