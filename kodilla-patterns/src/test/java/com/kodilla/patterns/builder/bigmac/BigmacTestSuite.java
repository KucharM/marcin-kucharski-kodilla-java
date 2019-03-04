package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame seed bun")
                .burgers(2)
                .ingredient("salad")
                .ingredient("cheese")
                .ingredient("cucumber")
                .ingredient("tomato")
                .sauce("spicy")
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
    }
}
