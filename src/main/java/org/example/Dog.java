package org.example;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    public void makeSound() {
        bark();
    }
}
