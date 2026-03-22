package com.aixm.delorean.aixm511.integration;

import org.junit.jupiter.api.*;
import org.testcontainers.utility.DockerImageName;
import org.testcontainers.containers.Container.ExecResult;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.xmlunit.assertj.XmlAssert;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.aixm.delorean.aixm511.DeloreanAIXM511;
import com.aixm.delorean.aixm511.engine.Aixm511Engine;
import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.context.ContextWarehouse;
import com.aixm.delorean.core.database.DatabaseBindingService;
import com.aixm.delorean.core.xml.XmlBindingService;

import static org.assertj.core.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;

/*
<
*/
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MergeAixm511E2E {

    String id;
    DeloreanAIXM511 delorean;
    Container<?,?,?,?> AContainer;
    Container<?,?,?,?> BContainer;
    PostgreSQLContainer postgis = new PostgreSQLContainer(DockerImageName.parse("postgis/postgis:16-3.4-alpine").asCompatibleSubstituteFor("postgres"));

    @Test
    @Order(1)
    void startPostgreSQLContainer() {
        postgis.start();
    }

    @Test
    @Order(2)
    void setDelorean() {

        //given
        delorean = new DeloreanAIXM511();

        // delorean is successfully created
        assertThat(delorean).isNotNull();
    }

    @Test
    @Order(3)
    void setContext() {

        //given
        delorean.setContext("RoundTripXmlAixm511E2E","");

        // context is successfully created
        ContextWarehouse.getInstance().getActiveInfo();

        // context is correctly set
        assertThat(ContextWarehouse.getInstance().getActive().getName()).isEqualTo("RoundTripXmlAixm51E2E");

        // context has a non-null hash
        assertThat(ContextWarehouse.getActiveHash()).isNotNull();

    }

    @Test
    @Order(10)
    void configAContainerDeloreanCore() {

        // given
        AContainer = delorean.newContainer();

        // container is successfully created
        assertThat(AContainer).isNotNull();
    }

    @Test
    @Order(20)
    void loadFirstXml(){

        // given 
        String xmlPath = "src/test/resources/merge/timeslice-merge-first.xml";

        // do
        AContainer.unmarshal(xmlPath);

    }

    @Test
    @Order(30)
    void infoFirst(){
        // do
        AContainer.info();
    }

    @Test
    @Order(40)
    void establishAConnection() {

        // given
        AContainer.getDatabaseBinding().setUrl(postgis.getJdbcUrl());
        AContainer.getDatabaseBinding().setUsername(postgis.getUsername());
        AContainer.getDatabaseBinding().setPassword(postgis.getPassword());
        AContainer.getDatabaseBinding().setHbm2ddl("create");

        // do
        AContainer.startup();

        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(50)
    void persisteFirst() {

        // given

        // do
        AContainer.persist();
        
        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(60)
    void loadSecondXml(){

        // given 
        String xmlPath = "src/test/resources/merge/timeslice-merge-second.xml";

        // do
        AContainer.unmarshal(xmlPath);

    }

    @Test
    @Order(70)
    void infoSecond(){
        // do
        AContainer.info();
    }

    @Test
    @Order(80)
    void mergeSecond() {

        // given

        // do
        AContainer.merge();
        
        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(90)
    void configBContainerDeloreanCore() {

        // given
        BContainer = delorean.newContainer();

        // container is successfully created
        assertThat(BContainer).isNotNull();
    }

    @Test
    @Order(100)
    void loadThirdXml(){

        // given 
        String xmlPath = "src/test/resources/merge/timeslice-merge-third.xml";

        // do
        BContainer.unmarshal(xmlPath);

    }

    @Test
    @Order(110)
    void infoThird(){
        // do
        BContainer.info();
    }

    @Test
    @Order(120)
    void establishBConnection() {

        // given
        BContainer.getDatabaseBinding().setUrl(postgis.getJdbcUrl());
        BContainer.getDatabaseBinding().setUsername(postgis.getUsername());
        BContainer.getDatabaseBinding().setPassword(postgis.getPassword());
        BContainer.getDatabaseBinding().setHbm2ddl("none");

        // do
        BContainer.startup();

        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(130)
    void mergeThird() {

        // given

        // do
        BContainer.merge();
        
        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(140)
    void predicateAll() {

        // do
        BContainer.predicate("2022-01-01T00:00:00Z");

        // check that
    }


    @Test
    @Order(150)
    void extractAll() {

        // given
        String xmlPath = "src/test/resources/merge/timeslice-merge-all.xml.log";

        // do
        BContainer.marshal(xmlPath);
    }

    @Test
    @Order(160)
    void predicateLast() {

        // do
        BContainer.predicate("2026-06-01T00:00:00Z");

        // check that
    }


    @Test
    @Order(170)
    void extractLast() {

        // given
        String xmlPath = "src/test/resources/merge/timeslice-merge-last.xml.log";

        // do
        BContainer.marshal(xmlPath);
    } 

    @Test
    @Order(180)
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
            "src/test/java/com/aixm/delorean/aixm511/out"
        );

        Path dataFile = outDir.resolve("merge-data.sql");

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
}
