package com.aixm.delorean.core.database;

import javax.xml.validation.Schema;

import org.hibernate.cfg.Configuration;


public class DatabaseBindingFactory<ROOT, FEATURE> {
    protected final Class<ROOT> rootClass;
    protected final Class<FEATURE> featureClass;
    protected final Class<?> CoreResourceAnchorsClass;
    protected final Class<?> AIXMResourceAnchorsClass;
    protected String sqlPreInitPath;
    protected String sqlPostInitPath;
    protected Configuration configuration;
    protected AbstractDatabaseFunctions databaseHelper;

    public DatabaseBindingFactory(Class<ROOT> rootClass, Class<FEATURE> featureClass, String sqlPreInitPath, String sqlPostInitPath, String configurationPath, Class<?> CoreResourceAnchorsClass, Class<?> AIXMResourceAnchorsClass, AbstractDatabaseFunctions databaseHelper) {
        this.rootClass = rootClass;
        this.featureClass = featureClass;
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

    public AbstractDatabaseFunctions getDatabaseHelper() {
        return this.databaseHelper;
    }

    public DatabaseBindingService<ROOT, FEATURE> createDatabaseBinding() {
        return new DatabaseBindingService<>(
            this.getRootClass(), 
            this.getFeatureClass(), 
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
