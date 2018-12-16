package com.kodilla.testing.collection;

import com.kodilla.testing.collection.CollectionTestSuite;
import org.junit.*;

import java.util.ArrayList;


public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("test case begin");
    }

    @After
    public void after() {
        System.out.println("test case end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("test suite begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("test suite end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> evenList = oddNumbersExterminator.exterminate(list);
        System.out.println("testing case empty list");

        //Then
        Assert.assertTrue(evenList.isEmpty());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> list = new ArrayList<>();
        list.add(121);
        list.add(234);
        list.add(345);
        list.add(456);
        list.add(567);
        list.add(678);

        ArrayList<Integer> evenList = oddNumbersExterminator.exterminate(list);
        System.out.println("testing case normal list");

        //Then
        ArrayList<Integer> expectedNumbersList = new ArrayList<>();
        expectedNumbersList.add(234);
        expectedNumbersList.add(456);
        expectedNumbersList.add(678);

        Assert.assertEquals(evenList, expectedNumbersList);
    }
}
