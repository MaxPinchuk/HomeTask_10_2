package com.company;

/**
 * Меню пиицерии.
 */

public class Pizzeria {

    public String[] menu;

    public static void main(String[] args) {

        Pizza[] menu = new Pizza[3];
        menu[0] = new Pizza(20, "tomato, meat, souse, cheese, plants", "Pizza", 199.99);
        menu[1] = new Pizza(30, "tomato, meat, souse, cheese, plants", "Pizza_L", 209.99);
        menu[2] = new Pizza(50, "tomato, meat, souse, cheese, plants", "Pizza_XL", 219.99);

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i].getInfo());
        }
    }
}