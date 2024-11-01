package org.example.models;

public class Direction {
    private String street;
    private String city;
    private String codigoPostal;

    public Direction(){

    }
    public Direction(String street, String city, String codigoPostal){
        this.street = street;
        this.city = city;
        this.codigoPostal = codigoPostal;
    }

    public String getStreet(){
        return this.street;
    }
    public String getCity(){
        return this.city;
    }
    public String getCodigoPostal(){
        return this.codigoPostal;
    }

    public void setStreet(String street){
        this.street = street;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        String format = "";
        format += String.format("Calle: %s",this.getStreet());
        format += String.format("Ciudad: %s",this.getCity());
        format += String.format("Codig postal: %s",this.getCodigoPostal());
        return format;
    }
}
