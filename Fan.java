package com.company;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private String color;
    private double radius;
    
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.color = "color";
        this.radius = 5;
    }
    
    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        String fanSpeed = null;
        switch (getSpeed()) {
            case 1:
                fanSpeed = "LOW";
                break;
            case 2:
                fanSpeed = "MEDIUM";
                break;
            case 3:
                fanSpeed = "FAST";
                break;
        }
        if (getOn()) {
            return "{" +
                    "speed=" + fanSpeed +
                    ", radius=" + radius +
                    ", color=" + color +
                    "}\' \n" +
                    " fan is on ";
        } else {
            return "{" +
                    "radius=" + radius +
                    ", color=" + color +
                    "}\' \n" +
                    " fan is off ";
        }
    }
}
