package com.company;

/**
 * Здесь делают пиццу.
 */

public class Pizza {

    Circle basic;
    String composition;
    String name;
    double price;

    public Pizza(double basic, String composition, String name, double price) {
        this.basic = new Circle(basic);
        this.composition = composition;
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return basic.getDiameter() + ", " + name + ", " + composition + ", " + price;
    }
}