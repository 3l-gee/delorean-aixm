package com.delorean.aixm.core.database;

import org.hibernate.cfg.Configuration;

public class DatabaseBindingFactory<ROOT, FEATURE, TIMESLICE, OBJECT> {
    protected final Class<ROOT> rootClass;
    protected final Class<FEATURE> featureClass;
    protected final Class<TIMESLICE> timeSliceClass;
    protected final Class<OBJECT> objectClass;
    protected final Class<?> CoreResourceAnchorsClass;
    protected final Class<?> AIXMResourceAnchorsClass;
    protected String sqlPreInitPath;
    protected String sqlPostInitPath;
    protected Configuration configuration;
    protected AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> databaseHelper;

    public DatabaseBindingFactory(
        Class<ROOT> rootClass,
        Class<FEATURE> featureClass, 
        Class<TIMESLICE> timeSliceClass, 
        Class<OBJECT> objectClass, 
        String sqlPreInitPath, 
        String sqlPostInitPath, 
        String configurationPath, 
        Class<?> CoreResourceAnchorsClass, 
        Class<?> AIXMResourceAnchorsClass, 
        AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> databaseHelper) {
        this.rootClass = rootClass;
        this.featureClass = featureClass;
        this.timeSliceClass = timeSliceClass;
        this.objectClass = objectClass;
        this.sqlPreInitPath = sqlPreInitPath;
        this.sqlPostInitPath = sqlPostInitPath;
        this.CoreResourceAnchorsClass = CoreResourceAnchorsClass;
        this.AIXMResourceAnchorsClass = AIXMResourceAnchorsClass;
        this.configuration = new Configuration().configure(configurationPath);
        this.databaseHelper = databaseHelper;
    }

    public Class<ROOT> getRootClass() {
        return this.rootClass;
    }

    public Class<FEATURE> getFeatureClass() {
        return this.featureClass;
    }

    public Class<TIMESLICE> getTimeSliceClass() {
        return this.timeSliceClass;
    }

    public Class<OBJECT> getObjectClasss() {
        return this.objectClass;
    }

    public Class<?> getCoreResourceAnchorsClass() {
        return this.CoreResourceAnchorsClass;
    }

    public Class<?> getAIXMResourceAnchorsClass() {
        return this.AIXMResourceAnchorsClass;
    }

    public String getSqlPreInitPath() {
        return this.sqlPreInitPath;
    }

    public String getSqlPostInitPath() {
        return this.sqlPostInitPath;
    }

    public Configuration getConfiguration() {
        return this.configuration;
    }

    public AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> getDatabaseHelper() {
        return this.databaseHelper;
    }

    public DatabaseBindingService<ROOT, FEATURE, TIMESLICE, OBJECT> createDatabaseBinding() {
        return new DatabaseBindingService<>(
            this.getRootClass(), 
            this.getFeatureClass(), 
            this.getTimeSliceClass(),
            this.getObjectClasss(),
            this.getSqlPreInitPath(), 
            this.getSqlPostInitPath(), 
            this.getConfiguration(), 
            ConnectionStatus.DISCONNECTED,
            this.getDatabaseHelper(),
            this.getCoreResourceAnchorsClass(),
            this.getAIXMResourceAnchorsClass()
        );
    }
}
