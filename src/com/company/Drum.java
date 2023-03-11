package com.company;

public class Drum implements Instrument{
    private double sizeOfDrum;

    public Drum(double sizeOfDrum) {
        this.sizeOfDrum = sizeOfDrum;
    }

    public double getSizeOfDrum() {
        return sizeOfDrum;
    }

    public void setSizeOfDrum(double sizeOfDrum) {
        this.sizeOfDrum = sizeOfDrum;
    }

    @Override
    public void play() {
        System.out.println("Играет: Drum c диаметром " + sizeOfDrum + " мм");
    }
}
