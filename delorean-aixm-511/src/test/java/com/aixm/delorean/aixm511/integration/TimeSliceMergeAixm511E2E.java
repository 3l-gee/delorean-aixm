package com.aixm.delorean.aixm511.integration;

import org.junit.jupiter.api.*;

import com.aixm.delorean.aixm511.AIXM511;
import com.aixm.delorean.aixm511.engine.Aixm511Engine;
import com.aixm.delorean.core.CoreConfig;
import com.aixm.delorean.core.Delorean;
import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.core.database.DatabaseBindingService;
import com.aixm.delorean.core.xml.XmlBindingService;

import static org.assertj.core.api.Assertions.*;

/*
Merge lifecycle test for AIXM 5.1.1 Delorean container
    - unmarshal firt XML
    - establish connection to DB
    - persist data to DB
    - unmarshal second XML
    - establish connection to DB
    - merge second data into first data
    - extract data from DB
    - marshal XML
*/
@Disabled
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TimeSliceMergeAixm511E2E {

    String id;
    Container<?,?,?,?> FirstContainer;
    Container<?,?,?,?> SecondContainer;
    
    @Test
    @Order(10)
    void configDeloreanCoreFirstContainer() {

        // given
        FirstContainer = AIXM511.container();

        // container is successfully created
        assertThat(FirstContainer).isNotNull();
    }

    @Test
    @Order(20)
    void loadXmlFirstContainer(){

        // given 
        String xmlPath = "src\\test\\resources\\xml\\timeslice-merge-first.xml";
        

        // do
        FirstContainer.unmarshal(xmlPath);

    }

    @Test
    @Order(30)
    void establishConnectionFirstContainer() {

        // given
        FirstContainer.getDatabaseBinding().setUrl("jdbc:postgresql://localhost:5432/aixm_5_1_1");
        FirstContainer.getDatabaseBinding().setUsername("postgres");
        FirstContainer.getDatabaseBinding().setPassword("postgres");
        FirstContainer.getDatabaseBinding().setHbm2ddl("create");

        // do
        FirstContainer.startup();
    }

    @Test
    @Order(40)
    void persisteDataFirstContainer() {

        // given

        // do
        FirstContainer.persist();
    }



    @Test
    @Order(50)
    void loadXmlSecondContainer(){

        // given 
        String xmlPath = "src\\test\\resources\\xml\\timeslice-merge-second.xml";

        // do
        FirstContainer.unmarshal(xmlPath);

    }


    @Test
    @Order(60)
    void persisteDataSecondContainer() {

        // given

        // do
        FirstContainer.merge();
        
        // check that 
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }

    @Test
    @Order(70)
    void databaseExtract() {

        // do
        FirstContainer.extract(1);

        // check that
    }

    @Test
    @Order(80)
    void extractExtractedXml() {

        // given
        String xmlPath = "src\\test\\resources\\xml\\timeslice-merged.xml.log";

        // do
        FirstContainer.marshal(xmlPath);
    } 

    @Test
    @Order(90)
    void shutdownSecondContainer() {

        // given

        // do
        FirstContainer.shutdown();
        
        // check that 1
        // the dbconfig is of the right dbconfig 
        // assertThat(app.containerWarehouse.getContainer(containerID).databaseBinding).isEqualTo(dbConfig);

    }




    
}
