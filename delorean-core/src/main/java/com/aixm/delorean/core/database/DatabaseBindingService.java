package com.aixm.delorean.core.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import org.hibernate.Transaction;

import jakarta.persistence.Tuple;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.function.Function;

import java.sql.SQLException;

import com.aixm.delorean.core.DeloreanUtility;

public class DatabaseBindingService<ROOT, FEATURE> {
    private final Class<ROOT> rootClass;
    private final Class<FEATURE> featureClass;
    private String sqlPreInit;
    private String sqlPostInit;
    private SessionFactory sessionFactory;
    private Configuration configuration;
    private ConnectionStatus connectionStatus;
    protected AbstractDatabaseFunctions databaseHelper;

    public DatabaseBindingService(Class<ROOT> rootClass, Class<FEATURE> featureClass, String sqlPreInitPath, String sqlPostInitPath, Configuration configuration, ConnectionStatus connectionStatus, AbstractDatabaseFunctions databaseHelper) {
        this.rootClass = rootClass;
        this.featureClass = featureClass;
        this.sqlPreInit = this.inputStreamToSQL(Thread.currentThread().getContextClassLoader().getResourceAsStream(sqlPreInitPath));
        this.sqlPostInit = this.inputStreamToSQL(Thread.currentThread().getContextClassLoader().getResourceAsStream(sqlPostInitPath));
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
        String featureSql = "SELECT COUNT(DISTINCT id) FROM AIXM.AIXM_FEATURE";
        String timeSliceSql = "SELECT COUNT(DISTINCT id) FROM AIXM.aixm_timeslice";

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
        return new String("F: " + featureCount + " / TS: " + timeSliceCount);
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

    private void executeSQLScript(String sql) {
        try {
            try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
                if (sql.contains("DO $$")) {
                    stmt.execute(sql);  // Handle PostgreSQL DO block as one statement
                } else {
                    for (String query : sql.split(";")) {
                        if (!query.trim().isEmpty()) {
                            stmt.execute(query.trim());
                        }
                    }
                }
            }
        } catch (SQLException e) {
            ConsoleLogger.log(LogLevel.ERROR, "Error executing script.", e);
            return;
        }
    }

    public void shutdown(){
        this.sessionFactory.close();
    }

    public void persist(Object object) {
        if (this.sessionFactory == null){
            throw new IllegalArgumentException("sessionfactory is not init");
        }

        try (Session session = sessionFactory.openSession()) {
            HibernateHelper.doInTransaction(session, s -> {
                s.persist(object);
                return null;
            });
        } catch (Exception ex) {
            throw new RuntimeException("Failed to persist " + object.getClass().getName(), ex);
        }
    }

    public Object extract(Class<ROOT> structure, Object id) {
        if (this.sessionFactory == null){
            throw new IllegalArgumentException("sessionfactory is not init");
        }

        Session session = this.getSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Object object = session.find(structure, id);

            transaction.commit();
            return object;

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public void merge(Object object) {
        if (this.sessionFactory == null){
            throw new IllegalArgumentException("sessionfactory is not init");
        }

        this.databaseHelper.merge(this.sessionFactory, object);
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

