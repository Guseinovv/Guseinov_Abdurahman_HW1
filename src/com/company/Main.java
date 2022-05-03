package com.company;

public class Main {

    public static void main(String[] args) {
        SupraMk4 supraMk4 = new SupraMk4(ColorOfCar.BLACK, 5, 2009, 395,1 );
        SupraMk5 supraMk5 = new SupraMk5(ColorOfCar.GREEN, 410, 2, "Petrol", 4000);
        SupraMk5 supraMk51 = new SupraMk5(ColorOfCar.BLUE, 375, 2, "Petrol", 3960);
        System.out.println("SupraMk4: " + supraMk4.getInfo() + "\nSupraMk5: " + supraMk5.getInfo() + "\n" +
                "SupraMk51: " + supraMk51.getInfo());

    }
}
