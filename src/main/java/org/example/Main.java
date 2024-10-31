package org.example;

import org.example.models.Person;
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Johan Reyes");
        person.setAge(18);
        person.setGender("Masculino");
        person.printInformation();
    }
}