package com.aixm.delorean.core;

import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.core.database.DatabaseBindingFactory;
import com.aixm.delorean.core.xml.XMLBindingFactory;
import javax.xml.namespace.QName;

public class Delorean<T, X> {

    protected static Delorean<?, ?> instance;
    protected final Class<T> root;
    protected final Class<X> feature;
    protected final QName qName;
    protected final ContainerWarehouse<T, X> warehouse;
    protected final XMLBindingFactory<T, X> xmlFactory;
    protected final DatabaseBindingFactory<T, X> databaseFactory;

    public Delorean(DeloreanConfig config) {
        this.root = (Class<T>) config.getRoot();
        this.feature = (Class<X>) config.getFeature();
        this.qName = config.getQName();

        this.warehouse = new ContainerWarehouse<>(this.root, this.feature, this.qName);
        this.xmlFactory = new XMLBindingFactory<T, X>(this.root, this.feature, config.getSchemaPath());
        this.databaseFactory = new DatabaseBindingFactory<T, X>(this.root, this.feature, config.getSqlPreInitPath(), config.getSqlPostInitPath(), config.getConfigurationPath());
    }



    @SuppressWarnings("unchecked")
    public static synchronized <T, X> Delorean<T, X> getInstance(DeloreanConfig deloreanConfig) {
        if (instance == null) {
            instance = new Delorean<>(deloreanConfig);
        }
        return (Delorean<T, X>) instance;
    }
}
