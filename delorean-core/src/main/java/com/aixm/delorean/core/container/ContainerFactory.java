package com.aixm.delorean.core.container;

import javax.xml.namespace.QName;

public final class ContainerFactory<T, X> {
    private ContainerFactory() {
        // Private constructor to prevent instantiation
    }

    public static <T, X> Container<T, X> createContainer(Class<T> root, Class<X> feature, QName qName) {
        return new Container<T, X>(root, feature, qName);

    }
       
}
