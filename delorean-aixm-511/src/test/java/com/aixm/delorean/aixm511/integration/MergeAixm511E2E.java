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
    Container<?,?,?,?> container;
    PostgreSQLContainer postgis = new PostgreSQLContainer(DockerImageName.parse("postgis/postgis:16-3.4-alpine").asCompatibleSubstituteFor("postgres"));

    @Test
    @Order(1)
    void startPostgreSQLContainer() {
        postgis.start();
    }

    @Test
    @Order(10)
    void configDeloreanCore() {

        // given
        container = AIXM511.newContainer();

        // container is successfully created
        assertThat(container).isNotNull();
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
    @Order(50)
    void persisteData() {

        // given

        // do
        container.persist();
        
        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(60)
    void databaseExtract() {

        // do
        container.predicate("2022-01-01T00:00:00Z");

        // check that
    }


    @Test
    @Order(70)
    void extractExtractedXml() {

        // given
        String xmlPath = "src/test/resources/roundtrip/donlon-predicated.xml.log";

        // do
        container.marshal(xmlPath);
    } 


}
