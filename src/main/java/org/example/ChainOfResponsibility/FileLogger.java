package org.example.ChainOfResponsibility;

public class FileLogger extends Logger{
    FileLogger(Integer level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("File log: "+message);
    }
}
