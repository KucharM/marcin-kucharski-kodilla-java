package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = i + 1;
        }

        //When
        double average = ArrayOperations.getAverage(array);

        //Then
        Assert.assertEquals(10.5, average, 0.1);
    }
}
