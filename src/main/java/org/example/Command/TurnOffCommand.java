package org.example.Command;

public class TurnOffCommand implements Command{
    private TV tv;

    public TurnOffCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOff();
    }
}
