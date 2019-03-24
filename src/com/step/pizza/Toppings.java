package com.step.pizza;

import java.util.ArrayList;
import java.util.List;

public class Toppings {
    private List<AvailableToppings> toppings = new ArrayList<>();


    public void add(AvailableToppings topping) {
        toppings.add(topping);
    }

    boolean contains(AvailableToppings topping) {
        return this.toppings.contains(topping);
    }

    double getCost() {
        double cost = 0;
        for (AvailableToppings topping : this.toppings) {
            cost += topping.getCost();
        }
        return cost;
    }


    public String description() {
        return null;
    }
}
