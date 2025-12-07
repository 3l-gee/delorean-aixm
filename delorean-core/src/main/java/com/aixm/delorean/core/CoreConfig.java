package com.aixm.delorean.core;

import javax.xml.namespace.QName;

public class CoreConfig {

    protected final String name;
    protected final Class<?> rootClass;
    protected final Class<?> featureClass;
    protected final Class<?> timeSliceClass;
    protected final Class<?> objectClass;
    protected final QName qName;
    protected final String schemaPath;
    protected final String sqlPreInitPath;
    protected final String sqlPostInitPath;
    protected final String configurationPath;
    protected final Class<?> deloreanEngineClass;
    protected final Class<?> databaseHelperClass;
    protected final Class<?> CoreResourceAnchorsClass;
    protected final Class<?> AIXMResourceAnchorsClass;


    public CoreConfig(
        // General settings
        String name,
        Class<?> root,
        Class<?> feature,
        Class<?> timeSlice,
        Class<?> object,

        // Engine settings
        Class<?> engineClass,
        Class<?> databaseHelperClass,

        // XML settings
        QName qName,
        String schemaPath,

        // Database settings
        String sqlPreInitPath,
        String sqlPostInitPath,
        String configurationPath,

        // Resource settings
        Class<?> CoreResourceAnchorsClass,
        Class<?> AIXMResourceAnchorsClass
    ) {
        this.name = name;
        this.rootClass = root;
        this.timeSliceClass = timeSlice;
        this.objectClass = object;
        this.featureClass = feature;
        this.qName = qName;
        this.schemaPath = schemaPath;
        this.sqlPreInitPath = sqlPreInitPath;
        this.sqlPostInitPath = sqlPostInitPath;
        this.configurationPath = configurationPath;
        this.deloreanEngineClass = engineClass;
        this.databaseHelperClass = databaseHelperClass;
        this.CoreResourceAnchorsClass = CoreResourceAnchorsClass;
        this.AIXMResourceAnchorsClass = AIXMResourceAnchorsClass;
    }

    public String getName() {
        return this.name;
    }

    public Class<?> getRootClass() {
        return this.rootClass;
    }

    public Class<?> getFeatureClass() {
        return this.featureClass;
    }

    public Class<?> getTimeSliceClass() {
        return this.timeSliceClass;
    }

    public Class<?> getObjectClass() {
        return this.objectClass;
    }

    public QName getQName() {
        return this.qName;
    }

    public String getSchemaPath() {
        return this.schemaPath;
    }

    public String getSqlPreInitPath() {
        return this.sqlPreInitPath;
    }

    public String getSqlPostInitPath() {
        return this.sqlPostInitPath;
    }

    public String getConfigurationPath() {
        return this.configurationPath;
    }

    public Class<?> getDeloreanEngineClass() {
        return this.deloreanEngineClass;
    }
    
    public Class<?> getDatabaseHelperClass() {
        return this.databaseHelperClass;
    }

    public Class<?> getCoreResourceAnchorsClass() {
        return this.CoreResourceAnchorsClass;
    }

    public Class<?> getAIXMResourceAnchorsClass() {
        return this.AIXMResourceAnchorsClass;
    }
}
