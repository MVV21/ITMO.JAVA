package org.lession6.Part3;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(5000, "Volvo", 'a', 200, 8, 9000);
        truck.newWheels(10);
        truck.outPut(); //метод родительского класса Car
    }
}
