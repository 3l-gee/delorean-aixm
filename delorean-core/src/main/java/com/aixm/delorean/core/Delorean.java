package com.aixm.delorean.core;

import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.core.database.DatabaseBindingFactory;
import com.aixm.delorean.core.container.ContainerFactory;
import com.aixm.delorean.core.xml.XMLBindingFactory;
import javax.xml.namespace.QName;

public class Delorean<T, X> {

    private static Delorean<?, ?> instance;
    
    private final Class<T> root;
    private final Class<X> feature;
    private final QName qName;
    private final ContainerWarehouse<T, X> warehouse;
    private final XMLBindingFactory<T, X> xmlFactory;
    private final ContainerFactory<T, X> containerFactory;
    private final DatabaseBindingFactory<T, X> databaseFactory;

    private Delorean(DeloreanConfig config) {
        this.root = (Class<T>) config.getRoot();
        this.feature = (Class<X>) config.getFeature();
        this.containerFactory = new ContainerFactory<>();

    }

    @SuppressWarnings("unchecked")
    public static synchronized <T, X> Delorean<T, X> getInstance(Class<T> root, Class<X> feature) {
        if (instance == null) {
            instance = new Delorean<>(root, feature);
        }
        return (Delorean<T, X>) instance;
    }
}
