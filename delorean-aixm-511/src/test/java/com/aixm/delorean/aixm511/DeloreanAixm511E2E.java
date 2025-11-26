package com.aixm.delorean.aixm511;

import org.junit.jupiter.api.*;

import com.aixm.delorean.core.DeloreanConfig;
import com.aixm.delorean.core.Delorean;
import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.core.configuration.StructureConfig;
import com.aixm.delorean.core.database.DatabaseBinding;
import com.aixm.delorean.core.database.DatabaseConfig;
import com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType;
import com.aixm.delorean.core.xml.XMLBinding;
import com.aixm.delorean.core.xml.XMLConfig;

import static org.assertj.core.api.Assertions.*;

import java.util.Scanner;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DeloreanAixm511E2E {
    
    String id;
    ContainerWarehouse<?,?> warehouse;
    
    @Test
    @Order(10)
    void configDeloreanCore() {

        // given
        DeloreanConfig config = new DeloreanConfig(
            "AIXM 5.1.1",
            com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType.class,
            com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType.class,
            new javax.xml.namespace.QName("http://www.aixm.aero/schema/5.1.1", "AIXMBasicMessage"),
            "schema/message/AIXM_BasicMessage.xsd",
            "/postgrsql/pre-init.sql",
            "/postgrsql//post-init.sql",
            "/hibernate/hibernate.cfg.xml"
        );

        // do
        warehouse = Delorean.initContainerWarehouse(config);

        // container is successfully created
        assertThat(warehouse).isNotNull();

        // warehouse contains one container
        assertThat(warehouse.getLastUsedContainer()).isNotNull();
        assertThat(warehouse.getLastUsedContainerId()).isNotNull();
        id = warehouse.getLastUsedContainerId();

        // container is searchable by its id
        assertThat(warehouse.getContainerById(id)).isEqualTo(warehouse.getLastUsedContainer());

        // container is correctly configured
        assertThat(warehouse.getLastUsedContainer().getRoot()).isEqualTo(com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType.class);
        assertThat(warehouse.getLastUsedContainer().getFeature()).isEqualTo(com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType.class);

        // container has XML binding
        XMLBinding<?,?> xmlBinding = warehouse.getLastUsedContainer().getXmlBinding();
        assertThat(xmlBinding).isNotNull();

        // ciontainer has Database binding
        DatabaseBinding<?,?> dbBinding = warehouse.getLastUsedContainer().getDatabaseBinding();
        assertThat(dbBinding).isNotNull();
    }
    
    @Test
    @Order(20)
    void loadXml(){

        // given 
        String xmlPath = "delorean-aixm-511/src/test/xml/donlon-in.xml";

        // do
        warehouse.getContainerById(id).unmarshal(xmlPath);

    }

    @Test
    @Order(30)
    void extractMarshalledXml() {

        // given
        String xmlPath = "delorean-aixm-511/src/test/xml/donlon-marshalled.xml";

        // do
        warehouse.getContainerById(id).marshal(xmlPath);
    }

    @Test
    @Order(40)
    void establishConnection() {

        // given
        warehouse.getContainerById(id).getDatabaseBinding().setUrl("jdbc:postgresql://localhost:5432/aixm_5_1_1");
        warehouse.getContainerById(id).getDatabaseBinding().setUsername("postgres");
        warehouse.getContainerById(id).getDatabaseBinding().setPassword("postgres");
        warehouse.getContainerById(id).getDatabaseBinding().setHbm2ddl("create");

        // do
        warehouse.getContainerById(id).startup();

        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(40)
    void persisteData() {

        // given

        // do
        warehouse.getContainerById(id).persist();
        
        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(50)
    void databaseExtract() {

        // do
        warehouse.getContainerById(id).extract(1);

        // check that
    }


    @Test
    @Order(60)
    void extractExtractedXml() {

        // given
        String xmlPath = "delorean-aixm-511/src/test/xml/donlon-extracted.xml";

        // do
        warehouse.getContainerById(id).marshal(xmlPath);
    } 

    
}
