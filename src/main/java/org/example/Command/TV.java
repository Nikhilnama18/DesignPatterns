package org.example.Command;

public class TV {
    private Integer volume = 10;
    private String state = "Off";

    public TV(Integer vol, String state){
        this.volume = vol;
        this.state = state;
    }

    public void turnOn(){
        this.state =  "On";
        System.out.println("TV is turned On");
    }

    public void turnOff(){
        this.state = "Off";
        System.out.println("TV is turned off");
    }

    public void volumeUp(){
        this.volume +=1;
        System.out.println("Volume is up " + this.volume);
    }

    public  void volumeDown(){
        this.volume -=1;
        System.out.println("Volume is down " + this.volume);
    }
}
