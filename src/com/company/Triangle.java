package com.company;

import com.company.Exceptions.NegativeException;
import com.company.Exceptions.TriangleException;

public class Triangle {
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) throws TriangleException, NegativeException {
        if (a < 0 || b < 0 || c < 0){
            throw new NegativeException();
        }
        if ((a + c) > b && (a + b) > c && (b + c) > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else {
            throw new TriangleException();
        }


    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double squareOfTriangle() {
        double perimeter = (a + b + c) / 2;
        double square = Math.sqrt(perimeter * (perimeter - a) * (perimeter - c) * (perimeter - b));
        return square;
    }
}
