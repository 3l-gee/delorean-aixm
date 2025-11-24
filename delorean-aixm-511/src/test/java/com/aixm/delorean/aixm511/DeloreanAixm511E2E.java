package com.aixm.delorean.aixm511;

import org.junit.jupiter.api.*;

import com.aixm.delorean.core.DeloreanConfig;
import com.aixm.delorean.core.Delorean;
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

    @Test
    @Order(10)
    void configDeloreanCore() {

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

        new Delorean<AIXMBasicMessageType, com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType>(config);

    }
    
}
