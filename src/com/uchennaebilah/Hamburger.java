package com.uchennaebilah;

/**
 * Created by Uchenna on 3/21/2016.
 */
public class Hamburger {
    private String name;
    private double price;
    private String bread;
    private String meat;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger (String name, String bread, String meat, double price)
    {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }

    public void receipt(){
        double total = getPrice();

        if (addition1 == null && addition2 == null && addition3 == null && addition4 == null) {
            System.out.println("Ordered " + getName() + " (" + getName() + ") burger on " + getBread() + "bread, with no additions");
            System.out.println("\nBurger :     $" + getPrice());
        }

        else
        {
            total = total();
        }

        double taxes = calcTaxes(total);
        double grandTotal = total + taxes;

        System.out.println("\nTotal :       $" + total);
        System.out.println("Tax (5%) :    $" + taxes);
        System.out.println("Grand Total : $" + grandTotal);
    }

    public void addAdditions(String add1, String add2, String add3, String add4)
    {
        addition1 = checkAndSelectAddition(add1);
        addition2 = checkAndSelectAddition(add2);
        addition3 = checkAndSelectAddition(add3);
        addition4 = checkAndSelectAddition(add4);

        if (addition1 != null)
            System.out.println(add1.toUpperCase() + " has been added to your order.");

        if (addition2 != null)
            System.out.println(add2.toUpperCase() + " has been added to your order.");

        if (addition3 != null)
            System.out.println(add3.toUpperCase() + " has been added to your order.");

        if (addition4 != null)
            System.out.println(add4.toUpperCase() + " has been added to your order.");
    }

    public Addition checkAndSelectAddition(String addition)
    {
        if (addition.equalsIgnoreCase("lettuce"))
            return new Lettuce();

        else if (addition.equalsIgnoreCase("tomato"))
            return new Tomato();

        else if (addition.equalsIgnoreCase("carrot"))
            return new Carrot();

        else if (addition.equalsIgnoreCase("ketchup"))
            return new Ketchup();

        else if (addition.equalsIgnoreCase("drink"))
            return new Drink();

        else if (addition.equalsIgnoreCase("chips"))
            return new Chips();

        else if (addition.equalsIgnoreCase("cheese"))
            return new Cheese();

        else
            System.out.println(addition + " is not available on the menu.");

        return null;
    }

    public double calcTaxes (double total) {
        double taxValue = 0.05 * total;
        return taxValue;
    }

    public double total(){
        double total = price;

        if (addition1 == null && addition2 == null && addition3 == null && addition4 == null)
            return total;

        else
        {
            System.out.println("Ordered " + getName().toUpperCase() + " (" + getMeat().toUpperCase() + ") burger on " + getBread().toUpperCase() + " bread, with:");

            System.out.println("\n" + getName().toUpperCase() + " :     $" + getPrice());

            if (addition1 != null){
                System.out.println(addition1.getName().toUpperCase() + " :    $" + addition1.getPrice());
                total += addition1.getPrice();
            }

            if (addition2 != null) {
                System.out.println(addition2.getName().toUpperCase() + " :    $" + addition2.getPrice());
                total += addition2.getPrice();
            }

            if (addition3 != null) {
                System.out.println(addition3.getName().toUpperCase() + " :    $" + addition3.getPrice());
                total += addition3.getPrice();
            }

            if (addition4 != null) {
                System.out.println(addition4.getName().toUpperCase() + " :    $" + addition4.getPrice());
                total += addition4.getPrice();
            }
        }

        return total;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public Addition getAddition1() {
        return this.addition1;
    }

    public Addition getAddition2() {
        return this.addition2;
    }

    public Addition getAddition3() {
        return this.addition3;
    }

    public Addition getAddition4() {
        return this.addition4;
    }

}
