package com.aixm.delorean.aixm511;

import javax.xml.namespace.QName;

import com.aixm.delorean.aixm511.container.ContainerWarehouse;
import com.aixm.delorean.aixm511.database.DatabaseBindingFactory;
import com.aixm.delorean.aixm511.xml.XMLBindingFactory;

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
