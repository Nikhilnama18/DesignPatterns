package org.example.Command;

public class VolumeUpCommand implements Command{
    private TV tv;

    public VolumeUpCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.volumeUp();
    }
}
