package com.step.pizza;

public enum AvailableToppings {
    VEGETABLE(20),
    CHICKEN(30),
    MOZZARELLA(10),
    TOMATO_SAUCE(5),
    EXTRA_CHEESE(25),
    JALAPENO(40);

    private final int cost;

    AvailableToppings(int cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }
}
