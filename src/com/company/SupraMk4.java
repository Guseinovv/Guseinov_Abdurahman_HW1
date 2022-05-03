package com.company;

public class SupraMk4 extends SupraMk3 {

    private int maxSpeed;
    private int numberOfPlaces;

    public SupraMk4(ColorOfCar color, int volumeOfEngine, int year, int maxSpeed, int numberOfPlaces) {
        super(color, volumeOfEngine, year);

        this.maxSpeed = maxSpeed;
        this.numberOfPlaces = numberOfPlaces;
    }
    public int speed(int maxSpeed, int numberOfPlaces){
        return maxSpeed;

    }
    public final int speed(int numberOfPlaces){
        return numberOfPlaces;
    }
    public String getInfo(){
     return super.getInfo() + "\nMax speed: " + maxSpeed + "\nNumber of places: " + numberOfPlaces;
    }
}
