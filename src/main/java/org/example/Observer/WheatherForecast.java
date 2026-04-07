package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class WheatherForecast implements Subject{
    private List<Observer>observers;
    private float temperature;
    private  float humidity;
    private float pressure;

    public WheatherForecast(){
        observers = new ArrayList<>();
    }

    public void setWheather(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }
}
