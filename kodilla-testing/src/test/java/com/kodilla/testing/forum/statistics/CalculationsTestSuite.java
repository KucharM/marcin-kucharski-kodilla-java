package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculationsTestSuite {

    private static int testCounter = 0;

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
        System.out.println("I'm testing case " + testCounter);
    }

    @Test
    public void testCase1CalculateAdvStatistics() {
        // Case: numberOfPosts == 0, numberOfComments == 0, numberOfUsers == 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>(0);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculations calculations = new Calculations(statisticsMock);
        calculations.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = calculations.getNumberOfPosts();
        int numberOfComments = calculations.getNumberOfComments();
        int numberOfUsers = calculations.getNumberOfUsers();
        int averagePostsNumberPerUser = calculations.getAveragePostsNumberPerUser();
        int averageCommentsNumberPerUser = calculations.getAverageCommentsNumberPerUser();
        int averageCommentsNumberPerPost = calculations.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(0, numberOfPosts);
        Assert.assertEquals(0, numberOfComments);
        Assert.assertEquals(0, numberOfUsers);
        Assert.assertEquals(0, averagePostsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerPost);
    }

    @Test
    public void testCase2CalculateAdvStatistics() {
        // Case: numberOfPosts == 0, numberOfComments < numberOfPosts, numberOfUsers == 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>(0);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(-1);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculations calculations = new Calculations(statisticsMock);
        calculations.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = calculations.getNumberOfPosts();
        boolean comments = calculations.getNumberOfComments() < calculations.getNumberOfPosts();
        int numberOfUsers = calculations.getNumberOfUsers();
        int averagePostsNumberPerUser = calculations.getAveragePostsNumberPerUser();
        int averageCommentsNumberPerUser = calculations.getAverageCommentsNumberPerUser();
        int averageCommentsNumberPerPost = calculations.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(0, numberOfPosts);
        Assert.assertTrue(comments);
        Assert.assertEquals(0, numberOfUsers);
        Assert.assertEquals(0, averagePostsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerPost);
    }

    @Test
    public void testCase3CalculateAdvStatistics() {
        // Case: numberOfPosts == 0, numberOfComments > numberOfPosts, numberOfUsers == 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>(0);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(1);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculations calculations = new Calculations(statisticsMock);
        calculations.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = calculations.getNumberOfPosts();
        boolean comments = calculations.getNumberOfComments() > calculations.getNumberOfPosts();
        int numberOfUsers = calculations.getNumberOfUsers();
        int averagePostsNumberPerUser = calculations.getAveragePostsNumberPerUser();
        int averageCommentsNumberPerUser = calculations.getAverageCommentsNumberPerUser();
        int averageCommentsNumberPerPost = calculations.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(0, numberOfPosts);
        Assert.assertTrue(comments);
        Assert.assertEquals(0, numberOfUsers);
        Assert.assertEquals(0, averagePostsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerPost);
    }

    @Test
    public void testCase4CalculateAdvStatistics() {
        // Case: numberOfPosts == 1000, numberOfComments == 0, numberOfUsers == 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>(0);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculations calculations = new Calculations(statisticsMock);
        calculations.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = calculations.getNumberOfPosts();
        int numberOfComments = calculations.getNumberOfComments();
        int numberOfUsers = calculations.getNumberOfUsers();
        int averagePostsNumberPerUser = calculations.getAveragePostsNumberPerUser();
        int averageCommentsNumberPerUser = calculations.getAverageCommentsNumberPerUser();
        int averageCommentsNumberPerPost = calculations.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertEquals(0, numberOfComments);
        Assert.assertEquals(0, numberOfUsers);
        Assert.assertEquals(0, averagePostsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerPost);
    }

    @Test
    public void testCase5CalculateAdvStatistics() {
        // Case: numberOfPosts == 1000, numberOfComments < numberOfPosts, numberOfUsers == 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>(0);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(900);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculations calculations = new Calculations(statisticsMock);
        calculations.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = calculations.getNumberOfPosts();
        boolean comments = calculations.getNumberOfComments() < calculations.getNumberOfPosts();
        int numberOfUsers = calculations.getNumberOfUsers();
        int averagePostsNumberPerUser = calculations.getAveragePostsNumberPerUser();
        int averageCommentsNumberPerUser = calculations.getAverageCommentsNumberPerUser();
        int averageCommentsNumberPerPost = calculations.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertTrue(comments);
        Assert.assertEquals(0, numberOfUsers);
        Assert.assertEquals(0, averagePostsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerPost);
    }

    @Test
    public void testCase6CalculateAdvStatistics() {
        // Case: numberOfPosts == 1000, numberOfComments > numberOfPosts, numberOfUsers == 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>(0);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculations calculations = new Calculations(statisticsMock);
        calculations.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = calculations.getNumberOfPosts();
        boolean comments = calculations.getNumberOfComments() > calculations.getNumberOfPosts();
        int numberOfUsers = calculations.getNumberOfUsers();
        int averagePostsNumberPerUser = calculations.getAveragePostsNumberPerUser();
        int averageCommentsNumberPerUser = calculations.getAverageCommentsNumberPerUser();
        int averageCommentsNumberPerPost = calculations.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertTrue(comments);
        Assert.assertEquals(0, numberOfUsers);
        Assert.assertEquals(0, averagePostsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerUser);
        Assert.assertEquals(2, averageCommentsNumberPerPost);
    }

    @Test
    public void testCase7CalculateAdvStatistics() {
        // Case: numberOfPosts == 0, numberOfComments == 0, numberOfUsers == 100
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("user");
        }

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculations calculations = new Calculations(statisticsMock);
        calculations.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = calculations.getNumberOfPosts();
        int numberOfComments = calculations.getNumberOfComments();
        int numberOfUsers = calculations.getNumberOfUsers();
        int averagePostsNumberPerUser = calculations.getAveragePostsNumberPerUser();
        int averageCommentsNumberPerUser = calculations.getAverageCommentsNumberPerUser();
        int averageCommentsNumberPerPost = calculations.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(0, numberOfPosts);
        Assert.assertEquals(0, numberOfComments);
        Assert.assertEquals(100, numberOfUsers);
        Assert.assertEquals(0, averagePostsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerPost);
    }

    @Test
    public void testCase8CalculateAdvStatistics() {
        // Case: numberOfPosts == 0, numberOfComments > numberOfPosts, numberOfUsers == 100
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("user");
        }

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculations calculations = new Calculations(statisticsMock);
        calculations.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = calculations.getNumberOfPosts();
        boolean comments = calculations.getNumberOfComments() > calculations.getNumberOfPosts();
        int numberOfUsers = calculations.getNumberOfUsers();
        int averagePostsNumberPerUser = calculations.getAveragePostsNumberPerUser();
        int averageCommentsNumberPerUser = calculations.getAverageCommentsNumberPerUser();
        int averageCommentsNumberPerPost = calculations.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(0, numberOfPosts);
        Assert.assertTrue(comments);
        Assert.assertEquals(100, numberOfUsers);
        Assert.assertEquals(0, averagePostsNumberPerUser);
        Assert.assertEquals(2, averageCommentsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerPost);
    }

    @Test
    public void testCase9CalculateAdvStatistics() {
        // Case: numberOfPosts == 0, numberOfComments < numberOfPosts, numberOfUsers == 100
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("user");
        }

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(-1);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculations calculations = new Calculations(statisticsMock);
        calculations.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = calculations.getNumberOfPosts();
        boolean comments = calculations.getNumberOfComments() < calculations.getNumberOfPosts();
        int numberOfUsers = calculations.getNumberOfUsers();
        int averagePostsNumberPerUser = calculations.getAveragePostsNumberPerUser();
        int averageCommentsNumberPerUser = calculations.getAverageCommentsNumberPerUser();
        int averageCommentsNumberPerPost = calculations.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(0, numberOfPosts);
        Assert.assertTrue(comments);
        Assert.assertEquals(100, numberOfUsers);
        Assert.assertEquals(0, averagePostsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerPost);
    }

    @Test
    public void testCase10CalculateAdvStatistics() {
        // Case: numberOfPosts == 1000, numberOfComments == 0, numberOfUsers == 100
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("user");
        }

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculations calculations = new Calculations(statisticsMock);
        calculations.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = calculations.getNumberOfPosts();
        int numberOfComments = calculations.getNumberOfComments();
        int numberOfUsers = calculations.getNumberOfUsers();
        int averagePostsNumberPerUser = calculations.getAveragePostsNumberPerUser();
        int averageCommentsNumberPerUser = calculations.getAverageCommentsNumberPerUser();
        int averageCommentsNumberPerPost = calculations.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertEquals(0, numberOfComments);
        Assert.assertEquals(100, numberOfUsers);
        Assert.assertEquals(10, averagePostsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerPost);
    }

    @Test
    public void testCase11CalculateAdvStatistics() {
        // Case: numberOfPosts == 1000, numberOfComments > numberOfPosts, numberOfUsers == 100
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("user");
        }

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculations calculations = new Calculations(statisticsMock);
        calculations.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = calculations.getNumberOfPosts();
        boolean comments = calculations.getNumberOfComments() > calculations.getNumberOfPosts();
        int numberOfUsers = calculations.getNumberOfUsers();
        int averagePostsNumberPerUser = calculations.getAveragePostsNumberPerUser();
        int averageCommentsNumberPerUser = calculations.getAverageCommentsNumberPerUser();
        int averageCommentsNumberPerPost = calculations.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertTrue(comments);
        Assert.assertEquals(100, numberOfUsers);
        Assert.assertEquals(10, averagePostsNumberPerUser);
        Assert.assertEquals(20, averageCommentsNumberPerUser);
        Assert.assertEquals(2, averageCommentsNumberPerPost);
    }

    @Test
    public void testCase12CalculateAdvStatistics() {
        // Case: numberOfPosts == 1000, numberOfComments < numberOfPosts, numberOfUsers == 100
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("user");
        }

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(800);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculations calculations = new Calculations(statisticsMock);
        calculations.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = calculations.getNumberOfPosts();
        boolean comments = calculations.getNumberOfComments() < calculations.getNumberOfPosts();
        int numberOfUsers = calculations.getNumberOfUsers();
        int averagePostsNumberPerUser = calculations.getAveragePostsNumberPerUser();
        int averageCommentsNumberPerUser = calculations.getAverageCommentsNumberPerUser();
        int averageCommentsNumberPerPost = calculations.getAverageCommentsNumberPerPost();

        //Then
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertTrue(comments);
        Assert.assertEquals(100, numberOfUsers);
        Assert.assertEquals(10, averagePostsNumberPerUser);
        Assert.assertEquals(8, averageCommentsNumberPerUser);
        Assert.assertEquals(0, averageCommentsNumberPerPost);
    }
}
