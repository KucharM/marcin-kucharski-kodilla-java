package com.kodilla.testing.forum.statistics;

import org.junit.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculationsTestSuite {
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("I'm starting to test.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("I have finished testing");
    }

    @Before
    public void beforeTest() {
        System.out.println("I'm testing");
    }

    @Test
    public void calculateAdvStatistics() {
        /////////////////////////////////////////////////////////////////////////////////////////////
        //#1 if number of posts == 0
        //Given
        Statistics statisticsMock1 = mock(Statistics.class);
        when(statisticsMock1.postsCount()).thenReturn(0);

        Calculations calculations1 = new Calculations(statisticsMock1);
        calculations1.calculateAdvStatistics(statisticsMock1);

        //When
        int numOfPosts = statisticsMock1.postsCount();

        //Then
        Assert.assertEquals(0, numOfPosts);

        ///////////////////////////////////////////////////////////////////////////////////////////
        //#2 if number of posts == 1000
        //Given
        Statistics statisticsMock2 = mock(Statistics.class);
        when(statisticsMock2.postsCount()).thenReturn(1000);

        Calculations calculations2 = new Calculations(statisticsMock2);
        calculations2.calculateAdvStatistics(statisticsMock2);

        //When
        int numOfPosts2 = statisticsMock2.postsCount();

        //Then
        Assert.assertEquals(1000, numOfPosts2);

        ////////////////////////////////////////////////////////////////////////////////////////////
        //#3 if numbers of comments == 0
        //Given
        Statistics statisticsMock3 = mock(Statistics.class);
        when(statisticsMock3.commentsCount()).thenReturn(0);

        Calculations calculations3 = new Calculations(statisticsMock3);
        calculations3.calculateAdvStatistics(statisticsMock3);

        //When
        int numOfComments = statisticsMock3.commentsCount();

        //Then
        Assert.assertEquals(0, numOfComments);

        ////////////////////////////////////////////////////////////////////////////////////////////
        //#4 if number of comments < number of posts
        //Given
        Statistics statisticsMock4 = mock(Statistics.class);
        when(statisticsMock4.commentsCount()).thenReturn(20);
        when(statisticsMock4.postsCount()).thenReturn(40);

        Calculations calculations4 = new Calculations(statisticsMock4);
        calculations4.calculateAdvStatistics(statisticsMock4);

        //When
        boolean result = statisticsMock4.commentsCount() < statisticsMock4.postsCount();

        //Then
        Assert.assertTrue(result);

        //////////////////////////////////////////////////////////////////////////////////////////////////
        //#5 if number of comments > number of posts
        //Given
        Statistics statisticsMock5 = mock(Statistics.class);
        when(statisticsMock5.commentsCount()).thenReturn(50);
        when(statisticsMock5.postsCount()).thenReturn(30);

        Calculations calculations5 = new Calculations(statisticsMock5);
        calculations5.calculateAdvStatistics(statisticsMock5);

        //When
        boolean result2 = statisticsMock4.commentsCount() > statisticsMock4.postsCount();

        //Then
        Assert.assertTrue(result2);

        ///////////////////////////////////////////////////////////////////////////////////////////////
        //#6 number of users == 0
        //Given
        Statistics statisticsMock6 = mock(Statistics.class);
        when(statisticsMock6.usersNames().size()).thenReturn(0);

        Calculations calculations6 = new Calculations(statisticsMock6);
        calculations6.calculateAdvStatistics(statisticsMock6);

        //When
        int numOfUsers = statisticsMock6.usersNames().size();

        //Then
        Assert.assertEquals(0, numOfUsers);

        ///////////////////////////////////////////////////////////////////////////////////////////////
        //#7 number of users == 100
        //Given
        Statistics statisticsMock7 = mock(Statistics.class);
        when(statisticsMock7.usersNames().size()).thenReturn(100);

        Calculations calculations7 = new Calculations(statisticsMock7);
        calculations7.calculateAdvStatistics(statisticsMock7);

        //When
        int numOfUsers2 = statisticsMock7.usersNames().size();

        Assert.assertEquals(100, numOfUsers2);
    }
}
