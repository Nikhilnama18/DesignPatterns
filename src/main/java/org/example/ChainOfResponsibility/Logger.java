package org.example.ChainOfResponsibility;

abstract  public class Logger {
    public static Integer INFO = 1;
    public static Integer DEBUG = 2;
    public static Integer ERROR = 3;

    protected Integer level;
    protected Logger nextLogger = null;

    public void logMessage(Integer level, String message){
        if(this.level <= level){
            write(message);
        }else{
            if(nextLogger!= null){
                this.nextLogger.logMessage(level,message);
            }
        }
    }

    public void setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    abstract public void write(String message);
}
