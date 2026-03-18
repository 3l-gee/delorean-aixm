package com.aixm.delorean.cli;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import com.aixm.delorean.aixm52.DeloreanAIXM52;
import com.aixm.delorean.core.DeloreanProcessor;


@Command(name = "delorean-a52", 
        description = "Delorean-AIXM CLI for AIXM 5.2")
public class DeloreanCLIAIXM52  extends DeloreanCLI {
    @Override
    protected DeloreanProcessor createProcessor() {
        return new DeloreanAIXM52();
    }

    public static void main(String[] args) {
        printBanner(DeloreanCLIAIXM52.class);
        int exitCode = new CommandLine(new DeloreanCLIAIXM52()).execute(args);
        System.exit(exitCode);
    }
    
}
