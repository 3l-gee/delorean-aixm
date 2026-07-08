package com.delorean.aixm.aixm52.integration;

import org.junit.jupiter.api.*;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

import com.delorean.aixm.aixm52.DeloreanAIXM52;
import com.delorean.aixm.aixm52.engine.Aixm52Engine;
import com.delorean.aixm.core.container.Container;
import com.delorean.aixm.core.context.ContextWarehouse;
import com.delorean.aixm.core.database.DatabaseBindingService;
import com.delorean.aixm.core.xml.XmlBindingService;

import static org.assertj.core.api.Assertions.*;

/*
Simple lifecycle test for AIXM 5.1.1 Delorean container 
    - unmarshal XML
    - establish connection to DB
    - persist data to DB
    - extract data from DB
    - marshal XML
*/
@Disabled("Until a AIXM 5.2 dataset is published")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RoundTripZipAixm52E2E {
    
    String id;
    Container<?,?,?,?,?,?> container;
    DeloreanAIXM52 delorean;
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
        delorean = new DeloreanAIXM52();

        // delorean is successfully created
        assertThat(delorean).isNotNull();
    }

    @Test
    @Order(3)
    void setContext() {

        //given
        delorean.setContext("RoundTripZipAixm52E2E");

        // context is successfully created
        ContextWarehouse.getInstance().getActiveInfo();

        // context is correctly set
        assertThat(ContextWarehouse.getInstance().getActive().getDescription()).isEqualTo("RoundTripZipAixm52E2E");

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
        assertThat(container.getRootClass()).isEqualTo(com.delorean.aixm.aixm52.schema.message.AIXMBasicMessageType.class);
        assertThat(container.getFeatureClass()).isEqualTo(com.delorean.aixm.aixm52.schema.AbstractAIXMFeatureType.class);
        assertThat(container.getTimeSliceClass()).isEqualTo(com.delorean.aixm.aixm52.schema.AbstractAIXMTimeSliceType.class);
        assertThat(container.getObjectClass()).isEqualTo(com.delorean.aixm.aixm52.schema.AbstractAIXMObjectType.class);

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
        String xmlPath = "src/test/resources/roundtrip/donlon.zip";

        // do
        container.unmarshal(xmlPath);

    }

    @Test
    @Order(30)
    void info(){
        // do
        container.temporalityInspection();
    }

    @Test
    @Order(40)
    void extractMarshalledXml() {

        // given
        String xmlPath = "src/test/resources/roundtrip/donlon-marshalled.xml.log";

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
        String xmlPath = "src/test/resources/roundtrip/donlon-extracted.xml.log";

        // do
        container.marshal(xmlPath);
    } 

    
}
