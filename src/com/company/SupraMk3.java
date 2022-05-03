package com.company;

public class SupraMk3 {
    private ColorOfCar color;
    private int volumeOfEngine;
    private int year;

    public SupraMk3(ColorOfCar color, int volumeOfEngine, int year) {
        this.color = color;
        this.volumeOfEngine = volumeOfEngine;
        this.year = 2009;
    }
    public String getInfo(){
        return "Color of car: " + color +
                "\nVolume Of engine: " + volumeOfEngine +
                "\nYear of car: " + year;
    }
}
