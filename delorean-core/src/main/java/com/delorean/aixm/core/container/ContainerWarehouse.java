package com.delorean.aixm.core.container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.xml.namespace.QName;

import com.delorean.aixm.core.database.DatabaseBindingFactory;
import com.delorean.aixm.core.xml.XMLBindingFactory;
import com.delorean.aixm.core.engine.AbstractEngine;
import com.delorean.aixm.core.filter.AbstractFilterConfig;
import com.delorean.aixm.core.log.ConsoleLogger;
import com.delorean.aixm.core.log.LogLevel;
import com.delorean.aixm.core.database.AbstractDatabaseFunctions;

public class ContainerWarehouse<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> {
    protected String name;
    protected final Class<ROOT> rootClass;
    protected final Class<FEATURE> featureClass;
    protected final Class<TIMESLICE> timeSliceClass;
    protected final Class<OBJECT> objectClass;
    protected final QName qName;
    protected final XMLBindingFactory<ROOT, FEATURE> xmlFactory;
    protected final DatabaseBindingFactory<ROOT, FEATURE, TIMESLICE, OBJECT> databaseFactory;
    protected final AbstractEngine<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> deloreanEngine;
    protected final AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> databaseHelper;
    protected Map<String, Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG>> containers;
    protected Map<String, String> nameToIdMap = new HashMap<>();
    protected String lastUsedContainerId; 
    protected final Class<?> CoreResourceAnchorsClass;
    protected final Class<?> AIXMResourceAnchorsClass;


    public ContainerWarehouse(
        String name, 
        Class<ROOT> rootClass,
        Class<FEATURE> featureClass, 
        Class<TIMESLICE> timeSliceClass, 
        Class<OBJECT> objectClass, 
        QName qName, 
        XMLBindingFactory<ROOT, FEATURE> xmlFactory, 
        DatabaseBindingFactory<ROOT, FEATURE, TIMESLICE, OBJECT> databaseFactory, 
        AbstractEngine<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> deloreanEngine,
        AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> databaseHelper,
        Class<?> CoreResourceAnchorsClass,
        Class<?> AIXMResourceAnchorsClass
    ) {
        this.name = name;
        this.rootClass = rootClass;
        this.featureClass = featureClass;
        this.timeSliceClass = timeSliceClass;
        this.objectClass = objectClass;
        this.qName = qName;
        this.lastUsedContainerId = null; 
        this.xmlFactory = xmlFactory;
        this.databaseFactory = databaseFactory;
        this.databaseHelper = databaseHelper;
        this.containers = new HashMap<>();
        this.deloreanEngine = deloreanEngine;
        this.CoreResourceAnchorsClass = CoreResourceAnchorsClass;
        this.AIXMResourceAnchorsClass = AIXMResourceAnchorsClass;
    }

    public void createNewContainer() {
        String id = UUID.randomUUID().toString().substring(0, 6);
        Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> container = new Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG>(this.rootClass, this.featureClass, this.timeSliceClass, this.objectClass, this.qName, id);
        container.setXmlBinding(this.xmlFactory.createXMLBinding());
        container.setDatabaseBinding(this.databaseFactory.createDatabaseBinding());
        container.setDeloreanEngine(this.deloreanEngine);
        
        this.containers.put(id, container);
        this.lastUsedContainerId = id;
    }

    public void createNewContainer(String name) {
        String id = UUID.randomUUID().toString().substring(0, 6);
        Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> container = new Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG>(this.rootClass, this.featureClass, this.timeSliceClass, this.objectClass, this.qName, id);
        container.setXmlBinding(this.xmlFactory.createXMLBinding());
        container.setDatabaseBinding(this.databaseFactory.createDatabaseBinding());
        container.setDeloreanEngine(this.deloreanEngine);
        container.setName(name);
        this.nameToIdMap.put(name, id);
        this.containers.put(id, container);
        this.lastUsedContainerId = id;
    }

    public void removeContainerById(String id) {
        if (!this.containers.containsKey(id)) {
            throw new IllegalArgumentException("No container found with id: " + id);
        }
        
        this.containers.remove(id);
        this.lastUsedContainerId = null; 
        this.nameToIdMap.remove(this.nameToIdMap.get(id));
    }

    public void removeContainerByName(String name) {
        if (!this.nameToIdMap.containsKey(name)) {
            throw new IllegalArgumentException("No container found with name: " + name);
        }
        
        String id = this.nameToIdMap.get(name);
        if (id != null) {
            this.containers.remove(id);
            this.nameToIdMap.remove(name);
            this.lastUsedContainerId = null;
        }
    }

    public Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> getContainerById(String id) {
        if (!this.containers.containsKey(id)) {
            return null;
        }
        this.lastUsedContainerId = id; 
        return this.containers.get(id);
    }

    public Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> getContainerByName(String name) {
        if (!this.nameToIdMap.containsKey(name)) {
            return null;
        }
        String id = this.nameToIdMap.get(name);
        this.lastUsedContainerId = id; 
        return this.containers.get(id);
    }

    public Set<String> getIds() {
        return this.containers.keySet();
    }

    public Set<String> getNames() {
        return this.nameToIdMap.keySet();
    }

    public String getLastUsedContainerId() {
        if (this.lastUsedContainerId == null) {
            throw new IllegalStateException(
                "No container has been created or selected yet"
            );
        }
        return this.lastUsedContainerId;
    }

    public Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> getLastUsedContainer() {
        return this.containers.get(this.lastUsedContainerId);
    }

    public List<String> listContainerId() {
        List<String> output = new ArrayList<>();
        for (Map.Entry<String, Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG>> entry : this.containers.entrySet()) {
            output.add(entry.getKey());
        }

        return output;
    }

    /**
     * Prunes the message from the last used container, pipes the results into a
     * brand new container, and sets the new container as the active/last used one.
     */
    public void prune(String containerId, AbstractFilterConfig config) {
        Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> sourceContainer = this.getContainerById(containerId);
        if (sourceContainer == null) {
            throw new IllegalArgumentException("No container found with id: " + containerId);
        }

        ROOT filteredMessage = this.deloreanEngine.filter(sourceContainer.getMessage(), config);
        String stats = this.deloreanEngine.statistics(filteredMessage);
        this.createNewContainer();
        Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> newContainer = this.getLastUsedContainer();
        newContainer.setMessage(filteredMessage);
        ConsoleLogger.info("Prune from " + sourceContainer.getId() +  " to " + newContainer.getId() + " applied to <" + rootClass.getSimpleName() + "> stats: " + stats);

    }

    public void prune(String sourceContainerName, String outputContainerName, AbstractFilterConfig config) {
        Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> sourceContainer = this.getContainerByName(sourceContainerName);
        if (sourceContainer == null) {
            throw new IllegalArgumentException("No container found with name: " + sourceContainerName);
        }

        ROOT filteredMessage = this.deloreanEngine.filter(sourceContainer.getMessage(), config);
        String stats = this.deloreanEngine.statistics(filteredMessage);
        this.createNewContainer();
        Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> newContainer = this.getLastUsedContainer();
        newContainer.setMessage(filteredMessage);
        newContainer.setName(outputContainerName);
        ConsoleLogger.info("Prune from " + sourceContainer.getId() +  " to " + newContainer.getId() + " applied to <" + rootClass.getSimpleName() + "> stats: " + stats);

    }
}
