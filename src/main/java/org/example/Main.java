package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Mazsola");
        Cat cat = new Cat("Tádé");
        Dog dog2 = new Dog("Kifli");
        Cat cat2 = new Cat("Zsömi");

        System.out.println(dog.getName() + " says: ");
        dog.makeSound();

        System.out.println(cat.getName() + " says: ");
        cat.makeSound();

        System.out.println(dog2.getName() + " says: ");
        dog2.makeSound();

        System.out.println(cat2.getName() + " says: ");
        cat2.makeSound();
    }
}