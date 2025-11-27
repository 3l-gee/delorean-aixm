package com.aixm.delorean.core;

import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.core.database.DatabaseBindingFactory;
import com.aixm.delorean.core.xml.XMLBindingFactory;
import javax.xml.namespace.QName;

public class Delorean<T, X> {

    private Delorean() {
        // Prevent instantiation without configuration
    }
    
    public static <T, X> ContainerWarehouse<T, X> initContainerWarehouse(DeloreanConfig config) {
        Class<T> root = (Class<T>) config.getRoot();
        Class<X> feature = (Class<X>) config.getFeature();
        QName qName = config.getQName();
        XMLBindingFactory<T, X> xmlFactory = new XMLBindingFactory<>(root, feature, config.getSchemaPath(), config.getRootObjectFactory(), config.getFeatureObjectFactory());
        DatabaseBindingFactory<T, X> databaseFactory = new DatabaseBindingFactory<>(root, feature, config.getSqlPreInitPath(), config.getSqlPostInitPath(), config.getConfigurationPath());
        return new ContainerWarehouse<>(config.getName(), root, feature, qName, xmlFactory, databaseFactory);
    }

}
