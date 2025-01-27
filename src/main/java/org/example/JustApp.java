package org.example;

import java.util.ArrayList;

public class JustApp {


    public static void main(String[] args){
        ArrayList<Food> items = new ArrayList<>();
        System.out.println("welcome to Just App");
        System.out.println("this is your order...");

        int total = 0;

        Burger cheeseBurger = new Burger("Cheeseburger", 1.99, "Tasty");
        Burger veggie = new Burger("veggie burger", 2.99, "green Tasty");

        Pizza cheese = new Pizza("Cheese Pizza", 8.99, "cheesy");
        Pizza plain = new Pizza("plain Pizza", 8.99, "boring");

        Fries curly = new Fries("curly", 3.50, "twisted");
        Fries salted = new Fries("salted fries", 3.50, "salty");

        Desert icecream = new Desert("chocolate icecream", 4.50, "dark");



        items.add(cheeseBurger);
        items.add(veggie);
        items.add(cheese);
        items.add(plain);
        items.add(salted);
        items.add(curly);
        items.add(icecream);

        for(Food item : items){
            System.out.println("\nName: ");
            System.out.println(item.getName());
            System.out.println("\nDescription: ");
            System.out.println(item.getDescription());
            System.out.println("\nPrice: ");
            System.out.println(item.getPrice());
            total += item.getPrice();

        }
        System.out.println("\nTotal cost:");
        System.out.println(total);

    }

    public static interface food {
        String getName();
        double getPrice();
        String getDescription();
    }
}
