package com.aixm.delorean.core;

import javax.xml.namespace.QName;

public class DeloreanConfig {

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


    public DeloreanConfig(
        // General settings
        String name,
        Class<?> root,
        Class<?> feature,
        Class<?> timeSlice,
        Class<?> object,

        // Engine settings
        Class<?> deloreanEngineClass,

        // XML settings
        QName qName,
        String schemaPath,

        // Database settings
        String sqlPreInitPath,
        String sqlPostInitPath,
        String configurationPath
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
        this.deloreanEngineClass = deloreanEngineClass;
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

}
