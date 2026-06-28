package com.aixm.delorean.aixm52.integration;

import org.junit.jupiter.api.*;
import org.testcontainers.utility.DockerImageName;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.xmlunit.assertj.XmlAssert;

import com.aixm.delorean.aixm52.DeloreanAIXM52;
import com.aixm.delorean.aixm52.engine.Aixm52Engine;
import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.database.DatabaseBindingService;
import com.aixm.delorean.core.xml.XmlBindingService;

import static org.assertj.core.api.Assertions.*;

import java.io.File;

/*

*/
@Disabled("Until a AIXM 5.2 dataset is published")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IntegrateAixm52E2E {

    String id;
    Container<?,?,?,?,?,?> firstContainer;
    Container<?,?,?,?,?,?> secondContainer;
    PostgreSQLContainer postgis = new PostgreSQLContainer(DockerImageName.parse("postgis/postgis:16-3.4-alpine").asCompatibleSubstituteFor("postgres"));

    @Test
    @Order(1)
    void startPostgreSQLContainer() {
        postgis.start();
    }


}
