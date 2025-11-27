package com.aixm.delorean.core.container;

import com.aixm.delorean.core.xml.XMLBinding;
import com.aixm.delorean.core.xml.XMLConfig;
import com.aixm.delorean.core.Delorean;
import com.aixm.delorean.core.database.DatabaseBinding;
import com.aixm.delorean.core.database.DatabaseConfig;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.qgis.QgisProjectBinding;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.namespace.QName;

import org.hibernate.Session;

public class Container<T, X> {
    protected String name;
    protected final QName qName;
    protected final Class<T> root;
    protected final Class<X> feature;
    protected T message;
    protected MessageType messageType;
    protected XMLBinding<T, X> xmlBinding;
    protected DatabaseBinding<T, X> databaseBinding;

    public Container(Class<T> rootClass, Class<X> featureClass, QName qName) {
        this.root = rootClass;
        this.feature = featureClass;
        this.qName = qName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QName getQName() {
        return this.qName;
    }

    public Class<?> getRoot() {
        return this.root;
    }

    public Class<?> getFeature() {
        return this.feature;
    }

    public T getMessage() {
        return this.message;
    }   

    public void setMessage(T message) {
        this.message = message;
    }

    public MessageType getMessageType() {
        return this.messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public void setXmlBinding(XMLBinding<T, X> xmlBinding) {
        this.xmlBinding = xmlBinding;
    }

    public XMLBinding<T, X> getXmlBinding() {
        return this.xmlBinding;
    }

    public void setDatabaseBinding(DatabaseBinding<T, X> databaseBinding) {
        this.databaseBinding = databaseBinding;
    }

    public DatabaseBinding<T, X> getDatabaseBinding() {
        return this.databaseBinding;
    }

    public void unmarshal(String path) {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }
        Path pathObj = Paths.get(path);
        this.message = (T) this.xmlBinding.unmarshal(pathObj);
    }

    public void marshal(String path) {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }
        Path pathObj = Paths.get(path);
        this.xmlBinding.marshal(this.message, pathObj, this.root, this.qName);
    }

    public void startup() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.startup();
    }

    public void shutdown() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.shutdown();
    }

    public void persist() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.persist(this.message);
        
        // if (this.getEditorProject() != null) {
        // }

        // if (this.getPublisherProject() != null) {
        //     Session session = this.databaseBinding.getSession();
        //     String userName = this.databaseBinding.getUserName();
        //     this.publisherPRJ.loadProject(session, userName);
        //     ConsoleLogger.log(LogLevel.INFO, "AIXM and project successfully loaded");
        // } else {
        //     ConsoleLogger.log(LogLevel.INFO, "AIXM successfully loaded");
        // }
    }

    public void extract(Object id) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }   

        this.message = (T) this.databaseBinding.extract(this.root, id);
    }

}
