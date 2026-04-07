package org.example.Observer;

public class CurrentConditionsDisplay implements Observer{

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current wheather conditions are, temperature " + temperature + " Humidity "+ humidity + " Pressure " + pressure );
    }
}
