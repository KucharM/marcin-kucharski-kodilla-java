package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaOrderDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String description = pizzaOrder.getDescription();

        //Then
        Assert.assertEquals("Pizza with sauce and cheese", description);
    }

    @Test
    public void testPizzaMushroomPorkCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMushroom(pizzaOrder);
        pizzaOrder = new PizzaPork(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(26), cost);
    }

    @Test
    public void testPizzaMushroomPorkDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMushroom(pizzaOrder);
        pizzaOrder = new PizzaPork(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Then
        Assert.assertEquals("Pizza with sauce and cheese with Mushrooms with ham", description);
    }

    @Test
    public void testPizzaMushroomPorkCheeseChilliCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMushroom(pizzaOrder);
        pizzaOrder = new PizzaPork(pizzaOrder);
        pizzaOrder = new PizzaCheese(pizzaOrder);
        pizzaOrder = new PizzaChilli(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(37), cost);
    }

    @Test
    public void testPizzaMushroomPorkCheeseChilliDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMushroom(pizzaOrder);
        pizzaOrder = new PizzaPork(pizzaOrder);
        pizzaOrder = new PizzaCheese(pizzaOrder);
        pizzaOrder = new PizzaChilli(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Then
        Assert.assertEquals("Pizza with sauce and cheese with Mushrooms " +
                "with ham with extra cheese with spice peppers", description);
    }
}
