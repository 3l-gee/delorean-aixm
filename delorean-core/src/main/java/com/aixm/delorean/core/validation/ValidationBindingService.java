package com.aixm.delorean.core.validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.xml.sax.SAXParseException;

import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

public class ValidationBindingService {

    private static ValidationBindingService instance;

    private final List<ValidationEvent> allEvents = new ArrayList<>();
    private final Map<ValidationSeverity, List<ValidationEvent>> severityIndex = new EnumMap<>(ValidationSeverity.class);
    private final Map<ValidationSource, List<ValidationEvent>> sourceIndex = new EnumMap<>(ValidationSource.class);

    private ValidationBindingService() {
        for (ValidationSeverity severity : ValidationSeverity.values()) {
            severityIndex.put(severity, new ArrayList<>());
        }
        for (ValidationSource source : ValidationSource.values()) {
            sourceIndex.put(source, new ArrayList<>());
        }
    }

    public static synchronized ValidationBindingService getInstance() {
        if (instance == null) {
            instance = new ValidationBindingService();
        }
        return instance;
    }

    /**
     * Instance method to safely record and automatically index events.
     */
    public static void recordEvent(ValidationSource source, ValidationSeverity severity, String method, String message, String location) {
        ValidationEvent event = new ValidationEvent(source, severity, method, message, location);
        getInstance().addValidationEvent(event);
    }

    /**
     * Overload instance method to map SAX Parse Exceptions natively.
     */
    public static void recordEvent(ValidationSource source, ValidationSeverity severity, String method, SAXParseException e) {
        String location = "Line: " + e.getLineNumber() + ", Col: " + e.getColumnNumber();
        ValidationEvent event = new ValidationEvent(source, severity, method, e.getMessage(), location);
        getInstance().addValidationEvent(event);
    }

    /**
    * Overload instance method to map JAXB Validation Events natively.
    */
    public static void recordEvent(ValidationSource source, ValidationSeverity severity, String method, jakarta.xml.bind.ValidationEvent error) {
        String location = "Line: " + error.getLocator().getLineNumber() + ", Col: " + error.getLocator().getColumnNumber();
        ValidationEvent event = new ValidationEvent(source, severity, method, error);
        getInstance().addValidationEvent(event);
    }

    // Single synchronized entry point for adding elements to the main bucket and indexes
    private synchronized void addValidationEvent(ValidationEvent event) {
        allEvents.add(event);
        severityIndex.get(event.getSeverity()).add(event);
        sourceIndex.get(event.getSource()).add(event);
    }

    /**
     * grabs all events matching a severity. 
     */
    public List<ValidationEvent> getBySeverity(ValidationSeverity severity) {
        return Collections.unmodifiableList(getInstance().severityIndex.get(severity));
    }

    /**
     * grabs all events matching a specific framework source origin.
     */
    public List<ValidationEvent> getBySource(ValidationSource source) {
        return Collections.unmodifiableList(getInstance().sourceIndex.get(source));
    }

    /**
     * Filters by Source, Severity, and a keyword search 
     */
    public static List<ValidationEvent> findEvents(ValidationSource source, ValidationSeverity severity, String methodKeyword) {
        ValidationBindingService s = getInstance();
        // Performance optimization: Start with the smallest pre-indexed sub-bucket 
        List<ValidationEvent> basePool;
        
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

    public static List<ValidationEvent> getAllEvents() {
        return Collections.unmodifiableList(getInstance().allEvents);
    }

    public static synchronized void clearEvents() {
        ValidationBindingService s = getInstance();
        s.allEvents.clear();
        s.severityIndex.values().forEach(List::clear);
        s.sourceIndex.values().forEach(List::clear);
    }

    public static void printSummary() {
        ValidationBindingService s = getInstance();

        if (s.allEvents.isEmpty()) {
            ConsoleLogger.log(LogLevel.INFO, "Validation : 0 issues detected.");
            return;
        }

        ConsoleLogger.log(LogLevel.INFO, "Validation : " + s.allEvents.size() + " issue(s) detected.");

        // Grouping Hierarchy: Source -> Severity -> Message String -> Event List
        Map<ValidationSource, Map<ValidationSeverity, Map<String, List<ValidationEvent>>>> groupedEvents = 
            s.allEvents.stream().collect(Collectors.groupingBy(
                ValidationEvent::getSource,
                () -> new EnumMap<>(ValidationSource.class),
                Collectors.groupingBy(
                    ValidationEvent::getSeverity,
                    () -> new EnumMap<>(ValidationSeverity.class),
                    Collectors.groupingBy(event -> {
                        String msg = event.getMessage();
                        return (msg != null && !msg.trim().isEmpty()) ? msg : "Unknown or empty validation message";
                    })
                )
            ));
        
            groupedEvents.forEach((source, severityMap) -> {
                ConsoleLogger.log(LogLevel.INFO, "Source : [" + source + "]");
            
                severityMap.forEach((severity, messageMap) -> {
                    long totalSeverityCount = messageMap.values().stream().mapToLong(List::size).sum();
                    
                    ConsoleLogger.log(LogLevel.INFO, "  └──  Severity: [" + severity + "] (" + totalSeverityCount + " total instances)");
                    
                    messageMap.forEach((message, instances) -> {
                        int occurrenceCount = instances.size();
                        ValidationEvent sample = instances.get(0);
                        
                        ConsoleLogger.log(LogLevel.INFO, String.format(
                            "      ├── [x%d] %s -> %s", 
                            occurrenceCount, 
                            sample.getMethod(), 
                            message
                        ));
                        
                        // Show a sample reference location spot so developers know where to look
                        ConsoleLogger.log(LogLevel.INFO, "      │   └──  Sample Location Trace: " + sample.getLocation());
                    });
                });
        });
    }
}
