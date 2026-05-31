package com.aixm.delorean.aixm52.unit;

import org.junit.jupiter.api.*;

import com.aixm.delorean.aixm52.DeloreanAIXM52;
import com.aixm.delorean.aixm52.engine.Aixm52Engine;
import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.database.DatabaseBindingService;
import com.aixm.delorean.core.xml.XmlBindingService;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

/*
Simple lifecycle test for AIXM 5.1.1 Delorean container with specific marshalling tasks
    - unmarshal XML
    - establish connection to DB
    - persist data to DB
    - extract data from DB
    - marshal XML
*/
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ContainerAIXM52Test {
    String firstContainerID;
    String secondContainerID;
    Container<?,?,?,?,?,?> firstContainer;
    Container<?,?,?,?,?,?> secondContainer;
    DeloreanAIXM52 deloreanAIXM52 = new DeloreanAIXM52();
    
    @Test
    @Order(1)
    void configDeloreanCore() {

        // given
        firstContainer = deloreanAIXM52.newContainer();

        // container is successfully created
        assertThat(firstContainer).isNotNull();

        // container is correctly configured
        assertThat(firstContainer.getRootClass()).isEqualTo(com.aixm.delorean.aixm52.schema.message.AIXMBasicMessageType.class);
        assertThat(firstContainer.getFeatureClass()).isEqualTo(com.aixm.delorean.aixm52.schema.AbstractAIXMFeatureType.class);
        assertThat(firstContainer.getTimeSliceClass()).isEqualTo(com.aixm.delorean.aixm52.schema.AbstractAIXMTimeSliceType.class);
        assertThat(firstContainer.getObjectClass()).isEqualTo(com.aixm.delorean.aixm52.schema.AbstractAIXMObjectType.class);

        // container has XML binding
        XmlBindingService<?,?> xmlBinding = firstContainer.getXmlBinding();
        assertThat(xmlBinding).isNotNull();

        // container has Database binding
        DatabaseBindingService<?,?,?,?> dbBinding = firstContainer.getDatabaseBinding();
        assertThat(dbBinding).isNotNull();

        // container has Delorean engine
        Aixm52Engine deloreanEngine = (Aixm52Engine) firstContainer.getDeloreanEngine();
        assertThat(deloreanEngine).isNotNull();

        // container id is the same as the last id used
        firstContainerID = firstContainer.getId();
        assertThat(firstContainer).isEqualTo(deloreanAIXM52.getContainerById(firstContainerID));

        // warehouse has one containe
        List<String> idList = deloreanAIXM52.listContainerId();
        assertThat(idList).hasSize(1);
    }

    @Test
    @Order(2)
    void addNewContainer() {

        secondContainer = deloreanAIXM52.newContainer();

        // container is successfully created
        assertThat(secondContainer).isNotNull();

        // container is correctly configured
        assertThat(secondContainer.getRootClass()).isEqualTo(com.aixm.delorean.aixm52.schema.message.AIXMBasicMessageType.class);
        assertThat(secondContainer.getFeatureClass()).isEqualTo(com.aixm.delorean.aixm52.schema.AbstractAIXMFeatureType.class);
        assertThat(secondContainer.getTimeSliceClass()).isEqualTo(com.aixm.delorean.aixm52.schema.AbstractAIXMTimeSliceType.class);
        assertThat(secondContainer.getObjectClass()).isEqualTo(com.aixm.delorean.aixm52.schema.AbstractAIXMObjectType.class);

        // container has XML binding
        XmlBindingService<?,?> xmlBinding = secondContainer.getXmlBinding();
        assertThat(xmlBinding).isNotNull();

        // ciontainer has Database binding
        DatabaseBindingService<?,?,?,?> dbBinding = secondContainer.getDatabaseBinding();
        assertThat(dbBinding).isNotNull();

        // container has Delorean engine
        Aixm52Engine deloreanEngine = (Aixm52Engine) secondContainer.getDeloreanEngine();
        assertThat(deloreanEngine).isNotNull();

        // container id is the same as the last id used
        String secondContainerID = secondContainer.getId();
        assertThat(secondContainer).isEqualTo(deloreanAIXM52.getContainerById(secondContainerID));

        // warehouse has two containe
        List<String> idList = deloreanAIXM52.listContainerId();
        assertThat(idList).hasSize(2);

    }

    @Test
    @Order(3)
    void removeFirstContainer() {

        deloreanAIXM52.removeContainerById(firstContainerID);

        // container id is the same as the last id used
        String id = secondContainer.getId();
        assertThat(secondContainer).isEqualTo(deloreanAIXM52.getContainerById(id));

        // warehouse has two containe
        List<String> idList = deloreanAIXM52.listContainerId();
        assertThat(idList).hasSize(1);

    }
    
}

