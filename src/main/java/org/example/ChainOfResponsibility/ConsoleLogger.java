package org.example.ChainOfResponsibility;

public class ConsoleLogger extends Logger {

    ConsoleLogger(Integer level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Console Logger: " + message);
    }
}