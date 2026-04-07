package org.example.ChainOfResponsibility;

public class ErrorLogger extends Logger{

    ErrorLogger(Integer level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Error log: " + message);
    }
}
