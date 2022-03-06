package br.com.albertoferes;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Command(name = "App", version = "App 1.0-SNAPSHOT", mixinStandardHelpOptions = true)
public class App implements Runnable {

    private static final Logger LOGGER = LogManager.getLogger(App.class);

    @Option(names = { "-p", "--port" }, description = "port to listen on") 
    int port = 8080;

    @Override
    public void run() {
        LOGGER.info(String.format("Hello, my port is %d!", port));
    }

    public static void main(String[] args) {
        System.exit(new CommandLine(new App()).execute(args));
    }

}
