package com.company;

public class Human {
    public String name;

    private int age;

    private double height;

    private boolean isGood;

    public Human(String name) {
    }

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", isGood=" + isGood +
                '}';
    }

    public Human(String name, int age, double height, boolean isGood) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isGood = isGood;
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
    }
}
