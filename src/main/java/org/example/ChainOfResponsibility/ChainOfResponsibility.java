package org.example.ChainOfResponsibility;

public class ChainOfResponsibility {
    public static Logger getChainOfLoggers(){
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger errorLogger = new ErrorLogger(Logger.ERROR);

        fileLogger.setNextLogger(consoleLogger);
        errorLogger.setNextLogger(fileLogger);

        return errorLogger;
    }
}
