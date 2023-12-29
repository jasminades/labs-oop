package org.example.week11;

public class Logger {

    private static Logger instance;


    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("General message " + message);
    }

    public void logInfo(String message) {
        System.out.println("Informational message " + message);
    }

    public void logWarning(String message) {
        System.out.println("Warning message " + message);
    }

    public void logError(String message) {
        System.out.println("Error message " + message);
    }
}


public class Main{
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Application has started");
        logger.logInfo("This is an informational message");
        logger.logWarning("This is a warning message");
        logger.logError("This is an error message");

        Logger anotherLogger = Logger.getInstance();
        System.out.println("Are both loggers the same instance? " + (logger == anotherLogger));
    }
}
