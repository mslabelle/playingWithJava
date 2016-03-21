package com.uchennaebilah;

// BILL'S BURGER MENU
// Hamburger - Get up to 4 additions.
// Deluxe Burger - Comes with chips and a drink. No other additions allowed.
// Healthy Burger - Get up to 6 additions. MM MM Good!
// Additions allowed: Lettuce, Carrots, Chips, Drink, Cheese, Ketchup, Tomato

// <instance>.receipt() - To view your itemized receipt
// <instance>.add
public class Main {

    public static void main(String[] args) {
	    Hamburger plain = new Hamburger("Plain","White","Beef",2.50);
        DeluxeBurger deluxe = new DeluxeBurger("White","Beef");
        HealthyBurger veggie = new HealthyBurger("Tofu");

        //plain.addAdditions("lettuce","ketchup","chips","drink");
        //deluxe.addAdditions();
        //veggie.receipt();
        veggie.addAdditions("Ketchup","Carrot","Lettuce","Drink","Chips","Tomato");
        veggie.receipt();


        //deluxe.addAdditions("Fries","Carrots","Lettuce","Drink");
        //deluxe.receipt();



        //plain.receipt();

    }
}
