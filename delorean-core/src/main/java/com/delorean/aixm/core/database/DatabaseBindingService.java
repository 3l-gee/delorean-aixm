package com.delorean.aixm.core.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.delorean.aixm.core.log.ConsoleLogger;

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
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DatabaseBindingService<ROOT, FEATURE, TIMESLICE, OBJECT> {
    private final Class<ROOT> rootClass;
    private final Class<FEATURE> featureClass;
    private final Class<TIMESLICE> timeSliceClass;
    private final Class<OBJECT> objectClass;
    private final Class<?> CoreResourceAnchorsClass;
    private final Class<?> AIXMResourceAnchorsClass;
    private String sqlPreInit;
    private String sqlPostInit;
    private Map<String, String> sqlFilesMap;
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
            Map<String, String> sqlFilesMap,
            Configuration configuration,
            ConnectionStatus connectionStatus,
            AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> databaseHelper,
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
        this.sqlFilesMap = sqlFilesMap;
        this.configuration = configuration;
        this.sessionFactory = null;
        this.connectionStatus = connectionStatus;
        this.databaseHelper = databaseHelper;

        log.info("Initialized DatabaseBindingService");
        log.atDebug().setMessage("Root class: {}").addArgument(() -> rootClass.getName()).log();
        log.atDebug().setMessage("Feature class: {}").addArgument(() -> featureClass.getName()).log();
        log.atDebug().setMessage("TimeSlice class: {}").addArgument(() -> timeSliceClass.getName()).log();
        log.atDebug().setMessage("Object class: {}").addArgument(() -> objectClass.getName()).log();
        log.atDebug().setMessage("CoreResourceAnchorsClass: {}").addArgument(() -> CoreResourceAnchorsClass.getName()).log();
        log.atDebug().setMessage("AIXMResourceAnchorsClass: {}").addArgument(() -> AIXMResourceAnchorsClass.getName()).log();
        log.atDebug().setMessage("SQL Pre-Init Path: {}").addArgument(() -> sqlPreInitPath).log();
        log.atDebug().setMessage("SQL Post-Init Path: {}").addArgument(() -> sqlPostInitPath).log();

    }

    public void setUrl(String url) {
        this.configuration.setProperty("hibernate.connection.url", url);
    }

    public String getUrl() {
        return this.configuration.getProperty("hibernate.connection.url");
    }

    public void setUsername(String username) {
        this.configuration.setProperty("hibernate.connection.username", username);
    }

    public String getUserName() {
        return this.configuration.getProperty("hibernate.connection.username");
    }

    public void setPassword(String password) {
        this.configuration.setProperty("hibernate.connection.password", password);
    }

    public boolean SetCredentials(String url, String username, String password, String hbm2ddl) {
        this.setUrl(url);
        this.setUsername(username);
        this.setPassword(password);
        this.setHbm2ddl(hbm2ddl);

        log.atDebug().setMessage("Database credentials set: URL={}, Username={}, hbm2ddl={}").addArgument(() -> url).addArgument(() -> username).addArgument(() -> hbm2ddl).log();

        try {
            Class.forName("org.postgresql.Driver");

            try (java.sql.Connection conn = java.sql.DriverManager.getConnection(url, username, password)) {
                return true;
            }
        } catch (java.lang.ClassNotFoundException e) {
            throw new RuntimeException("PostgreSQL JDBC Driver not found. Please check your dependencies.", e);
        } catch (java.sql.SQLException e) {
            throw new RuntimeException("Database connection error. Please check your credentials and database status.", e);
        }
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
        if (this.sessionFactory == null) {
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
            throw new RuntimeException("Error executing statistics queries", e);
        }

        // Format and return the result string
        return new String("F: " + featureCount + " / T: " + timeSliceCount);
    }

    public String inputStreamToSQL(InputStream inputStream) {
        try {
            String string = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8).lines()
                    .collect(Collectors.joining("\n"));
            return string;
        } catch (Exception e) {
            throw new RuntimeException("Error reading SQL resource stream", e);
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
                throw new IllegalArgumentException("Unknown hbm2ddl.auto value: " + hbm2ddlAuto);
        }
    }

    /**
     * Initializes the Hibernate session factory and executes the pre-initialization and post-initialization SQL scripts. 
     * The behavior of this method is determined by the value of the "hibernate.hbm2ddl.auto" property in the configuration.
     * Cases:
     * - "create", "create-only", "create-drop": Executes the pre-initialization SQL script, builds the session factory, and then executes the post-initialization SQL script.
     * - "none", "drop", "validate", "update": Only builds the session factory without executing any SQL scripts.
     */
    public void startup(boolean withDomainCheck) {
        try {
            String hbm2ddl = this.configuration.getProperty("hibernate.hbm2ddl.auto");
            log.atDebug().setMessage("Starting up with Hbm2ddl: {} | Domain Check Option: {}")
                .addArgument(hbm2ddl)
                .addArgument(withDomainCheck)
                .log();
            switch (hbm2ddl) {
                case "create":
                case "create-only":
                case "create-drop":
                    this.executeSQLScript(this.sqlPreInit);
                    if (withDomainCheck){
                        String sql = this.inputStreamToSQL(this.AIXMResourceAnchorsClass.getResourceAsStream(this.sqlFilesMap.get("domain_check")));
                        this.executeSQLScript(sql);
                    } else {
                        String sql = this.inputStreamToSQL(this.AIXMResourceAnchorsClass.getResourceAsStream(this.sqlFilesMap.get("domain_checkless")));
                        this.executeSQLScript(sql);
                    }

                    this.sessionFactory = configuration.buildSessionFactory();
                    String sql = this.inputStreamToSQL(this.AIXMResourceAnchorsClass.getResourceAsStream(this.sqlFilesMap.get("postgresql_comments")));
                    this.executeSQLScript(sql);
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
            throw new RuntimeException("Error initializing Hibernate session factory", e);
        }
    }

    /**
     * Inspects the persisted messages in the database.
     */
    public void persistedMessageinspection() {
        if (this.sessionFactory == null) {
            throw new IllegalArgumentException("sessionfactory is not init");
        }
        this.databaseHelper.persistedMessageinspection(this.sessionFactory);
    }

    /**
     * Executes a single SQL query (typically SELECT) and maps the results to a List
     * of objects.
     * @param <T>    The type of object to map the results to.
     * @param sql    The single SQL SELECT query to execute.
     * @param mapper The RowMapper functional interface to handle per-row mapping
     *               logic.
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
            String errorMsg = String.format("SQL Error [State: %s, Code: %d]: %s", e.getSQLState(), e.getErrorCode(), e.getMessage());
            throw new RuntimeException(errorMsg, e);
        } catch (UnsupportedOperationException e) {
            throw new RuntimeException("Database connection error.", e);
        }

        return results;
    }

    /**
     * Executes a custom SQL script
     * @param sql The SQL script to execute. Can contain multiple statements
     *            separated by semicolons. If it contains a PostgreSQL DO block, it
     *            will be executed as a single statement.
     * @throws RuntimeException if there is an error during script execution or if the PostgreSQL JDBC driver is not found.
     */
    private void executeSQLScript(String sql) {
        if (sql == null || sql.isBlank()) {
            return;
        }

        try {
            Class.forName("org.postgresql.Driver");

            try (Connection conn = getConnection();
                Statement stmt = conn.createStatement()) {
                
                stmt.execute(sql);

                log.info("SQL script executed successfully.");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("PostgreSQL JDBC Driver not found. Please check your dependencies.", e);
        } catch (SQLException e) {
            String errorMsg = String.format("SQL Error [State: %s, Code: %d]: %s", e.getSQLState(), e.getErrorCode(), e.getMessage());
            throw new RuntimeException(errorMsg, e);
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error during script execution.", e);
        }
    }

    /**
     * Shuts down the Hibernate session factory and releases all associated resources.
     */
    public void shutdown() {
        this.sessionFactory.close();
    }

    /**
     * Persists the provided message object into the database. The message should be of type ROOT.
     * @param message The message object to be persisted into the database.
     * @throws IllegalArgumentException if the session factory is not initialized.
     */
    public void persist(ROOT message) {
        if (this.sessionFactory == null) {
            throw new IllegalArgumentException("sessionfactory is not init");
        }

        this.databaseHelper.persist(message, this.sessionFactory);
    }

    /**
     * Extracts an object of type ROOT from the database based on the provided structure and ID.
     * @param structure The class type of the structure to extract.
     * @param id The ID of the object to extract.
     * @return The extracted object, or null if not found.
     */
    public ROOT extract(Class<ROOT> structure, Object id) {
        if (this.sessionFactory == null) {
            throw new IllegalArgumentException("sessionfactory is not init");
        }

        try (Session session = this.getSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                ROOT object = session.find(structure, id);
                transaction.commit();
                return object;
            } catch (Exception e) {
                transaction.rollback();
                e.printStackTrace();
                return null;
            }
        }
    }

    /**
     * Predicates the valid timeslice for a given structure and time. Only the last timeslices before the given 
     * time are considered valid as well as the timeslices that are valid after or at the given time.
     * @param structure The class type of the structure for which the valid timeslice is to be determined.
     * @param time The time for which to determine the valid timeslice.
     * @return The valid timeslice for the given structure and time.
     */
    public ROOT predicateValidTimeslice(Class<ROOT> structure, Instant time) {
        if (this.sessionFactory == null) {
            throw new IllegalArgumentException("Sessionfactory is not init");
        }

        // collect relevant tiemeslice property ids
        Session session = sessionFactory.openSession();
        InputStream TPIdsStream = this.AIXMResourceAnchorsClass.getResourceAsStream(this.sqlFilesMap.get("query_time_slice_property_ids"));
        if (TPIdsStream == null) {
            throw new IllegalStateException("TimeSliceProperty predicate script not found");
        }
        String TPIdsSQL = this.inputStreamToSQL(TPIdsStream);
        Transaction TPIdsTX = session.beginTransaction();
        List<Long> TPIds = session.createNativeQuery(TPIdsSQL, Long.class).setParameter("time", time).getResultList();
        TPIdsTX.commit();

        // collect relevant basic message memebers ids
        InputStream BMMIdsStream = this.AIXMResourceAnchorsClass.getResourceAsStream(this.sqlFilesMap.get("query_basic_message_member_ids"));
        if (BMMIdsStream == null) {
            throw new IllegalStateException("TimeSliceProperty predicate script not found");
        }
        String BMMIdsSQL = this.inputStreamToSQL(BMMIdsStream);
        Transaction BMMIdsTX = session.beginTransaction();
        List<Long> BMMIds = session.createNativeQuery(BMMIdsSQL, Long.class).setParameter("time", time).getResultList();
        BMMIdsTX.commit();

        return this.databaseHelper.predicateValidTimeslice(BMMIds, TPIds, this.sessionFactory);
    }

    /**
     * Merges the provided message into the database.
     * @param message The message object to be merged into the database. It should be of type ROOT.
     * @throws IllegalArgumentException if the session factory is not initialized.
     */
    public void merge(ROOT message) {
        if (this.sessionFactory == null) {
            throw new IllegalArgumentException("Sessionfactory is not init");
        }

        this.databaseHelper.merge(message, this.sessionFactory);
    }

    /**
     * Integrates the provided message into the database
     * @param message The message object to be integrated into the database. It should be of type ROOT.
     * @throws IllegalArgumentException if the session factory is not initialized.
     */
    public void integrate(ROOT message) {
        if (this.sessionFactory == null) {
            throw new IllegalArgumentException("Sessionfactory is not init");
        }

        this.databaseHelper.merge(message, this.sessionFactory);
    }
}
