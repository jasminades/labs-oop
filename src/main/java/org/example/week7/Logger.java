package org.example.week7;

interface Logger{
    void logMessage(String message);
}

record RecordLogger(String loggerName) implements Logger{
    @Override
    public void logMessage(String message){
        System.out.println("Record Logger " + loggerName + " " + message);
    }
}

class ClassLogger implements Logger{
    private String loggerName;

    public ClassLogger(String loggerName){
        this.loggerName=loggerName;
    }

    @Override
    public void logMessage(String message){
        System.out.println("Class Logger " + loggerName + " " + message);
    }
}

public class LoggingSystem{
    public static void main(String[] args){
        Logger recordLogger = new RecordLogger("RecordLogger");
        recordLogger.logMessage("Record Logger Message");

        Logger classLogger = new ClassLogger("ClassLogger");
        classLogger.logMessage("Class Logger Message");
        
        Logger lambdaRecordLogger = message -> System.out.println("Lambda RecordLogger " + message);
        lambdaRecordLogger.logMessage("Lambda recordLogger message");

        Logger lambdaClassLogger = message -> System.out.println("Lambda ClassLogger");
        lambdaClassLogger.logMessage("Lambda classLogger message");
    }
}