package org.example.Observer;

public class FuturePredictor implements Observer{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        if(temperature > 45){
            System.out.println("Its going to be very hot for the next couple of weeks");
        }else if(temperature < 18 && humidity > 25){
            System.out.println("We can expect rain any time soon");
        }else if(pressure > 180){
            System.out.println("We can expect winds in next few overs");
        }
    }
}
