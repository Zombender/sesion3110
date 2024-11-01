package org.example.models;

public class Company {

    private String companyName;
    private Direction direction;

    public Company(){

    }

    public Company(String companyName, Direction direction){
        this.companyName = companyName;
        this.direction = direction;
    }

    public String getCompanyName(){
        return this.companyName;
    }

    public Direction getDirection(){
        return this.direction;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public void setDirection(Direction direction){
        this.direction = direction;
    }

    @Override
    public String toString() {
        String format = "";
        format += String.format("Nombre: %s",getCompanyName());
        format += direction.toString();
        return format;
    }
}
