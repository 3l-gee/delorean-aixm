package com.delorean.aixm.aixm511.engine;

import java.lang.reflect.Field;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import com.delorean.aixm.aixm511.filter.Aixm511FilterConfig;
import com.delorean.aixm.aixm511.schema.AbstractAIXMFeatureType;
import com.delorean.aixm.aixm511.schema.AbstractAIXMObjectType;
import com.delorean.aixm.aixm511.schema.AbstractAIXMTimeSliceType;
import com.delorean.aixm.aixm511.schema.message.AIXMBasicMessageType;
import com.delorean.aixm.aixm511.schema.message.BasicMessageMemberAIXMPropertyType;
import com.delorean.aixm.core.engine.TemporalityInspector;
import com.delorean.aixm.core.filter.AbstractFilterConfig;
import com.delorean.aixm.core.filter.AbstractFilterSpecification;
import com.delorean.aixm.core.log.ConsoleLogger;
import com.delorean.aixm.core.log.LogLevel;
import org.apache.commons.lang3.SerializationUtils;
import jakarta.xml.bind.JAXBElement;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Aixm511Engine extends com.delorean.aixm.core.engine.AbstractEngine<AIXMBasicMessageType, BasicMessageMemberAIXMPropertyType, AbstractAIXMFeatureType, AbstractAIXMTimeSliceType, AbstractAIXMObjectType, Aixm511FilterConfig> {

    public Aixm511Engine() {
        super();
    }

    /**
     * Propagates a lifecycle status string across an entire AIXM Basic Message, setting it on 
     * all message members, their embedded features, and all extracted time slices.
     * 
     * @param message The top-level AIXM message container.
     * @param status The lifecycle status string to set.
     */
    @Override
    public void applyMessageLifecycleStatus(AIXMBasicMessageType message, String status) {
        if (message == null || message.getHasMember() == null) {
            log.atWarn().log("Cannot set lifecycle status on null AIXMBasicMessageType or empty members list");
            return;
        }

        log.atDebug().log("Applying lifecycleStatus='{}' across {} message members", status, message.getHasMember().size());

        for (BasicMessageMemberAIXMPropertyType member : message.getHasMember()) {
            if (member != null) {
                applyFeatureLifecycleStatus(member, status);
            }
        }
    }

    /**
     * Propagates a lifecycle status string to both the underlying AbstractAIXMFeatureType 
     * and all of its associated AbstractAIXMTimeSliceType instances.
     * 
     * @param member The JAXB/JPA message member container.
     * @param status The lifecycle status string to set.
     */

    public static void applyFeatureLifecycleStatus(BasicMessageMemberAIXMPropertyType member, String status) {
        if (member == null || member.getAbstractAIXMFeature() == null) {
            log.atWarn().log("Cannot set lifecycle status on null member or null feature payload");
            return;
        }

        AbstractAIXMFeatureType feature = member.getAbstractAIXMFeature().getValue();
        if (feature == null) {
            return;
        }

        log.atDebug().log("Setting lifecycleStatus='{}' for feature: {}", status, feature.getIdentifier().getValue());
        feature.setLifecycleStatus(status);

        Aixm511TimeSliceEngine.applyTimeSliceLifecycleStatus(feature, status);
    }

    /**
     * Computes information about the AIXM message like the earliest and latest feature lifetime, valid time, and counts of different slice types. It combines the temporality information of all features in the message to provide an overall summary.
     * @param message The AIXM message to analyze.
     */
    @Override
    public void temporalityInspection(AIXMBasicMessageType message) {
        TemporalityInspector combinedInspector = new TemporalityInspector(Instant.MAX, Instant.MIN, Instant.MAX, Instant.MIN, 0, 0, 0, 0,0,0);

        for (BasicMessageMemberAIXMPropertyType member : message.getHasMember()) { 
            AbstractAIXMFeatureType feature = member.getAbstractAIXMFeature().getValue();
            if (feature != null) {
                TemporalityInspector inspector = Aixm511TimeSliceEngine.getTimeSliceValidityPeriod(feature);
                combinedInspector = combinedInspector.combine(inspector);
            }
        }

        combinedInspector.validateTemporality();
    }

    /**
     * Computes statistics about the AIXM message, such as the number of features and time slices.
     * @param message The AIXM message to analyze.
     * @return A string summarizing the statistics of the message.
     */
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
    public AIXMBasicMessageType filter(AIXMBasicMessageType message, AbstractFilterConfig filterExpression) {
        if (message == null || message.getHasMember() == null) {
            return message;
        }

        log.atDebug().setMessage("Filtering AIXM message with {} members using filter expression: {}").addArgument(() -> message.getHasMember().size()).addArgument(() -> filterExpression).log();

        List<AbstractFilterSpecification<AbstractAIXMFeatureType>> featureFilter = filterExpression.getFeatureFilter();
        List<AbstractFilterSpecification<AbstractAIXMTimeSliceType>> timesliceFilter = filterExpression.getTimesliceFilter();

        List<BasicMessageMemberAIXMPropertyType> members = message.getHasMember();
        
        members.removeIf(member -> {

            // 1 Feature Check
            AbstractAIXMFeatureType feature = member.getAbstractAIXMFeature().getValue();
            if (feature == null) {
                log.atDebug().setMessage("Removed null member").log();
                return true;
            }

            for (AbstractFilterSpecification<AbstractAIXMFeatureType> spec : featureFilter) {
                if (!spec.isSatisfiedBy(feature)) {
                    log.atDebug().setMessage("Removed feature {} due to filter: {}").addArgument(() -> feature.getIdentifier().getValue()).addArgument(() -> spec.getDescription()).log();
                    return true;
                }
            }

            // 2 TimeSlice Check
            List<AbstractAIXMTimeSliceType> timeSlices = Aixm511TimeSliceEngine.invokeTimeSlice(feature);
            if (timeSlices.isEmpty()) {
                return true;
            }

            // Filter the timeslices list itself
            timeSlices.removeIf(timeSlice -> {
                for (AbstractFilterSpecification<AbstractAIXMTimeSliceType> spec : timesliceFilter) {
                    if (!spec.isSatisfiedBy(timeSlice)) {
                        log.atDebug().setMessage("Removed timeslice {} of feature {} due to filter: {}").addArgument(() -> timeSlice.getId()).addArgument(() -> feature.getIdentifier().getValue()).addArgument(() -> spec.getDescription()).log();
                        return true;
                    }
                }
                return false;
            });

            return timeSlices.isEmpty();
        });

        return message; 
    }

    @Override
    public AIXMBasicMessageType combine(AIXMBasicMessageType message) {
        return null;
    }

    @Override
    public AIXMBasicMessageType clone(AIXMBasicMessageType message) {
        if (message == null) {
            return null;
        }
        AIXMBasicMessageType clonedMessage = SerializationUtils.clone(message);
        return clonedMessage;
    }

    /**
     * Integrates a new partial AIXM message with an existing current AIXM message by merging features based on their identifiers. For each feature in the new message, it checks if a corresponding feature exists in the current message. If it does, it merges their time slices to create a complete feature. The result is a new AIXM message that combines the information from both messages, effectively converting temporary or permanent deltas into baseline features.
     * @param currentMessage The existing AIXM message that serves as the baseline for integration
     * @param newMessage The new partial AIXM message to integrate
     * @return The integrated AIXM message
     */
    @SuppressWarnings("unchecked")
    @Override
    public AIXMBasicMessageType integrate(AIXMBasicMessageType currentMessage, AIXMBasicMessageType newMessage) {
        Map<String, AbstractAIXMFeatureType> currentIdsFeatures = new HashMap<>();

        for (BasicMessageMemberAIXMPropertyType currentMember : currentMessage.getHasMember()) {
            AbstractAIXMFeatureType currentFeature = currentMember.getAbstractAIXMFeatureValue();
            if (currentFeature == null || currentFeature.getIdentifier() == null) {
                throw new IllegalArgumentException("Current message contains a feature with null identifier: " + currentMember);
            }

            String currentIdentifier = currentFeature.getIdentifier().getValue();
            if (currentIdentifier == null || currentIdentifier.isBlank()) {
                throw new IllegalArgumentException("Current message contains a feature with null or blank identifier: " + currentMember);
            }

            AbstractAIXMFeatureType previous = currentIdsFeatures.putIfAbsent(currentIdentifier, currentFeature);

            if (previous != null) {
                log.warn("Current message contains duplicate feature identifiers: " + currentIdentifier);
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
                throw new IllegalArgumentException("New message contains a partial feature with null identifier: " + newPartialMember);
            }

            String newPartialIdentifier = newPartialFeature.getIdentifier().getValue();
            if (newPartialIdentifier == null || newPartialIdentifier.isBlank()) {
                throw new IllegalArgumentException("New message contains a partial feature with null or blank identifier: " + newPartialMember);
            }

            AbstractAIXMFeatureType currentFeature = currentIdsFeatures.get(newPartialIdentifier);
            log.atDebug().setMessage("Integrating partial feature with id : {}").addArgument(() -> currentFeature.getIdentifier().getValue()).log();
            if (currentFeature != null) {
                // Existing feature 
                newCompletedFeature = this.integrateAixmFeature(newPartialFeature.getClass(), currentFeature, newPartialFeature);
                Class<AbstractAIXMFeatureType> declaredType = (Class<AbstractAIXMFeatureType>) newPartialFeature.getClass();
                JAXBElement<? extends AbstractAIXMFeatureType> newCompletedFeatureElement = new JAXBElement<>(new QName("http://www.aixm.aero/schema/5.1", newPartialFeature.getClass().getSimpleName()), declaredType, newCompletedFeature);
                newPartialMember.setAbstractAIXMFeature(newCompletedFeatureElement);
            } else {
                // New feature
                throw new IllegalArgumentException("New message contains a partial feature with identifier <" + newPartialIdentifier + "> that does not exist in the current message, it can not be integrated: " + newPartialMember);
            }

            newMessage.getHasMember().add(newPartialMember);
        }

        return newMessage;
    }

    /**
     * Computes the difference between two AIXM messages by comparing their features time slices. For each feature in the new message, it checks if a corresponding feature exists in the current message. If it does, it compares their time slices to identify changes and creates a new feature that represents the differences. The result is a new AIXM message that contains only the features and time slices that have changed between the two messages, effectively creating a delta message that can be used for updates or synchronization.
      * @param message The new AIXM message to compare against the current message
      * @return An AIXM message containing only the differences between the new and current messages
     */
    @SuppressWarnings("unchecked")
    @Override
    public AIXMBasicMessageType diff(AIXMBasicMessageType message) {
        List<BasicMessageMemberAIXMPropertyType> messageMember = new ArrayList<>(message.getHasMember());
        message.unsetHasMember();

        for (BasicMessageMemberAIXMPropertyType member : messageMember) {
            AbstractAIXMFeatureType fullFeature = member.getAbstractAIXMFeatureValue();
            AbstractAIXMFeatureType diffFeature;
            try {
                diffFeature = fullFeature.getClass().getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException("Failed to instantiate " + fullFeature.getClass(), e);
            }

            if (fullFeature == null || fullFeature.getIdentifier() == null) {
                throw new IllegalArgumentException("Current message contains a feature with null identifier: " + member);
            }
            log.atDebug().setMessage("Diffing feature with id : {}").addArgument(() -> fullFeature.getIdentifier().getValue()).log();
            diffFeature = this.diffAixmFeature(fullFeature.getClass(), fullFeature);

            if (diffFeature == null) {
                continue;
            } else {
                Class<AbstractAIXMFeatureType> declaredType = (Class<AbstractAIXMFeatureType>) fullFeature.getClass();
                JAXBElement<? extends AbstractAIXMFeatureType> diffFeatureElement = new JAXBElement<>(new QName("http://www.aixm.aero/schema/5.1", fullFeature.getClass().getSimpleName()), declaredType, diffFeature);
                member.setAbstractAIXMFeature(diffFeatureElement);
                message.getHasMember().add(member);
            }
        }

        return message;
    }

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

        outputFeature.setIdentifier(currentFeature.getIdentifier());

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
            log.atDebug().setMessage("Integrating feature: {} at timeslice: {} with incoming timeslice: {}")
                .addArgument(() -> currentFeature.getIdentifier().getValue())
                .addArgument(() -> currentTimeSlice.getSequenceNumber())
                .addArgument(() -> newTimeSlice.getSequenceNumber())
                .log();

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

                    // Skip serialVersionUID
                    if (field.getName().equals("serialVersionUID")) {
                        continue;

                    // Both null => nothing
                    } else if (currentVal == null && newVal == null) {
                        continue;

                    // Was null, is now set => set new val
                    } else if (currentVal == null && newVal != null) {
                        field.set(newCompletedTimeSlice, newVal);
                    
                    // Was set, is now null => keep old val
                    } else if (currentVal != null && newVal == null) {
                        field.set(newCompletedTimeSlice, currentVal);

                    // Both Set, JAXB Content analyse
                    } else if (currentVal instanceof JAXBElement<?> || newVal instanceof JAXBElement<?>) {
                        if (isDifferentIntegrate((JAXBElement<?>) currentVal, (JAXBElement<?>) newVal)) {
                            field.set(newCompletedTimeSlice, newVal);
                        } else {
                            field.set(newCompletedTimeSlice, currentVal);
                        }
                    // Both Set, List Content analyse
                    } else if (currentVal instanceof List<?> || newVal instanceof List<?>) {
                        if (isDifferentIntegrate((List<?>) currentVal, (List<?>) newVal)) {
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

            Aixm511TimeSliceEngine.injectTimeSlice((AbstractAIXMFeatureType) outputFeature, newCompletedTimeSlice);
        }

        return outputFeature;
    }
    
    /**
     * Compares two time slice field values to determine if they are different for the purpose of diffing. It handles null values, JAXBElement content, and List content to accurately identify differences between the current and new values.
     * @param <FTYPE> the concrete AIXM feature type produced by this method
     * @param featureType the feature class used to instantiate the result
     * @param feature the AIXM feature to diff, never {@code null}
     * @return
     */
    public <FTYPE extends AbstractAIXMFeatureType> FTYPE diffAixmFeature(Class<FTYPE> featureType, AbstractAIXMFeatureType feature) {
        FTYPE diffFeature;

        try {
            diffFeature = featureType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + featureType.getSimpleName(), e);
        }

        diffFeature.setIdentifier(feature.getIdentifier());

        if (featureType != feature.getClass()) {
            throw new IllegalArgumentException("Identifier <" + feature.getIdentifier() + "> does not map to the same AIXM type, new : " + feature.getClass() + " current : " + feature.getClass());
        }

        Comparator<AbstractAIXMTimeSliceType> timeSliceComparator = Comparator.comparing(
            AbstractAIXMTimeSliceType::getSequenceNumber,Comparator.nullsLast(Long::compare))
            .thenComparing(
                AbstractAIXMTimeSliceType::getCorrectionNumber,Comparator.nullsLast(Long::compare)
            );

        List<AbstractAIXMTimeSliceType> listFullTimeSlice = Aixm511TimeSliceEngine.invokeTimeSlice(feature);

        if (listFullTimeSlice.isEmpty() || listFullTimeSlice.size() < 2) {
            return null;
        }
        Class<? extends AbstractAIXMTimeSliceType> timeSliceType = listFullTimeSlice.getFirst().getClass();

        listFullTimeSlice.sort(timeSliceComparator);

        // Sliding Window: Start from index 1 and look back at i-1
        for (int i = 1; i < listFullTimeSlice.size(); i++) {
            AbstractAIXMTimeSliceType previous = listFullTimeSlice.get(i - 1);
            AbstractAIXMTimeSliceType current = listFullTimeSlice.get(i);
            AbstractAIXMTimeSliceType  diffTimeSlice;

            log.atDebug().setMessage("Diffing feature: {} between curent timeslice: {} and previous timeslice: {} ")
                .addArgument(() -> feature.getIdentifier().getValue())
                .addArgument(() -> current.getSequenceNumber())
                .addArgument(() -> previous.getSequenceNumber())
                .log();

            try {
                diffTimeSlice = timeSliceType.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException("Failed to instantiate " + timeSliceType, e);
            }

            diffTimeSlice.setId(current.getId());
            diffTimeSlice.setInterpretation("PERMDELTA");
            diffTimeSlice.setSequenceNumber(current.getSequenceNumber());
            diffTimeSlice.setCorrectionNumber(current.getCorrectionNumber());
            diffTimeSlice.setTimeSliceMetadata(current.getTimeSliceMetadata());
            diffTimeSlice.setValidTime(current.getValidTime());

            for (Field field : timeSliceType.getDeclaredFields()) {
                try {
                    field.setAccessible(true);
                    Object previousVal = field.get(previous);
                    Object currentVal = field.get(current);

                    if (field.getName().equals("serialVersionUID")) {
                        continue;

                    } else if (previousVal == null && currentVal == null) {
                        continue;

                    } else if (previousVal == null && currentVal != null) {
                        field.set(diffTimeSlice, currentVal);

                    } else if (previousVal instanceof JAXBElement<?> || currentVal instanceof JAXBElement<?>) {
                        if (isDifferentDiff((JAXBElement<?>) previousVal, (JAXBElement<?>) currentVal)) {
                            field.set(diffTimeSlice, currentVal);
                        }
                        
                    } else if (previousVal instanceof List<?> || currentVal instanceof List<?>) {
                        if (isDifferentDiff((List<?>) previousVal, (List<?>) currentVal)) {
                            field.set(diffTimeSlice, currentVal);
                        }

                    } else {
                        throw new RuntimeException("AXIM TimeSlice should only contain JAXBElement or List fields, got : " + field.getName() + " / " + previousVal.getClass());
                    }

                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Failed to access field " + field.getName(), e);

                }
            }

            Aixm511TimeSliceEngine.injectTimeSlice((AbstractAIXMFeatureType) diffFeature, diffTimeSlice);
        }

        return diffFeature;
    }
}
