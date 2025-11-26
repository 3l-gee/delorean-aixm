package com.aixm.delorean.core.container;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.xml.namespace.QName;

import com.aixm.delorean.core.database.DatabaseBindingFactory;
import com.aixm.delorean.core.xml.XMLBindingFactory;

public class ContainerWarehouse<T, X> {
    protected String name;
    protected final Class<T> root;
    protected final Class<X> feature;
    protected final QName qName;
    protected final XMLBindingFactory<T, X> xmlFactory;
    protected final DatabaseBindingFactory<T, X> databaseFactory;
    protected Map<String, Container<T, X>> containers;
    protected String lastUsedContainerId; 

    public ContainerWarehouse(String name, Class<T> root, Class<X> feature, QName qName, XMLBindingFactory<T, X> xmlFactory, DatabaseBindingFactory<T, X> databaseFactory) {
        this.name = name;
        this.root = root;
        this.feature = feature;
        this.qName = qName;
        this.lastUsedContainerId = null; 
        this.xmlFactory = xmlFactory;
        this.databaseFactory = databaseFactory;
        this.containers = new HashMap<>();
        this.createNewContainer();
    }

    public void createNewContainer() {
        Container<T, X> container = new Container<T, X>(this.root, this.feature, this.qName);
        container.setXmlBinding(this.xmlFactory.createXMLBinding());
        container.setDatabaseBinding(this.databaseFactory.createDatabaseBinding());

        String id = UUID.randomUUID().toString().substring(0, 6);
        this.containers.put(id, container);
        this.lastUsedContainerId = id;
    }

    public void removeContainer(String id) {
        this.containers.remove(id);
        this.lastUsedContainerId = id; 
    }

    public Container<T, X> getContainerById(String id) {
        if (!this.containers.containsKey(id)) {
            return null;
        }
        this.lastUsedContainerId = id; 
        return this.containers.get(id);
    }

    public Container<T, X> getContainerByName(String name) {
        for (Map.Entry<String, Container<T, X>> entry : this.containers.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                this.lastUsedContainerId = entry.getKey();
                return entry.getValue();
            }
        }
        return null;
    }

    public Set<String> getIds() {
        return this.containers.keySet();
    }

    public String getLastUsedContainerId() {
        return this.lastUsedContainerId;
    }

    public Container<T, X> getLastUsedContainer() {
        return this.containers.get(this.lastUsedContainerId);
    }
}
