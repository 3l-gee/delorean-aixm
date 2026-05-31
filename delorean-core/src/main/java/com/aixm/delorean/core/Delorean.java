package com.aixm.delorean.core;

import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.core.database.DatabaseBindingFactory;
import com.aixm.delorean.core.engine.AbstractEngine;
import com.aixm.delorean.core.xml.XMLBindingFactory;
import com.aixm.delorean.core.database.AbstractDatabaseFunctions;
import javax.xml.namespace.QName;

public class Delorean<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, CONFIG> {

    private Delorean() {
        // Prevent instantiation without configuration
    }
    
    @SuppressWarnings("unchecked")
    public static <ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> ContainerWarehouse<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> initContainerWarehouse(CoreConfig config) {
        Class<ROOT> rootClass = (Class<ROOT>) config.getRootClass();
        Class<FEATURE> featureClass = (Class<FEATURE>) config.getFeatureClass();
        Class<TIMESLICE> timeSliceClass = (Class<TIMESLICE>) config.getTimeSliceClass();
        Class<OBJECT> objectClass = (Class<OBJECT>) config.getObjectClass();
        Class<SEARCH_CONFIG> configClass = (Class<SEARCH_CONFIG>) config.getSearchConfigClass();

        Class<? extends AbstractEngine<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG>> engineClass = (Class<? extends AbstractEngine<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG>>) config.getDeloreanEngineClass();
        AbstractEngine<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> deloreanEngine;
        try {
            deloreanEngine = engineClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate DeloreanEngine: " + engineClass + e.getMessage(), e);
        }

        Class<? extends AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT>> databaseHelperClass = (Class<? extends AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT>>) config.getDatabaseHelperClass();
        AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> databaseHelper;
        try {
            databaseHelper = databaseHelperClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate DatabaseHelper: " + databaseHelperClass + e.getMessage(), e);
        }

        QName qName = config.getQName();
        XMLBindingFactory<ROOT, FEATURE> xmlFactory = new XMLBindingFactory<>(
            rootClass,
            featureClass, 
            config.getSchemaPath(), 
            config.getCoreResourceAnchorsClass(), 
            config.getAIXMResourceAnchorsClass());
            
        DatabaseBindingFactory<ROOT, FEATURE, TIMESLICE, OBJECT> databaseFactory = new DatabaseBindingFactory<>(
            rootClass, 
            featureClass, 
            timeSliceClass,
            objectClass,
            config.getSqlPreInitPath(), 
            config.getSqlPostInitPath(), 
            config.getConfigurationPath(),  
            config.getCoreResourceAnchorsClass(), 
            config.getAIXMResourceAnchorsClass(), 
            databaseHelper);

        return new ContainerWarehouse<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG>(config.getName(), rootClass, featureClass, timeSliceClass, objectClass, qName, xmlFactory, databaseFactory, deloreanEngine, databaseHelper, config.getCoreResourceAnchorsClass(), config.getAIXMResourceAnchorsClass());
    }

}
