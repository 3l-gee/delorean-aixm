package com.delorean.aixm.aixm51.integration;

import org.junit.jupiter.api.*;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.time.Instant;   

import com.delorean.aixm.aixm51.DeloreanAIXM51;
import com.delorean.aixm.aixm51.filter.Aixm51FilterConfig;
import com.delorean.aixm.aixm51.filter.type.FeatureTypeSpecification;
import com.delorean.aixm.aixm51.filter.type.TimeSliceValidTimeSpecification;
import com.delorean.aixm.aixm51.filter.type.FeatureIdentifierSpecification;
import com.delorean.aixm.aixm51.schema.AbstractAIXMFeatureType;
import com.delorean.aixm.aixm51.schema.AbstractAIXMTimeSliceType;
import com.delorean.aixm.aixm51.schema.message.BasicMessageMemberAIXMPropertyType;


import com.delorean.aixm.core.container.Container;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
/*
Simple lifecycle test for AIXM 5.1.1 Delorean container 
    - unmarshal XML
    - establish connection to DB
    - persist data to DB
    - extract data from DB
    - marshal XML
*/
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FilterAixm51E2E {

    String id;
    Container<?,?,?,?,?,?> container;
    DeloreanAIXM51 delorean;
    PostgreSQLContainer postgis = new PostgreSQLContainer(DockerImageName.parse("postgis/postgis:16-3.4-alpine")
        .asCompatibleSubstituteFor("postgres"))
        .withCommand("postgres", 
        "-c", "shared_preload_libraries=pg_stat_statements", 
        "-c", "pg_stat_statements.track=all");

    @Test
    @Order(1)
    void startPostgreSQLContainer() throws Exception {
        postgis.start();

        // Enable the extension immediately after start
        try (Connection conn = DriverManager.getConnection(
                postgis.getJdbcUrl(), postgis.getUsername(), postgis.getPassword())) {
            try (Statement stmt = conn.createStatement()) {
                stmt.execute("CREATE EXTENSION IF NOT EXISTS pg_stat_statements;");
            }
        }
    }

    @Test
    @Order(2)
    void preparation() {
        delorean = new DeloreanAIXM51();
        delorean.setContext("RoundTripXmlAixm51E2E");
        container = delorean.createNewContainer();
        String xmlPath = "src/test/resources/roundtrip/donlon-aixm-51.xml";
        container.unmarshal(xmlPath);
    }

    @Test
    @Order(3)
    void ContainerPruneMatchAllIncludeDme() {

        //given
        FeatureTypeSpecification spec = new FeatureTypeSpecification("match all", "include", "DMEType");
        Aixm51FilterConfig config = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        config.addFeatureFilter(spec);

        // do
        Container<?,?,?,?,?,?> newContainer = container.prune(config);
        // check
        assertThat(newContainer.getMessage()).isNotNull();
    }

    @Test
    @Order(4)
    void ContainerPruneMatchAllExcludeDme() {

        //given
        FeatureTypeSpecification spec = new FeatureTypeSpecification("match all", "exclude", "DMEType");
        Aixm51FilterConfig config = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        config.addFeatureFilter(spec);

        // do
        Container<?,?,?,?,?,?> newContainer = container.prune(config);
        // check
        assertThat(newContainer.getMessage()).isNotNull();
    }

    @Test
    @Order(5)
    void ContainerPruneMatchAllIncludeAirportHotSpot() {

        //given
        FeatureTypeSpecification spec = new FeatureTypeSpecification("match none", "include", "AirportHotSpotTypeType");
        Aixm51FilterConfig config = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        config.addFeatureFilter(spec);

        // do
        Container<?,?,?,?,?,?> newContainer = container.prune(config);
        // check
        assertThat(newContainer.getMessage()).isNotNull();
    }

    @Test
    @Order(6)
    void ContainerPruneMatchAllExcludeAirportHotSpot() {

        //given
        FeatureTypeSpecification spec = new FeatureTypeSpecification("match none", "exclude", "AirportHotSpotType");
        Aixm51FilterConfig config = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        config.addFeatureFilter(spec);

        // do
        Container<?,?,?,?,?,?> newContainer = container.prune(config);
        // check
        assertThat(newContainer.getMessage()).isNotNull();
    }

    @Test
    @Order(7)
    void containerPruneThrowExceptionIncludeDme() {
        // given
        FeatureTypeSpecification spec = new FeatureTypeSpecification("throw exception", "include", "DMEType");
        Aixm51FilterConfig config = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        config.addFeatureFilter(spec);

        // do
        Container<?,?,?,?,?,?> newContainer = container.prune(config);
        // check
        assertThat(newContainer.getMessage()).isNotNull();
    }


    @Test
    @Order(8)
    void ContainerPruneMatchAllIncludeIndentifier() {

        //given
        FeatureIdentifierSpecification spec = new FeatureIdentifierSpecification("match all", "include", "e9240179-b707-4133-b49f-39725663e736");
        Aixm51FilterConfig config = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        config.addFeatureFilter(spec);

        // do
        Container<?,?,?,?,?,?> newContainer = container.prune(config);
        // check
        assertThat(newContainer.getMessage()).isNotNull();
        
    }

    @Test
    @Order(9)
    void ContainerPruneMatchAllExcludeIndentifier() {

        //given
        FeatureIdentifierSpecification spec = new FeatureIdentifierSpecification("match all", "exclude", "e9240179-b707-4133-b49f-39725663e736");
        Aixm51FilterConfig config = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        config.addFeatureFilter(spec);

        // do
        Container<?,?,?,?,?,?> newContainer = container.prune(config);
        // check
        assertThat(newContainer.getMessage()).isNotNull();
        
    }

    @Test
    @Order(5)
    void ContainerPruneMatchAllIncludeTiemeSlice() {

        // startingAfter

        //given
        TimeSliceValidTimeSpecification startingAfterspec = TimeSliceValidTimeSpecification.startingAfter("match all", "include", Instant.parse("2017-07-01T11:00:00Z"));
        Aixm51FilterConfig startingAfterconfig = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        startingAfterconfig.addTimesliceFilter(startingAfterspec);
        Container<?,?,?,?,?,?> startingAfterContainer = container.prune(startingAfterconfig);
        // check
        assertThat(startingAfterContainer.getMessage()).isNotNull();

    }

    @Test
    @Order(5)
    void ContainerPruneMatchAllExcludeTiemeSlice() {

        // startingAfter

        //given
        TimeSliceValidTimeSpecification startingAfterspec = TimeSliceValidTimeSpecification.startingAfter("match all", "exclude", Instant.parse("2017-07-01T11:00:00Z"));
        Aixm51FilterConfig startingAfterconfig = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        startingAfterconfig.addTimesliceFilter(startingAfterspec);
        Container<?,?,?,?,?,?> startingAfterContainer = container.prune(startingAfterconfig);
        // check
        assertThat(startingAfterContainer.getMessage()).isNotNull();

    }

    @Test
    @Order(5)
    void ContainerPruneThrowExceptionIncludeTiemeSlice() {

        // startingAfter

        //given
        TimeSliceValidTimeSpecification startingAfterspec = TimeSliceValidTimeSpecification.endingAfter("throw exception", "include", Instant.parse("2017-07-01T11:00:00Z"));
        Aixm51FilterConfig startingAfterconfig = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        startingAfterconfig.addTimesliceFilter(startingAfterspec);

        // do & check
        assertThrows(IllegalStateException.class, () -> container.prune(startingAfterconfig));

    }

    @Test
    @Order(5)
    void ContainerPruneMatchAllIncludeTiemeSliceList() {

        // startingAt

        //given
        TimeSliceValidTimeSpecification startingAtpec = TimeSliceValidTimeSpecification.startingAt("match all", "include", Instant.parse("2017-07-01T12:00:00Z"));
        Aixm51FilterConfig startingAtconfig = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        startingAtconfig.addTimesliceFilter(startingAtpec);
        Container<?,?,?,?,?,?> startingAtContainer = container.prune(startingAtconfig);
        // check
        assertThat(startingAtContainer.getMessage()).isNotNull();

        // startingBefore

        //given
        TimeSliceValidTimeSpecification startingBeforespec = TimeSliceValidTimeSpecification.startingBefore("match all", "include",Instant.parse("2017-07-01T13:00:00Z"));
        Aixm51FilterConfig startingBeforeconfig = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        startingBeforeconfig.addTimesliceFilter(startingBeforespec);
        Container<?,?,?,?,?,?> startingBeforeContainer = container.prune(startingBeforeconfig);
        // check
        assertThat(startingBeforeContainer.getMessage()).isNotNull();

        // endingAfter

        //given
        TimeSliceValidTimeSpecification endingAfterpec = TimeSliceValidTimeSpecification.endingAfter("match all", "include",Instant.parse("2014-12-30T23:59:59Z"));
        Aixm51FilterConfig endingAfterconfig = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        endingAfterconfig.addTimesliceFilter(endingAfterpec);
        Container<?,?,?,?,?,?> endingAfterContainer = container.prune(endingAfterconfig);
        // check
        assertThat(endingAfterContainer.getMessage()).isNotNull();

        // endingAt

        //given
        TimeSliceValidTimeSpecification endingAtspec = TimeSliceValidTimeSpecification.endingAt("match all", "include",Instant.parse("2014-12-31T23:59:59Z"));
        Aixm51FilterConfig endingAtconfig = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        endingAtconfig.addTimesliceFilter(endingAtspec);
        Container<?,?,?,?,?,?> endingAtContainer = container.prune(endingAtconfig);
        // check
        assertThat(endingAtContainer.getMessage()).isNotNull();

        // endingBefore

        //given
        TimeSliceValidTimeSpecification endingBeforespec = TimeSliceValidTimeSpecification.endingBefore("match all", "include",Instant.parse("2015-01-01T00:00:00Z"));
        Aixm51FilterConfig endingBeforeconfig = new Aixm51FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);
        endingBeforeconfig.addTimesliceFilter(endingBeforespec);
        Container<?,?,?,?,?,?> endingBeforeContainer = container.prune(endingBeforeconfig);
        // check
        assertThat(endingBeforeContainer.getMessage()).isNotNull();
        
    }

}
