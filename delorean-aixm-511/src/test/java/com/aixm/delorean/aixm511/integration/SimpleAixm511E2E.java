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

@Disabled
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SimpleAixm511E2E {
    
    String id;
    Container<?,?,?,?> container;
    
    @Test
    @Order(10)
    void configDeloreanCore() {

        // given
        container = AIXM511.container();

        // container is successfully created
        assertThat(container).isNotNull();

        // container is correctly configured
        assertThat(container.getRootClass()).isEqualTo(com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType.class);
        assertThat(container.getFeatureClass()).isEqualTo(com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType.class);
        assertThat(container.getTimeSliceClass()).isEqualTo(com.aixm.delorean.aixm511.schema.AbstractAIXMTimeSliceType.class);
        assertThat(container.getObjectClass()).isEqualTo(com.aixm.delorean.aixm511.schema.AbstractAIXMObjectType.class);

        // container has XML binding
        XmlBindingService<?,?> xmlBinding = container.getXmlBinding();
        assertThat(xmlBinding).isNotNull();

        // ciontainer has Database binding
        DatabaseBindingService<?,?> dbBinding = container.getDatabaseBinding();
        assertThat(dbBinding).isNotNull();

        // container has Delorean engine
        Aixm511Engine deloreanEngine = (Aixm511Engine) container.getDeloreanEngine();
        assertThat(deloreanEngine).isNotNull();
    }
    
    @Test
    @Order(20)
    void loadXml(){

        // given 
        String xmlPath = "src\\test\\resources\\donlon-in.xml";

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
        String xmlPath = "src\\test\\resources\\donlon-marshalled.xml.log";

        // do
        container.marshal(xmlPath);
    }

    @Test
    @Order(50)
    void establishConnection() {

        // given
        container.getDatabaseBinding().setUrl("jdbc:postgresql://localhost:5432/aixm_5_1_1");
        container.getDatabaseBinding().setUsername("postgres");
        container.getDatabaseBinding().setPassword("postgres");
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
        container.extract(1);

        // check that
    }


    @Test
    @Order(80)
    void extractExtractedXml() {

        // given
        String xmlPath = "src\\test\\resources\\donlon-extracted.xml.log";

        // do
        container.marshal(xmlPath);
    } 

    
}
