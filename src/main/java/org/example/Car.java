package org.example;

public class Car extends Vehicle {
    private int doors, passengers;

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}
