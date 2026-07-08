package com.delorean.aixm.core.inspection;

import org.xml.sax.SAXParseException;

import com.delorean.aixm.core.inspection.InspectionSource;

import javax.xml.bind.ValidationEventLocator;

public class InspectionEvent {
    InspectionSource source;
    ValidationSeverity severity;
    String method;
    String message;
    String location;

    // Default constructor
    public InspectionEvent(InspectionSource source, ValidationSeverity severity, String method, String message) {
        this.source = source;
        this.severity = severity;
        this.method = method;
        this.message = message;
        this.location = "";
    }

    // Default constructor
    public InspectionEvent(InspectionSource source, ValidationSeverity severity, String method, String message, String location) {
        this.source = source;
        this.severity = severity;
        this.method = method;
        this.message = message;
        this.location = location;
    }

    // Constructor to convert SAX Exceptions
    public InspectionEvent(InspectionSource source, ValidationSeverity severity, String method, SAXParseException e) {
        this.source = source;
        this.severity = severity;
        this.method = method;
        this.message = e.getMessage();
        
        StringBuilder locBuilder = new StringBuilder();
        if (e.getLineNumber() != -1) locBuilder.append("Line: ").append(e.getLineNumber()).append(" ");
        if (e.getColumnNumber() != -1) locBuilder.append("Column: ").append(e.getColumnNumber());
        this.location = locBuilder.toString().trim().isEmpty() ? "Unknown" : locBuilder.toString();
    }

    // Constructor to convert JAXB Exceptions
    public InspectionEvent(InspectionSource source, ValidationSeverity severity, String method, jakarta.xml.bind.ValidationEvent error) {
        this.source = source;
        this.severity = severity;
        this.method = method;
        this.message = error.getMessage();

        StringBuilder locBuilder = new StringBuilder();
        if (error.getLocator().getLineNumber() != -1) locBuilder.append("Line: ").append(error.getLocator().getLineNumber()).append(" ");
        if (error.getLocator().getColumnNumber() != -1) locBuilder.append("Column: ").append(error.getLocator().getColumnNumber());
        this.location = locBuilder.toString().trim().isEmpty() ? "Unknown" : locBuilder.toString();
    }

    // Getters
    public InspectionSource getSource() {
        return source; 
    }

    public ValidationSeverity getSeverity() {
        return severity; 
    }

    public String getMethod() {
        return method; 
    }

    public String getMessage() {
        return message; 
    }

    public String getLocation() {
        return location; 
    }
}


