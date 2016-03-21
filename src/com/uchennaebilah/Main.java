package com.uchennaebilah;

public class Main {

    public static void main(String[] args) {
	    //Hamburger plain = new Hamburger("Plain","White","Beef",2.50);
        //DeluxeBurger deluxe = new DeluxeBurger("White","Beef");
        HealthyBurger veggie = new HealthyBurger("Tofu");

        //plain.addAdditions("lettuce","ketchup","chips","drink");
        //deluxe.addAdditions();
        //veggie.receipt();
        veggie.addAdditions("Ketchup","Carrot","Lettuce","Drink");
        veggie.receipt();


        //deluxe.addAdditions("Fries","Carrots","Lettuce","Drink");
        //deluxe.receipt();



        //plain.receipt();

    }
}
