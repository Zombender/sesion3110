package org.example.models;

public class Car extends Vehicle{
    private int capacity;

    public Car(){

    }

    public Car(String brand, String model, int year, int capacity) {
        super(brand, model, year);
        this.capacity = capacity;
    }
}
