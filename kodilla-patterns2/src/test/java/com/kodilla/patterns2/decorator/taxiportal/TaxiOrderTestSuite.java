package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCOst = taxiOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(5.00), calculatedCOst);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        //When
        String desc = order.getDescription();
        //Then
        Assert.assertEquals("Drive a course", desc);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);

        //When
        BigDecimal cost = taxiOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(40), cost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);

        //WHen
        String desc = taxiOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by Taxi Network", desc);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        BigDecimal cost = taxiOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(37), cost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //WHen
        String desc = taxiOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by My Taxi + child seat", desc);

    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        System.out.println(taxiOrder.getCost());

        //When
        BigDecimal cost = taxiOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(52), cost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        System.out.println(taxiOrder.getCost());

        //WHen
        String desc = taxiOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by Taxi Network vip car + child seat", desc);
    }
}
