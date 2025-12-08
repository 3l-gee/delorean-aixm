package com.aixm.delorean.core;

import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.core.database.DatabaseBindingFactory;
import com.aixm.delorean.core.engine.AbstractEngine;
import com.aixm.delorean.core.xml.XMLBindingFactory;
import com.aixm.delorean.core.database.AbstractDatabaseFunctions;
import javax.xml.namespace.QName;

public class Delorean<R, F, T, O> {

    private Delorean() {
        // Prevent instantiation without configuration
    }
    
    @SuppressWarnings("unchecked")
    public static <ROOT, FEATURE, TIMESLICE, OBJECT> ContainerWarehouse<ROOT, FEATURE, TIMESLICE, OBJECT> initContainerWarehouse(CoreConfig config) {
        Class<ROOT> rootClass = (Class<ROOT>) config.getRootClass();
        Class<FEATURE> featureClass = (Class<FEATURE>) config.getFeatureClass();
        Class<TIMESLICE> timeSliceClass = (Class<TIMESLICE>) config.getTimeSliceClass();
        Class<OBJECT> objectClass = (Class<OBJECT>) config.getObjectClass();

        Class<AbstractEngine> engineClass = (Class<AbstractEngine>) config.getDeloreanEngineClass();
        AbstractEngine deloreanEngine;
        try {
            deloreanEngine = engineClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate DeloreanEngine: " + engineClass + e.getMessage(), e);
        }

        Class<AbstractDatabaseFunctions> databaseHelperClass = (Class<AbstractDatabaseFunctions>) config.getDatabaseHelperClass();
        AbstractDatabaseFunctions databaseHelper;
        try {
            databaseHelper = databaseHelperClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate DatabaseHelper: " + databaseHelperClass + e.getMessage(), e);
        }

        QName qName = config.getQName();
        XMLBindingFactory<ROOT, FEATURE> xmlFactory = new XMLBindingFactory<>(rootClass, featureClass, config.getSchemaPath(), config.getCoreResourceAnchorsClass(), config.getAIXMResourceAnchorsClass());
        DatabaseBindingFactory<ROOT, FEATURE> databaseFactory = new DatabaseBindingFactory<>(rootClass, featureClass, config.getSqlPreInitPath(), config.getSqlPostInitPath(), config.getConfigurationPath(),  config.getCoreResourceAnchorsClass(), config.getAIXMResourceAnchorsClass(), databaseHelper);

        return new ContainerWarehouse<ROOT, FEATURE, TIMESLICE, OBJECT>(config.getName(), rootClass, featureClass, timeSliceClass, objectClass, qName, xmlFactory, databaseFactory, deloreanEngine, databaseHelper, config.getCoreResourceAnchorsClass(), config.getAIXMResourceAnchorsClass());
    }

}
