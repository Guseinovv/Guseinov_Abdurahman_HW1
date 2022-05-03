package com.company;

public final class SupraMk5 extends SupraMk4 {
    private String typeOfFuel;
    private int enginePower;

    public SupraMk5(ColorOfCar color, int maxSpeed, int numberOfPlaces, String typeOfFuel, int enginePower) {
        super(color, maxSpeed, numberOfPlaces, maxSpeed, numberOfPlaces);

        this.typeOfFuel = typeOfFuel;
        this.enginePower = enginePower;
    }

    @Override
    public int speed(int maxSpeed, int numberOfPlaces) {
        return super.speed(maxSpeed, numberOfPlaces);

    }
    public String getInfo(){
        return super.getInfo() + "\nType of fuel: " + typeOfFuel + "\nEngine power: " + enginePower;
    }
}
