package com.delorean.aixm.cli;

import org.junit.jupiter.api.*;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import java.nio.file.Path;
import java.nio.file.Paths; 
import picocli.CommandLine;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SimpleCLIE2E {

    // Spin up a PostGIS database container
    PostgreSQLContainer postgres = new PostgreSQLContainer(DockerImageName.parse(
            "postgis/postgis:16-3.4-alpine")
            .asCompatibleSubstituteFor("postgres"))
            .withDatabaseName("aixm-dataset-511")
            .withUsername("postgres")
            .withPassword("postgres");

    Path OutDir = Paths.get("target", "test_output", "aixm511", "simple_cli_e2e");


    @BeforeAll
    void startContainer() {
        postgres.start();
    }

    @AfterAll
    void stopContainer() {
        postgres.stop();
    }

    @Test
    @Order(10)
    void testFormatActionAgainstDockerDatabase() {
        // Concrete CLI implementation for testing
        DeloreanCLIAIXM511 cli = new DeloreanCLIAIXM511();

        // Target container connection details dynamically mapped by Testcontainers
        String[] args = new String[] {
            "-d", postgres.getDatabaseName(),
            "-h", postgres.getHost(),
            "-p", String.valueOf(postgres.getFirstMappedPort()),
            "-U", postgres.getUsername(),
            "-W", postgres.getPassword(),
            "-a", "format"
        };

        // Execute CLI command directly
        int exitCode = new CommandLine(cli).execute(args);

        assertEquals(0, exitCode, "CLI format command should execute successfully against Docker database");
    }

    @Test
    @Order(20)
    void testPersistActionAgainstDockerDatabase() {
        // Concrete CLI implementation for testing
        DeloreanCLIAIXM511 cli = new DeloreanCLIAIXM511();

        // Target container connection details dynamically mapped by Testcontainers
        String[] args = new String[] {
            "-d", postgres.getDatabaseName(),
            "-h", postgres.getHost(),
            "-p", String.valueOf(postgres.getFirstMappedPort()),
            "-U", postgres.getUsername(),
            "-W", postgres.getPassword(),
            "-a", "persist",
            "-f", "src/test/resources/donlon-aixm-511.xml"
        };

        // Execute CLI command directly
        int exitCode = new CommandLine(cli).execute(args);

        assertEquals(0, exitCode, "CLI Persist command should execute successfully against Docker database");
    }

    @Test
    @Order(30)
    void testRenderFirstActionAgainstDockerDatabase() {
        // Concrete CLI implementation for testing
        DeloreanCLIAIXM511 cli = new DeloreanCLIAIXM511();

        // Target container connection details dynamically mapped by Testcontainers
        String[] args = new String[] {
            "-d", postgres.getDatabaseName(),
            "-h", postgres.getHost(),
            "-p", String.valueOf(postgres.getFirstMappedPort()),
            "-U", postgres.getUsername(),
            "-W", postgres.getPassword(),
            "-a", "render"
        };

        // Execute CLI command directly
        int exitCode = new CommandLine(cli).execute(args);

        assertEquals(0, exitCode, "CLI Render command should execute successfully against Docker database");
    }

    @Test
    @Order(40)
    void testMergeActionAgainstDockerDatabase() {
        // Concrete CLI implementation for testing
        DeloreanCLIAIXM511 cli = new DeloreanCLIAIXM511();

        // Target container connection details dynamically mapped by Testcontainers
        String[] args = new String[] {
            "-d", postgres.getDatabaseName(),
            "-h", postgres.getHost(),
            "-p", String.valueOf(postgres.getFirstMappedPort()),
            "-U", postgres.getUsername(),
            "-W", postgres.getPassword(),
            "-a", "merge",
            "-f", "src/test/resources/donlon-aixm-511-merge.xml",
            "--id", "1"
        };

        // Execute CLI command directly
        int exitCode = new CommandLine(cli).execute(args);

        assertEquals(0, exitCode, "CLI Merge command should execute successfully against Docker database");
    }

    @Test
    @Order(50)
    void testRenderSecondActionAgainstDockerDatabase() {
        // Concrete CLI implementation for testing
        DeloreanCLIAIXM511 cli = new DeloreanCLIAIXM511();

        // Target container connection details dynamically mapped by Testcontainers
        String[] args = new String[] {
            "-d", postgres.getDatabaseName(),
            "-h", postgres.getHost(),
            "-p", String.valueOf(postgres.getFirstMappedPort()),
            "-U", postgres.getUsername(),
            "-W", postgres.getPassword(),
            "-a", "render"
        };

        // Execute CLI command directly
        int exitCode = new CommandLine(cli).execute(args);

        assertEquals(0, exitCode, "CLI Render command should execute successfully against Docker database");
    }

    @Test
    @Order(60)
    void testExtractActionAgainstDockerDatabase() {
        // Concrete CLI implementation for testing
        DeloreanCLIAIXM511 cli = new DeloreanCLIAIXM511();

        // Target container connection details dynamically mapped by Testcontainers
        String[] args = new String[] {
            "-d", postgres.getDatabaseName(),
            "-h", postgres.getHost(),
            "-p", String.valueOf(postgres.getFirstMappedPort()),
            "-U", postgres.getUsername(),
            "-W", postgres.getPassword(),
            "-a", "extract",
            "-f", OutDir.resolve("simple-cli-donlon-extract.xml").toString(),
            "--id", "1"
        };

        // Execute CLI command directly
        int exitCode = new CommandLine(cli).execute(args);

        assertEquals(0, exitCode, "CLI Extract command should execute successfully against Docker database");
    }

    @Test
    @Order(70)
    void testPredicateActionAgainstDockerDatabase() {
        // Concrete CLI implementation for testing
        DeloreanCLIAIXM511 cli = new DeloreanCLIAIXM511();

        // Target container connection details dynamically mapped by Testcontainers
        String[] args = new String[] {
            "-d", postgres.getDatabaseName(),
            "-h", postgres.getHost(),
            "-p", String.valueOf(postgres.getFirstMappedPort()),
            "-U", postgres.getUsername(),
            "-W", postgres.getPassword(),
            "-a", "predicate",
            "-f", OutDir.resolve("simple-cli-donlon-predicate.xml").toString(),
            "--id", "1",
            "--time", "2024-01-01T00:00:00Z"
        };

        // Execute CLI command directly
        int exitCode = new CommandLine(cli).execute(args);

        assertEquals(0, exitCode, "CLI Predicate command should execute successfully against Docker database");
    }
}