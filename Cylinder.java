package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calV() {
        return this.height * this.height * 3.14;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", color=" + this.getColor() +
                ", radius=" + this.getRadius() +
                ", area=" + this.getArea() +
                ", volume=" + this.calV() +
                '}';
    }
}
