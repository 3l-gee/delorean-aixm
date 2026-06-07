package com.aixm.delorean.core.container;

import com.aixm.delorean.core.xml.XmlBindingService;
import com.aixm.delorean.core.validation.ValidationBindingService;
import com.aixm.delorean.core.database.DatabaseBindingService;
import com.aixm.delorean.core.engine.AbstractEngine;
import com.aixm.delorean.core.filter.AbstractFilterConfig;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.UUID;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.apache.commons.lang3.SerializationUtils;

import com.aixm.delorean.core.DeloreanUtility;

public class Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> {
    protected final String id;
    protected String name;
    protected final QName qName;
    protected final Class<ROOT> rootClass;
    protected final Class<FEATURE> featureClass;
    protected final Class<TIMESLICE> timeSliceClass;
    protected final Class<OBJECT> objectClass;
    protected ROOT message;
    protected MessageType messageType;
    protected XmlBindingService<ROOT, FEATURE> xmlBinding;
    protected DatabaseBindingService<ROOT, FEATURE, TIMESLICE, OBJECT> databaseBinding;
    protected AbstractEngine<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> deloreanEngine;

    public Container(Class<ROOT> rootClass, Class<FEATURE> featureClass, Class<TIMESLICE> timeSliceClass, Class<OBJECT> objectClass, QName qName, String id) {
        this.rootClass = rootClass;
        this.featureClass = featureClass;
        this.timeSliceClass = timeSliceClass;
        this.objectClass = objectClass;
        this.qName = qName;
        this.id = id;

    }

    public String getId() {
        return this.id;
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


    public void getPersitedMessage() {
        this.databaseBinding.getPersitedMessage();
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

    public void SetCredentials(String url, String username, String password, String hbm2ddl){
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        
        boolean success = this.databaseBinding.SetCredentials(url, username, password, hbm2ddl);

        if (success) {
            ConsoleLogger.info("Connected to <" + this.databaseBinding.getUrl() + ">");
        } else {
            ConsoleLogger.error("Failed to connect to <" + this.databaseBinding.getUrl() + ">");
        }
    }

    public XmlBindingService<ROOT, FEATURE> getXmlBinding() {
        return this.xmlBinding;
    }

    public void setDatabaseBinding(DatabaseBindingService<ROOT, FEATURE, TIMESLICE, OBJECT> databaseBinding) {
        this.databaseBinding = databaseBinding;
    }

    public DatabaseBindingService<ROOT, FEATURE, TIMESLICE, OBJECT> getDatabaseBinding() {
        return this.databaseBinding;
    }

    public void setDeloreanEngine(AbstractEngine<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> deloreanEngine) {
        this.deloreanEngine = deloreanEngine;
    }

    public AbstractEngine<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> getDeloreanEngine() {
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
        ConsoleLogger.info("Unmarshalled <" + rootClass.getSimpleName() + "> from: " + path + " stats: " + stats);

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
        ConsoleLogger.info("Unmarshalled <" + rootClass.getSimpleName() + "> from: " + path + " stats: " + stats);
        return message;
    }

    // Lifecycle methods
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
        ConsoleLogger.info("Marshalled <" + rootClass.getSimpleName() + "> to: " + path + " stats: " + stats);
    }

    public void saxValidation() {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }
        this.xmlBinding.saxValidate(this.message);
        ConsoleLogger.info("SAX Validation <" + rootClass.getSimpleName() + ">");
    }

    public void printValidation() {
        ValidationBindingService.printSummary();
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

        ConsoleLogger.info("Initialized <" + this.databaseBinding.getUrl() + ">");
    }

    public void shutdown() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.shutdown();
        ConsoleLogger.info("Shutdown <" + this.databaseBinding.getUrl() + ">");
    }

    public void persist() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.persist(this.message);
        String stats = this.databaseBinding.statistics();
        ConsoleLogger.info("Persisted <" + rootClass.getSimpleName() + ">  to: " + this.databaseBinding.getUrl() + " stats: " + stats);
    }

    public void merge() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }   
        this.databaseBinding.merge(this.message);
        String stats = this.databaseBinding.statistics();
        ConsoleLogger.info("Merged <" + rootClass.getSimpleName() + ">  to: " + this.databaseBinding.getUrl() + " stats: " + stats);
    }

    public void integrate(String path) {
        ROOT newMessage = this.doUnmarshal(path);
        this.message = this.deloreanEngine.integrate(this.message, newMessage);
    }

    public void extract(Object id) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }   

        this.message = (ROOT) this.databaseBinding.extract(this.rootClass, id);
        String stats = this.deloreanEngine.statistics(this.message);
        ConsoleLogger.info("Extracted <" + rootClass.getSimpleName() + "> from: " + this.databaseBinding.getUrl() + " stats: " + stats);
    }

    public void predicate(String timeString) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }   

        Instant time;

        switch (timeString.trim().toUpperCase()) {
            case "MAX":
                time = Instant.MAX;
                break;

            case "MIN":
                time = Instant.MIN;
                break;

            default:
                try {
                    // expects full ISO-8601, e.g. "2022-01-01T00:00:00Z"
                    time = Instant.parse(timeString);
                } catch (DateTimeParseException e) {
                    throw new DateTimeParseException(
                        "Time must be ISO-8601 (e.g. 2022-01-01T00:00:00Z) or one of [MIN, MAX]",
                        timeString,
                        e.getErrorIndex()
                    );
                }
        }

        this.message = (ROOT) this.databaseBinding.predicateValidTimeslice(this.rootClass, time);
        String stats = this.deloreanEngine.statistics(this.message);
        ConsoleLogger.info("Predicated <" + rootClass.getSimpleName() + "> from: " + this.databaseBinding.getUrl() + " stats: " + stats);
    }

    @SuppressWarnings("unchecked")
    private ROOT doPredicate(Instant time) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        } 

        ROOT message = null;

        message = (ROOT) this.databaseBinding.predicateValidTimeslice(this.rootClass, time);
        String stats = this.deloreanEngine.statistics(this.message);
        ConsoleLogger.info("Predicated <" + rootClass.getSimpleName() + "> from: " + this.databaseBinding.getUrl() + " stats: " + stats);
        return message;
    }

    public void diff(){
        this.message = this.deloreanEngine.diff(this.message);
        String stats = this.deloreanEngine.statistics(this.message);
        ConsoleLogger.info("Diff applied to <" + rootClass.getSimpleName() + "> stats: " + stats);
    }

    public void filter(AbstractFilterConfig config) {
        this.message = this.deloreanEngine.filter(this.message, config);
        String stats = this.deloreanEngine.statistics(this.message);
        ConsoleLogger.info("Filter applied to <" + rootClass.getSimpleName() + "> stats: " + stats);
    }

    public Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> prune(AbstractFilterConfig config) {
        Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> newContainer = new Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG>(this.rootClass, this.featureClass, this.timeSliceClass, this.objectClass, this.qName, id);
        newContainer.setXmlBinding(this.xmlBinding);
        newContainer.setDatabaseBinding(this.databaseBinding);
        newContainer.setDeloreanEngine(this.deloreanEngine);

        ROOT clonedMessage = this.deloreanEngine.clone(this.message);
        ROOT filteredMessage = this.deloreanEngine.filter(clonedMessage, config);
        String stats = this.deloreanEngine.statistics(filteredMessage);
        newContainer.setMessage(filteredMessage);
        ConsoleLogger.info("Prune applied to <" + rootClass.getSimpleName() + "> stats: " + stats);
        return newContainer;
    }

    public Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> clone() {
        Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> newContainer = new Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG>(this.rootClass, this.featureClass, this.timeSliceClass, this.objectClass, this.qName, id);
        newContainer.setXmlBinding(this.xmlBinding);
        newContainer.setDatabaseBinding(this.databaseBinding);
        newContainer.setDeloreanEngine(this.deloreanEngine);

        ROOT clonedMessage = this.deloreanEngine.clone(this.message);
        String stats = this.deloreanEngine.statistics(clonedMessage);
        newContainer.setMessage(clonedMessage);
        ConsoleLogger.info("Clone applied to <" + rootClass.getSimpleName() + "> stats: " + stats);
        return newContainer;
    }

    // public void serialization(String path) {

    // }

    // public void mapping(){

    // }

}
