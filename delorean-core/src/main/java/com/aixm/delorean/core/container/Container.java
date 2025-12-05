package com.aixm.delorean.core.container;

import com.aixm.delorean.core.xml.XmlBindingService;
import com.aixm.delorean.core.xml.XMLConfig;
import com.aixm.delorean.core.Delorean;
import com.aixm.delorean.core.database.DatabaseBindingService;
import com.aixm.delorean.core.database.DatabaseConfig;
import com.aixm.delorean.core.engine.AbstractEngine;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.qgis.QgisProjectBinding;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.namespace.QName;

import com.aixm.delorean.core.DeloreanUtility;

import org.hibernate.Session;
import org.locationtech.jts.awt.PointShapeFactory.X;

public class Container<R, F, T, O> {
    protected String name;
    protected final QName qName;
    protected final Class<R> rootClass;
    protected final Class<F> featureClass;
    protected final Class<T> timeSliceClass;
    protected final Class<O> objectClass;
    protected R message;
    protected MessageType messageType;
    protected XmlBindingService<R, F> xmlBinding;
    protected DatabaseBindingService<R, F> databaseBinding;
    protected AbstractEngine deloreanEngine;

    public Container(Class<R> rootClass, Class<F> featureClass, Class<T> timeSliceClass, Class<O> objectClass, QName qName) {
        this.rootClass = rootClass;
        this.featureClass = featureClass;
        this.timeSliceClass = timeSliceClass;
        this.objectClass = objectClass;
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

    public Class<?> getRootClass() {
        return this.rootClass;
    }

    public Class<?> getFeatureClass() {
        return this.featureClass;
    }

    public Class<?> getTimeSliceClass() {
        return this.timeSliceClass;
    }

    public Class<?> getObjectClass() {
        return this.objectClass;
    }

    public R getMessage() {
        return this.message;
    }   

    public void setMessage(R message) {
        this.message = message;
    }

    public MessageType getMessageType() {
        return this.messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public void setXmlBinding(XmlBindingService<R, F> xmlBinding) {
        this.xmlBinding = xmlBinding;
    }

    public XmlBindingService<R, F> getXmlBinding() {
        return this.xmlBinding;
    }

    public void setDatabaseBinding(DatabaseBindingService<R, F> databaseBinding) {
        this.databaseBinding = databaseBinding;
    }

    public DatabaseBindingService<R, F> getDatabaseBinding() {
        return this.databaseBinding;
    }

    public void setDeloreanEngine(AbstractEngine deloreanEngine) {
        this.deloreanEngine = deloreanEngine;
    }

    public AbstractEngine getDeloreanEngine() {
        return this.deloreanEngine;
    }

    // Lifecycle methods

    public void unmarshal(String path) {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }
        
        InputStream xmlStream;
        if (path.toLowerCase().endsWith(".zip")) {
            xmlStream = DeloreanUtility.absPathZipToInputStream(path);
        } else {
            xmlStream = DeloreanUtility.absPathToInputStream(path);
        }

        if (xmlStream == null) {
            return;
        } 

        this.message = (R) this.xmlBinding.unmarshal(xmlStream);

    }

    public void marshal(String path) {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }
        FileOutputStream pathObj = DeloreanUtility.pathToOutputStream(path);
        if (pathObj == null) {
            return;
        }
        this.xmlBinding.marshal(this.message, pathObj, this.rootClass, this.qName);
    }

    public void statistics() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.deloreanEngine.statistics(this.message);
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

        this.message = (R) this.databaseBinding.extract(this.rootClass, id);
    }

}
