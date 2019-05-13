package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaChilli extends AbstractPizzaOrderDecorator {
    protected PizzaChilli(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with spice peppers";
    }
}
