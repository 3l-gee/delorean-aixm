package com.delorean.aixm.cli;

import org.junit.jupiter.api.*;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import picocli.CommandLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class YamlCLIE2E {

    // Spin up a PostGIS database container
    PostgreSQLContainer postgres = new PostgreSQLContainer(DockerImageName.parse(
            "postgis/postgis:16-3.4-alpine")
            .asCompatibleSubstituteFor("postgres"))
            .withDatabaseName("aixm-dataset-511")
            .withUsername("postgres")
            .withPassword("postgres");

    Path outDir = Paths.get("target", "test_output", "aixm51", "yaml_cli_e2e");


    @BeforeAll
    void startContainer() {
        postgres.start();
        try {
            Files.createDirectories(outDir);
        } catch (IOException e) {
            throw new RuntimeException("Failed to create output directory", e);
        }
    }

    @AfterAll
    void stopContainer() {
        postgres.stop();
    }

    @Test
    @Order(10)
    void testFormatActionAgainstDockerDatabase() {
        // Read the source YAML file
        Path sourceYaml = Paths.get("src", "test", "resources", "task1.yaml");
        Path targetYaml = outDir.resolve("task1.yaml");
        String rawYaml;
        try {
            rawYaml = Files.readString(sourceYaml);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read source YAML", e);
        }
        

        // Build dynamic JDBC connection string from Testcontainers instance
        String dynamicJdbcUrl = String.format("jdbc:postgresql://%s:%d/%s",
                postgres.getHost(),
                postgres.getFirstMappedPort(),
                postgres.getDatabaseName());

        // Replace any local static JDBC URL in the YAML with the dynamic container URL
        String updatedYaml = rawYaml.replaceAll(
                "url:\\s*\"jdbc:postgresql://[^\"]+\"",
                "url: \"" + dynamicJdbcUrl + "\""
        );

        try {
            Files.writeString(targetYaml, updatedYaml, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write target YAML", e);
        }
        DeloreanCLIAIXM51 cli = new DeloreanCLIAIXM51();

        // Target container connection details dynamically mapped by Testcontainers
        String[] args = new String[] {
            "-y", "target/test_output/aixm51/yaml_cli_e2e/task1.yaml"
        };

        // Execute CLI command directly
        int exitCode = new CommandLine(cli).execute(args);

        assertEquals(0, exitCode, "CLI format command should execute successfully against Docker database");
    }

}