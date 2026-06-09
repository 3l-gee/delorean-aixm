package com.aixm.delorean.aixm52.integration;

import org.junit.jupiter.api.*;
import org.testcontainers.containers.Container.ExecResult;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

import com.aixm.delorean.aixm52.DeloreanAIXM52;
import com.aixm.delorean.aixm52.engine.Aixm52Engine;
import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.context.ContextWarehouse;
import com.aixm.delorean.core.database.DatabaseBindingService;
import com.aixm.delorean.core.xml.XmlBindingService;

import static org.assertj.core.api.Assertions.*;

/*
Simple lifecycle test for AIXM 5.1.1 Delorean container 
    - unmarshal XML
    - establish connection to DB
    - persist data to DB
    - extract data from DB
    - marshal XML
*/
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RoundTripXmlAixm52E2E {
    
    String id;
    Container<?,?,?,?,?,?> container;
    DeloreanAIXM52 delorean;
    PostgreSQLContainer postgis = new PostgreSQLContainer(DockerImageName.parse("postgis/postgis:16-3.4-alpine")
        .asCompatibleSubstituteFor("postgres"))
        .withCommand("postgres", 
        "-c", "shared_preload_libraries=pg_stat_statements", 
        "-c", "pg_stat_statements.track=all");
    DeloreanAIXM52 deloreanAIXM52 = new DeloreanAIXM52();

    @Test
    @Order(1)
    void startPostgreSQLContainer() throws Exception {
        postgis.start();

        // Enable the extension immediately after start
        try (Connection conn = DriverManager.getConnection(
                postgis.getJdbcUrl(), postgis.getUsername(), postgis.getPassword())) {
            try (Statement stmt = conn.createStatement()) {
                stmt.execute("CREATE EXTENSION IF NOT EXISTS pg_stat_statements;");
            }
        }
    }

    @Test
    @Order(2)
    void setDelorean() {

        //given
        delorean = new DeloreanAIXM52();

        // delorean is successfully created
        assertThat(delorean).isNotNull();
    }

    @Test
    @Order(3)
    void setContext() {

        //given
        delorean.setContext("RoundTripXmlAixm52E2E");

        // context is successfully created
        ContextWarehouse.getInstance().getActiveInfo();

        // context is correctly set
        assertThat(ContextWarehouse.getInstance().getActive().getDescription()).isEqualTo("RoundTripXmlAixm51E2E");

        // context has a non-null hash
        assertThat(ContextWarehouse.getActiveSalt()).isNotNull();

    }
    
    @Test
    @Order(10)
    void configDeloreanCore() {

        // given
        container = delorean.createNewContainer();

        // container is successfully created
        assertThat(container).isNotNull();

        // container is correctly configured
        assertThat(container.getRootClass()).isEqualTo(com.aixm.delorean.aixm52.schema.message.AIXMBasicMessageType.class);
        assertThat(container.getFeatureClass()).isEqualTo(com.aixm.delorean.aixm52.schema.AbstractAIXMFeatureType.class);
        assertThat(container.getTimeSliceClass()).isEqualTo(com.aixm.delorean.aixm52.schema.AbstractAIXMTimeSliceType.class);
        assertThat(container.getObjectClass()).isEqualTo(com.aixm.delorean.aixm52.schema.AbstractAIXMObjectType.class);

        // container has XML binding
        XmlBindingService<?,?> xmlBinding = container.getXmlBinding();
        assertThat(xmlBinding).isNotNull();

        // ciontainer has Database binding
        DatabaseBindingService<?,?,?,?> dbBinding = container.getDatabaseBinding();
        assertThat(dbBinding).isNotNull();

        // container has Delorean engine
        Aixm52Engine deloreanEngine = (Aixm52Engine) container.getDeloreanEngine();
        assertThat(deloreanEngine).isNotNull();
    }
    
    @Test
    @Order(20)
    void loadXml(){

        // given 
        String xmlPath = "src/test/resources/roundtrip/donlon.xml";

        // do
        container.unmarshal(xmlPath);

    }

    @Test
    @Order(30)
    void info(){
        // do
        container.info();
    }

    @Test
    @Order(40)
    void extractMarshalledXml() {

        // given
        String xmlPath = "src/test/java/com/aixm/delorean/aixm52/out/donlon-marshalled.xml.log";

        // do
        container.marshal(xmlPath);
    }

    @Test
    @Order(50)
    void establishConnection() {

        // given
        container.getDatabaseBinding().setUrl(postgis.getJdbcUrl());
        container.getDatabaseBinding().setUsername(postgis.getUsername());
        container.getDatabaseBinding().setPassword(postgis.getPassword());
        container.getDatabaseBinding().setHbm2ddl("create");

        // do
        container.startup();

        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(51)
    void resetPgStatStatements() {
        String query = "SELECT pg_stat_statements_reset();";

        //do
        try {
            postgis.execInContainer(
                "psql", "-U", postgis.getUsername(), 
                "-d", postgis.getDatabaseName(), 
                "-c", query
            );

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Failed to reset pg_stat_statements query", e);
        }
    }


    @Test
    @Order(60)
    void persisteData() {

        // given

        // do
        container.persist();
        
        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(70)
    void databaseExtract() {

        // do
        container.predicate("2022-01-01T00:00:00Z");

        // check that
    }


    @Test
    @Order(80)
    void extractExtractedXml() {

        // given
        String xmlPath = "src/test/java/com/aixm/delorean/aixm52/out/donlon-predicated.xml.log";

        // do
        container.marshal(xmlPath);
    } 

    @Test
    @Order(90)
    void dumpDatabaseSchema() {

        // do
        ExecResult result;
        try {
            result = postgis.execInContainer(
                "pg_dump",
                "--schema-only",
                "--no-owner",
                "--no-privileges",
                "--no-comments",
                "-U", postgis.getUsername(),
                postgis.getDatabaseName()
            );
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Failed to execute pg_dump", e);
        }


        if (result.getExitCode() != 0) {
            throw new IllegalStateException(
                "pg_dump failed:\n" + result.getStderr()
            );
        }

        Path outDir = Paths.get(
            "src/test/java/com/aixm/delorean/aixm52/out"
        );

        Path schemaFile = outDir.resolve("aixm-52-schema.sql");

        try {
            Files.createDirectories(outDir);
            Files.writeString(
                schemaFile,
                result.getStdout(),
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
            );
        } catch (IOException e) {
            throw new RuntimeException("Failed to write schema dump", e);
        }
    }

    @Test
    @Order(100)
    void dumpDatabaseData() {

        // do
        ExecResult result;
        try {
            result = postgis.execInContainer(
                "pg_dump",
                "--data-only",
                "--no-owner",
                "--no-privileges",
                "--no-comments",
                "-U", postgis.getUsername(),
                postgis.getDatabaseName()
            );
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Failed to execute pg_dump", e);
        }


        if (result.getExitCode() != 0) {
            throw new IllegalStateException(
                "pg_dump failed:\n" + result.getStderr()
            );
        }

        Path outDir = Paths.get(
            "src/test/java/com/aixm/delorean/aixm52/out"
        );

        Path dataFile = outDir.resolve("roundtrip-data.sql");

        try {
            Files.createDirectories(outDir);
            Files.writeString(
                dataFile,
                result.getStdout(),
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
            );
        } catch (IOException e) {
            throw new RuntimeException("Failed to write data dump", e);
        }
    }

    @AfterAll
    void exportPgStatStatements() {
        Path outDir = Paths.get("src/test/java/com/aixm/delorean/aixm52/out");
        Path pgStatFile = outDir.resolve("pg_stat_statements.log");
        String query = "SELECT query, calls, total_exec_time FROM pg_stat_statements ORDER BY total_exec_time DESC LIMIT 100;";

        ExecResult result;

        //do
        try {
            Files.createDirectories(outDir);

            result = postgis.execInContainer(
                "psql", "-U", postgis.getUsername(), 
                "-d", postgis.getDatabaseName(), 
                "-c", query
            );

            if (result.getExitCode() != 0) {
                throw new RuntimeException("Postgres command failed: " + result.getStderr());
            }

            Files.writeString(pgStatFile, result.getStdout());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Failed to execute pg_stat_statements query", e);
        }
    }
}
