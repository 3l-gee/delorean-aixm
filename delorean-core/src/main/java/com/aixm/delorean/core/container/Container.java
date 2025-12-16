package com.aixm.delorean.core.container;

import com.aixm.delorean.core.xml.XmlBindingService;
import com.aixm.delorean.core.xml.XMLConfig;
import com.aixm.delorean.core.Delorean;
import com.aixm.delorean.core.database.AbstractDatabaseFunctions;
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
import java.security.PublicKey;
import java.time.Instant;
import java.time.format.DateTimeParseException;

import javax.xml.namespace.QName;

import com.aixm.delorean.core.DeloreanUtility;

import org.hibernate.Session;
import org.locationtech.jts.awt.PointShapeFactory.X;

public class Container<ROOT, FEATURE, TIMESLICE, OBJECT> {
    protected String name;
    protected final QName qName;
    protected final Class<ROOT> rootClass;
    protected final Class<FEATURE> featureClass;
    protected final Class<TIMESLICE> timeSliceClass;
    protected final Class<OBJECT> objectClass;
    protected ROOT message;
    protected MessageType messageType;
    protected XmlBindingService<ROOT, FEATURE> xmlBinding;
    protected DatabaseBindingService<ROOT, FEATURE> databaseBinding;
    protected AbstractEngine deloreanEngine;

    public Container(Class<ROOT> rootClass, Class<FEATURE> featureClass, Class<TIMESLICE> timeSliceClass, Class<OBJECT> objectClass, QName qName) {
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

    public ROOT getMessage() {
        return this.message;
    }   

    public void setMessage(ROOT message) {
        this.message = message;
    }

    public MessageType getMessageType() {
        return this.messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public void setXmlBinding(XmlBindingService<ROOT, FEATURE> xmlBinding) {
        this.xmlBinding = xmlBinding;
    }

    public XmlBindingService<ROOT, FEATURE> getXmlBinding() {
        return this.xmlBinding;
    }

    public void setDatabaseBinding(DatabaseBindingService<ROOT, FEATURE> databaseBinding) {
        this.databaseBinding = databaseBinding;
    }

    public DatabaseBindingService<ROOT, FEATURE> getDatabaseBinding() {
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

        this.message = (ROOT) this.xmlBinding.unmarshal(xmlStream);
        String stats = this.deloreanEngine.statistics(this.message);
        ConsoleLogger.log(LogLevel.INFO, "Unmarshalled <" + rootClass.getSimpleName() + "> from: " + path + " stats: " + stats);

    }

    private ROOT doUnmarshal(String path) {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }

        ROOT message = null;
        
        InputStream xmlStream;
        if (path.toLowerCase().endsWith(".zip")) {
            xmlStream = DeloreanUtility.absPathZipToInputStream(path);
        } else {
            xmlStream = DeloreanUtility.absPathToInputStream(path);
        }

        if (xmlStream == null) {
            return message;
        } 

        message = (ROOT) this.xmlBinding.unmarshal(xmlStream);
        String stats = this.deloreanEngine.statistics(this.message);
        ConsoleLogger.log(LogLevel.INFO, "Unmarshalled <" + rootClass.getSimpleName() + "> from: " + path + " stats: " + stats);
        return message;
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
        String stats = this.xmlBinding.statistics(path);
        ConsoleLogger.log(LogLevel.INFO, "Marshalled <" + rootClass.getSimpleName() + "> to: " + path + " stats: " + stats);
    }

    public void statistics() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.deloreanEngine.statistics(this.message);
    }

    public void info() {
        if (this.deloreanEngine == null) {
            throw new RuntimeException("DeloreanEngine is not set");
        }
        this.deloreanEngine.info(this.message);
    }

    public void startup() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.startup();

        ConsoleLogger.log(LogLevel.INFO, "Initialized <" + this.databaseBinding.getUrl() + ">");
    }

    public void shutdown() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.shutdown();
        ConsoleLogger.log(LogLevel.INFO, "Shutdown <" + this.databaseBinding.getUrl() + ">");
    }

    public void persist() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.persist(this.message);
        String stats = this.databaseBinding.statistics();
        ConsoleLogger.log(LogLevel.INFO, "Persisted <" + rootClass.getSimpleName() + ">  to: " + this.databaseBinding.getUrl() + " stats: " + stats);
    }

    public void merge() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }   
        this.databaseBinding.merge(this.message);
        String stats = this.databaseBinding.statistics();
        ConsoleLogger.log(LogLevel.INFO, "Merged <" + rootClass.getSimpleName() + ">  to: " + this.databaseBinding.getUrl() + " stats: " + stats);
    }

    @SuppressWarnings("unchecked")
    public void integrate(String path) {
        
        ROOT newMessage = this.doUnmarshal(path);
        ROOT oldMessage = this.doPredicate(Instant.MAX);

        ConsoleLogger.log(LogLevel.INFO, "Integrated <" + rootClass.getSimpleName() + ">  to: " + this.databaseBinding.getUrl() + " stats: " + stats);
    }

    @SuppressWarnings("unchecked")
    public void extract(Object id) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }   

        this.message = (ROOT) this.databaseBinding.extract(this.rootClass, id);
        String stats = this.deloreanEngine.statistics(this.message);
        ConsoleLogger.log(LogLevel.INFO, "Extracted <" + rootClass.getSimpleName() + "> from: " + this.databaseBinding.getUrl() + " stats: " + stats);
    }

    @SuppressWarnings("unchecked")
    public void predicate(String timeString) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }   

        Instant time;
        try {
            time = Instant.parse(timeString); // expects full ISO-8601, e.g., "2022-01-01T00:00:00Z"
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException(
                "Instant requires a full ISO-8601 date-time (e.g., 2022-01-01T00:00:00Z)", 
                timeString, 
                e.getErrorIndex()
            );
        }

        this.message = (ROOT) this.databaseBinding.predicateValidTimeslice(this.rootClass, time);
        String stats = this.deloreanEngine.statistics(this.message);
        ConsoleLogger.log(LogLevel.INFO, "Predicated <" + rootClass.getSimpleName() + "> from: " + this.databaseBinding.getUrl() + " stats: " + stats);
    }

    @SuppressWarnings("unchecked")
    private ROOT doPredicate(Instant time) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        } 

        ROOT message = null;

        message = (ROOT) this.databaseBinding.predicateValidTimeslice(this.rootClass, time);
        String stats = this.deloreanEngine.statistics(this.message);
        ConsoleLogger.log(LogLevel.INFO, "Predicated <" + rootClass.getSimpleName() + "> from: " + this.databaseBinding.getUrl() + " stats: " + stats);
        return message;
    }

    // public void serialization(String path) {

    // }

    // public void mapping(){

    // }

}
