package org.lession6.Part3;

public class Truck extends Car {
    public int numWheels;
    public int maxWeight;

    public void newWheels (int newWheels) {
        this.numWheels = newWheels;
        System.out.println("New number of wheels is " + numWheels);
    }

    public Truck (int weight, String model, char color, float speed, int numWheels, int maxWeight) {
        super(weight, model, color, speed);
        this.numWheels = numWheels;
        this.maxWeight = maxWeight;
    }

    public Truck () {}

}
