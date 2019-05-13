package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaCheese extends AbstractPizzaOrderDecorator {
    protected PizzaCheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with extra cheese";
    }
}
