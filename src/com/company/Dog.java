package com.company;

public class Dog extends ClassAnimal{
    @Override
    void voice() {
        System.out.println("Gav-Gav");
    }

    @Override
    void move() {
        System.out.println("run");
    }
}
