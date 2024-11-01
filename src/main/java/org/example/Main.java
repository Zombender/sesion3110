package org.example;

import org.example.models.Company;
import org.example.models.Direction;

public class Main {
    public static void main(String[] args) {
        /* ejercicio 1
        Person person = new Person();
        person.setName("Johan Reyes");
        person.setAge(18);
        person.setGender("Masculino");
        System.out.println(person.printInformation());
        */
        /* ejercicio 2
        Product producto = new Product("Torta de jamon",10.42,9);
        producto.updateStock(1,"i");
        System.out.println(producto.total());
         */
        Company company = new Company();
        Direction direction = new Direction("Calle falsa 123","Ciudad real","10000");
        company.setCompanyName("Sevasa");
        company.setDirection(direction);

    }
}