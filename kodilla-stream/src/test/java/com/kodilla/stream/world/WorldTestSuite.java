package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        // Europe
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("82000000"));
        Country france = new Country("France", new BigDecimal("62000000"));
        Country spain = new Country("Spain", new BigDecimal("40000000"));
        Country italy = new Country("Italy", new BigDecimal("58000000"));

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(spain);
        europe.addCountry(italy);

        // Asia
        Country russia = new Country("Russia", new BigDecimal("103000000"));
        Country china = new Country("China", new BigDecimal("1300000000"));
        Country india = new Country("India", new BigDecimal("1100000000"));
        Country kazakhstan = new Country("Kazakhstan", new BigDecimal("15000000"));

        asia.addCountry(russia);
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(kazakhstan);

        // Africa
        Country egypt = new Country("Egypt", new BigDecimal("97000000"));
        Country cameroon = new Country("Cameroon", new BigDecimal("25000000"));
        Country morocco = new Country("Morocco", new BigDecimal("34000000"));
        Country nigeria = new Country("Nigeria", new BigDecimal("190000000"));

        africa.addCountry(egypt);
        africa.addCountry(cameroon);
        africa.addCountry(morocco);
        africa.addCountry(nigeria);

        World world = new World();
        world.addContinent(africa);
        world.addContinent(europe);
        world.addContinent(asia);

        //When
        BigDecimal worldQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantity = new BigDecimal("3144000000");
        Assert.assertEquals(expectedQuantity, worldQuantity);
    }
}
