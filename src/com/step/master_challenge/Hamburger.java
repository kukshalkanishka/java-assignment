package com.step.master_challenge;

// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.

// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.

public class Hamburger {
    private AdditionalItem breadRollType;
    private AdditionalItem item1;
    private AdditionalItem item2;
    private AdditionalItem item3;
    private AdditionalItem item4;
    private double cost;


    public Hamburger(AdditionalItem breadRollType) {
        this.cost = breadRollType.getCost();
        this.breadRollType = breadRollType;
    }

    public void addItem1(AdditionalItem item1){
        this.item1 = item1;
        this.cost += item1.getCost();

    }
    public void addItem2(AdditionalItem item2){
        this.item2 = item2;
        this.cost += item2.getCost();
    }

    public void addItem3(AdditionalItem item3){
        this.item3 = item3;
        this.cost += item3.getCost();
    }

    public void addItem4(AdditionalItem item4){
        this.item4 = item4;
        this.cost += item4.getCost();
    }


    public void addCost(double itemCost) {
        this.cost += itemCost;
    }

    public double getCost() {
        return cost;
    }
}
