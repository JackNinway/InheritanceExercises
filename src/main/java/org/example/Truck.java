package org.example;

public class Truck extends Vehicle {
    private int maxSpeed;

    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }
}
