package com.step.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToppingsTest {

    @Test
    void shouldAddProvidedToppingToTheToppingsList() {
        Toppings toppings = new Toppings();
        toppings.add(AvailableToppings.VEGETABLE);
        assertTrue(toppings.contains(AvailableToppings.VEGETABLE));
    }

    @Test
    void shouldReturnTotalCostOfToppings() {
        Toppings toppings = new Toppings();
        toppings.add(AvailableToppings.VEGETABLE);
        toppings.add(AvailableToppings.VEGETABLE);

        assertEquals(40,toppings.getCost());
    }
}