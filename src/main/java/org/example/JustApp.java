package org.example;

import org.example.Burger;
import org.example.Pizza;

import java.util.ArrayList;

public class JustApp {


    public static void main(String[] args){
        ArrayList<Food> items = new ArrayList<>();
        System.out.println("welcome to Just App");
        System.out.println("this is your order...");

        Burger cheeseBurger = new Burger("Cheeseburger", 1.99, "Tasty");
        Burger veggie = new Burger("veggie burger", 2.99, "green Tasty");

        Pizza cheese = new Pizza("Cheese Pizza", 8.99, "cheesy");
        Pizza plain = new Pizza("plain Pizza", 8.99, "boring");

        Fries curly = new Fries()

        items.add(cheeseBurger);
        items.add(veggie);
        items.add(cheese);

        for(Food item : items){
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
        }

    }

    public static interface food {
        String getName();
        double getPrice();
        String getDescription();
    }
}
