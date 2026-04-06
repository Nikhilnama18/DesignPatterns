package org.example.Prototype;

public class CarMaker implements Prototype<CarMaker>{

    private Integer wheels;
    private String type ="sedan";
    public String color;

    public CarMaker(String color){
        this.color = color;
        this.wheels = 4;
    }

    @Override
    public CarMaker clone() {
        CarMaker cm = new CarMaker(this.color);
        cm.wheels = this.wheels;
        cm.type = this.type;
        return cm;
    }
}
