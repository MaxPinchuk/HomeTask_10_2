package com.company;

/**
 * Здесь делают пиццу.
 */

public class Pizza {

    double basic;
    String composition;
    String name;
    double price;

    public Pizza(double basic) {
        this.basic = basic;

    }

    public Pizza(double basic, String composition, String name, double price) {
        this.basic = basic;
        this.composition = composition;
        this.name = name;
        this.price = price;

        Pizza pizza = new Pizza
        (20, "tomato, meat, souse, cheese, plants", "SuperPizza", 199.99);
        System.out.println(pizza);
        Pizza pizza_L = new Pizza
        (30, "tomato, meat, souse, cheese, plants", "SuperPizza", 209.99);
        System.out.println(pizza_L);
        Pizza pizza_XL = new Pizza
        (50, "tomato, meat, souse, cheese, plants", "SuperPizza", 219.99);
        System.out.println(pizza_XL);
    }
}
