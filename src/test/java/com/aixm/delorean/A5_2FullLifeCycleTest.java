package com.aixm.delorean;

import org.junit.jupiter.api.*;

import com.aixm.delorean.core.configuration.StructureConfig;
import com.aixm.delorean.core.database.DatabaseBinding;
import com.aixm.delorean.core.database.DatabaseConfig;
import com.aixm.delorean.core.container.ContainerFactory;

import static org.assertj.core.api.Assertions.*;

import java.util.Scanner;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class A5_2FullLifeCycleTest {

    private Main app;
    private Scanner scanner;
    private String containerID;

    @BeforeAll
    void setUp() {
        app = new Main();
    }

    @Test
    @Order(1)
    void Container() {

        // given
        StructureConfig strctConfig = StructureConfig.AIXM_5_2;

        // do
        app.containerWarehouse.addContainer(ContainerFactory.createContainer(strctConfig));

        // when
        containerID = app.containerWarehouse.getLastContainerId();

        // check that 
        // id is created
        assertThat(containerID).isNotNull();

        // container is in the warehouse
        assertThat(app.containerWarehouse.getIds()).contains(containerID);

        // the container is of the right structure
        assertThat(app.containerWarehouse.getContainer(containerID).getStructure()).isEqualTo("com.aixm.delorean.core.schema.a5_2.aixm.message.AIXMBasicMessageTyp");
    }

    @Test
    @Order(2)
    //TODO change to psql testcontainers
    void DatabaseBinding() {

        // given
        DatabaseConfig dbConfig = DatabaseConfig.A5_2;
        DatabaseBinding dbBinding = new DatabaseBinding(dbConfig);

        // do
        app.containerWarehouse.getContainer(containerID).setDbBiding(dbBinding);
        app.containerWarehouse.getContainer(containerID).databaseBinding.setUrl("jdbc:postgresql://localhost:5432/test");
        app.containerWarehouse.getContainer(containerID).databaseBinding.setUsername("postgres");
        app.containerWarehouse.getContainer(containerID).databaseBinding.setPassword("postgres");
        app.containerWarehouse.getContainer(containerID).databaseBinding.setHbm2ddl("create");

        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(3)
    //TODO change to psql testcontainers
    void DatabaseStartup() {

        // do
        app.containerWarehouse.getContainer(containerID).databaseBinding.startup();

        // check that 
    }
}
