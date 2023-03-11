package com.company;

public class City {
    private String name;
    private double square;
    private int population;
    private int codeTel;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    public City() {
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", population=" + population +
                '}';
    }

    public City(String name, int codeTel) {
        this.name = name;
        this.codeTel = codeTel;
        address = new Address(1, "Lenina");
    }

    public int countOnMeter (int population, double square) {
        return (int)(Math.ceil(population/square));
    }



    class Address{
        private int numberOfHouse;
        private String nameOfStreet;

        public Address(int numberOfStreet, String nameOfStreet) {
            this.numberOfHouse = numberOfStreet;
            this.nameOfStreet = nameOfStreet;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "numberOfStreet=" + numberOfHouse +
                    ", nameOfStreet='" + nameOfStreet + '\'' +
                    '}';
        }
    }

    public void createAddress(int numberOfHouse, String nameOfStreet){
        Address address = new Address(numberOfHouse, nameOfStreet);
        System.out.println("Адрес создан: " + address);
    }
    public void printFirstAddress () {
        System.out.println(address);
    }
}
