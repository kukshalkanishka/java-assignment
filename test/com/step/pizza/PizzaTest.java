package com.step.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void shouldReturnTrueWhenPizzaHaveProvidedTopping() {
        Toppings toppings = new Toppings();
        Pizza pizza = new Pizza(toppings);
        pizza.addTopping(AvailableToppings.CHICKEN);
        assertTrue(pizza.hasTopping(AvailableToppings.CHICKEN));
    }

    @Test
    void shouldReturnFalseWhenPizzaDoesNotHaveProvidedTopping() {
        Toppings toppings = new Toppings();
        Pizza pizza = new Pizza(toppings);
        assertFalse(pizza.hasTopping(AvailableToppings.CHICKEN));
    }

    @Test
    void shouldReturnTotalPriceOfPizza() {
        Toppings toppings = new Toppings();
        Pizza pizza = new Pizza(toppings);
        pizza.addTopping(AvailableToppings.CHICKEN);
        pizza.addTopping(AvailableToppings.CHICKEN);

        assertEquals(110,pizza.getTotalPrice());
    }

    @Test
    void shouldReturnPizzaDescription() {
        Toppings toppings = new Toppings();
        Pizza pizza = new Pizza(toppings);
        pizza.addTopping(AvailableToppings.CHICKEN);
        pizza.addTopping(AvailableToppings.CHICKEN);

        String expectedDescription = "Topping are: CHICKEN, CHICKEN";

        assertEquals(expectedDescription, pizza.getDescription());
    }
}