package org.example.models;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(){

    }

    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public void setStock(int stock){
        this.stock = stock;
    }

    public void updateStock(int stock){
        if (stock <=0) return;
        setStock(getStock()+stock);
        //this.stock += stock
    }
    public double total(){
        return getStock()*getPrice();
        //this.stock * this.price;
    }

}