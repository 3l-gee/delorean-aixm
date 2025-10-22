package com.aixm.delorean.core.time.helper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import com.aixm.delorean.core.schema.a5_2.aixm.DMETimeSliceType;

public class TemporalityHelper {

    private TemporalityHelper() {
        // Private constructor to prevent instantiation of utility class
    }

    @Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    public interface DMEMapper {

        DMEMapper INSTANCE = Mappers.getMapper(DMEMapper.class);
        
        @Mappings({
            @Mapping(target = "interpretation", ignore = true),
            @Mapping(target = "sequenceNumber", ignore = true),
            @Mapping(target = "correctionNumber", ignore = true),
            @Mapping(target = "timeSliceMetadata", ignore = true),
            @Mapping(target = "featureLifetime", ignore = true),
            @Mapping(target = "hjid", ignore = true),
            @Mapping(target = "hjversion", ignore = true)
        })
        void merge(@MappingTarget DMETimeSliceType target, DMETimeSliceType source);
    }

    /**
     * Removes all fields in 'update' that are identical to 'baseline'.
     */
    public static <T> T delta(T original, T modified, Class<T> type) {
        if (original == null || modified == null) {
            System.err.println("Cannot extract delta: one or both objects are null.");
            return null;
        }

        try {
            // 1. Instantiate the Delta object
            T delta = type.getDeclaredConstructor().newInstance();
            boolean hasChanged = false;

            // 2. Iterate over all public methods to find getters
            // We iterate over all public methods of the class and its superclasses
            for (Method getter : type.getMethods()) {
                
                // 2a. Exclude methods declared in Object.class (e.g., wait, notify, toString)
                if (getter.getDeclaringClass().equals(Object.class)) {
                    continue;
                }
                
                String methodName = getter.getName();

                // 2b. Check for standard JavaBean getter names: get* and is*
                boolean isGetter = (methodName.startsWith("get") && methodName.length() > 3) 
                                || (methodName.startsWith("is") && methodName.length() > 2);
                
                if (isGetter) {
                    
                    // Determine property name (e.g., "getProp" -> "Prop")
                    String propName = methodName.startsWith("get") 
                                    ? methodName.substring(3) 
                                    : methodName.substring(2);

                    // CRITICAL FILTERING: Exclude properties related to JAXB/JPA metadata 
                    // (like 'hjid', 'hjversion', 'nil') that often cause reflection issues.
                    if (propName.equals("Hjid") || propName.equals("Hjversion") || propName.equals("Nil") || propName.equals("Content")) {
                        continue;
                    }
                    
                    String setterName = "set" + propName;
                    
                    try {
                        // 3. Invoke the getter on both objects
                        Object originalValue = getter.invoke(original);
                        Object modifiedValue = getter.invoke(modified);

                        // 4. Compare the values
                        if (!Objects.equals(originalValue, modifiedValue)) {
                            // Value has changed! Find the setter method.
                            // The setter must take the same argument type as the getter's return type.
                            Method setter = type.getMethod(setterName, getter.getReturnType());

                            // 5. Invoke the setter on the delta object
                            setter.invoke(delta, modifiedValue);
                            hasChanged = true;
                            
                            // Optional logging for debugging:
                            // System.out.println("Delta found for property: " + propName);
                        }
                    } catch (NoSuchMethodException e) {
                        // Suppress: This happens if a getter (read method) has no corresponding setter (write method).
                        // This property is read-only, so we ignore it for delta *setting*.
                    }
                }
            }

            if (hasChanged) {
                return delta;
            } else {
                return null; // No differences found
            }

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            // Handle critical reflection errors (e.g., missing default constructor, security issues)
            System.err.println("CRITICAL Delta Extraction Error for type " + type.getSimpleName() + ": " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}