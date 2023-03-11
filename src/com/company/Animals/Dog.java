package com.company.Animals;

import com.company.Parents.Animal;

public class Dog extends Animal {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String name, String color) {
       super(name);
       this.color = color;
    }

    public Dog() {
        super();
        this.limitAge = 15;
        color = "Brown";
    }

    public String say(){
        return "Gav-Gav";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", limitAge=" + limitAge +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
