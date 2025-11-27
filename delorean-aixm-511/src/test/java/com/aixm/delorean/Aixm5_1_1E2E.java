package com.aixm.delorean;

import org.jboss.jandex.Main;
import org.junit.jupiter.api.*;

import com.aixm.delorean.aixm511.Delorean;
import com.aixm.delorean.aixm511.DeloreanConfig;
import com.aixm.delorean.aixm511.container.ContainerWarehouse;

import com.aixm.delorean.aixm511.configuration.StructureConfig;
import com.aixm.delorean.aixm511.database.DatabaseBinding;
import com.aixm.delorean.aixm511.database.DatabaseConfig;
import com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType;
import com.aixm.delorean.aixm511.xml.XMLBinding;
import com.aixm.delorean.aixm511.xml.XMLConfig;

import static org.assertj.core.api.Assertions.*;

import java.util.Scanner;

import javax.xml.validation.SchemaFactory;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Aixm5_1_1E2E {

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
            com.aixm.delorean.aixm511.schema.message.ObjectFactory.class,
            com.aixm.delorean.aixm511.schema.ObjectFactory.class,
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
        String xmlPath = "src\\test\\resources\\donlon-in.xml";

        // do
        warehouse.getContainerById(id).unmarshal(xmlPath);

    }

    @Test
    @Order(30)
    void extractMarshalledXml() {

        // given
        String xmlPath = "src\\test\\resources\\donlon-marshalled.xml";

        // do
        warehouse.getContainerById(id).marshal(xmlPath);
    }



    // @Test
    // @Order(50)
    // void databaseBinding() {

    //     // given
    //     DatabaseConfig dbConfig = DatabaseConfig.AIXM_5_1_1;

    //     // do
    //     app.containerWarehouse.getContainer(containerID).setDatabaseBinding(dbConfig);
    //     app.containerWarehouse.getContainer(containerID).databaseBinding.setUrl("jdbc:postgresql://localhost:5432/aixm_5_1_1");
    //     app.containerWarehouse.getContainer(containerID).databaseBinding.setUsername("postgres");
    //     app.containerWarehouse.getContainer(containerID).databaseBinding.setPassword("postgres");
    //     app.containerWarehouse.getContainer(containerID).databaseBinding.setHbm2ddl("create");

    //     // check that 
    //     // the dbconfig is of the right dbconfig 
    //     // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    // }

    // @Test
    // @Order(60)
    // void databaseStartup() {

    //     // do
    //     app.containerWarehouse.getContainer(containerID).startDatabaseConnection();

    //     // check that 
    // }

    // @Test
    // @Order(70)
    // void databasePersist() {

    //     // do
    //     app.containerWarehouse.getContainer(containerID).persist();

    //     // check that 
    // }


    // @Test
    // @Order(80)
    // void databaseExtract() {

    //     // do
    //     app.containerWarehouse.getContainer(containerID).extract(1);

    //     // check that
    // }

    // @Test
    // @Order(90)
    // void extractExtractedXml() {

    //     // given
    //     String xmlPath = "src/test/xml/a5_1_1/donlon-extract.xml";

    //     // do
    //     app.containerWarehouse.getContainer(containerID).marshal(xmlPath);
    // } 


}
