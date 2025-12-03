package com.aixm.delorean.core.database;

import org.hibernate.cfg.Configuration;


public class DatabaseBindingFactory<T, X> {
    protected final Class<T> rootClass;
    protected final Class<X> featureClass;
    protected String sqlPreInitPath;
    protected String sqlPostInitPath;
    protected Configuration configuration;

    public DatabaseBindingFactory(Class<T> rootClass, Class<X> featureClass, String sqlPreInitPath, String sqlPostInitPath, String configurationPath) {
        this.rootClass = rootClass;
        this.featureClass = featureClass;
        this.sqlPreInitPath = sqlPreInitPath;
        this.sqlPostInitPath = sqlPostInitPath;
        this.configuration = new Configuration().configure(configurationPath);
    }

    public DatabaseBinding<T, X> createDatabaseBinding() {
        return new DatabaseBinding<>(
            this.rootClass, 
            this.featureClass, 
            this.sqlPreInitPath, 
            this.sqlPostInitPath, 
            this.configuration, 
            ConnectionStatus.DISCONNECTED);
    }
}
