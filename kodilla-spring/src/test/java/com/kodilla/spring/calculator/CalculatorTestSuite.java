package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addingResult = calculator.add(2.0, 3.3);
        double subtractionResult = calculator.sub(11.2, 2.2);
        double multipResult = calculator.mul(3.3, 4.4);
        double divideResult = calculator.div(33.3, 3.0);

        //Then
        Assert.assertEquals(5.3, addingResult, 0.1);
        Assert.assertEquals(9.0, subtractionResult, 0.1);
        Assert.assertEquals(14.5, multipResult, 0.1);
        Assert.assertEquals(11.0, divideResult, 0.1);
    }
}
