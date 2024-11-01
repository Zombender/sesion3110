package org.example.models;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(){

    }
    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String showInformation(){
        String format = "";
        format += String.format("Marca: %s\n",this.brand);
        format += String.format("Modelo: %s\n",this.model);
        format += String.format("Año: %s\n",this.year);
        return format;
    }


}
