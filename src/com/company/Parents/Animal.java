package com.company.Parents;

public class Animal {
    protected String name;
    protected int age;
    protected int limitAge;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        name = "Barsik";
        age = 0;
    }

    public int getLimitAge() {
        return limitAge;
    }

    public void setLimitAge(int limitAge) {
        this.limitAge = limitAge;
    }

}
