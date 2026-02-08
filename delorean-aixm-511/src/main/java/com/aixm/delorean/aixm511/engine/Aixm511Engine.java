package com.aixm.delorean.aixm511.engine;

import java.lang.reflect.Field;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm511.schema.AbstractAIXMObjectType;
import com.aixm.delorean.aixm511.schema.AbstractAIXMTimeSliceType;
import com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType;
import com.aixm.delorean.aixm511.schema.message.BasicMessageMemberAIXMPropertyType;
import com.aixm.delorean.core.engine.TemporalityInspector;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

import jakarta.xml.bind.JAXBElement;

public class Aixm511Engine extends com.aixm.delorean.core.engine.AbstractEngine<AIXMBasicMessageType, AbstractAIXMFeatureType, AbstractAIXMTimeSliceType, AbstractAIXMObjectType> {

    public Aixm511Engine() {
        super();
    }

    @Override
    public void info(AIXMBasicMessageType message) {
        TemporalityInspector combinedInspector = new TemporalityInspector(Instant.MAX, Instant.MIN, Instant.MAX, Instant.MIN, 0, 0, 0, 0);

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
    public String statistics(AIXMBasicMessageType message) {
        Integer featureCount = 0;
        Integer timeSliceCount = 0;

        for (BasicMessageMemberAIXMPropertyType member : message.getHasMember()) {
            AbstractAIXMFeatureType feature = member.getAbstractAIXMFeature().getValue();
            if (feature != null) {
                featureCount += 1;
                timeSliceCount += Aixm511TimeSliceEngine.countTimeSlices(feature);
            }

        }

        return new String("F: " + featureCount + " / T: " + timeSliceCount);
    }

    @Override
    public AIXMBasicMessageType filter(AIXMBasicMessageType message, String filterExpression) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AIXMBasicMessageType merge(AIXMBasicMessageType message) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public AIXMBasicMessageType integrate(AIXMBasicMessageType currentMessage, AIXMBasicMessageType newMessage) {
        Map<String, AbstractAIXMFeatureType> currentIdsFeatures = new HashMap<>();

        for (BasicMessageMemberAIXMPropertyType currentMember : currentMessage.getHasMember()) {

            AbstractAIXMFeatureType currentFeature = currentMember.getAbstractAIXMFeatureValue();
            if (currentFeature == null || currentFeature.getIdentifier() == null) {
                continue;
            }

            String currentIdentifier = currentFeature.getIdentifier().getValue();
            if (currentIdentifier == null || currentIdentifier.isBlank()) {
                continue;
            }

            AbstractAIXMFeatureType previous = currentIdsFeatures.putIfAbsent(currentIdentifier, currentFeature);

            if (previous != null) {
                ConsoleLogger.log(LogLevel.WARN, "Duplicate AIXM feature identifier detected: " + currentIdentifier
                );
            }
        }

        List<BasicMessageMemberAIXMPropertyType> newPartialMembers = new ArrayList<>(newMessage.getHasMember());
        newMessage.unsetHasMember();

        for (BasicMessageMemberAIXMPropertyType newPartialMember  : newPartialMembers) {

            AbstractAIXMFeatureType newPartialFeature = newPartialMember.getAbstractAIXMFeatureValue();
            AbstractAIXMFeatureType newCompletedFeature;
            try {
                newCompletedFeature = newPartialFeature.getClass().getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException("Failed to instantiate " + newPartialFeature.getClass(), e);
            }
            if (newPartialFeature == null || newPartialFeature.getIdentifier() == null) {
                continue;
            }

            String newPartialIdentifier = newPartialFeature.getIdentifier().getValue();
            if (newPartialIdentifier == null || newPartialIdentifier.isBlank()) {
                continue;
            }

            AbstractAIXMFeatureType currentFeature = currentIdsFeatures.get(newPartialIdentifier);
            

            if (currentFeature != null) {
                // Existing feature 
                newCompletedFeature = this.integrateAixmFeature(newPartialFeature.getClass(), currentFeature, newPartialFeature);
                Class<AbstractAIXMFeatureType> declaredType = (Class<AbstractAIXMFeatureType>) newPartialFeature.getClass();
                JAXBElement<? extends AbstractAIXMFeatureType> newCompletedFeatureElement = new JAXBElement<>(new QName("http://www.aixm.aero/schema/5.1.1", newPartialFeature.getClass().getSimpleName()), declaredType, newCompletedFeature);
                newPartialMember.setAbstractAIXMFeature(newCompletedFeatureElement);

                newMessage.getHasMember().add(newPartialMember);
            } else {
                // New feature
                newMessage.getHasMember().add(newPartialMember);
            }
        }

        return newMessage;
    }

    @Override
    public AIXMBasicMessageType delta(AIXMBasicMessageType oldMessage, AIXMBasicMessageType newMessage) {
        return null;
    }
    // @Override
    // public Object delta(Object oldMessage, Object newMessage) {
    //     if (AbstractAIXMTimeSliceType.class.isAssignableFrom(type) == false) {
    //         throw new RuntimeException("Unsupported type for integration: " + type);
    //     }
    //     AbstractAIXMTimeSliceType oldTS = (AbstractAIXMTimeSliceType) oldObj;
    //     AbstractAIXMTimeSliceType newTS = (AbstractAIXMTimeSliceType) newObj;
    //     @SuppressWarnings("unchecked")
    //     Object result = deltaAixmTimeSlice((Class<? extends AbstractAIXMTimeSliceType>) type, oldTS, newTS);
    //     return result;
    // }

    /**
     *  Merges partial feature's timeslice (TEMPDELTA or PERMDELTA) with current feature's timeslice to crate BASELINE slices. effectively converting TEMPDELTA or PERMDELTA into BASELINE slices.
     * 
     * @param <FTYPE> the concrete AIXM feature type produced by this method
     * @param featureType the feature class used to instantiate the result
     * @param currentFeature the existing BASELINE feature, never {@code null}
     * @param newPartialFeature new partial aixm feature, never {@code null}
     * @return a integrated aixm feature wiht BASLINE timeslices.
     * @throws RuntimeException if the feature type cannot be instantiated
     */ 
    private <FTYPE extends AbstractAIXMFeatureType> FTYPE integrateAixmFeature(Class<FTYPE> featureType, AbstractAIXMFeatureType currentFeature, AbstractAIXMFeatureType newPartialFeature) {
        FTYPE outputFeature; 
        try {
            outputFeature = featureType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + featureType.getSimpleName(), e);
        }

        if (featureType != currentFeature.getClass() && featureType != newPartialFeature.getClass() && currentFeature.getClass() != newPartialFeature.getClass()) {
            throw new IllegalArgumentException("Identifier <" + currentFeature.getIdentifier() + "> does not map to the same AIXM type, new : " + newPartialFeature.getClass() + " current : " + currentFeature.getClass());
        }

        Comparator<AbstractAIXMTimeSliceType> timeSliceComparator = Comparator.comparing(
            AbstractAIXMTimeSliceType::getSequenceNumber,Comparator.nullsLast(Long::compare))
            .thenComparing(
                AbstractAIXMTimeSliceType::getCorrectionNumber,Comparator.nullsLast(Long::compare)
            );

        List<AbstractAIXMTimeSliceType> listNewPartialTimeSlice = Aixm511TimeSliceEngine.invokeTimeSlice(newPartialFeature);
        List<AbstractAIXMTimeSliceType> listCurrentTimeSlice = Aixm511TimeSliceEngine.invokeTimeSlice(currentFeature);
        Class<? extends AbstractAIXMTimeSliceType> timeSliceType = listNewPartialTimeSlice.getFirst().getClass();

        listNewPartialTimeSlice.sort(timeSliceComparator);
        listCurrentTimeSlice.sort(timeSliceComparator);

        AbstractAIXMTimeSliceType currentTimeSlice = listCurrentTimeSlice.getLast();

        for (AbstractAIXMTimeSliceType newTimeSlice: listNewPartialTimeSlice) {

            AbstractAIXMTimeSliceType  newCompletedTimeSlice;
            try {
                newCompletedTimeSlice = timeSliceType.getDeclaredConstructor().newInstance();
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

        return outputFeature;
    }

    public <CT extends AbstractAIXMTimeSliceType> CT deltaAixmTimeSlice(Class<CT> type, AbstractAIXMTimeSliceType oldObj, AbstractAIXMTimeSliceType newObj) {
        CT result;
        try {
            result = type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + type.getSimpleName(), e);
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
