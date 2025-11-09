package com.aixm.delorean;

import org.junit.jupiter.api.*;

import com.aixm.delorean.core.configuration.StructureConfig;
import com.aixm.delorean.core.database.DatabaseBinding;
import com.aixm.delorean.core.database.DatabaseConfig;
import com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType;
import com.aixm.delorean.core.xml.XMLBinding;
import com.aixm.delorean.core.xml.XMLConfig;
import com.aixm.delorean.core.container.ContainerFactory;

import static org.assertj.core.api.Assertions.*;

import java.util.Scanner;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Aixm5_1_1E2E {

    private Main app;
    private Scanner scanner;
    private String containerID;

    @BeforeAll
    void setUp() {
        org.assertj.core.api.Assertions.setMaxStackTraceElementsDisplayed(0);
        app = new Main();
    }

    @Test
    @Order(10)
    void container() {

        // given
        StructureConfig strctConfig = StructureConfig.AIXM_5_1_1;

        // do
        app.containerWarehouse.addContainer(ContainerFactory.createContainer(strctConfig));
        containerID = app.containerWarehouse.getLastContainerId();

        // check that 
        // id is created
        assertThat(containerID).isNotNull();

        // container is in the warehouse
        assertThat(app.containerWarehouse.getIds()).contains(containerID);

        // the container is of the right structure
        assertThat(app.containerWarehouse.getContainer(containerID).getStructure()).isEqualTo(AIXMBasicMessageType.class);
    }

    @Test
    @Order(20)
    void xmlBinding() {

        // given
        XMLConfig xmlConfig = XMLConfig.AIXM_5_1_1;
        StructureConfig strctConfig = StructureConfig.AIXM_5_1_1;

        // do
        XMLBinding<?> binding = new XMLBinding<>(xmlConfig, app.containerWarehouse.getContainer(containerID).getStructure());
        app.containerWarehouse.getContainer(containerID).setXmlBinding(binding);

        // check that
        // the generated jaxb marshaller is of the right structure
        assertThat(app.containerWarehouse.getContainer(containerID).xmlBinding.getMarshaller().getSchema()).isEqualTo(xmlConfig.getSchema());

        // the generated jaxb unmarshaller is of the right structure
        assertThat(app.containerWarehouse.getContainer(containerID).xmlBinding.getMarshaller().getSchema()).isEqualTo(xmlConfig.getSchema());
    }

    // @Test
    // @Order(30)
    // void loadXml() {

    //     // given
    //     String xmlPath = "src/test/xml/a5_2/xml-in.xml";

    //     // do
    //     app.containerWarehouse.getContainer(containerID).unmarshal(xmlPath);
    // }

    // @Test
    // @Order(40)
    // void extractXml() {

    //     // given
    //     String xmlPath = "src/test/xml/a5_2/xml-out.xml";

    //     // do
    //     app.containerWarehouse.getContainer(containerID).marshal(xmlPath);
    // }

    @Test
    @Order(50)
    //TODO change to psql testcontainers
    void databaseBinding() {

        // given
        DatabaseConfig dbConfig = DatabaseConfig.AIXM_5_1_1;
        DatabaseBinding dbBinding = new DatabaseBinding(dbConfig);

        // do
        app.containerWarehouse.getContainer(containerID).setDbBiding(dbBinding);
        app.containerWarehouse.getContainer(containerID).databaseBinding.setUrl("jdbc:postgresql://localhost:5432/aixm_5_1_1");
        app.containerWarehouse.getContainer(containerID).databaseBinding.setUsername("postgres");
        app.containerWarehouse.getContainer(containerID).databaseBinding.setPassword("postgres");
        app.containerWarehouse.getContainer(containerID).databaseBinding.setHbm2ddl("create");

        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(60)
    //TODO change to psql testcontainers
    void databaseStartup() {

        // do
        app.containerWarehouse.getContainer(containerID).databaseBinding.startup();

        // check that 
    }

    @Test
    @Order(70)
    //TODO change to psql testcontainers
    void DatabaseLoad() {

        // do
        app.containerWarehouse.getContainer(containerID).loadDB();

        // check that 
    }
}
