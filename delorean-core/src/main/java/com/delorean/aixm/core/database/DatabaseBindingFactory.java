package com.delorean.aixm.core.database;

import org.hibernate.cfg.Configuration;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DatabaseBindingFactory<ROOT, FEATURE, TIMESLICE, OBJECT> {
    protected final Class<ROOT> rootClass;
    protected final Class<FEATURE> featureClass;
    protected final Class<TIMESLICE> timeSliceClass;
    protected final Class<OBJECT> objectClass;
    protected final Class<?> CoreResourceAnchorsClass;
    protected final Class<?> AIXMResourceAnchorsClass;
    protected String sqlPreInitPath;
    protected String sqlPostInitPath;
    protected Map<String, String> sqlFilesMap;
    protected Configuration configuration;
    protected AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> databaseHelper;

    public DatabaseBindingFactory(
        Class<ROOT> rootClass,
        Class<FEATURE> featureClass, 
        Class<TIMESLICE> timeSliceClass, 
        Class<OBJECT> objectClass, 
        String sqlPreInitPath, 
        String sqlPostInitPath, 
        Map<String, String> sqlFilesMap,
        String configurationPath, 
        Class<?> CoreResourceAnchorsClass, 
        Class<?> AIXMResourceAnchorsClass, 
        AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> databaseHelper) {
        this.rootClass = rootClass;
        this.featureClass = featureClass;
        this.timeSliceClass = timeSliceClass;
        this.objectClass = objectClass;
        this.sqlPreInitPath = sqlPreInitPath;
        this.sqlPostInitPath = sqlPostInitPath;
        this.sqlFilesMap = sqlFilesMap;
        this.CoreResourceAnchorsClass = CoreResourceAnchorsClass;
        this.AIXMResourceAnchorsClass = AIXMResourceAnchorsClass;
        this.configuration = new Configuration().configure(configurationPath);
        this.databaseHelper = databaseHelper;

        log.atDebug().setMessage("Successfully initialized DatabaseBindingFactory");
        log.atDebug().setMessage("Root class: {}").addArgument(() -> rootClass.getName()).log();
        log.atDebug().setMessage("Feature class: {}").addArgument(() -> featureClass.getName()).log();
        log.atDebug().setMessage("TimeSlice class: {}").addArgument(() -> timeSliceClass.getName()).log();
        log.atDebug().setMessage("Object class: {}").addArgument(() -> objectClass.getName()).log();
        log.atDebug().setMessage("CoreResourceAnchorsClass: {}").addArgument(() -> CoreResourceAnchorsClass.getName()).log();
        log.atDebug().setMessage("AIXMResourceAnchorsClass: {}").addArgument(() -> AIXMResourceAnchorsClass.getName()).log();
        log.atDebug().setMessage("SQL Pre-Init Path: {}").addArgument(() -> sqlPreInitPath).log();
        log.atDebug().setMessage("SQL Post-Init Path: {}").addArgument(() -> sqlPostInitPath).log();
        log.atDebug().setMessage("SQL Files-Map Content: ").addArgument(() -> sqlFilesMap.toString()).log();
        for (Map.Entry<String, String> entry : sqlFilesMap.entrySet()) {
            String key = entry.getKey();
            String sqlPath = entry.getValue();
            log.atDebug().setMessage("  Name : {} Path: {}").addArgument(key).addArgument(sqlPath).log();
        }
        log.atDebug().setMessage("Configuration Path: {}").addArgument(() -> configurationPath).log();
    }

    public Class<ROOT> getRootClass() {
        return this.rootClass;
    }

    public Class<FEATURE> getFeatureClass() {
        return this.featureClass;
    }

    public Class<TIMESLICE> getTimeSliceClass() {
        return this.timeSliceClass;
    }

    public Class<OBJECT> getObjectClasss() {
        return this.objectClass;
    }

    public Class<?> getCoreResourceAnchorsClass() {
        return this.CoreResourceAnchorsClass;
    }

    public Class<?> getAIXMResourceAnchorsClass() {
        return this.AIXMResourceAnchorsClass;
    }

    public String getSqlPreInitPath() {
        return this.sqlPreInitPath;
    }

    public String getSqlPostInitPath() {
        return this.sqlPostInitPath;
    }

    public Map<String, String> getSqlFilesMap() {
        return this.sqlFilesMap;
    }

    public Configuration getConfiguration() {
        return this.configuration;
    }

    public AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> getDatabaseHelper() {
        return this.databaseHelper;
    }

    public DatabaseBindingService<ROOT, FEATURE, TIMESLICE, OBJECT> createDatabaseBinding() {
        return new DatabaseBindingService<>(
            this.getRootClass(), 
            this.getFeatureClass(), 
            this.getTimeSliceClass(),
            this.getObjectClasss(),
            this.getSqlPreInitPath(), 
            this.getSqlPostInitPath(), 
            this.getSqlFilesMap(),
            this.getConfiguration(), 
            ConnectionStatus.DISCONNECTED,
            this.getDatabaseHelper(),
            this.getCoreResourceAnchorsClass(),
            this.getAIXMResourceAnchorsClass()
        );
    }
}
