package com.delorean.aixm.core.container;

import com.delorean.aixm.core.xml.XmlBindingService;
import com.delorean.aixm.core.database.DatabaseBindingService;
import com.delorean.aixm.core.engine.AbstractEngine;
import com.delorean.aixm.core.filter.AbstractFilterConfig;
import com.delorean.aixm.core.inspection.InspectionBindingService;
import com.delorean.aixm.core.log.ConsoleLogger;
import com.delorean.aixm.core.log.LogLevel;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.UUID;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.apache.commons.lang3.SerializationUtils;

import com.delorean.aixm.core.DeloreanUtility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * Core container managing the lifecycle, XML binding, database persistence,
 * and processing engines for AIXM messages. This
 *
 * @param <ROOT>          The root message type.
 * @param <MESSAGE>       The internal message type.
 * @param <FEATURE>       The feature type.
 * @param <TIMESLICE>     The timeslice type.
 * @param <OBJECT>        The object type.
 * @param <SEARCH_CONFIG> The configuration type for search operations.
 */
public class Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> {
    protected final String id;
    protected String name;
    protected final QName qName;
    protected final Class<ROOT> rootClass;
    protected final Class<FEATURE> featureClass;
    protected final Class<TIMESLICE> timeSliceClass;
    protected final Class<OBJECT> objectClass;
    protected ROOT message;
    protected XmlBindingService<ROOT, FEATURE> xmlBinding;
    protected DatabaseBindingService<ROOT, FEATURE, TIMESLICE, OBJECT> databaseBinding;
    protected AbstractEngine<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> deloreanEngine;

    public Container(Class<ROOT> rootClass, Class<FEATURE> featureClass, Class<TIMESLICE> timeSliceClass,
        Class<OBJECT> objectClass, QName qName, String id) {
        this.rootClass = rootClass;
        this.featureClass = featureClass;
        this.timeSliceClass = timeSliceClass;
        this.objectClass = objectClass;
        this.qName = qName;
        this.id = id;

        log.info("Container: " + this.name + " initialized");
        log.atDebug().setMessage("Root class: {}").addArgument(() -> rootClass.getName()).log();
        log.atDebug().setMessage("Feature class: {}").addArgument(() -> featureClass.getName()).log();
        log.atDebug().setMessage("TimeSlice class: {}").addArgument(() -> timeSliceClass.getName()).log();
        log.atDebug().setMessage("Object class: {}").addArgument(() -> objectClass.getName()).log();
        log.atDebug().setMessage("Qname value: {}").addArgument(() -> qName.getNamespaceURI()).log();
        log.atDebug().setMessage("Id: {}").addArgument(() -> id).log();
    }

    /** @return Unique identifier of the container. */
    public String getId() {
        return this.id;
    }

    /** @return Name of the currently loaded message or file. */
    public String getName() {
        return this.name;
    }

    /** @param name Name to set for the container. */
    public void setName(String name) {
        this.name = name;
    }

    /** @return The XML qualified name (QName) associated with the root element. */
    public QName getQName() {
        return this.qName;
    }

    /** @return The class type of the root message. */
    public Class<?> getRootClass() {
        return this.rootClass;
    }

    /** @return The class type of the features. */
    public Class<?> getFeatureClass() {
        return this.featureClass;
    }

    /** @return The class type of the timeslices. */
    public Class<?> getTimeSliceClass() {
        return this.timeSliceClass;
    }

    /** @return The class type of the base objects. */
    public Class<?> getObjectClass() {
        return this.objectClass;
    }

    /** @return The root aixm message entity currently stored in memory. */
    public ROOT getMessage() {
        return this.message;
    }

    /** @param message The root aixm message entity to set. */
    public void setMessage(ROOT message) {
        this.message = message;
    }

    /** @param xmlBinding The XML marshal/unmarshal service to bind. */
    public void setXmlBinding(XmlBindingService<ROOT, FEATURE> xmlBinding) {
        this.xmlBinding = xmlBinding;
    }

    /**
     * Configures database credentials and attempts a test connection.
     * * @throws RuntimeException if databaseBinding has not been initialized.
     */
    public void SetCredentials(String url, String username, String password, String hbm2ddl) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }

        boolean success = this.databaseBinding.SetCredentials(url, username, password, hbm2ddl);

        if (success) {
            log.info("Connected <" + this.name + "> to <" + this.databaseBinding.getUrl() + ">");
        } else {
            log.error("Failed to connect to <" + this.databaseBinding.getUrl() + ">");
        }
    }

    /** @return The active XML binding service. */
    public XmlBindingService<ROOT, FEATURE> getXmlBinding() {
        return this.xmlBinding;
    }

    /** @param databaseBinding The ORM/database mapping service to bind. */
    public void setDatabaseBinding(DatabaseBindingService<ROOT, FEATURE, TIMESLICE, OBJECT> databaseBinding) {
        this.databaseBinding = databaseBinding;
    }

    /** @return The active database binding service. */
    public DatabaseBindingService<ROOT, FEATURE, TIMESLICE, OBJECT> getDatabaseBinding() {
        return this.databaseBinding;
    }

    /** @param deloreanEngine The processing engine to bind. */
    public void setDeloreanEngine(
            AbstractEngine<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> deloreanEngine) {
        this.deloreanEngine = deloreanEngine;
    }

    /** @return The active processing engine. */
    public AbstractEngine<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> getDeloreanEngine() {
        return this.deloreanEngine;
    }

    /**
     * Unmarshals an XML document from a local or remote path (supports .zip) and
     * loads it into memory.
     * * @param path File path or URL to the source XML/ZIP.
     * 
     * @throws RuntimeException if xmlBinding is not configured.
     */
    public void unmarshal(String path, String description) {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }

        InputStream xmlStream;
        String lowerCasePath = path != null ? path.trim().toLowerCase() : "";
        boolean isRemote = lowerCasePath.startsWith("http://") || lowerCasePath.startsWith("https://");

        if (lowerCasePath.endsWith(".zip")) {
            xmlStream = isRemote ? DeloreanUtility.urlZipToInputStream(path)
                    : DeloreanUtility.absPathZipToInputStream(path);
        } else {
            xmlStream = isRemote ? DeloreanUtility.urlToInputStream(path)
                    : DeloreanUtility.absPathToInputStream(path);
        }

        if (xmlStream == null) {
            throw new RuntimeException("Failed to open XML stream from path: " + path);
        }

        String fileName = "";
        if (path != null && !path.isBlank()) {
            try {
                fileName = java.nio.file.Paths.get(path).getFileName().toString();
            } catch (Exception e) {
                fileName = path.substring(path.lastIndexOf('/') + 1);
            }
        }

        try {
            this.message = (ROOT) this.xmlBinding.unmarshal(xmlStream, description);
            this.name = fileName;
            String stats = this.deloreanEngine.statistics(this.message);
            log.info("Unmarshalled <" + this.name + "> from: " + path + " stats: " + stats);
        } finally {
            try {
                xmlStream.close();
            } catch (Exception e) {
                // Quietly close to avoid masking unmarshal exceptions
            }
        }
    }

    /** Internal helper to unmarshal a payload without mutating container state. */
    private ROOT doUnmarshal(String path, String description) {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }

        ROOT message = null;

        InputStream xmlStream;
        String lowerCasePath = path != null ? path.trim().toLowerCase() : "";
        boolean isRemote = lowerCasePath.startsWith("http://") || lowerCasePath.startsWith("https://");

        if (lowerCasePath.endsWith(".zip")) {
            xmlStream = isRemote ? DeloreanUtility.urlZipToInputStream(path)
                    : DeloreanUtility.absPathZipToInputStream(path);
        } else {
            xmlStream = isRemote ? DeloreanUtility.urlToInputStream(path)
                    : DeloreanUtility.absPathToInputStream(path);
        }

        if (xmlStream == null) {
            throw new RuntimeException("Failed to open XML stream from path: " + path);
        }

        try {
            message = (ROOT) this.xmlBinding.unmarshal(xmlStream, description);
        } finally {
            try {
                xmlStream.close();
            } catch (Exception e) {
                // Quietly close
            }
        }
        return message;
    }
    /**
     * Sets the lifecycle status of the current in-memory message and all its members.
     * @param status The lifecycle status string to set.
     */
    public void setStatus(String status) {
        if (this.deloreanEngine == null) {
            throw new RuntimeException("DeloreanEngine is not set");
        }

        this.deloreanEngine.applyMessageLifecycleStatus(this.message, status);
        String stats = this.deloreanEngine.statistics(this.message);
        log.info("Lifecycle <" + this.name + "> status set to '{}'", status);
    }

    /**
     * Marshals the current in-memory message structure out to an XML file.
     * * @param path Absolute local destination path.
     * 
     * @throws RuntimeException if xmlBinding is not configured.
     */
    public void marshal(String path) {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }
        FileOutputStream pathObj = DeloreanUtility.pathToOutputStream(path);
        if (pathObj == null) {
            throw new RuntimeException("Failed to open output stream for path: " + path);
        }
        this.xmlBinding.marshal(this.message, pathObj, this.rootClass, this.qName);
        String stats = this.xmlBinding.statistics(path);
        log.info("Marshalled <" + this.name + "> to: " + path + " stats: " + stats);
    }

    /**
     * Internal helper to marshal a specific root message payload out to an XML
     * file.
     * * @param path Absolute local destination path.
     * 
     * @param message The root message entity graph to serialize.
     * @throws RuntimeException if xmlBinding is not configured.
     */
    private void doMarshal(String path, ROOT message) {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }
        FileOutputStream pathObj = DeloreanUtility.pathToOutputStream(path);
        if (pathObj == null) {
            throw new RuntimeException("Failed to open output stream for path: " + path);
        }
        this.xmlBinding.marshal(message, pathObj, this.rootClass, this.qName);
    }

    /**
     * Inspects the database already persisted aixm messages. Generates statistic as
     * an inspection report
     */
    public void persistedMessageinspection() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }

        this.databaseBinding.persistedMessageinspection();
        log.info("Persisted Message Inspection <" + this.name + "> connection <" + this.databaseBinding.getUrl() + ">");
    }

    /**
     * Runs a SAX-based structure validation on the current in-memory message.
     * Generates statistic as an inspection report
     */
    public void saxInspection() {
        if (this.xmlBinding == null) {
            throw new RuntimeException("XMLBinding is not set");
        }
        this.xmlBinding.saxInspect(this.message);
        log.info("SAX Inspection <" + this.name + ">");
    }

    /** Prints a global inspection summary report. */
    public void inspectionSummary() {
        InspectionBindingService.printSummary();
    }

    /**
     * Performs temporal validity checks on the in memory message data. Generates
     * statistic as an inspection report
     */
    public void temporalityInspection() {
        if (this.deloreanEngine == null) {
            throw new RuntimeException("DeloreanEngine is not set");
        }
        this.deloreanEngine.temporalityInspection(this.message);
    }

    /** Start the database session factory layer. */
    public void startup(boolean withDomainCheck) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.startup(withDomainCheck);

        log.info("Initialized <" + this.name + "> connection: <" + this.databaseBinding.getUrl() + ">");
    }

    /** Tears down database connections and state. */
    public void shutdown() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.shutdown();
        log.info("Shutdown <" + this.name + "> connection: <" + this.databaseBinding.getUrl() + ">");
    }

    /** Tears down database connections and state. */
    public void render() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.geometryRender();
        log.info("Rendered <" + this.name + "> connection: <" + this.databaseBinding.getUrl() + ">");
    }

    /** Saves the full aixm message currently in-memory to the database. */
    public void persist() {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.persist(this.message);
        String stats = this.databaseBinding.statistics();
        log.info("Persisted <" + this.name + ">  to: <" + this.databaseBinding.getUrl() + "> stats: " + stats);
    }

    /**
     * merges the aixm message currently in-memory message into the database exiting
     * message.
     */
    public void merge(String fieldName, Object value) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }
        this.databaseBinding.merge(this.message, fieldName, value);
        String stats = this.databaseBinding.statistics();
        log.info("Merged <" + this.name + ">  to: <" + this.databaseBinding.getUrl() + "> stats: " + stats);
    }

    /**
     * Unmarshals an external dataset path and merges it temporally onto the current
     * message. Resolves partial diff (delta) to full timeslices.
     */
    public void integrate(String path) {
        ROOT newMessage = this.doUnmarshal(path, null);
        this.message = this.deloreanEngine.integrate(this.message, newMessage);
        String stats = this.deloreanEngine.statistics(message);
        log.info("Integrated <" + this.name + "> stats: " + stats);
    }

    /**
     * Pulls a message entity graph out of the database matching the provided
     * primary identifier.
     */
    public void extract(String fieldName, Object value) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }

        this.message = (ROOT) this.databaseBinding.extract(this.rootClass, fieldName, value);
        String stats = this.deloreanEngine.statistics(this.message);
        log.info("Extracted <" + this.name + "> from: <" + this.databaseBinding.getUrl() + "> stats: " + stats);
    }

    /**
     * Pulls a message entity graph out of the database matching the provided
     * primary identifier and valid timeslice that are valid and active later then
     * the given date.
     * * @param timeString ISO-8601 string payload or macro flags ["MIN", "MAX"].
     * 
     * @throws DateTimeParseException if format validation fails.
     */
    public void predicate(String timeString, String fieldName, Object value) {
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
                            e.getErrorIndex());
                }
        }

        this.message = (ROOT) this.databaseBinding.predicateValidTimeslice(this.rootClass, time, fieldName, value);
        String stats = this.deloreanEngine.statistics(this.message);
        log.info("Predicated <" + this.name + "> from: <" + this.databaseBinding.getUrl() + "> stats: " + stats);
    }

    /** Internal slice lookup processing against a precise timestamp value. */
    @SuppressWarnings("unchecked")
    private ROOT doPredicate(Instant time, String fieldName, Object value) {
        if (this.databaseBinding == null) {
            throw new RuntimeException("DatabaseBinding is not set");
        }

        ROOT message = null;

        message = (ROOT) this.databaseBinding.predicateValidTimeslice(this.rootClass, time, this.name, this.id);
        String stats = this.deloreanEngine.statistics(this.message);
        log.info("Predicated <" + this.name + "> from: <" + this.databaseBinding.getUrl() + "> stats: " + stats);
        return message;
    }

    /**
     * Computes modifications (deltas) on the current message and marshals the
     * resulting diff payload to an XML file.
     * * @param path Absolute local destination path for the generated XML diff.
     */
    public void diff(String path) {
        message = this.deloreanEngine.diff(this.message);
        this.doMarshal(path, message);
        String stats = this.xmlBinding.statistics(path);
        log.info("Diffed <" + this.name + "> to: <" + path + "> stats: " + stats);
    }

    /**
     * Destructively filters the container's message properties against criteria.
     */
    public void filter(AbstractFilterConfig config) {
        this.message = this.deloreanEngine.filter(this.message, config);
        String stats = this.deloreanEngine.statistics(this.message);
        log.info("Filtered <" + this.name + "> stats: " + stats);
    }

    /**
     * Non-destructively clones the environment structure and filters out its
     * message elements.
     * * @return A deep copy container variant hosting the isolated content dataset.
     */
    public Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> prune(AbstractFilterConfig config) {
        Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> newContainer = new Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG>(
                this.rootClass, this.featureClass, this.timeSliceClass, this.objectClass, this.qName, id);
        newContainer.setXmlBinding(this.xmlBinding);
        newContainer.setDatabaseBinding(this.databaseBinding);
        newContainer.setDeloreanEngine(this.deloreanEngine);

        ROOT clonedMessage = this.deloreanEngine.clone(this.message);
        ROOT filteredMessage = this.deloreanEngine.filter(clonedMessage, config);
        String stats = this.deloreanEngine.statistics(filteredMessage);
        newContainer.setMessage(filteredMessage);
        log.info("Pruned <" + this.name + "> stats: " + stats);
        return newContainer;
    }

    /**
     * Creates a deep cloned workspace instance replicating bindings and
     * configuration states.
     * * @return Fresh detached functional duplication mapping.
     */
    public Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> clone() {
        Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG> newContainer = new Container<ROOT, MESSAGE, FEATURE, TIMESLICE, OBJECT, SEARCH_CONFIG>(
                this.rootClass, this.featureClass, this.timeSliceClass, this.objectClass, this.qName, id);
        newContainer.setXmlBinding(this.xmlBinding);
        newContainer.setDatabaseBinding(this.databaseBinding);
        newContainer.setDeloreanEngine(this.deloreanEngine);

        ROOT clonedMessage = this.deloreanEngine.clone(this.message);
        String stats = this.deloreanEngine.statistics(clonedMessage);
        newContainer.setMessage(clonedMessage);
        log.info("Cloned <" + this.name + "> stats: " + stats);
        return newContainer;
    }
}
