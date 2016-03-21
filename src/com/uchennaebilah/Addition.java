package com.uchennaebilah;

/**
 * Created by Uchenna on 3/21/2016.
 */
public class Addition {
    private String name;
    private double price;

    public Addition(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void printAddition()
    {
        System.out.println(getName() + " : " + getPrice());
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
