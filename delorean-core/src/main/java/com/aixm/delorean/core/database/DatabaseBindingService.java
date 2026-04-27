package com.aixm.delorean.core.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

import org.hibernate.Transaction;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;

public class DatabaseBindingService<ROOT, FEATURE, TIMESLICE, OBJECT> {
    private final Class<ROOT> rootClass;
    private final Class<FEATURE> featureClass;
    private final Class<TIMESLICE> timeSliceClass;
    private final Class<OBJECT> objectClass;
    private final Class<?> CoreResourceAnchorsClass;
    private final Class<?> AIXMResourceAnchorsClass;
    private String sqlPreInit;
    private String sqlPostInit;
    private SessionFactory sessionFactory;
    private Configuration configuration;
    private ConnectionStatus connectionStatus;
    private AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> databaseHelper;

    public DatabaseBindingService(
        Class<ROOT> rootClass,
        Class<FEATURE> featureClass, 
        Class<TIMESLICE> timeSliceClass, 
        Class<OBJECT> objectClass, 
        String sqlPreInitPath, 
        String sqlPostInitPath, 
        Configuration configuration,
        ConnectionStatus connectionStatus, 
        AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT>  databaseHelper, 
        Class<?> CoreResourceAnchorsClass, 
        Class<?> AIXMResourceAnchorsClass) {
        this.rootClass = rootClass;
        this.featureClass = featureClass;
        this.timeSliceClass = timeSliceClass;
        this.objectClass = objectClass;
        this.CoreResourceAnchorsClass = CoreResourceAnchorsClass;
        this.AIXMResourceAnchorsClass = AIXMResourceAnchorsClass;
        this.sqlPreInit = this.inputStreamToSQL(this.AIXMResourceAnchorsClass.getResourceAsStream(sqlPreInitPath));
        this.sqlPostInit = this.inputStreamToSQL(this.AIXMResourceAnchorsClass.getResourceAsStream(sqlPostInitPath));
        this.configuration = configuration;
        this.sessionFactory = null;
        this.connectionStatus = connectionStatus;
        this.databaseHelper = databaseHelper;
    }
    
    public void setUrl(String url){
        this.configuration.setProperty("hibernate.connection.url", url);
    }

    public String getUrl(){
        return this.configuration.getProperty("hibernate.connection.url");
    }

    public void setUsername(String username){
        this.configuration.setProperty("hibernate.connection.username", username);
    }

    public String getUserName(){
        return this.configuration.getProperty("hibernate.connection.username");
    }

    public void setPassword(String password){
        this.configuration.setProperty("hibernate.connection.password", password);
    }

    private Connection getConnection() throws SQLException {
        String url = configuration.getProperty("hibernate.connection.url");
        String username = configuration.getProperty("hibernate.connection.username");
        String password = configuration.getProperty("hibernate.connection.password");
        return DriverManager.getConnection(url, username, password);
    }

    public Session getSession() {
        return this.sessionFactory.openSession();
    }

    public String statistics() {
        if (this.sessionFactory == null){
            throw new IllegalArgumentException("sessionfactory is not init");
        }

        Function<ResultSet, Integer> countMapper = (rs) -> {
            try {
                return rs.getInt(1); 
            } catch (SQLException e) {
                throw new RuntimeException("Error reading count from ResultSet", e);
            }
        };

        // Define SQL queries
        String featureSql = "SELECT COUNT(DISTINCT hjid) FROM aixm.aixm_feature";
        String timeSliceSql = "SELECT COUNT(DISTINCT hjid) FROM aixm.aixm_timeslice";

        Integer featureCount = 0;
        Integer timeSliceCount = 0;

        try {
            List<Integer> featureResults = executeSQLQuery(featureSql, countMapper);
            if (!featureResults.isEmpty()) {
                featureCount = featureResults.get(0);
            }

            List<Integer> timeSliceResults = executeSQLQuery(timeSliceSql, countMapper);
            if (!timeSliceResults.isEmpty()) {
                timeSliceCount = timeSliceResults.get(0);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return "ERROR: Could not fetch statistics.";
        }

        // Format and return the result string
        return new String("F: " + featureCount + " / T: " + timeSliceCount);
    }
    
    public String inputStreamToSQL(InputStream inputStream) {
        try {
            String string = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8).lines().collect(Collectors.joining("\n"));
            return string;
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "Error reading SQL resource stream", e);
            return null;
        }
    }

    public void setHbm2ddl(String hbm2ddlAuto) {
        switch (hbm2ddlAuto) {
            case "create":
                this.configuration.setProperty("hibernate.hbm2ddl.auto", hbm2ddlAuto);
                break;

            case "create-only":
                this.configuration.setProperty("hibernate.hbm2ddl.auto", hbm2ddlAuto);
                break;

            case "create-drop":
                this.configuration.setProperty("hibernate.hbm2ddl.auto", hbm2ddlAuto);
                break;

            case "none":
                this.configuration.setProperty("hibernate.hbm2ddl.auto", hbm2ddlAuto);
                break;

            case "drop":
                this.configuration.setProperty("hibernate.hbm2ddl.auto", hbm2ddlAuto);
                break;

            case "validate":
                this.configuration.setProperty("hibernate.hbm2ddl.auto", hbm2ddlAuto);
                break;

            case "update":
                this.configuration.setProperty("hibernate.hbm2ddl.auto", hbm2ddlAuto);
                break;

            default:
                System.err.println("Invalid hbm2ddl value provided: " + hbm2ddlAuto);
                break;
        }
    }
  
    public void startup() {
        try {
            String hbm2ddl = this.configuration.getProperty("hibernate.hbm2ddl.auto");
            switch (hbm2ddl) {
                case "create":
                case "create-only":
                case "create-drop":
                    this.executeSQLScript(this.sqlPreInit);
                    this.sessionFactory = configuration.buildSessionFactory();
                    this.executeSQLScript(this.sqlPostInit);
                    break;

                case "none":
                case "drop":
                case "validate":
                case "update":
                    this.sessionFactory = configuration.buildSessionFactory();
                    break;

                default:
                    throw new IllegalArgumentException("Unknown hbm2ddl.auto value: " + hbm2ddl);
            }
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "Error initializing Hibernate session factory", e);

        }
    }

    /**
     * Executes a single SQL query (typically SELECT) and maps the results to a List of objects.
     * @param <T> The type of object to map the results to.
     * @param sql The single SQL SELECT query to execute.
     * @param mapper The RowMapper functional interface to handle per-row mapping logic.
     * @return A List of objects of type T containing the mapped results.
     */
    public <R> List<R> executeSQLQuery(String sql, Function<ResultSet, R> mapper) {
        List<R> results = new ArrayList<>();

        if (sql == null || sql.trim().isEmpty()) {
            return results;
        }

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql.trim())) {

            while (rs.next()) {
                R item = mapper.apply(rs);
                results.add(item);
            }

        } catch (SQLException e) {
            ConsoleLogger.log(LogLevel.ERROR, "Error executing query: " + sql, e);
        } catch (UnsupportedOperationException e) {
            ConsoleLogger.log(LogLevel.ERROR, "Database connection error.", e);
        }
        
        return results;
    }

    /**
     * Executes a custom SQL script
     * @param sql The SQL script to execute. Can contain multiple statements separated by semicolons. If it contains a PostgreSQL DO block, it will be executed as a single statement.
     */
    private void executeSQLScript(String sql) {
        if (sql == null || sql.isBlank()) {
            return;
        }

        try {
            // Ensure driver is registered for the DriverManager
            Class.forName("org.postgresql.Driver");

            try (Connection conn = getConnection(); 
                Statement stmt = conn.createStatement()) {
                    if (sql.toUpperCase().contains("DO $$") || sql.toUpperCase().contains("BEGIN")) {
                        stmt.execute(sql);
                    } else {
                        String[] queries = sql.split(";");

                        for (String query : queries) {
                            String cleaned = query.trim();
                        
                            if (cleaned.isEmpty() || cleaned.startsWith("--")) {
                                continue; 
                            }
                            
                            stmt.execute(cleaned);
                        }
                    }
                ConsoleLogger.log(LogLevel.INFO, "SQL script executed successfully.");
            }           
        } catch (ClassNotFoundException e) {
            ConsoleLogger.log(LogLevel.ERROR, "PostgreSQL JDBC Driver not found. Please check your dependencies.", e);
        } catch (SQLException e) {
            String errorMsg = String.format("SQL Error [State: %s, Code: %d]: %s", e.getSQLState(), e.getErrorCode(), e.getMessage());
            ConsoleLogger.log(LogLevel.ERROR, errorMsg, e);
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "Unexpected error during script execution.", e);
        }
    }

    public void shutdown(){
        this.sessionFactory.close();
    }

    public void persist(ROOT message) {
        if (this.sessionFactory == null){
            throw new IllegalArgumentException("sessionfactory is not init");
        }

        this.databaseHelper.persist(message, this.sessionFactory);
    }

    public ROOT extract(Class<ROOT> structure, Object id) {
        if (this.sessionFactory == null){
            throw new IllegalArgumentException("sessionfactory is not init");
        }

        Session session = this.getSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            ROOT object = session.find(structure, id);

            transaction.commit();
            session.close();
            return object;

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public ROOT predicateValidTimeslice(Class<ROOT> structure, Instant time) {
        if (this.sessionFactory == null){
            throw new IllegalArgumentException("Sessionfactory is not init");
        }

        //collect relevant tiemeslice property ids
        Session session = sessionFactory.openSession();
        InputStream TPIdsStream = this.AIXMResourceAnchorsClass.getResourceAsStream("/sql/time_slice_property_ids.sql");
        if (TPIdsStream == null) {
            throw new IllegalStateException("TimeSliceProperty predicate script not found");
        }
        String TPIdsSQL = this.inputStreamToSQL(TPIdsStream);
        Transaction TPIdsTX = session.beginTransaction();
        List<Long> TPIds = session.createNativeQuery(TPIdsSQL, Long.class).setParameter("time", time).getResultList();
        TPIdsTX.commit();
        
        //collect relevant basic message memebers ids
        InputStream BMMIdsStream = this.AIXMResourceAnchorsClass.getResourceAsStream("/sql/basic_message_member_ids.sql");
        if (BMMIdsStream == null) {
            throw new IllegalStateException("TimeSliceProperty predicate script not found");
        }
        String BMMIdsSQL = this.inputStreamToSQL(BMMIdsStream);        
        Transaction BMMIdsTX = session.beginTransaction();
        List<Long> BMMIds = session.createNativeQuery(BMMIdsSQL, Long.class).setParameter("time", time).getResultList();
        BMMIdsTX.commit();

        return this.databaseHelper.predicateValidTimeslice(BMMIds, TPIds, this.sessionFactory);
    }

    public void merge(ROOT message) {
        if (this.sessionFactory == null){
            throw new IllegalArgumentException("Sessionfactory is not init");
        }

        this.databaseHelper.merge(message, this.sessionFactory);
    }

    public void integrate(ROOT message) {
        if (this.sessionFactory == null){
            throw new IllegalArgumentException("Sessionfactory is not init");
        }

        this.databaseHelper.merge(message, this.sessionFactory);
    }

    // public Object export(Class<T> structure, Object id) {
    //     ConsoleLogger.log(LogLevel.DEBUG, "Retrieving : " + structure + " with id: " + id, new Exception().getStackTrace()[0]);
    //     if (this.sessionFactory == null) {
    //         throw new IllegalArgumentException("sessionfactory is not initialized");
    //     }

    //     Session session = this.sessionFactory.openSession();
    //     Transaction transaction = null;
    //     AIXMBasicMessageType object = null;

    //     try {
    //         transaction = session.beginTransaction();

    //         // 1. Execute SQL to get the latest IDs per sequence_number
    //         String sql = """
    //         SELECT DISTINCT ON (identifier, sequence_number)
    //         navaids_points.designatedpoint_tsp.id
    //         FROM navaids_points.designatedpoint
    //         LEFT JOIN master_join
    //         ON navaids_points.designatedpoint.id = master_join.source_id
    //         LEFT JOIN navaids_points.designatedpoint_tsp
    //         ON master_join.target_id = navaids_points.designatedpoint_tsp.id
    //         LEFT JOIN navaids_points.designatedpoint_ts
    //         ON navaids_points.designatedpoint_tsp.designatedpointtimeslice_id = navaids_points.designatedpoint_ts.id
    //         WHERE
    //             navaids_points.designatedpoint.feature_status = 'APPROVED'
    //             AND 
    //             navaids_points.designatedpoint_ts.feature_status = 'APPROVED'
    //         ORDER BY sequence_number, correction_number DESC;
    //         """;

    //         List<Integer> validIds = session.createNativeQuery(sql, Integer.class).getResultList();

    //         if (validIds.isEmpty()) {
    //             ConsoleLogger.log(LogLevel.INFO, "No valid DesignatedPointTimeSlice IDs found");
    //             return null;
    //         }

    //         // 2. Run the HQL using the result from SQL
    //         String hql = """
    //         SELECT dpt
    //         FROM DesignatedPointType dpt
    //         JOIN FETCH dpt.timeSlice tsp
    //         JOIN FETCH  tsp.designatedPointTimeSlice ts
    //         WHERE 
    //             tsp.dbid IN :validIds
    //             AND 
    //             (:validDateTime <= ts.validTime.endPosition OR ts.validTime.endPosition IS NULL)
    //         ORDER BY ts.sequenceNumber, ts.correctionNumber DESC
    //         """;

    //         List<DesignatedPointType> designatedPoints = session.createQuery(hql, DesignatedPointType.class)
    //             .setParameterList("validIds", validIds)
    //             .setParameter("validDateTime", Instant.parse("2011-01-01T00:00:00.000Z"))
    //             .getResultList();


    //         // 3. Build the export message
    //         object = new AIXMBasicMessageType();
    //         for (DesignatedPointType dpt : designatedPoints) {
    //             BasicMessageMemberAIXMPropertyType member = new BasicMessageMemberAIXMPropertyType();
    //             member.setAbstractAIXMFeature(dpt);
    //             object.getHasMember().add(member);
    //         }

    //         transaction.commit();
    //     } catch (Exception e) {
    //         if (transaction != null) {
    //             transaction.rollback();
    //         }
    //         e.printStackTrace();
    //     } finally {
    //         session.close();
    //     }

    //     ConsoleLogger.log(LogLevel.INFO, "AIXM Successfully exported");
    //     return object;
    // }

    // public void computeDBView() {
    //     this.executeSQLScript(this.databaseConfig.getSqlDBViewFilePath());

    //     ConsoleLogger.log(LogLevel.INFO, "Database views successfully created.");
    // }


    // private boolean isMappedClass(Object object){ 
    //     if (this.databaseConfig.getMappedClasses().contains(object.getClass())){
    //         return true;
    //     }
    //     return false;
    // }
}

