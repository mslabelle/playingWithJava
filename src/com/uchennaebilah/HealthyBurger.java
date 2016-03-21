package com.uchennaebilah;

/**
 * Created by Uchenna on 3/21/2016.
 */
public class HealthyBurger extends Hamburger{

    private String name;
    private String bread;
    private String meat;
    private double price;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
    private Addition addition5;
    private Addition addition6;

    public HealthyBurger(String meat) {
        super("Healthy Burger", "Brown Rye Roll", meat, 4.25);
    }

    public void addAdditions(String add1, String add2, String add3, String add4, String add5, String add6) {
        super.addAdditions(add1, add2, add3, add4);

        addition1 = getAddition1();
        addition2 = getAddition2();
        addition3 = getAddition3();
        addition4 = getAddition4();
        addition5 = checkAndSelectAddition(add5);
        addition6 = checkAndSelectAddition(add6);

        if (addition5 != null)
            System.out.println(add5.toUpperCase() + " has been added to your order.");

        if (addition6 != null)
            System.out.println(add6.toUpperCase() + " has been added to your order.");

    }

    @Override
    public void receipt(){
        addition1 = getAddition1();
        addition2 = getAddition2();
        addition3 = getAddition3();
        addition4 = getAddition4();

        double total = getPrice();

        if (addition1 == null && addition2 == null && addition3 == null && addition4 == null && addition5 == null && addition6 == null) {
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

    @Override
    public double total(){
        double total = super.total();

        if (addition5 == null && addition6 == null)
            return total;

        else
        {
            if (addition5 != null) {
                System.out.println(addition5.getName().toUpperCase() + " :    $" + addition5.getPrice());
                total += addition5.getPrice();
            }

            if (addition6 != null) {
                System.out.println(addition6.getName().toUpperCase() + " :    $" + addition6.getPrice());
                total += addition6.getPrice();
            }
        }

        return total;
    }
}
