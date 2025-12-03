package com.aixm.delorean.core.container;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.xml.namespace.QName;

import com.aixm.delorean.core.database.DatabaseBindingFactory;
import com.aixm.delorean.core.xml.XMLBindingFactory;

public class ContainerWarehouse<R, F, T, O> {
    protected String name;
    protected final Class<R> root;
    protected final Class<F> feature;
    protected final Class<T> timeSlice;
    protected final Class<O> object;
    protected final QName qName;
    protected final XMLBindingFactory<R, F> xmlFactory;
    protected final DatabaseBindingFactory<R, F> databaseFactory;
    protected Map<String, Container<R, F>> containers;
    protected String lastUsedContainerId; 

    public ContainerWarehouse(String name, Class<R> root, Class<F> feature, Class<T> timeSlice, Class<O> object, QName qName, XMLBindingFactory<R, F> xmlFactory, DatabaseBindingFactory<R, F> databaseFactory) {
        this.name = name;
        this.root = root;
        this.feature = feature;
        this.timeSlice = timeSlice;
        this.object = object;
        this.qName = qName;
        this.lastUsedContainerId = null; 
        this.xmlFactory = xmlFactory;
        this.databaseFactory = databaseFactory;
        this.containers = new HashMap<>();
        this.createNewContainer();
    }

    public void createNewContainer() {
        Container<R, F> container = new Container<R, F>(this.root, this.feature, this.qName);
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

    public Container<R, F> getContainerById(String id) {
        if (!this.containers.containsKey(id)) {
            return null;
        }
        this.lastUsedContainerId = id; 
        return this.containers.get(id);
    }

    public Container<R, F> getContainerByName(String name) {
        for (Map.Entry<String, Container<R, F>> entry : this.containers.entrySet()) {
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

    public Container<R, F> getLastUsedContainer() {
        return this.containers.get(this.lastUsedContainerId);
    }
}
