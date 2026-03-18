package com.aixm.delorean.cli;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import com.aixm.delorean.aixm51.DeloreanAIXM51;
import com.aixm.delorean.core.DeloreanProcessor;


@Command(name = "delorean-a51", 
        description = "Delorean-AIXM CLI for AIXM 5.1")
public class DeloreanCLIAIXM51  extends DeloreanCLI {
    @Override
    protected DeloreanProcessor createProcessor() {
        return new DeloreanAIXM51();
    }

    public static void main(String[] args) {
        printBanner(DeloreanCLIAIXM51.class);
        int exitCode = new CommandLine(new DeloreanCLIAIXM51()).execute(args);
        System.exit(exitCode);
    }
    
}
