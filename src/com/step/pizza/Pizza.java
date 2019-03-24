package com.step.pizza;

class Pizza {
    private static double baseCost = 50;
    private final Toppings toppings;

    Pizza(Toppings toppings) {
        this.toppings = toppings;
    }

    void addTopping(AvailableToppings topping) {
        this.toppings.add(topping);
    }

    boolean hasTopping(AvailableToppings topping) {
        return this.toppings.contains(topping);
    }

    double getTotalPrice() {
        return baseCost + this.toppings.getCost();
    }

    public String getDescription() {
        String toppingDescription = this.toppings.description();
        return toppingDescription;
    }
}
