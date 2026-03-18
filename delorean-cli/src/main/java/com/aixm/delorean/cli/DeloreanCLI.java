package com.aixm.delorean.cli;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;
import java.io.File;
import com.aixm.delorean.core.DeloreanProcessor;
import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.log.ConsoleLogger;

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

        run(processor);
        return 0;
    }

    private void run(DeloreanProcessor processor) {
        try {
            Container<?,?,?,?> container = processor.newContainer();
            container.unmarshal("C:/Users/rapha/Downloads/2025-10-02-skyguide-obst.aixm.xml");
            container.getDatabaseBinding().setUrl("jdbc:postgresql://localhost:5433/aixm51");
            container.getDatabaseBinding().setUsername("postgres");
            container.getDatabaseBinding().setPassword("postgres");
            container.getDatabaseBinding().setHbm2ddl("create");
            container.startup();
            container.persist();
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
        System.out.printf("     cli version : %s%n", DeloreanCLI.class.getPackage().getImplementationVersion());
        System.out.printf(" binding version : %s%n", clazz.getPackage().getImplementationVersion());
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
