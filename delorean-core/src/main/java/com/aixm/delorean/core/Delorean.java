package com.aixm.delorean.core;

import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.core.database.DatabaseBindingFactory;
import com.aixm.delorean.core.engine.DeloreanEngine;
import com.aixm.delorean.core.xml.XMLBindingFactory;
import javax.xml.namespace.QName;

public class Delorean<R, F, T, O> {

    private Delorean() {
        // Prevent instantiation without configuration
    }
    
    @SuppressWarnings("unchecked")
    public static <R, F, T, O> ContainerWarehouse<R, F, T, O> initContainerWarehouse(DeloreanConfig config) {
        Class<R> rootClass = (Class<R>) config.getRootClass();
        Class<F> featureClass = (Class<F>) config.getFeatureClass();
        Class<T> timeSliceClass = (Class<T>) config.getTimeSliceClass();
        Class<O> objectClass = (Class<O>) config.getObjectClass();

        QName qName = config.getQName();
        XMLBindingFactory<R, F> xmlFactory = new XMLBindingFactory<>(rootClass, featureClass, config.getSchemaPath());
        DatabaseBindingFactory<R, F> databaseFactory = new DatabaseBindingFactory<>(rootClass, featureClass, config.getSqlPreInitPath(), config.getSqlPostInitPath(), config.getConfigurationPath());
        Class<DeloreanEngine> engineClass = (Class<DeloreanEngine>) config.getDeloreanEngineClass();
        DeloreanEngine deloreanEngine;
        try {
            deloreanEngine = engineClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate DeloreanEngine: " + engineClass + e.getMessage(), e);
        }
        
        return new ContainerWarehouse<R, F, T, O>(config.getName(), rootClass, featureClass, timeSliceClass, objectClass, qName, xmlFactory, databaseFactory, deloreanEngine);
    }

}
