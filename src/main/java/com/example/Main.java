package com.example;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("GenericAnimal", 5);
        System.out.println(animal.getName() + " is " + animal.getAge()
                + " years old and says: " + animal.makeSound());
    }
}