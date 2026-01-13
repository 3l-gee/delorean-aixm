package com.aixm.delorean.aixm511.integration;

import org.junit.jupiter.api.*;
import org.testcontainers.utility.DockerImageName;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.xmlunit.assertj.XmlAssert;

import com.aixm.delorean.aixm511.AIXM511;
import com.aixm.delorean.aixm511.engine.Aixm511Engine;
import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.database.DatabaseBindingService;
import com.aixm.delorean.core.xml.XmlBindingService;

import static org.assertj.core.api.Assertions.*;

import java.io.File;

/*
<
*/
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MergeAixm511E2E {

    String id;
    Container<?,?,?,?> AContainer;
    Container<?,?,?,?> BContainer;
    PostgreSQLContainer postgis = new PostgreSQLContainer(DockerImageName.parse("postgis/postgis:16-3.4-alpine").asCompatibleSubstituteFor("postgres"));

    @Test
    @Order(1)
    void startPostgreSQLContainer() {
        postgis.start();
    }

    @Test
    @Order(10)
    void configAContainerDeloreanCore() {

        // given
        AContainer = AIXM511.newContainer();

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
        BContainer = AIXM511.newContainer();

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


}
