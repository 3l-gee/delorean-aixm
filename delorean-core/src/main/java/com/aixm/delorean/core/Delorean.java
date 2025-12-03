package com.aixm.delorean.core;

import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.core.database.DatabaseBindingFactory;
import com.aixm.delorean.core.xml.XMLBindingFactory;
import javax.xml.namespace.QName;

public class Delorean<R, F, T, O> {

    private Delorean() {
        // Prevent instantiation without configuration
    }
    
    @SuppressWarnings("unchecked")
    public static <R, F, T, O> ContainerWarehouse<R, F, T, O> initContainerWarehouse(DeloreanConfig config) {
        Class<R> root = (Class<R>) config.getRoot();
        Class<F> feature = (Class<F>) config.getFeature();
        Class<T> timeSlice = (Class<T>) config.getTimeSlice();
        Class<O> object = (Class<O>) config.getObject();

        QName qName = config.getQName();
        XMLBindingFactory<R, F> xmlFactory = new XMLBindingFactory<>(root, feature, config.getSchemaPath());
        DatabaseBindingFactory<R, F> databaseFactory = new DatabaseBindingFactory<>(root, feature, config.getSqlPreInitPath(), config.getSqlPostInitPath(), config.getConfigurationPath());
        return new ContainerWarehouse<>(config.getName(), root, feature, timeSlice, object, qName, xmlFactory, databaseFactory);
    }

}
