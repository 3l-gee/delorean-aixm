package com.aixm.delorean.aixm51.integration;

import org.junit.jupiter.api.*;
import org.testcontainers.utility.DockerImageName;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.xmlunit.assertj.XmlAssert;

import com.aixm.delorean.aixm51.DeloreanAIXM51;
import com.aixm.delorean.aixm51.engine.Aixm51Engine;
import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.database.DatabaseBindingService;
import com.aixm.delorean.core.xml.XmlBindingService;

import static org.assertj.core.api.Assertions.*;

import java.io.File;

/*

*/
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IntegrateAixm51E2E {

    String id;
    Container<?,?,?,?> firstContainer;
    Container<?,?,?,?> secondContainer;
    PostgreSQLContainer postgis = new PostgreSQLContainer(DockerImageName.parse("postgis/postgis:16-3.4-alpine").asCompatibleSubstituteFor("postgres"));

    @Test
    @Order(1)
    void startPostgreSQLContainer() {
        postgis.start();
    }
}
