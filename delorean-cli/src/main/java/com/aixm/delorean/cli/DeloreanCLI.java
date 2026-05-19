package com.aixm.delorean.cli;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

import com.aixm.delorean.core.DeloreanProcessor;
import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

@Command(mixinStandardHelpOptions = true, version = "0.2.0")
public abstract class DeloreanCLI implements Callable<Integer> {

    @Option(names = {"-y", "--yaml"}, required = false, description = "YAML configuration file")
    File yamlFile;

    @Option(names = {"--verbose"}, description = "Enable verbose output")
    boolean verbose;

    @Option(names = {"--strict"}, description = "Enable strict mode")
    boolean strict;

    protected abstract DeloreanProcessor createProcessor();

    @Override
    public Integer call() throws Exception {
        DeloreanProcessor processor = createProcessor();
        if (processor == null) {
            System.err.println("Internal Error: Processor not initialized.");
            return 1;
        }

        if (!yamlFile.exists()) {
            System.err.println("Error: Configuration file not found: " + yamlFile.getAbsolutePath());
            return 1;
        }

        // Run structural validation against internal resources
        if (!validateYaml(yamlFile)) {
            System.err.println("Validation failures encountered. Halting execution pipeline.");
            return 1;
        }

        return executePipeline(processor, yamlFile) ? 0 : 1;
    }

    private boolean validateYaml(File yaml) {
        String schemaResourcePath = "/delorean-schema.json";
        
        try (InputStream schemaStream = getClass().getResourceAsStream(schemaResourcePath)) {
            if (schemaStream == null) {
                if (strict) {
                    System.err.println("Strict Mode Error: Embedded validation schema '" + schemaResourcePath + "' was not found in JAR resources.");
                    return false;
                }
                if (verbose) System.out.println("Validation skipped: Embedded schema file not found in resources.");
                return true; // Lenient bypass if schema is absent in normal execution
            }

            ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
            JsonNode jsonNode = yamlMapper.readTree(yaml);

            JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V202012);
            JsonSchema jsonSchema = factory.getSchema(schemaStream);
            Set<ValidationMessage> errors = jsonSchema.validate(jsonNode);

            if (!errors.isEmpty()) {
                System.err.println("YAML Configuration Rule Violations Detected:");
                for (ValidationMessage error : errors) {
                    System.err.println(" -> " + error.getMessage());
                }
                return false;
            }

            return true;
        } catch (Exception e) {
            System.err.println("Pre-flight validation engine error while parsing schema resource: " + e.getMessage());
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    private boolean executePipeline(DeloreanProcessor processor, File yaml) {
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            Map<String, Object> rootConfig = mapper.readValue(yaml, Map.class);

            List<Object> pipelineSteps = (List<Object>) rootConfig.get("pipeline");
            for (Object stepObj : pipelineSteps) {

            }

            // 1. Setup Global Default Variables
            String context = (String) rootConfig.getOrDefault("context", "donlon");
            processor.setContext(context, "");

            Map<String, Object> dbCreds = (Map<String, Object>) rootConfig.get("database");
            List<Object> pipelineSteps = (List<Object>) rootConfig.get("pipeline");

            if (dbCreds == null || pipelineSteps == null) {
                System.err.println("Malformed configuration file: Missing 'database' or 'pipeline' sequence blocks.");
                return false;
            }

            // Track active space context blocks predictably inside an isolation memory map
            Map<String, Container<?,?,?,?>> containers = new HashMap<>();

            // 2. Drive sequentially through the pipeline sequence
            for (Object stepObj : pipelineSteps) {
                if (!(stepObj instanceof Map)) continue;
                Map<String, Object> block = (Map<String, Object>) stepObj;

                // --- Scenario 1: Process Container Configuration Blocks ---
                if (block.containsKey("container")) {
                    String id = String.valueOf(block.get("container"));
                    List<Object> actionSteps = (List<Object>) block.get("actions");

                    if (verbose) System.out.println("-> Constructing isolation space environment: [" + id + "]");
                    
                    Container<?,?,?,?> container = processor.newContainer();
                    container.getDatabaseBinding().setUrl((String) dbCreds.get("url"));
                    container.getDatabaseBinding().setUsername((String) dbCreds.get("username"));
                    container.getDatabaseBinding().setPassword((String) dbCreds.get("password"));
                    container.getDatabaseBinding().setHbm2ddl("create");
                    container.startup();

                    if (actionSteps != null) {
                        for (Object step : actionSteps) {
                            if (step instanceof String) {
                                runAtomicAction(container, (String) step, null);
                            } else if (step instanceof Map) {
                                Map<String, Object> stepMap = (Map<String, Object>) step;
                                String commandName = stepMap.keySet().iterator().next();
                                runAtomicAction(container, commandName, stepMap.get(commandName));
                            }
                        }
                    }
                    containers.put(id, container);
                } 
                
                // --- Scenario 2: Process Explicit Merge Blocks ---
                else if (block.containsKey("merge")) {
                    Map<String, Object> mergeOpts = (Map<String, Object>) block.get("merge");
                    String srcKey = String.valueOf(mergeOpts.get("source"));
                    String tgtKey = String.valueOf(mergeOpts.get("target"));

                    Container<?,?,?,?> source = containers.get(srcKey);
                    Container<?,?,?,?> target = containers.get(tgtKey);

                    if (source == null || target == null) {
                        throw new IllegalStateException("Execution pipeline fault: Cannot merge '" + srcKey + "' to '" + tgtKey + "'. Active space uninitialized.");
                    }

                    if (verbose) System.out.println("-> Running Merge Operation: Mapping [" + srcKey + "] into [" + tgtKey + "]");
                    target.merge(source);
                } 
                
                // --- Scenario 3: Process Explicit Filter Blocks ---
                else if (block.containsKey("filter")) {
                    Map<String, Object> filterOpts = (Map<String, Object>) block.get("filter");
                    String posKey = String.valueOf(filterOpts.get("positive"));
                    String negKey = String.valueOf(filterOpts.get("negative"));

                    if (verbose) System.out.println("-> Running Split Filter. Tracking outputs across: [" + posKey + " / " + negKey + "]");
                }
            }

            // 3. Cleanup tracked dependencies gracefully
            for (Container<?,?,?,?> activeContainer : containers.values()) {
                try { activeContainer.shutdown(); } catch (Exception ignored) {}
            }

            return true;
        } catch (Exception e) {
            System.err.println("Fatal execution failure during sequential processing: " + e.getMessage());
            if (verbose) e.printStackTrace();
            return false;
        }
    }

    private void run(DeloreanProcessor processor) {
        try {
            processor.setContext("donlon", "");
            Container<?,?,?,?> baseline = processor.newContainer();
            baseline.getDatabaseBinding().setUrl("jdbc:postgresql://localhost:5433/aixm51");
            baseline.getDatabaseBinding().setUsername("postgres");
            baseline.getDatabaseBinding().setPassword("postgres");
            baseline.getDatabaseBinding().setHbm2ddl("create");
            baseline.startup();
            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm51/baseline.xml");
            baseline.unmarshal("C:/Users/rapha/Downloads/aixm51/EDDF_AerodromeMapping_2025-08-07_2025-08-07_snapshot.xml");
            baseline.info();
            baseline.saxValidation();
            baseline.printValidation();
            baseline.persist();


            Container<?,?,?,?> notam = processor.newContainer();
            notam.getDatabaseBinding().setUrl("jdbc:postgresql://localhost:5433/aixm51");
            notam.getDatabaseBinding().setUsername("postgres");
            notam.getDatabaseBinding().setPassword("postgres");
            notam.getDatabaseBinding().setHbm2ddl("none");
            notam.startup();
            notam.extract(1L);
            baseline.info();
            notam.saxValidation();
            notam.printValidation();    
            notam.marshal("C:/Users/rapha/Downloads/aixm51/obst.xml");

            // notam.predicate("2024-01-01T00:00:00Z");
            // notam.integrate("C:/Users/rapha/Downloads/aixm51/permdelta.xml");
            // notam.marshal("C:/Users/rapha/Downloads/aixm51/integrate.xml");
            // notam.merge();

            // notam.extract(1L);
            // notam.marshal("C:/Users/rapha/Downloads/aixm51/full.xml");
            // notam.diff();
            // notam.marshal("C:/Users/rapha/Downloads/aixm51/diff.xml");


            // notam.extract(1);
            // notam.marshal("C:/Users/rapha/Downloads/aixm51/extract.xml");

            // container.unmarshal("C:/Users/rapha/Downloads/aixm51/LF_AIP_DS_PartOf_20240516_AIRAC.xml");
            // container.persist();

            // // container.unmarshal("C:/Users/rapha/Downloads/aixm51/EDDF_AerodromeMapping_2025-08-07_2025-08-07_snapshot.xml");
            // // container.persist();

            // container.unmarshal("C:/Users/rapha/Downloads/aixm51/2025-10-02-skyguide-obst.aixm.xml");
            // container.persist();

            // container.unmarshal("C:/Users/rapha/Downloads/aixm51/EA_AIP_DS_FULL_20170701_mod.xml");
            // container.persist();

            // Container<?,?,?,?> containerA = processor.newContainer();
            // containerA.getDatabaseBinding().setUrl("jdbc:postgresql://localhost:5433/aixm51");
            // containerA.getDatabaseBinding().setUsername("postgres");
            // containerA.getDatabaseBinding().setPassword("postgres");
            // containerA.getDatabaseBinding().setHbm2ddl("update");
            // containerA.startup();
            // containerA.extract(1L);
            // containerA.marshal("C:/Users/rapha/Downloads/data/extract.xml");
            // containerA.predicate("2020-01-01T00:00:00Z");
            // containerA.marshal("C:/Users/rapha/Downloads/data/predicate.xml");


            // container.unmarshal("C:/Users/rapha/Downloads/2025-10-02-skyguide-obst.aixm.xml");
            // container.getDatabaseBinding().setUrl("jdbc:postgresql://localhost:5433/aixm51");
            // container.getDatabaseBinding().setUsername("postgres");
            // container.getDatabaseBinding().setPassword("postgres");
            // container.getDatabaseBinding().setHbm2ddl("create");
            // container.startup();
            // container.persist();
            ConsoleLogger.getInstance().logOverride(com.aixm.delorean.core.log.LogLevel.INFO, "Workflow successfully completed.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            if (verbose) e.printStackTrace();
        }
    }

    protected static void printBanner(Class<? extends DeloreanCLI> clazz) {
        System.out.println("");
        System.out.println(" ██████╗ ███████╗██╗      ██████╗ ██████╗ ███████╗ █████╗ ███╗   ██╗         █████╗ ██╗██╗  ██╗███╗   ███╗ ");
        System.out.println(" ██╔══██╗██╔════╝██║     ██╔═══██╗██╔══██╗██╔════╝██╔══██╗████╗  ██║        ██╔══██╗██║╚██╗██╔╝████╗ ████║ ");
        System.out.println(" ██║  ██║█████╗  ██║     ██║   ██║██████╔╝█████╗  ███████║██╔██╗ ██║ █████╗ ███████║██║ ╚███╔╝ ██╔████╔██║ ");
        System.out.println(" ██║  ██║██╔══╝  ██║     ██║   ██║██╔══██╗██╔══╝  ██╔══██║██║╚██╗██║ ╚════╝ ██╔══██║██║ ██╔██╗ ██║╚██╔╝██║ ");
        System.out.println(" ██████╔╝███████╗███████╗╚██████╔╝██║  ██║███████╗██║  ██║██║ ╚████║        ██║  ██║██║██╔╝ ██╗██║ ╚═╝ ██║ ");
        System.out.println(" ╚═════╝ ╚══════╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝        ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚═╝     ╚═╝ ");
        System.out.println("");
        System.out.printf(" binding version : %s%n", clazz.getPackage().getImplementationVersion());
        System.out.printf("     cli version : %s%n", DeloreanCLI.class.getPackage().getImplementationVersion());
        System.out.println("         license : GPL v3");
        System.out.println("          author : Raphaël Gerth");
        System.out.println("            repo : https://github.com/3l-gee/delorean-aixm");
        System.out.println("             web : https://delorean-aixm.io/");
        System.out.println("            help : 'help' ");
        System.out.println("");
    }
}



// import com.aixm.delorean.core.configuration.StructureConfig;
// import com.aixm.delorean.core.container.ContainerFactory;
// import com.aixm.delorean.core.container.ContainerWarehouse;
// import com.aixm.delorean.core.database.DatabaseBinding;
// import com.aixm.delorean.core.database.DatabaseConfig;
// import com.aixm.delorean.core.log.ConsoleLogger;
// import com.aixm.delorean.core.log.LogLevel;
// import com.aixm.delorean.core.xml.XMLBinding;
// import com.aixm.delorean.core.xml.XMLConfig;
// import com.aixm.delorean.core.qgis.QgisProjectBinding;
// import com.aixm.delorean.core.qgis.QgisConfig;

// import java.io.Console;
// import java.util.Scanner;

// public class Main {
    
//     public static void main(String[] args) {
//         Main mainInstance = new Main(); 
//         for (String arg : args) {
//             switch (arg) {
//                     break;
//             }
//         }
         
//         mainInstance.run();
//     }

//     private void run() {
//         Scanner scanner = new Scanner(System.in);
//         String command;
//         System.out.println("");
//         System.out.println(" ██████╗ ███████╗██╗      ██████╗ ██████╗ ███████╗ █████╗ ███╗   ██╗         █████╗ ██╗██╗  ██╗███╗   ███╗ ");
//         System.out.println(" ██╔══██╗██╔════╝██║     ██╔═══██╗██╔══██╗██╔════╝██╔══██╗████╗  ██║        ██╔══██╗██║╚██╗██╔╝████╗ ████║ ");
//         System.out.println(" ██║  ██║█████╗  ██║     ██║   ██║██████╔╝█████╗  ███████║██╔██╗ ██║ █████╗ ███████║██║ ╚███╔╝ ██╔████╔██║ ");
//         System.out.println(" ██║  ██║██╔══╝  ██║     ██║   ██║██╔══██╗██╔══╝  ██╔══██║██║╚██╗██║ ╚════╝ ██╔══██║██║ ██╔██╗ ██║╚██╔╝██║ ");
//         System.out.println(" ██████╔╝███████╗███████╗╚██████╔╝██║  ██║███████╗██║  ██║██║ ╚████║        ██║  ██║██║██╔╝ ██╗██║ ╚═╝ ██║ ");
//         System.out.println(" ╚═════╝ ╚══════╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝        ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚═╝     ╚═╝ v1.0.0");
//         System.out.println("");
//         System.out.println("       version : 1.0.0");
//         System.out.println("       license : GPL v3");
//         System.out.println("        author : Raphaël Gerth");
//         System.out.println("          repo : https://github.com/3l-gee/delorean-aixm");
//         System.out.println("           web : https://delorean-aixm.io/");
//         System.out.println("          help : 'help' ");
//         System.out.println("");

//         while (true) {
//             System.out.print("> ");
//             command = scanner.nextLine().trim();

//             if (command.equalsIgnoreCase("exit")) {
//                 System.out.println("Exiting...");
//                 break;
//             }

//             try {
//                 executeCommand(command, scanner);
//             } catch (IllegalArgumentException e) {
//                 System.out.println("Invalid arguments: " + e.getMessage());
//             }
//         }

//         scanner.close();
//     }

//     private void executeCommand(String command, Scanner scanner) {
//         Action Argument Parameter Optipon
//         String[] parts = command.split(" ");
//         String action = parts[0];
//         String argument = null;
//         String parameter = null;
//         String option = null;

//         if (parts.length > 1) {
//             argument = parts[1];
//             if ("-".equals(argument)) {
//                 argument = this.containerWarehouse.getLastContainerId();
//             }
//         }

//         if (parts.length > 2) {
//             parameter = parts[2];
//         }

//         if (parts.length > 3) {
//             option = parts[3];
//         }


//         switch (action.toLowerCase()) {
//             case "/h": 
//             case "--help": 
//             case "-h":
//             case "?":
//             case "help":
//             System.out.println("""
//                -={ delorean-aixm Shell Commands }=-
//     help                                                              : Display this help message
//     new         [a5.1, a5.1.1]                                        : Create a new container with the specified argument       
//     xml-config  <container id, - >      [a5.1, a5.1.1]                : Configures the xml schema to use for the specified container
//     db-config   <container id, - >      [a5.1, a5.1.1]                : Configures the db connection for the specified container
//     qgis-config <container id, - >      [a5.1, a5.1.1]                : Configures the qgis project for the specified container
//     xml         <container id, - >      load             <path>       : load the xml data from the specified path
//     xml         <container id, - >      export           <path>       : export the xml data to the specified path
//     db          <container id, - >      startup                       : start the database
//     db          <container id, - >      load                          : load the data into the database
//     db          <container id, - >      compute                       : generates the views required for visualisation
//     db          <container id, - >      export           <id / time>  : (export the master aixmmessage with the specified id) broken
//     qgis        <container id, - >      init                          : format the qgis project
//     list                                                              : List all the containers
//     exit                                                              : Exit the shell                                    
//                 """);
//             break;

//             case "new":
//             executeNewCommand(argument, scanner, parameter, option);
//             break;

//             case "xml-config":
//             excuteXmlConfigurationCommand(argument,scanner, parameter, option);
//             break;

//             case "xml" :
//             executeXmlActionCommand(argument,scanner, parameter, option);
//             break;

//             case "db-config":
//             executeDbConfigurationCommand(argument, scanner, parameter, option);
//             break;

//             case "db" :
//             executeDbActionCommand(argument, scanner, parameter, option);
//             break;

//             case "qgis-config" :
//             executeQgisConfigurationCommand(argument, scanner, parameter, option);
//             break;

//             case "qgis" :
//             executeQgisActionCommand(argument, scanner, parameter, option);
//             break;

//             case "list":
//             executeListCommand();
//             break;          

//             case "format":
//                 executeFormatCommand();
//                 break;

//             case "show":
//             executeShowCommand(argument);
//             break;

//             default:
//             ConsoleLogger.log(LogLevel.ERROR, "Invalid command: " + action);
//             break;
//         }
//     }

// }
