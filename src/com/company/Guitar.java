package com.company;

public class Guitar implements Instrument {
    private int countOfStr;

    public Guitar(int countOfStr) {
        this.countOfStr = countOfStr;
    }

    public int getCountOfStr() {
        return countOfStr;
    }

    public void setCountOfStr(int countOfStr) {
        this.countOfStr = countOfStr;
    }

    @Override
    public void play() {
        System.out.println("Играет: Guitar"+ " c " + countOfStr + " струнами");
    }
}
