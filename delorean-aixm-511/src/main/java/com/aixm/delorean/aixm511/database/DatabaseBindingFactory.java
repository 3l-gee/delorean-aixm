package com.aixm.delorean.core.database;

import org.hibernate.cfg.Configuration;


public class DatabaseBindingFactory<T, X> {
    protected final Class<T> root;
    protected final Class<X> feature;
    protected String sqlPreInitPath;
    protected String sqlPostInitPath;
    protected Configuration configuration;

    public DatabaseBindingFactory(Class<T> root, Class<X> feature, String sqlPreInitPath, String sqlPostInitPath, String configurationPath) {
        this.root = root;
        this.feature = feature;
        this.sqlPreInitPath = sqlPreInitPath;
        this.sqlPostInitPath = sqlPostInitPath;
        this.configuration = new Configuration().configure(configurationPath);
    }

    public DatabaseBinding<T, X> createDatabaseBinding() {
        return new DatabaseBinding<>(
            this.root, 
            this.feature, 
            this.sqlPreInitPath, 
            this.sqlPostInitPath, 
            this.configuration, 
            ConnectionStatus.DISCONNECTED);
    }
}
