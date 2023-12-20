package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Mazsola");
        Cat cat = new Cat("Tádé");

        System.out.println(dog.getName() + " says: ");
        dog.makeSound();

        System.out.println(cat.getName() + " says: ");
        cat.makeSound();
    }
}