package org.example;

import org.example.models.Person;
import org.example.models.Product;

public class Main {
    public static void main(String[] args) {
        /* ejercicio 1
        Person person = new Person();
        person.setName("Johan Reyes");
        person.setAge(18);
        person.setGender("Masculino");
        System.out.println(person.printInformation());
        */
        // ejercicio 2
        Product producto = new Product("Torta de jamon",10.42,9);
        producto.updateStock(1);
        System.out.println(producto.total());
    }
}