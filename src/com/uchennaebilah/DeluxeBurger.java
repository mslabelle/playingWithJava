package com.uchennaebilah;

/**
 * Created by Uchenna on 3/21/2016.
 */
public class DeluxeBurger extends Hamburger{

    private String name;
    private String bread;
    private String meat;
    private double price;

    public DeluxeBurger(String bread, String meat) {
        super("Deluxe Burger", bread, meat, 3.75);
    }

    public void addAdditions() {
        super.addAdditions("Chips", "Drink", "", "");
        System.out.println("No further additions can be added to this order.");
    }

    @Override
    public void addAdditions(String add1, String add2, String add3, String add4) {
        System.out.println("Additional items for this order are FIXED and cannot be altered.\n");
        addAdditions();
    }


}
