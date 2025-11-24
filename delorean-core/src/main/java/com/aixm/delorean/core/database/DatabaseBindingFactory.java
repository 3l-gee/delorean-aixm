package com.aixm.delorean.core.database;

public class DatabaseBindingFactory {
    private DatabaseBindingFactory() {
        // Private constructor to prevent instantiation
    }

    public static <T, X> DatabaseBinding<T, X> createDatabaseBinding(Class<T> root, Class<X> feature) {
        return new DatabaseBinding<>(root, feature);
    }
    
}
