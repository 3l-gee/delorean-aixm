package com.aixm.delorean.core;

import javax.xml.namespace.QName;

public class DeloreanConfig {

    protected final String name;
    protected final Class<?> root;
    protected final Class<?> feature;
    protected final QName qName;
    protected final String schemaPath;
    protected final String sqlPreInitPath;
    protected final String sqlPostInitPath;
    protected final String configurationPath;

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
        String configurationPath
    ) {
        this.name = name;
        this.root = root;
        this.feature = feature;
        this.qName = qName;
        this.schemaPath = schemaPath;
        this.sqlPreInitPath = sqlPreInitPath;
        this.sqlPostInitPath = sqlPostInitPath;
        this.configurationPath = configurationPath;
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

}
