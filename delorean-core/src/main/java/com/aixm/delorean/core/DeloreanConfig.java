package com.aixm.delorean.core;

import javax.xml.namespace.QName;

public class DeloreanConfig {

    protected final String name;
    protected final Class<?> root;
    protected final Class<?> feature;
    private final QName qName;
    protected final String schemaPath;
    protected final String sqlPreInitPath;
    protected final String sqlPostInitPath;
    protected final Class<?>[] mappingClass;

    public DeloreanConfig(
        // General settings
        String name,
        Class<?> root,
        Class<?> feature,

        // XML settings
        QName qName,
        String schemaPath,
        // Boolean validateXML,

        // Database settings
        String sqlPreInitPath,
        String sqlPostInitPath,
        Class<?>[] mappingClass
    ) {
        this.name = name;
        this.root = root;
        this.feature = feature;
        this.qName = qName;
        this.schemaPath = schemaPath;
        this.sqlPreInitPath = sqlPreInitPath;
        this.sqlPostInitPath = sqlPostInitPath;
        this.mappingClass = mappingClass;
    }

    public String getName() {
        return this.name;
    }

    public Class<?> getRoot() {
        return this.root;
    }

    public Class<?> getFeature() {
        return this.feature;
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

    public Class<?>[] getMappingClass() {
        return this.mappingClass;
    }

}
