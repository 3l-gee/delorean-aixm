package com.aixm.delorean.core.database;

import org.hibernate.cfg.Configuration;


public class DatabaseBindingFactory<T, X> {
    protected final Class<T> rootClass;
    protected final Class<X> featureClass;
    protected String sqlPreInitPath;
    protected String sqlPostInitPath;
    protected Configuration configuration;
    protected final Class<?> CoreResourceAnchorsClass;
    protected final Class<?> AIXMResourceAnchorsClass;

    public DatabaseBindingFactory(Class<T> rootClass, Class<X> featureClass, String sqlPreInitPath, String sqlPostInitPath, String configurationPath, Class<?> CoreResourceAnchorsClass, Class<?> AIXMResourceAnchorsClass) {
        this.rootClass = rootClass;
        this.featureClass = featureClass;
        this.sqlPreInitPath = sqlPreInitPath;
        this.sqlPostInitPath = sqlPostInitPath;
        this.CoreResourceAnchorsClass = CoreResourceAnchorsClass;
        this.AIXMResourceAnchorsClass = AIXMResourceAnchorsClass;
        this.configuration = new Configuration().configure(configurationPath);
    }

    public DatabaseBindingService<T, X> createDatabaseBinding() {
        return new DatabaseBindingService<>(
            this.rootClass, 
            this.featureClass, 
            this.sqlPreInitPath, 
            this.sqlPostInitPath, 
            this.configuration, 
            ConnectionStatus.DISCONNECTED);
    }
}
