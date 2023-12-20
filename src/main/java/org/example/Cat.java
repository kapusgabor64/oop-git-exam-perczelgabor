package org.example;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("Meow!");
    }

    @Override
    public void makeSound() {
        meow();
    }
}