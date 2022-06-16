package com.company;

public class QuadraticEquation {
    private final double a, b, c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.sqrt(this.getB() * this.getB() - 4 * this.getA() * this.getC());
    }

    public double getRoot1() {
        if (this.getDiscriminant() >= 0) {
            return (-this.getB() + Math.sqrt(this.getB() * this.getB() - 4 * this.getA() * this.getC())) / (this.getA() * 2);

        } else return 0;
    }

    public double getRoot2() {
        if (this.getDiscriminant() >= 0) {
            return (-this.getB() - Math.sqrt(this.getB() * this.getB() - 4 * this.getA() * this.getC())) / (this.getA() * 2);

        } else return 0;
    }
}