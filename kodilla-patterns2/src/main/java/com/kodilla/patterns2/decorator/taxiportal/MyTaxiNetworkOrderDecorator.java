package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class MyTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    protected MyTaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(30));
    }

    public String getDescription() {
        return super.getDescription() + " by My Taxi";
    }
}
