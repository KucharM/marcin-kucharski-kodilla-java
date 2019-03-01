package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mike = new Millenials("Mike Mikelsen");
        User john = new ZGeneration("John Johnson");
        User tom = new YGeneration("Tom Thomson");

        //When
        String mikesPost = mike.sharePost();
        System.out.println("Mike: " + mikesPost);
        String johnsPost = john.sharePost();
        System.out.println("John: " + johnsPost);
        String tomsPost = tom.sharePost();
        System.out.println("Tom: " + tomsPost);

        //Then
        Assert.assertEquals("I like Snapchat", mikesPost);
        Assert.assertEquals("I like Twitter", johnsPost);
        Assert.assertEquals("I like Facebook", tomsPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mike = new Millenials("Mike Mikelsen");

        //When
        String mikesPost = mike.sharePost();
        System.out.println("Mike: " + mikesPost);

        mike.setSocialPublisher(new TwitterPublisher());
        mikesPost = mike.sharePost();
        System.out.println("Mike change social: " + mikesPost);

        //Then
        Assert.assertEquals("I like Twitter", mikesPost);
    }
}
