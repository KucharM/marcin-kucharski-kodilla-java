package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("test log");
        Logger.getInstance().log("test log2");
        Logger.getInstance().log("test log3");
        String log = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("test log3", log);
    }
}
