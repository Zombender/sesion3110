package org.example.models;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(){

    }
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String printInformation(){
        String format = "";
        format += String.format("Nombre: %s\n",this.name);
        format += String.format("Edad: %d\n",this.age);
        format += String.format("Genero: %s\n",this.gender);
        return format;
    }

}
