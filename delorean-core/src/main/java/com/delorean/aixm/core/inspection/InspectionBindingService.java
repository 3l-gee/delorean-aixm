package com.delorean.aixm.core.inspection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.xml.sax.SAXParseException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InspectionBindingService {

    private static InspectionBindingService instance;

    private final List<InspectionEvent> allEvents = new ArrayList<>();
    private final Map<ValidationSeverity, List<InspectionEvent>> severityIndex = new EnumMap<>(ValidationSeverity.class);
    private final Map<InspectionSource, List<InspectionEvent>> sourceIndex = new EnumMap<>(InspectionSource.class);

    private InspectionBindingService() {
        for (ValidationSeverity severity : ValidationSeverity.values()) {
            severityIndex.put(severity, new ArrayList<>());
        }
        for (InspectionSource source : InspectionSource.values()) {
            sourceIndex.put(source, new ArrayList<>());
        }
    }

    public static synchronized InspectionBindingService getInstance() {
        if (instance == null) {
            instance = new InspectionBindingService();
        }
        return instance;
    }

    /**
     * Instance method to safely record and automatically index events.
     */
    public static void recordEvent(InspectionSource source, ValidationSeverity severity, String method, String message, String location) {
        InspectionEvent event = new InspectionEvent(source, severity, method, message, location);
        getInstance().addValidationEvent(event);
    }

    /**
     * Instance method to safely record and automatically index events.
     */
    public static void recordEvent(InspectionSource source, ValidationSeverity severity, String method, String message) {
        InspectionEvent event = new InspectionEvent(source, severity, method, message);
        getInstance().addValidationEvent(event);
    }

    /**
     * Overload instance method to map SAX Parse Exceptions natively.
     */
    public static void recordEvent(InspectionSource source, ValidationSeverity severity, String method, SAXParseException e) {
        String location = "Line: " + e.getLineNumber() + ", Col: " + e.getColumnNumber();
        InspectionEvent event = new InspectionEvent(source, severity, method, e.getMessage(), location);
        getInstance().addValidationEvent(event);
    }

    /**
    * Overload instance method to map JAXB Validation Events natively.
    */
    public static void recordEvent(InspectionSource source, ValidationSeverity severity, String method, jakarta.xml.bind.ValidationEvent error) {
        String location = "Line: " + error.getLocator().getLineNumber() + ", Col: " + error.getLocator().getColumnNumber();
        InspectionEvent event = new InspectionEvent(source, severity, method, error);
        getInstance().addValidationEvent(event);
    }

    /**
    * Overload instance method to map Geoemtry Validation Events natively.
    */
    public static void recordEventGeometry(ValidationSeverity severity, String method, String error, String identifier) {
        String location = "gml:id : " + identifier;
        InspectionEvent event = new InspectionEvent(InspectionSource.GEOMETRY, severity, method, error, location);
        getInstance().addValidationEvent(event);
    }

    // Single synchronized entry point for adding elements to the main bucket and indexes
    private synchronized void addValidationEvent(InspectionEvent event) {
        allEvents.add(event);
        severityIndex.get(event.getSeverity()).add(event);
        sourceIndex.get(event.getSource()).add(event);
    }

    /**
     * grabs all events matching a severity. 
     */
    public List<InspectionEvent> getBySeverity(ValidationSeverity severity) {
        return Collections.unmodifiableList(getInstance().severityIndex.get(severity));
    }

    /**
     * grabs all events matching a specific framework source origin.
     */
    public List<InspectionEvent> getBySource(InspectionSource source) {
        return Collections.unmodifiableList(getInstance().sourceIndex.get(source));
    }

    /**
     * Filters by Source, Severity, and a keyword search 
     */
    public static List<InspectionEvent> findEvents(InspectionSource source, ValidationSeverity severity, String methodKeyword) {
        InspectionBindingService s = getInstance();
        // Performance optimization: Start with the smallest pre-indexed sub-bucket 
        List<InspectionEvent> basePool;
        
        if (severity != null) {
            basePool = s.severityIndex.get(severity);
        } else if (source != null) {
            basePool = s.sourceIndex.get(source);
        } else {
            basePool = s.allEvents;
        }

        // Stream only the pre-filtered subset instead of the whole master universe
        return basePool.stream()
                .filter(e -> source == null || e.getSource() == source)
                .filter(e -> severity == null || e.getSeverity() == severity)
                .filter(e -> methodKeyword == null || e.getMethod().toLowerCase().contains(methodKeyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public static List<InspectionEvent> getAllEvents() {
        return Collections.unmodifiableList(getInstance().allEvents);
    }

    public static synchronized void clearEvents() {
        InspectionBindingService s = getInstance();
        s.allEvents.clear();
        s.severityIndex.values().forEach(List::clear);
        s.sourceIndex.values().forEach(List::clear);
    }

    public static void printSummary() {
        InspectionBindingService s = getInstance();

        if (s.allEvents.isEmpty()) {
            log.info("Validation : 0 issues detected.");
            return;
        }

        log.info("Validation : " + s.allEvents.size() + " issue(s) detected.");

        // Grouping Hierarchy: Source -> Severity -> Message String -> Event List
        Map<InspectionSource, Map<ValidationSeverity, Map<String, List<InspectionEvent>>>> groupedEvents = 
            s.allEvents.stream().collect(Collectors.groupingBy(
                InspectionEvent::getSource,
                () -> new EnumMap<>(InspectionSource.class),
                Collectors.groupingBy(
                    InspectionEvent::getSeverity,
                    () -> new EnumMap<>(ValidationSeverity.class),
                    Collectors.groupingBy(event -> {
                        String msg = event.getMessage();
                        return (msg != null && !msg.trim().isEmpty()) ? msg : "Unknown or empty validation message";
                    })
                )
            ));
        
            groupedEvents.forEach((source, severityMap) -> {
                log.info("Source : [" + source + "]");
            
                severityMap.forEach((severity, messageMap) -> {
                    long totalSeverityCount = messageMap.values().stream().mapToLong(List::size).sum();
                    
                    log.info("  |-- Severity: [" + severity + "] (" + totalSeverityCount + " total instances)");
                    
                    messageMap.forEach((message, instances) -> {
                        int occurrenceCount = instances.size();
                        InspectionEvent sample = instances.get(0);
                        
                        log.info(String.format(
                            "      |-- [x%d] %s -> %s",
                            occurrenceCount, 
                            sample.getMethod(), 
                            message
                        ));
                        
                        // Show a sample reference location spot so developers know where to look
                        log.info("      |   |--  Sample Location Trace: " + sample.getLocation());
                    });
                });
        });
    }
}
